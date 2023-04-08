import {Component, OnInit, Input} from '@angular/core';

import {RoleService} from 'src/app/zynerator/security/Role.service';
import { ConfirmationService, MessageService } from 'primeng/api';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { environment } from 'src/environments/environment';
import { DatePipe } from '@angular/common';

import { StringUtilService } from 'src/app/zynerator/util/StringUtil.service';
import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {EtatEtudiantService} from 'src/app/controller/service/EtatEtudiant.service';
import {EtatEtudiantDto} from 'src/app/controller/model/EtatEtudiant.model';
import {EtatEtudiantCriteria} from 'src/app/controller/criteria/EtatEtudiantCriteria.model';
@Component({
  selector: 'app-etat-etudiant-create-admin',
  templateUrl: './etat-etudiant-create-admin.component.html'
})
export class EtatEtudiantCreateAdminComponent extends AbstractCreateController<EtatEtudiantDto, EtatEtudiantCriteria, EtatEtudiantService>  implements OnInit {



   private _validEtatEtudiantReference = true;

    constructor(private datePipe: DatePipe, private etatEtudiantService: EtatEtudiantService
     , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
    , private confirmationService: ConfirmationService, private router: Router  

    ) {
        super(datePipe, etatEtudiantService, messageService, confirmationService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validEtatEtudiantReference = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEtatEtudiantReference();
    }

    public validateEtatEtudiantReference(){
        if (this.stringUtilService.isEmpty(this.item.reference)) {
        this.errorMessages.push('Reference non valide');
        this.validEtatEtudiantReference = false;
        } else {
            this.validEtatEtudiantReference = true;
        }
    }






    get validEtatEtudiantReference(): boolean {
        return this._validEtatEtudiantReference;
    }

    set validEtatEtudiantReference(value: boolean) {
         this._validEtatEtudiantReference = value;
    }



}
