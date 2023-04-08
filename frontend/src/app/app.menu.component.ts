import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {
  trigger,
  state,
  style,
  transition,
  animate,
} from '@angular/animations';
import { AppComponent } from './app.component';
import { AppMainComponent } from './app.main.component';

import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { RoleService } from 'src/app/zynerator/security/Role.service';

@Component({
  selector: 'app-menu',
  templateUrl: './app.menu.component.html',
  animations: [
    trigger('inline', [
      state(
        'hidden',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visible',
        style({
          height: '*',
        })
      ),
      state(
        'hiddenAnimated',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visibleAnimated',
        style({
          height: '*',
        })
      ),
      transition(
        'visibleAnimated => hiddenAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
      transition(
        'hiddenAnimated => visibleAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
    ]),
  ],
})
export class AppMenuComponent implements OnInit {
  model: any[];
  modelsuperadmin:any[];
  modelanonymous: any[];
    modeladmin : any[];
  constructor(public app: AppComponent,
   public appMain: AppMainComponent,
   private roleService: RoleService,
   private authService:AuthService,
  private router: Router) {}

  ngOnInit() {


    this.modeladmin =
      [
              {
                label: 'Configuration',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste niveau etude',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/niveau-etude/list']
                    },
                    {
                      label: 'Liste statut free trial',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/statut-free-trial/list']
                    },
                ]
              },
              {
                label: 'Hopital Management',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste services',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/services/list']
                    },
                    {
                      label: 'Liste teacher locality',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/teacher-locality/list']
                    },
                ]
              },
              {
                label: 'Gestion Commande',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste invite student',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/invite-student/list']
                    },
                    {
                      label: 'Liste news',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/news/list']
                    },
                    {
                      label: 'Liste workload bonus prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/workload-bonus-prof/list']
                    },
                    {
                      label: 'Liste reponse etudiant home work',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/reponse-etudiant-home-work/list']
                    },
                    {
                      label: 'Liste home work',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/home-work/list']
                    },
                    {
                      label: 'Liste home work etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/home-work-etudiant/list']
                    },
                    {
                      label: 'Liste groupe etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/groupe-etudiant/list']
                    },
                    {
                      label: 'Liste class average bonus',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/class-average-bonus/list']
                    },
                    {
                      label: 'Liste categorie prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/categorie-prof/list']
                    },
                    {
                      label: 'Liste class room',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/class-room/list']
                    },
                    {
                      label: 'Liste parcours',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/parcours/list']
                    },
                    {
                      label: 'Liste niveau etude',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/niveau-etude/list']
                    },
                    {
                      label: 'Liste session cours',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/session-cours/list']
                    },
                    {
                      label: 'Liste inscription',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/inscription/list']
                    },
                    {
                      label: 'Liste etat inscription',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etat-inscription/list']
                    },
                    {
                      label: 'Liste class average bonus prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/class-average-bonus-prof/list']
                    },
                    {
                      label: 'Liste etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etudiant/list']
                    },
                    {
                      label: 'Liste free trial configuration',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial-configuration/list']
                    },
                    {
                      label: 'Liste type reclamation prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/type-reclamation-prof/list']
                    },
                    {
                      label: 'Liste faq type',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/faq-type/list']
                    },
                    {
                      label: 'Liste calendrier prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/calendrier-prof/list']
                    },
                    {
                      label: 'Liste admin',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/admin/list']
                    },
                    {
                      label: 'Liste type reclamation etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/type-reclamation-etudiant/list']
                    },
                    {
                      label: 'Liste quiz class room',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/quiz-class-room/list']
                    },
                    {
                      label: 'Liste statut social',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/statut-social/list']
                    },
                    {
                      label: 'Liste quiz',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/quiz/list']
                    },
                    {
                      label: 'Liste groupe etude',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/groupe-etude/list']
                    },
                    {
                      label: 'Liste type home work',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/type-home-work/list']
                    },
                    {
                      label: 'Liste cours',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/cours/list']
                    },
                    {
                      label: 'Liste free trial teacher whats template',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial-teacher-whats-template/list']
                    },
                    {
                      label: 'Liste section item',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/section-item/list']
                    },
                    {
                      label: 'Liste free trial',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial/list']
                    },
                    {
                      label: 'Liste section',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/section/list']
                    },
                    {
                      label: 'Liste etudiant cours',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etudiant-cours/list']
                    },
                    {
                      label: 'Liste free trial student whats template',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial-student-whats-template/list']
                    },
                    {
                      label: 'Liste level test configuration',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/level-test-configuration/list']
                    },
                    {
                      label: 'Liste reponse etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/reponse-etudiant/list']
                    },
                    {
                      label: 'Liste etat etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etat-etudiant/list']
                    },
                    {
                      label: 'Liste free trial detail',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial-detail/list']
                    },
                    {
                      label: 'Liste schedule prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/schedule-prof/list']
                    },
                    {
                      label: 'Liste fonction',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/fonction/list']
                    },
                    {
                      label: 'Liste howe work q s t reponse',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/howe-work-q-s-t-reponse/list']
                    },
                    {
                      label: 'Liste contact',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/contact/list']
                    },
                    {
                      label: 'Liste type teacher',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/type-teacher/list']
                    },
                    {
                      label: 'Liste etudiant class room',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etudiant-class-room/list']
                    },
                    {
                      label: 'Liste etat reponse',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etat-reponse/list']
                    },
                    {
                      label: 'Liste resultat home work',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/resultat-home-work/list']
                    },
                    {
                      label: 'Liste confirmation token',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/confirmation-token/list']
                    },
                    {
                      label: 'Liste super categorie section',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/super-categorie-section/list']
                    },
                    {
                      label: 'Liste faq',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/faq/list']
                    },
                    {
                      label: 'Liste categorie section',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/categorie-section/list']
                    },
                    {
                      label: 'Liste pack student',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/pack-student/list']
                    },
                    {
                      label: 'Liste groupe etudiant detail',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/groupe-etudiant-detail/list']
                    },
                    {
                      label: 'Liste type de question',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/type-de-question/list']
                    },
                    {
                      label: 'Liste tranche horaire prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/tranche-horaire-prof/list']
                    },
                    {
                      label: 'Liste free trialformule',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trialformule/list']
                    },
                    {
                      label: 'Liste etat etudiant schedule',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etat-etudiant-schedule/list']
                    },
                    {
                      label: 'Liste home work question',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/home-work-question/list']
                    },
                    {
                      label: 'Liste question',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/question/list']
                    },
                    {
                      label: 'Liste recommend teacher',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/recommend-teacher/list']
                    },
                    {
                      label: 'Liste price',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/price/list']
                    },
                    {
                      label: 'Liste centre',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/centre/list']
                    },
                    {
                      label: 'Liste reclamation etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/reclamation-etudiant/list']
                    },
                    {
                      label: 'Liste skill',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/skill/list']
                    },
                    {
                      label: 'Liste prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/prof/list']
                    },
                    {
                      label: 'Liste workload bonus',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/workload-bonus/list']
                    },
                    {
                      label: 'Liste langue',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/langue/list']
                    },
                    {
                      label: 'Liste paiement',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/paiement/list']
                    },
                    {
                      label: 'Liste free trial student email template',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial-student-email-template/list']
                    },
                    {
                      label: 'Liste reponse',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/reponse/list']
                    },
                    {
                      label: 'Liste interet etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/interet-etudiant/list']
                    },
                    {
                      label: 'Liste quiz etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/quiz-etudiant/list']
                    },
                    {
                      label: 'Liste dictionary',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/dictionary/list']
                    },
                    {
                      label: 'Liste salary',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/salary/list']
                    },
                    {
                      label: 'Liste etat cours',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etat-cours/list']
                    },
                    {
                      label: 'Liste prof review',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/prof-review/list']
                    },
                    {
                      label: 'Liste reclamation prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/reclamation-prof/list']
                    },
                    {
                      label: 'Liste vocabulary quiz',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/vocabulary-quiz/list']
                    },
                    {
                      label: 'Liste faq etudiant',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/faq-etudiant/list']
                    },
                    {
                      label: 'Liste free trial teacher email template',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/free-trial-teacher-email-template/list']
                    },
                    {
                      label: 'Liste vocabulary',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/vocabulary/list']
                    },
                    {
                      label: 'Liste etudiant review',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/etudiant-review/list']
                    },
                    {
                      label: 'Liste faq prof',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/alc/faq-prof/list']
                    },
                ]
              },
    ]
        if (this.authService.authenticated) {
      if (this.authService.authenticatedUser.roles) {

        this.authService.authenticatedUser.roles.forEach(role => {
          const roleName: string = this.getRole(role);
          this.roleService._role.next(roleName.toUpperCase());
          eval('this.model = this.model' + this.getRole(role));
        })
      }

    }
  }
  getRole(text){
  const [role, ...rest] = text.split('_');
  return rest.join('').toLowerCase();
}
  onMenuClick(event) {
    this.appMain.onMenuClick(event);
  }
}
