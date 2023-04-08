import {Component, OnInit} from '@angular/core';
import {ProfService} from 'src/app/controller/service/Prof.service';
import {ProfDto} from 'src/app/controller/model/Prof.model';
import {ProfCriteria} from 'src/app/controller/criteria/ProfCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import {Router} from '@angular/router';
import { environment } from 'src/environments/environment';
import { RoleService } from 'src/app/zynerator/security/Role.service';
import {DatePipe} from '@angular/common';


import { ParcoursService } from 'src/app/controller/service/Parcours.service';
import { ParcoursService } from 'src/app/controller/service/Parcours.service';
import { CategorieProfService } from 'src/app/controller/service/CategorieProf.service';
import { TypeTeacherService } from 'src/app/controller/service/TypeTeacher.service';

import {ParcoursDto} from 'src/app/controller/model/Parcours.model';
import {TypeTeacherDto} from 'src/app/controller/model/TypeTeacher.model';
import {RecommendTeacherDto} from 'src/app/controller/model/RecommendTeacher.model';
import {CategorieProfDto} from 'src/app/controller/model/CategorieProf.model';
import {TrancheHoraireProfDto} from 'src/app/controller/model/TrancheHoraireProf.model';
import {ClassRoomDto} from 'src/app/controller/model/ClassRoom.model';
import { MessageService, ConfirmationService } from 'primeng/api';
import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { ExportService } from 'src/app/zynerator/util/Export.service';

@Component({
  selector: 'app-prof-list-admin',
  templateUrl: './prof-list-admin.component.html'
})
export class ProfListAdminComponent extends AbstractListController<ProfDto, ProfCriteria, ProfService>  implements OnInit {

    fileName = 'Prof';

     yesOrNoCredentialsNonExpired :any[] =[];
     yesOrNoEnabled :any[] =[];
     yesOrNoAccountNonExpired :any[] =[];
     yesOrNoAccountNonLocked :any[] =[];
     yesOrNoPasswordChanged :any[] =[];
    levelMins :Array<ParcoursDto>;
    levelMaxs :Array<ParcoursDto>;
    categorieProfs :Array<CategorieProfDto>;
    typeTeachers :Array<TypeTeacherDto>;
  
