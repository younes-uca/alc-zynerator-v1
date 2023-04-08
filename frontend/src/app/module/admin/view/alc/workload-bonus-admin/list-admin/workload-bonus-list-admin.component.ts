import {Component, OnInit} from '@angular/core';
import {WorkloadBonusService} from 'src/app/controller/service/WorkloadBonus.service';
import {WorkloadBonusDto} from 'src/app/controller/model/WorkloadBonus.model';
import {WorkloadBonusCriteria} from 'src/app/controller/criteria/WorkloadBonusCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import {Router} from '@angular/router';
import { environment } from 'src/environments/environment';
import { RoleService } from 'src/app/zynerator/security/Role.service';
import {DatePipe} from '@angular/common';


import { WorkloadBonusService } from 'src/app/controller/service/WorkloadBonus.service';
import { ProfService } from 'src/app/controller/service/Prof.service';
import { SalaryService } from 'src/app/controller/service/Salary.service';

import {SalaryDto} from 'src/app/controller/model/Salary.model';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import { MessageService, ConfirmationService } from 'primeng/api';
import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { ExportService } from 'src/app/zynerator/util/Export.service';

@Component({
  selector: 'app-workload-bonus-list-admin',
  templateUrl: './workload-bonus-list-admin.component.html'
})
export class WorkloadBonusListAdminComponent extends AbstractListController<WorkloadBonusDto, WorkloadBonusCriteria, WorkloadBonusService>  implements OnInit {

    fileName = 'WorkloadBonus';

    workloadBonuss :Array<WorkloadBonusDto>;
    profs :Array<ProfDto>;
    salarys :Array<SalaryDto>;
  
    constructor(datePipe: DatePipe, workloadBonusService: WorkloadBonusService, messageService: MessageService, confirmationService: ConfirmationService
        , roleService: RoleService, router: Router , authService: AuthService , exportService: ExportService
, private workloadBonusService: WorkloadBonusService, private profService: ProfService, private salaryService: SalaryService) {
        super(datePipe, workloadBonusService, messageService, confirmationService, roleService, router, authService, exportService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadWorkloadBonus();
      this.loadProf();
      this.loadSalary();
    }

    public async loadWorkloadBonuss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('WorkloadBonus', 'list');
        isPermistted ? this.service.findAll().subscribe(workloadBonuss => this.items = workloadBonuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'workloadBonus?.id', header: 'Workload bonus'},
            {field: 'prof?.ref', header: 'Prof'},
            {field: 'mois', header: 'Mois'},
            {field: 'annee', header: 'Annee'},
            {field: 'salary?.code', header: 'Salary'},
        ];
    }


    public async loadWorkloadBonus(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('WorkloadBonus', 'list');
        isPermistted ? this.workloadBonusService.findAll().subscribe(workloadBonuss => this.workloadBonuss = workloadBonuss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadProf(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('WorkloadBonus', 'list');
        isPermistted ? this.profService.findAll().subscribe(profs => this.profs = profs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadSalary(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('WorkloadBonus', 'list');
        isPermistted ? this.salaryService.findAll().subscribe(salarys => this.salarys = salarys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: WorkloadBonusDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                'Workload bonus': e.workloadBonus?.id ,
                'Prof': e.prof?.ref ,
                 'Mois': e.mois ,
                 'Annee': e.annee ,
                'Salary': e.salary?.code ,
            }
        });

        this.criteriaData = [{
        //'Workload bonus': this.criteria.workloadBonus?.id ? this.criteria.workloadBonus?.id : environment.emptyForExport ,
        //'Prof': this.criteria.prof?.ref ? this.criteria.prof?.ref : environment.emptyForExport ,
            'Mois Min': this.criteria.moisMin ? this.criteria.moisMin : environment.emptyForExport ,
            'Mois Max': this.criteria.moisMax ? this.criteria.moisMax : environment.emptyForExport ,
            'Annee Min': this.criteria.anneeMin ? this.criteria.anneeMin : environment.emptyForExport ,
            'Annee Max': this.criteria.anneeMax ? this.criteria.anneeMax : environment.emptyForExport ,
        //'Salary': this.criteria.salary?.code ? this.criteria.salary?.code : environment.emptyForExport ,
        }];
      }
}
