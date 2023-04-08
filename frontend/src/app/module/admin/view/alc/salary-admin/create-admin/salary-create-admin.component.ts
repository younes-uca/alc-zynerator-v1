import {Component, OnInit, Input} from '@angular/core';

import {RoleService} from 'src/app/zynerator/security/Role.service';
import { ConfirmationService, MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { environment } from 'src/environments/environment';
import { DatePipe } from '@angular/common';

import { StringUtilService } from 'src/app/zynerator/util/StringUtil.service';
import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {SalaryService} from 'src/app/controller/service/Salary.service';
import {SalaryDto} from 'src/app/controller/model/Salary.model';
import {SalaryCriteria} from 'src/app/controller/criteria/SalaryCriteria.model';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import {ProfService} from 'src/app/controller/service/Prof.service';
@Component({
  selector: 'app-salary-create-admin',
  templateUrl: './salary-create-admin.component.html'
})
export class SalaryCreateAdminComponent extends AbstractCreateController<SalaryDto, SalaryCriteria, SalaryService>  implements OnInit {



   private _validSalaryCode = true;
    private _validProfRef = true;

    constructor(private datePipe: DatePipe, private salaryService: SalaryService
     , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
    , private confirmationService: ConfirmationService, private router: Router  
, private profService: ProfService
    ) {
        super(datePipe, salaryService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
    this.prof = new ProfDto();
    this.profService.findAll().subscribe((data) => this.profs = data);
}





    public setValidation(value: boolean){
        this.validSalaryCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSalaryCode();
    }

    public validateSalaryCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validSalaryCode = false;
        } else {
            this.validSalaryCode = true;
        }
    }


    public async openCreateProf(prof: string) {
    const isPermistted = await this.roleService.isPermitted('Prof', 'add');
    if(isPermistted) {
         this.prof = new ProfDto();
         this.createProfDialog = true;
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



    get validSalaryCode(): boolean {
        return this._validSalaryCode;
    }

    set validSalaryCode(value: boolean) {
         this._validSalaryCode = value;
    }

    get validProfRef(): boolean {
        return this._validProfRef;
    }
    set validProfRef(value: boolean) {
        this._validProfRef = value;
    }


}