    constructor(datePipe: DatePipe, profService: ProfService, messageService: MessageService, confirmationService: ConfirmationService
        , roleService: RoleService, router: Router , authService: AuthService , exportService: ExportService
, private parcoursService: ParcoursService, private parcoursService: ParcoursService, private categorieProfService: CategorieProfService, private typeTeacherService: TypeTeacherService) {
        super(datePipe, profService, messageService, confirmationService, roleService, router, authService, exportService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLevelMin();
      this.loadLevelMax();
      this.loadCategorieProf();
      this.loadTypeTeacher();
    this.yesOrNoCredentialsNonExpired =  [{label: 'CredentialsNonExpired', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoEnabled =  [{label: 'Enabled', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoAccountNonExpired =  [{label: 'AccountNonExpired', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoAccountNonLocked =  [{label: 'AccountNonLocked', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoPasswordChanged =  [{label: 'PasswordChanged', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    }

    public async loadProfs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Prof', 'list');
        isPermistted ? this.service.findAll().subscribe(profs => this.items = profs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'ref', header: 'Ref'},
            {field: 'about', header: 'About'},
            {field: 'email', header: 'Email'},
            {field: 'levelMin?.libelle', header: 'Level min'},
            {field: 'levelMax?.libelle', header: 'Level max'},
            {field: 'categorieProf?.code', header: 'Categorie prof'},
            {field: 'typeTeacher?.libelle', header: 'Type teacher'},
            {field: 'credentialsNonExpired', header: 'Credentials non expired'},
            {field: 'enabled', header: 'Enabled'},
            {field: 'accountNonExpired', header: 'Account non expired'},
            {field: 'accountNonLocked', header: 'Account non locked'},
            {field: 'passwordChanged', header: 'Password changed'},
            {field: 'createdAt', header: 'Created at'},
            {field: 'updatedAt', header: 'Updated at'},
            {field: 'username', header: 'Username'},
            {field: 'password', header: 'Password'},
            {field: 'prenom', header: 'Prenom'},
            {field: 'nom', header: 'Nom'},
        ];
    }


    public async loadLevelMin(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Prof', 'list');
        isPermistted ? this.parcoursService.findAll().subscribe(levelMins => this.levelMins = levelMins,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadLevelMax(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Prof', 'list');
        isPermistted ? this.parcoursService.findAll().subscribe(levelMaxs => this.levelMaxs = levelMaxs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadCategorieProf(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Prof', 'list');
        isPermistted ? this.categorieProfService.findAll().subscribe(categorieProfs => this.categorieProfs = categorieProfs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadTypeTeacher(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Prof', 'list');
        isPermistted ? this.typeTeacherService.findAll().subscribe(typeTeachers => this.typeTeachers = typeTeachers,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ProfDto) {
        if (res.trancheHoraireProfList != null) {
             res.trancheHoraireProfList.forEach(d => { d.prof = null; d.id = null; });
        }
        if (res.classRooms != null) {
             res.classRooms.forEach(d => { d.prof = null; d.id = null; });
        }
        if (res.recommendTeachers != null) {
             res.recommendTeachers.forEach(d => { d.prof = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Ref': e.ref ,
                 'About': e.about ,
                 'Email': e.email ,
                'Level min': e.levelMin?.libelle ,
                'Level max': e.levelMax?.libelle ,
                'Categorie prof': e.categorieProf?.code ,
                'Type teacher': e.typeTeacher?.libelle ,
                'Credentials non expired': e.credentialsNonExpired? 'Vrai' : 'Faux' ,
                'Enabled': e.enabled? 'Vrai' : 'Faux' ,
                'Account non expired': e.accountNonExpired? 'Vrai' : 'Faux' ,
                'Account non locked': e.accountNonLocked? 'Vrai' : 'Faux' ,
                'Password changed': e.passwordChanged? 'Vrai' : 'Faux' ,
                 'Created at': e.createdAt ,
                 'Updated at': e.updatedAt ,
                 'Username': e.username ,
                 'Password': e.password ,
                 'Prenom': e.prenom ,
                 'Nom': e.nom ,
            }
        });

        this.criteriaData = [{
            'Ref': this.criteria.ref ? this.criteria.ref : environment.emptyForExport ,
            'About': this.criteria.about ? this.criteria.about : environment.emptyForExport ,
            'Email': this.criteria.email ? this.criteria.email : environment.emptyForExport ,
        //'Level min': this.criteria.levelMin?.libelle ? this.criteria.levelMin?.libelle : environment.emptyForExport ,
        //'Level max': this.criteria.levelMax?.libelle ? this.criteria.levelMax?.libelle : environment.emptyForExport ,
        //'Categorie prof': this.criteria.categorieProf?.code ? this.criteria.categorieProf?.code : environment.emptyForExport ,
        //'Type teacher': this.criteria.typeTeacher?.libelle ? this.criteria.typeTeacher?.libelle : environment.emptyForExport ,
            'Credentials non expired': this.criteria.credentialsNonExpired ? (this.criteria.credentialsNonExpired ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Enabled': this.criteria.enabled ? (this.criteria.enabled ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Account non expired': this.criteria.accountNonExpired ? (this.criteria.accountNonExpired ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Account non locked': this.criteria.accountNonLocked ? (this.criteria.accountNonLocked ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Password changed': this.criteria.passwordChanged ? (this.criteria.passwordChanged ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Created at': this.criteria.createdAt ? this.criteria.createdAt : environment.emptyForExport ,
            'Updated at': this.criteria.updatedAt ? this.criteria.updatedAt : environment.emptyForExport ,
            'Username': this.criteria.username ? this.criteria.username : environment.emptyForExport ,
            'Password': this.criteria.password ? this.criteria.password : environment.emptyForExport ,
            'Prenom': this.criteria.prenom ? this.criteria.prenom : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
        }];
      }
}
