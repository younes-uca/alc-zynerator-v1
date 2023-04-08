import {Component, OnInit, Input} from '@angular/core';

import {RoleService} from 'src/app/zynerator/security/Role.service';
import { ConfirmationService, MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { environment } from 'src/environments/environment';
import { DatePipe } from '@angular/common';

import { StringUtilService } from 'src/app/zynerator/util/StringUtil.service';
import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {CategorieProfService} from 'src/app/controller/service/CategorieProf.service';
import {CategorieProfDto} from 'src/app/controller/model/CategorieProf.model';
import {CategorieProfCriteria} from 'src/app/controller/criteria/CategorieProfCriteria.model';
import {ClassRoomDto} from 'src/app/controller/model/ClassRoom.model';
import {ClassRoomService} from 'src/app/controller/service/ClassRoom.service';
import {ParcoursDto} from 'src/app/controller/model/Parcours.model';
import {ParcoursService} from 'src/app/controller/service/Parcours.service';
import {TypeTeacherDto} from 'src/app/controller/model/TypeTeacher.model';
import {TypeTeacherService} from 'src/app/controller/service/TypeTeacher.service';
import {RecommendTeacherDto} from 'src/app/controller/model/RecommendTeacher.model';
import {RecommendTeacherService} from 'src/app/controller/service/RecommendTeacher.service';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import {ProfService} from 'src/app/controller/service/Prof.service';
import {TrancheHoraireProfDto} from 'src/app/controller/model/TrancheHoraireProf.model';
import {TrancheHoraireProfService} from 'src/app/controller/service/TrancheHoraireProf.service';
@Component({
  selector: 'app-categorie-prof-create-admin',
  templateUrl: './categorie-prof-create-admin.component.html'
})
export class CategorieProfCreateAdminComponent extends AbstractCreateController<CategorieProfDto, CategorieProfCriteria, CategorieProfService>  implements OnInit {

    private _profsElement = new ProfDto();


   private _validCategorieProfCode = true;
    private _validProfsRef = true;

    constructor(private datePipe: DatePipe, private categorieProfService: CategorieProfService
     , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
    , private confirmationService: ConfirmationService, private router: Router  
, private profService: ProfService, private parcoursService: ParcoursService, private typeTeacherService: TypeTeacherService
    ) {
        super(datePipe, categorieProfService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
        this.profsElement.levelMin = new ParcoursDto();
        this.levelMinService.findAll().subscribe((data) => this.levelMins = data);
        this.profsElement.levelMax = new ParcoursDto();
        this.levelMaxService.findAll().subscribe((data) => this.levelMaxs = data);
        this.profsElement.typeTeacher = new TypeTeacherDto();
        this.typeTeacherService.findAll().subscribe((data) => this.typeTeachers = data);
}



    validateProfs(){
        this.errorMessages = new Array();
        this.validateProfsRef();
    }


    public setValidation(value: boolean){
        this.validCategorieProfCode = value;
        this.validProfsRef = value;
    }

    public addProfs() {
        if( this.item.profs == null )
            this.item.profs = new Array<ProfDto>();
       this.validateProfs();
       if (this.errorMessages.length === 0) {
              this.item.profs.push({... this.profsElement});
              this.profsElement = new ProfDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteProf(p: ProfDto) {
        this.item.profs.forEach((element, index) => {
            if (element === p) { this.item.profs.splice(index, 1); }
        });
    }

    public editProf(p: ProfDto) {
        this.profsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateCategorieProfCode();
    }

    public validateCategorieProfCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validCategorieProfCode = false;
        } else {
            this.validCategorieProfCode = true;
        }
    }

    public validateProfsRef(){
        if (this.profsElement.ref == null) {
            this.errorMessages.push('Ref de la prof est  invalide');
            this.validProfsRef = false;
        } else {
            this.validProfsRef = true;
        }
    }

    public async openCreateLevelMin(levelMin: string) {
    const isPermistted = await this.roleService.isPermitted('Parcours', 'add');
    if(isPermistted) {
         this.levelMin = new ParcoursDto();
         this.createLevelMinDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateLevelMax(levelMax: string) {
    const isPermistted = await this.roleService.isPermitted('Parcours', 'add');
    if(isPermistted) {
         this.levelMax = new ParcoursDto();
         this.createLevelMaxDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }
    public async openCreateTypeTeacher(typeTeacher: string) {
    const isPermistted = await this.roleService.isPermitted('TypeTeacher', 'add');
    if(isPermistted) {
         this.typeTeacher = new TypeTeacherDto();
         this.createTypeTeacherDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get levelMin(): ParcoursDto {
        return this.parcoursService.item;
    }
    set levelMin(value: ParcoursDto) {
        this.parcoursService.item = value;
    }
    get levelMins(): Array<ParcoursDto> {
        return this.parcoursService.items;
    }
    set levelMins(value: Array<ParcoursDto>) {
        this.parcoursService.items = value;
    }
    get createLevelMinDialog(): boolean {
       return this.parcoursService.createDialog;
    }
    set createLevelMinDialog(value: boolean) {
        this.parcoursService.createDialog= value;
    }
    get levelMax(): ParcoursDto {
        return this.parcoursService.item;
    }
    set levelMax(value: ParcoursDto) {
        this.parcoursService.item = value;
    }
    get levelMaxs(): Array<ParcoursDto> {
        return this.parcoursService.items;
    }
    set levelMaxs(value: Array<ParcoursDto>) {
        this.parcoursService.items = value;
    }
    get createLevelMaxDialog(): boolean {
       return this.parcoursService.createDialog;
    }
    set createLevelMaxDialog(value: boolean) {
        this.parcoursService.createDialog= value;
    }
    get typeTeacher(): TypeTeacherDto {
        return this.typeTeacherService.item;
    }
    set typeTeacher(value: TypeTeacherDto) {
        this.typeTeacherService.item = value;
    }
    get typeTeachers(): Array<TypeTeacherDto> {
        return this.typeTeacherService.items;
    }
    set typeTeachers(value: Array<TypeTeacherDto>) {
        this.typeTeacherService.items = value;
    }
    get createTypeTeacherDialog(): boolean {
       return this.typeTeacherService.createDialog;
    }
    set createTypeTeacherDialog(value: boolean) {
        this.typeTeacherService.createDialog= value;
    }



    get validCategorieProfCode(): boolean {
        return this._validCategorieProfCode;
    }

    set validCategorieProfCode(value: boolean) {
         this._validCategorieProfCode = value;
    }

    get validProfsRef(): boolean {
        return this._validProfsRef;
    }
    set validProfsRef(value: boolean) {
        this._validProfsRef = value;
    }

    get profsElement(): ProfDto {
        if( this._profsElement == null )
            this._profsElement = new ProfDto();
        return this._profsElement;
    }

    set profsElement(value: ProfDto) {
        this._profsElement = value;
    }

}
