import {Component, OnInit, Input} from '@angular/core';

import {ConfirmationService, MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {WorkloadBonusProfService} from 'src/app/controller/service/WorkloadBonusProf.service';
import {WorkloadBonusProfDto} from 'src/app/controller/model/WorkloadBonusProf.model';
import {WorkloadBonusProfCriteria} from 'src/app/controller/criteria/WorkloadBonusProfCriteria.model';



@Component({
  selector: 'app-workload-bonus-prof-edit-admin',
  templateUrl: './workload-bonus-prof-edit-admin.component.html'
})
export class WorkloadBonusProfEditAdminComponent extends AbstractEditController<WorkloadBonusProfDto, WorkloadBonusProfCriteria, WorkloadBonusProfService>   implements OnInit {


    private _validWorkloadBonusProfCode = true;




    constructor(private datePipe: DatePipe, private workloadBonusProfService: WorkloadBonusProfService
        , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
        , private confirmationService: ConfirmationService, private router: Router  

    ) {
        super(datePipe, workloadBonusProfService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
}

    public setValidation(value : boolean){
        this.validWorkloadBonusProfCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateWorkloadBonusProfCode();
    }
    public validateWorkloadBonusProfCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validWorkloadBonusProfCode = false;
        } else {
            this.validWorkloadBonusProfCode = true;
        }
    }






    get validWorkloadBonusProfCode(): boolean {
        return this._validWorkloadBonusProfCode;
    }
    set validWorkloadBonusProfCode(value: boolean) {
        this._validWorkloadBonusProfCode = value;
    }

}
