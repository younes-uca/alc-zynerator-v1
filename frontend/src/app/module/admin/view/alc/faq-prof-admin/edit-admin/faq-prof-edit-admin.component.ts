import {Component, OnInit, Input} from '@angular/core';

import {ConfirmationService, MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {FaqProfService} from 'src/app/controller/service/FaqProf.service';
import {FaqProfDto} from 'src/app/controller/model/FaqProf.model';
import {FaqProfCriteria} from 'src/app/controller/criteria/FaqProfCriteria.model';


import {AdminDto} from 'src/app/controller/model/Admin.model';
import {AdminService} from 'src/app/controller/service/Admin.service';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import {ProfService} from 'src/app/controller/service/Prof.service';
import {FaqTypeDto} from 'src/app/controller/model/FaqType.model';
import {FaqTypeService} from 'src/app/controller/service/FaqType.service';

@Component({
  selector: 'app-faq-prof-edit-admin',
  templateUrl: './faq-prof-edit-admin.component.html'
})
export class FaqProfEditAdminComponent extends AbstractEditController<FaqProfDto, FaqProfCriteria, FaqProfService>   implements OnInit {


    private _validFaqProfLibelle = true;

    private _validProfRef = true;
    private _validFaqTypeLibelle = true;



    constructor(private datePipe: DatePipe, private faqProfService: FaqProfService
        , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
        , private confirmationService: ConfirmationService, private router: Router  
, private adminService: AdminService, private profService: ProfService, private faqTypeService: FaqTypeService
    ) {
        super(datePipe, faqProfService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
    this.prof = new ProfDto();
    this.profService.findAll().subscribe((data) => this.profs = data);
    this.admin = new AdminDto();
    this.adminService.findAll().subscribe((data) => this.admins = data);
    this.faqType = new FaqTypeDto();
    this.faqTypeService.findAll().subscribe((data) => this.faqTypes = data);
}

    public setValidation(value : boolean){
        this.validFaqProfLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateFaqProfLibelle();
    }
    public validateFaqProfLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validFaqProfLibelle = false;
        } else {
            this.validFaqProfLibelle = true;
        }
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
   public async openCreateFaqType(faqType: string) {
        const isPermistted = await this.roleService.isPermitted('FaqType', 'edit');
        if(isPermistted) {
             this.faqType = new FaqTypeDto();
             this.createFaqTypeDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateAdmin(admin: string) {
        const isPermistted = await this.roleService.isPermitted('Admin', 'edit');
        if(isPermistted) {
             this.admin = new AdminDto();
             this.createAdminDialog = true;
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
   get faqType(): FaqTypeDto {
       return this.faqTypeService.item;
   }
  set faqType(value: FaqTypeDto) {
        this.faqTypeService.item = value;
   }
   get faqTypes(): Array<FaqTypeDto> {
        return this.faqTypeService.items;
   }
   set faqTypes(value: Array<FaqTypeDto>) {
        this.faqTypeService.items = value;
   }
   get createFaqTypeDialog(): boolean {
       return this.faqTypeService.createDialog;
   }
  set createFaqTypeDialog(value: boolean) {
       this.faqTypeService.createDialog= value;
   }
   get admin(): AdminDto {
       return this.adminService.item;
   }
  set admin(value: AdminDto) {
        this.adminService.item = value;
   }
   get admins(): Array<AdminDto> {
        return this.adminService.items;
   }
   set admins(value: Array<AdminDto>) {
        this.adminService.items = value;
   }
   get createAdminDialog(): boolean {
       return this.adminService.createDialog;
   }
  set createAdminDialog(value: boolean) {
       this.adminService.createDialog= value;
   }


    get validFaqProfLibelle(): boolean {
        return this._validFaqProfLibelle;
    }
    set validFaqProfLibelle(value: boolean) {
        this._validFaqProfLibelle = value;
    }

    get validProfRef(): boolean {
        return this._validProfRef;
    }
    set validProfRef(value: boolean) {
        this._validProfRef = value;
    }
    get validFaqTypeLibelle(): boolean {
        return this._validFaqTypeLibelle;
    }
    set validFaqTypeLibelle(value: boolean) {
        this._validFaqTypeLibelle = value;
    }
}
