import {Component, OnInit, Input} from '@angular/core';

import {ConfirmationService, MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {EtudiantCoursService} from 'src/app/controller/service/EtudiantCours.service';
import {EtudiantCoursDto} from 'src/app/controller/model/EtudiantCours.model';
import {EtudiantCoursCriteria} from 'src/app/controller/criteria/EtudiantCoursCriteria.model';


import {EtudiantDto} from 'src/app/controller/model/Etudiant.model';
import {EtudiantService} from 'src/app/controller/service/Etudiant.service';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import {ProfService} from 'src/app/controller/service/Prof.service';
import {CoursDto} from 'src/app/controller/model/Cours.model';
import {CoursService} from 'src/app/controller/service/Cours.service';

@Component({
  selector: 'app-etudiant-cours-edit-admin',
  templateUrl: './etudiant-cours-edit-admin.component.html'
})
export class EtudiantCoursEditAdminComponent extends AbstractEditController<EtudiantCoursDto, EtudiantCoursCriteria, EtudiantCoursService>   implements OnInit {



    private _validEtudiantRef = true;
    private _validProfRef = true;
    private _validCoursCode = true;
    private _validCoursLibelle = true;



    constructor(private datePipe: DatePipe, private etudiantCoursService: EtudiantCoursService
        , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
        , private confirmationService: ConfirmationService, private router: Router  
, private etudiantService: EtudiantService, private profService: ProfService, private coursService: CoursService
    ) {
        super(datePipe, etudiantCoursService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
    this.etudiant = new EtudiantDto();
    this.etudiantService.findAll().subscribe((data) => this.etudiants = data);
    this.prof = new ProfDto();
    this.profService.findAll().subscribe((data) => this.profs = data);
    this.cours = new CoursDto();
    this.coursService.findAll().subscribe((data) => this.courss = data);
}

    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



   public async openCreateProf(prof: string) {
        const isPermistted = await this.roleService.isPermitted('Prof', 'edit');
        if(isPermistted) {
             this.prof = new ProfDto();
             this.createProfDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateCours(cours: string) {
        const isPermistted = await this.roleService.isPermitted('Cours', 'edit');
        if(isPermistted) {
             this.cours = new CoursDto();
             this.createCoursDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateEtudiant(etudiant: string) {
        const isPermistted = await this.roleService.isPermitted('Etudiant', 'edit');
        if(isPermistted) {
             this.etudiant = new EtudiantDto();
             this.createEtudiantDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get prof(): ProfDto {
       return this.profService.item;
   }
  set prof(value: ProfDto) {
        this.profService.item = value;
   }
   get profs(): Array<ProfDto> {
        return this.profService.items;
   }
   set profs(value: Array<ProfDto>) {
        this.profService.items = value;
   }
   get createProfDialog(): boolean {
       return this.profService.createDialog;
   }
  set createProfDialog(value: boolean) {
       this.profService.createDialog= value;
   }
   get cours(): CoursDto {
       return this.coursService.item;
   }
  set cours(value: CoursDto) {
        this.coursService.item = value;
   }
   get courss(): Array<CoursDto> {
        return this.coursService.items;
   }
   set courss(value: Array<CoursDto>) {
        this.coursService.items = value;
   }
   get createCoursDialog(): boolean {
       return this.coursService.createDialog;
   }
  set createCoursDialog(value: boolean) {
       this.coursService.createDialog= value;
   }
   get etudiant(): EtudiantDto {
       return this.etudiantService.item;
   }
  set etudiant(value: EtudiantDto) {
        this.etudiantService.item = value;
   }
   get etudiants(): Array<EtudiantDto> {
        return this.etudiantService.items;
   }
   set etudiants(value: Array<EtudiantDto>) {
        this.etudiantService.items = value;
   }
   get createEtudiantDialog(): boolean {
       return this.etudiantService.createDialog;
   }
  set createEtudiantDialog(value: boolean) {
       this.etudiantService.createDialog= value;
   }



    get validEtudiantRef(): boolean {
        return this._validEtudiantRef;
    }
    set validEtudiantRef(value: boolean) {
        this._validEtudiantRef = value;
    }
    get validProfRef(): boolean {
        return this._validProfRef;
    }
    set validProfRef(value: boolean) {
        this._validProfRef = value;
    }
    get validCoursCode(): boolean {
        return this._validCoursCode;
    }
    set validCoursCode(value: boolean) {
        this._validCoursCode = value;
    }
    get validCoursLibelle(): boolean {
        return this._validCoursLibelle;
    }
    set validCoursLibelle(value: boolean) {
        this._validCoursLibelle = value;
    }
}
