import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';

import { InviteStudentCreateAdminComponent } from './invite-student-admin/create-admin/invite-student-create-admin.component';
import { InviteStudentEditAdminComponent } from './invite-student-admin/edit-admin/invite-student-edit-admin.component';
import { InviteStudentViewAdminComponent } from './invite-student-admin/view-admin/invite-student-view-admin.component';
import { InviteStudentListAdminComponent } from './invite-student-admin/list-admin/invite-student-list-admin.component';
import { NewsCreateAdminComponent } from './news-admin/create-admin/news-create-admin.component';
import { NewsEditAdminComponent } from './news-admin/edit-admin/news-edit-admin.component';
import { NewsViewAdminComponent } from './news-admin/view-admin/news-view-admin.component';
import { NewsListAdminComponent } from './news-admin/list-admin/news-list-admin.component';
import { WorkloadBonusProfCreateAdminComponent } from './workload-bonus-prof-admin/create-admin/workload-bonus-prof-create-admin.component';
import { WorkloadBonusProfEditAdminComponent } from './workload-bonus-prof-admin/edit-admin/workload-bonus-prof-edit-admin.component';
import { WorkloadBonusProfViewAdminComponent } from './workload-bonus-prof-admin/view-admin/workload-bonus-prof-view-admin.component';
import { WorkloadBonusProfListAdminComponent } from './workload-bonus-prof-admin/list-admin/workload-bonus-prof-list-admin.component';
import { ReponseEtudiantHomeWorkCreateAdminComponent } from './reponse-etudiant-home-work-admin/create-admin/reponse-etudiant-home-work-create-admin.component';
import { ReponseEtudiantHomeWorkEditAdminComponent } from './reponse-etudiant-home-work-admin/edit-admin/reponse-etudiant-home-work-edit-admin.component';
import { ReponseEtudiantHomeWorkViewAdminComponent } from './reponse-etudiant-home-work-admin/view-admin/reponse-etudiant-home-work-view-admin.component';
import { ReponseEtudiantHomeWorkListAdminComponent } from './reponse-etudiant-home-work-admin/list-admin/reponse-etudiant-home-work-list-admin.component';
import { HomeWorkCreateAdminComponent } from './home-work-admin/create-admin/home-work-create-admin.component';
import { HomeWorkEditAdminComponent } from './home-work-admin/edit-admin/home-work-edit-admin.component';
import { HomeWorkViewAdminComponent } from './home-work-admin/view-admin/home-work-view-admin.component';
import { HomeWorkListAdminComponent } from './home-work-admin/list-admin/home-work-list-admin.component';
import { HomeWorkEtudiantCreateAdminComponent } from './home-work-etudiant-admin/create-admin/home-work-etudiant-create-admin.component';
import { HomeWorkEtudiantEditAdminComponent } from './home-work-etudiant-admin/edit-admin/home-work-etudiant-edit-admin.component';
import { HomeWorkEtudiantViewAdminComponent } from './home-work-etudiant-admin/view-admin/home-work-etudiant-view-admin.component';
import { HomeWorkEtudiantListAdminComponent } from './home-work-etudiant-admin/list-admin/home-work-etudiant-list-admin.component';
import { GroupeEtudiantCreateAdminComponent } from './groupe-etudiant-admin/create-admin/groupe-etudiant-create-admin.component';
import { GroupeEtudiantEditAdminComponent } from './groupe-etudiant-admin/edit-admin/groupe-etudiant-edit-admin.component';
import { GroupeEtudiantViewAdminComponent } from './groupe-etudiant-admin/view-admin/groupe-etudiant-view-admin.component';
import { GroupeEtudiantListAdminComponent } from './groupe-etudiant-admin/list-admin/groupe-etudiant-list-admin.component';
import { ClassAverageBonusCreateAdminComponent } from './class-average-bonus-admin/create-admin/class-average-bonus-create-admin.component';
import { ClassAverageBonusEditAdminComponent } from './class-average-bonus-admin/edit-admin/class-average-bonus-edit-admin.component';
import { ClassAverageBonusViewAdminComponent } from './class-average-bonus-admin/view-admin/class-average-bonus-view-admin.component';
import { ClassAverageBonusListAdminComponent } from './class-average-bonus-admin/list-admin/class-average-bonus-list-admin.component';
import { ServicesCreateAdminComponent } from './services-admin/create-admin/services-create-admin.component';
import { ServicesEditAdminComponent } from './services-admin/edit-admin/services-edit-admin.component';
import { ServicesViewAdminComponent } from './services-admin/view-admin/services-view-admin.component';
import { ServicesListAdminComponent } from './services-admin/list-admin/services-list-admin.component';
import { CategorieProfCreateAdminComponent } from './categorie-prof-admin/create-admin/categorie-prof-create-admin.component';
import { CategorieProfEditAdminComponent } from './categorie-prof-admin/edit-admin/categorie-prof-edit-admin.component';
import { CategorieProfViewAdminComponent } from './categorie-prof-admin/view-admin/categorie-prof-view-admin.component';
import { CategorieProfListAdminComponent } from './categorie-prof-admin/list-admin/categorie-prof-list-admin.component';
import { ClassRoomCreateAdminComponent } from './class-room-admin/create-admin/class-room-create-admin.component';
import { ClassRoomEditAdminComponent } from './class-room-admin/edit-admin/class-room-edit-admin.component';
import { ClassRoomViewAdminComponent } from './class-room-admin/view-admin/class-room-view-admin.component';
import { ClassRoomListAdminComponent } from './class-room-admin/list-admin/class-room-list-admin.component';
import { ParcoursCreateAdminComponent } from './parcours-admin/create-admin/parcours-create-admin.component';
import { ParcoursEditAdminComponent } from './parcours-admin/edit-admin/parcours-edit-admin.component';
import { ParcoursViewAdminComponent } from './parcours-admin/view-admin/parcours-view-admin.component';
import { ParcoursListAdminComponent } from './parcours-admin/list-admin/parcours-list-admin.component';
import { NiveauEtudeCreateAdminComponent } from './niveau-etude-admin/create-admin/niveau-etude-create-admin.component';
import { NiveauEtudeEditAdminComponent } from './niveau-etude-admin/edit-admin/niveau-etude-edit-admin.component';
import { NiveauEtudeViewAdminComponent } from './niveau-etude-admin/view-admin/niveau-etude-view-admin.component';
import { NiveauEtudeListAdminComponent } from './niveau-etude-admin/list-admin/niveau-etude-list-admin.component';
import { SessionCoursCreateAdminComponent } from './session-cours-admin/create-admin/session-cours-create-admin.component';
import { SessionCoursEditAdminComponent } from './session-cours-admin/edit-admin/session-cours-edit-admin.component';
import { SessionCoursViewAdminComponent } from './session-cours-admin/view-admin/session-cours-view-admin.component';
import { SessionCoursListAdminComponent } from './session-cours-admin/list-admin/session-cours-list-admin.component';
import { InscriptionCreateAdminComponent } from './inscription-admin/create-admin/inscription-create-admin.component';
import { InscriptionEditAdminComponent } from './inscription-admin/edit-admin/inscription-edit-admin.component';
import { InscriptionViewAdminComponent } from './inscription-admin/view-admin/inscription-view-admin.component';
import { InscriptionListAdminComponent } from './inscription-admin/list-admin/inscription-list-admin.component';
import { EtatInscriptionCreateAdminComponent } from './etat-inscription-admin/create-admin/etat-inscription-create-admin.component';
import { EtatInscriptionEditAdminComponent } from './etat-inscription-admin/edit-admin/etat-inscription-edit-admin.component';
import { EtatInscriptionViewAdminComponent } from './etat-inscription-admin/view-admin/etat-inscription-view-admin.component';
import { EtatInscriptionListAdminComponent } from './etat-inscription-admin/list-admin/etat-inscription-list-admin.component';
import { ClassAverageBonusProfCreateAdminComponent } from './class-average-bonus-prof-admin/create-admin/class-average-bonus-prof-create-admin.component';
import { ClassAverageBonusProfEditAdminComponent } from './class-average-bonus-prof-admin/edit-admin/class-average-bonus-prof-edit-admin.component';
import { ClassAverageBonusProfViewAdminComponent } from './class-average-bonus-prof-admin/view-admin/class-average-bonus-prof-view-admin.component';
import { ClassAverageBonusProfListAdminComponent } from './class-average-bonus-prof-admin/list-admin/class-average-bonus-prof-list-admin.component';
import { EtudiantCreateAdminComponent } from './etudiant-admin/create-admin/etudiant-create-admin.component';
import { EtudiantEditAdminComponent } from './etudiant-admin/edit-admin/etudiant-edit-admin.component';
import { EtudiantViewAdminComponent } from './etudiant-admin/view-admin/etudiant-view-admin.component';
import { EtudiantListAdminComponent } from './etudiant-admin/list-admin/etudiant-list-admin.component';
import { FreeTrialConfigurationCreateAdminComponent } from './free-trial-configuration-admin/create-admin/free-trial-configuration-create-admin.component';
import { FreeTrialConfigurationEditAdminComponent } from './free-trial-configuration-admin/edit-admin/free-trial-configuration-edit-admin.component';
import { FreeTrialConfigurationViewAdminComponent } from './free-trial-configuration-admin/view-admin/free-trial-configuration-view-admin.component';
import { FreeTrialConfigurationListAdminComponent } from './free-trial-configuration-admin/list-admin/free-trial-configuration-list-admin.component';
import { TypeReclamationProfCreateAdminComponent } from './type-reclamation-prof-admin/create-admin/type-reclamation-prof-create-admin.component';
import { TypeReclamationProfEditAdminComponent } from './type-reclamation-prof-admin/edit-admin/type-reclamation-prof-edit-admin.component';
import { TypeReclamationProfViewAdminComponent } from './type-reclamation-prof-admin/view-admin/type-reclamation-prof-view-admin.component';
import { TypeReclamationProfListAdminComponent } from './type-reclamation-prof-admin/list-admin/type-reclamation-prof-list-admin.component';
import { FaqTypeCreateAdminComponent } from './faq-type-admin/create-admin/faq-type-create-admin.component';
import { FaqTypeEditAdminComponent } from './faq-type-admin/edit-admin/faq-type-edit-admin.component';
import { FaqTypeViewAdminComponent } from './faq-type-admin/view-admin/faq-type-view-admin.component';
import { FaqTypeListAdminComponent } from './faq-type-admin/list-admin/faq-type-list-admin.component';
import { CalendrierProfCreateAdminComponent } from './calendrier-prof-admin/create-admin/calendrier-prof-create-admin.component';
import { CalendrierProfEditAdminComponent } from './calendrier-prof-admin/edit-admin/calendrier-prof-edit-admin.component';
import { CalendrierProfViewAdminComponent } from './calendrier-prof-admin/view-admin/calendrier-prof-view-admin.component';
import { CalendrierProfListAdminComponent } from './calendrier-prof-admin/list-admin/calendrier-prof-list-admin.component';
import { AdminCreateAdminComponent } from './admin-admin/create-admin/admin-create-admin.component';
import { AdminEditAdminComponent } from './admin-admin/edit-admin/admin-edit-admin.component';
import { AdminViewAdminComponent } from './admin-admin/view-admin/admin-view-admin.component';
import { AdminListAdminComponent } from './admin-admin/list-admin/admin-list-admin.component';
import { TypeReclamationEtudiantCreateAdminComponent } from './type-reclamation-etudiant-admin/create-admin/type-reclamation-etudiant-create-admin.component';
import { TypeReclamationEtudiantEditAdminComponent } from './type-reclamation-etudiant-admin/edit-admin/type-reclamation-etudiant-edit-admin.component';
import { TypeReclamationEtudiantViewAdminComponent } from './type-reclamation-etudiant-admin/view-admin/type-reclamation-etudiant-view-admin.component';
import { TypeReclamationEtudiantListAdminComponent } from './type-reclamation-etudiant-admin/list-admin/type-reclamation-etudiant-list-admin.component';
import { QuizClassRoomCreateAdminComponent } from './quiz-class-room-admin/create-admin/quiz-class-room-create-admin.component';
import { QuizClassRoomEditAdminComponent } from './quiz-class-room-admin/edit-admin/quiz-class-room-edit-admin.component';
import { QuizClassRoomViewAdminComponent } from './quiz-class-room-admin/view-admin/quiz-class-room-view-admin.component';
import { QuizClassRoomListAdminComponent } from './quiz-class-room-admin/list-admin/quiz-class-room-list-admin.component';
import { NiveauEtudeCreateAdminComponent } from './niveau-etude-admin/create-admin/niveau-etude-create-admin.component';
import { NiveauEtudeEditAdminComponent } from './niveau-etude-admin/edit-admin/niveau-etude-edit-admin.component';
import { NiveauEtudeViewAdminComponent } from './niveau-etude-admin/view-admin/niveau-etude-view-admin.component';
import { NiveauEtudeListAdminComponent } from './niveau-etude-admin/list-admin/niveau-etude-list-admin.component';
import { StatutSocialCreateAdminComponent } from './statut-social-admin/create-admin/statut-social-create-admin.component';
import { StatutSocialEditAdminComponent } from './statut-social-admin/edit-admin/statut-social-edit-admin.component';
import { StatutSocialViewAdminComponent } from './statut-social-admin/view-admin/statut-social-view-admin.component';
import { StatutSocialListAdminComponent } from './statut-social-admin/list-admin/statut-social-list-admin.component';
import { QuizCreateAdminComponent } from './quiz-admin/create-admin/quiz-create-admin.component';
import { QuizEditAdminComponent } from './quiz-admin/edit-admin/quiz-edit-admin.component';
import { QuizViewAdminComponent } from './quiz-admin/view-admin/quiz-view-admin.component';
import { QuizListAdminComponent } from './quiz-admin/list-admin/quiz-list-admin.component';
import { GroupeEtudeCreateAdminComponent } from './groupe-etude-admin/create-admin/groupe-etude-create-admin.component';
import { GroupeEtudeEditAdminComponent } from './groupe-etude-admin/edit-admin/groupe-etude-edit-admin.component';
import { GroupeEtudeViewAdminComponent } from './groupe-etude-admin/view-admin/groupe-etude-view-admin.component';
import { GroupeEtudeListAdminComponent } from './groupe-etude-admin/list-admin/groupe-etude-list-admin.component';
import { TypeHomeWorkCreateAdminComponent } from './type-home-work-admin/create-admin/type-home-work-create-admin.component';
import { TypeHomeWorkEditAdminComponent } from './type-home-work-admin/edit-admin/type-home-work-edit-admin.component';
import { TypeHomeWorkViewAdminComponent } from './type-home-work-admin/view-admin/type-home-work-view-admin.component';
import { TypeHomeWorkListAdminComponent } from './type-home-work-admin/list-admin/type-home-work-list-admin.component';
import { CoursCreateAdminComponent } from './cours-admin/create-admin/cours-create-admin.component';
import { CoursEditAdminComponent } from './cours-admin/edit-admin/cours-edit-admin.component';
import { CoursViewAdminComponent } from './cours-admin/view-admin/cours-view-admin.component';
import { CoursListAdminComponent } from './cours-admin/list-admin/cours-list-admin.component';
import { FreeTrialTeacherWhatsTemplateCreateAdminComponent } from './free-trial-teacher-whats-template-admin/create-admin/free-trial-teacher-whats-template-create-admin.component';
import { FreeTrialTeacherWhatsTemplateEditAdminComponent } from './free-trial-teacher-whats-template-admin/edit-admin/free-trial-teacher-whats-template-edit-admin.component';
import { FreeTrialTeacherWhatsTemplateViewAdminComponent } from './free-trial-teacher-whats-template-admin/view-admin/free-trial-teacher-whats-template-view-admin.component';
import { FreeTrialTeacherWhatsTemplateListAdminComponent } from './free-trial-teacher-whats-template-admin/list-admin/free-trial-teacher-whats-template-list-admin.component';
import { SectionItemCreateAdminComponent } from './section-item-admin/create-admin/section-item-create-admin.component';
import { SectionItemEditAdminComponent } from './section-item-admin/edit-admin/section-item-edit-admin.component';
import { SectionItemViewAdminComponent } from './section-item-admin/view-admin/section-item-view-admin.component';
import { SectionItemListAdminComponent } from './section-item-admin/list-admin/section-item-list-admin.component';
import { FreeTrialCreateAdminComponent } from './free-trial-admin/create-admin/free-trial-create-admin.component';
import { FreeTrialEditAdminComponent } from './free-trial-admin/edit-admin/free-trial-edit-admin.component';
import { FreeTrialViewAdminComponent } from './free-trial-admin/view-admin/free-trial-view-admin.component';
import { FreeTrialListAdminComponent } from './free-trial-admin/list-admin/free-trial-list-admin.component';
import { SectionCreateAdminComponent } from './section-admin/create-admin/section-create-admin.component';
import { SectionEditAdminComponent } from './section-admin/edit-admin/section-edit-admin.component';
import { SectionViewAdminComponent } from './section-admin/view-admin/section-view-admin.component';
import { SectionListAdminComponent } from './section-admin/list-admin/section-list-admin.component';
import { EtudiantCoursCreateAdminComponent } from './etudiant-cours-admin/create-admin/etudiant-cours-create-admin.component';
import { EtudiantCoursEditAdminComponent } from './etudiant-cours-admin/edit-admin/etudiant-cours-edit-admin.component';
import { EtudiantCoursViewAdminComponent } from './etudiant-cours-admin/view-admin/etudiant-cours-view-admin.component';
import { EtudiantCoursListAdminComponent } from './etudiant-cours-admin/list-admin/etudiant-cours-list-admin.component';
import { FreeTrialStudentWhatsTemplateCreateAdminComponent } from './free-trial-student-whats-template-admin/create-admin/free-trial-student-whats-template-create-admin.component';
import { FreeTrialStudentWhatsTemplateEditAdminComponent } from './free-trial-student-whats-template-admin/edit-admin/free-trial-student-whats-template-edit-admin.component';
import { FreeTrialStudentWhatsTemplateViewAdminComponent } from './free-trial-student-whats-template-admin/view-admin/free-trial-student-whats-template-view-admin.component';
import { FreeTrialStudentWhatsTemplateListAdminComponent } from './free-trial-student-whats-template-admin/list-admin/free-trial-student-whats-template-list-admin.component';
import { LevelTestConfigurationCreateAdminComponent } from './level-test-configuration-admin/create-admin/level-test-configuration-create-admin.component';
import { LevelTestConfigurationEditAdminComponent } from './level-test-configuration-admin/edit-admin/level-test-configuration-edit-admin.component';
import { LevelTestConfigurationViewAdminComponent } from './level-test-configuration-admin/view-admin/level-test-configuration-view-admin.component';
import { LevelTestConfigurationListAdminComponent } from './level-test-configuration-admin/list-admin/level-test-configuration-list-admin.component';
import { StatutFreeTrialCreateAdminComponent } from './statut-free-trial-admin/create-admin/statut-free-trial-create-admin.component';
import { StatutFreeTrialEditAdminComponent } from './statut-free-trial-admin/edit-admin/statut-free-trial-edit-admin.component';
import { StatutFreeTrialViewAdminComponent } from './statut-free-trial-admin/view-admin/statut-free-trial-view-admin.component';
import { StatutFreeTrialListAdminComponent } from './statut-free-trial-admin/list-admin/statut-free-trial-list-admin.component';
import { ReponseEtudiantCreateAdminComponent } from './reponse-etudiant-admin/create-admin/reponse-etudiant-create-admin.component';
import { ReponseEtudiantEditAdminComponent } from './reponse-etudiant-admin/edit-admin/reponse-etudiant-edit-admin.component';
import { ReponseEtudiantViewAdminComponent } from './reponse-etudiant-admin/view-admin/reponse-etudiant-view-admin.component';
import { ReponseEtudiantListAdminComponent } from './reponse-etudiant-admin/list-admin/reponse-etudiant-list-admin.component';
import { EtatEtudiantCreateAdminComponent } from './etat-etudiant-admin/create-admin/etat-etudiant-create-admin.component';
import { EtatEtudiantEditAdminComponent } from './etat-etudiant-admin/edit-admin/etat-etudiant-edit-admin.component';
import { EtatEtudiantViewAdminComponent } from './etat-etudiant-admin/view-admin/etat-etudiant-view-admin.component';
import { EtatEtudiantListAdminComponent } from './etat-etudiant-admin/list-admin/etat-etudiant-list-admin.component';
import { FreeTrialDetailCreateAdminComponent } from './free-trial-detail-admin/create-admin/free-trial-detail-create-admin.component';
import { FreeTrialDetailEditAdminComponent } from './free-trial-detail-admin/edit-admin/free-trial-detail-edit-admin.component';
import { FreeTrialDetailViewAdminComponent } from './free-trial-detail-admin/view-admin/free-trial-detail-view-admin.component';
import { FreeTrialDetailListAdminComponent } from './free-trial-detail-admin/list-admin/free-trial-detail-list-admin.component';
import { ScheduleProfCreateAdminComponent } from './schedule-prof-admin/create-admin/schedule-prof-create-admin.component';
import { ScheduleProfEditAdminComponent } from './schedule-prof-admin/edit-admin/schedule-prof-edit-admin.component';
import { ScheduleProfViewAdminComponent } from './schedule-prof-admin/view-admin/schedule-prof-view-admin.component';
import { ScheduleProfListAdminComponent } from './schedule-prof-admin/list-admin/schedule-prof-list-admin.component';
import { FonctionCreateAdminComponent } from './fonction-admin/create-admin/fonction-create-admin.component';
import { FonctionEditAdminComponent } from './fonction-admin/edit-admin/fonction-edit-admin.component';
import { FonctionViewAdminComponent } from './fonction-admin/view-admin/fonction-view-admin.component';
import { FonctionListAdminComponent } from './fonction-admin/list-admin/fonction-list-admin.component';
import { HoweWorkQSTReponseCreateAdminComponent } from './howe-work-q-s-t-reponse-admin/create-admin/howe-work-q-s-t-reponse-create-admin.component';
import { HoweWorkQSTReponseEditAdminComponent } from './howe-work-q-s-t-reponse-admin/edit-admin/howe-work-q-s-t-reponse-edit-admin.component';
import { HoweWorkQSTReponseViewAdminComponent } from './howe-work-q-s-t-reponse-admin/view-admin/howe-work-q-s-t-reponse-view-admin.component';
import { HoweWorkQSTReponseListAdminComponent } from './howe-work-q-s-t-reponse-admin/list-admin/howe-work-q-s-t-reponse-list-admin.component';
import { ContactCreateAdminComponent } from './contact-admin/create-admin/contact-create-admin.component';
import { ContactEditAdminComponent } from './contact-admin/edit-admin/contact-edit-admin.component';
import { ContactViewAdminComponent } from './contact-admin/view-admin/contact-view-admin.component';
import { ContactListAdminComponent } from './contact-admin/list-admin/contact-list-admin.component';
import { TypeTeacherCreateAdminComponent } from './type-teacher-admin/create-admin/type-teacher-create-admin.component';
import { TypeTeacherEditAdminComponent } from './type-teacher-admin/edit-admin/type-teacher-edit-admin.component';
import { TypeTeacherViewAdminComponent } from './type-teacher-admin/view-admin/type-teacher-view-admin.component';
import { TypeTeacherListAdminComponent } from './type-teacher-admin/list-admin/type-teacher-list-admin.component';
import { EtudiantClassRoomCreateAdminComponent } from './etudiant-class-room-admin/create-admin/etudiant-class-room-create-admin.component';
import { EtudiantClassRoomEditAdminComponent } from './etudiant-class-room-admin/edit-admin/etudiant-class-room-edit-admin.component';
import { EtudiantClassRoomViewAdminComponent } from './etudiant-class-room-admin/view-admin/etudiant-class-room-view-admin.component';
import { EtudiantClassRoomListAdminComponent } from './etudiant-class-room-admin/list-admin/etudiant-class-room-list-admin.component';
import { EtatReponseCreateAdminComponent } from './etat-reponse-admin/create-admin/etat-reponse-create-admin.component';
import { EtatReponseEditAdminComponent } from './etat-reponse-admin/edit-admin/etat-reponse-edit-admin.component';
import { EtatReponseViewAdminComponent } from './etat-reponse-admin/view-admin/etat-reponse-view-admin.component';
import { EtatReponseListAdminComponent } from './etat-reponse-admin/list-admin/etat-reponse-list-admin.component';
import { ResultatHomeWorkCreateAdminComponent } from './resultat-home-work-admin/create-admin/resultat-home-work-create-admin.component';
import { ResultatHomeWorkEditAdminComponent } from './resultat-home-work-admin/edit-admin/resultat-home-work-edit-admin.component';
import { ResultatHomeWorkViewAdminComponent } from './resultat-home-work-admin/view-admin/resultat-home-work-view-admin.component';
import { ResultatHomeWorkListAdminComponent } from './resultat-home-work-admin/list-admin/resultat-home-work-list-admin.component';
import { ConfirmationTokenCreateAdminComponent } from './confirmation-token-admin/create-admin/confirmation-token-create-admin.component';
import { ConfirmationTokenEditAdminComponent } from './confirmation-token-admin/edit-admin/confirmation-token-edit-admin.component';
import { ConfirmationTokenViewAdminComponent } from './confirmation-token-admin/view-admin/confirmation-token-view-admin.component';
import { ConfirmationTokenListAdminComponent } from './confirmation-token-admin/list-admin/confirmation-token-list-admin.component';
import { SuperCategorieSectionCreateAdminComponent } from './super-categorie-section-admin/create-admin/super-categorie-section-create-admin.component';
import { SuperCategorieSectionEditAdminComponent } from './super-categorie-section-admin/edit-admin/super-categorie-section-edit-admin.component';
import { SuperCategorieSectionViewAdminComponent } from './super-categorie-section-admin/view-admin/super-categorie-section-view-admin.component';
import { SuperCategorieSectionListAdminComponent } from './super-categorie-section-admin/list-admin/super-categorie-section-list-admin.component';
import { FaqCreateAdminComponent } from './faq-admin/create-admin/faq-create-admin.component';
import { FaqEditAdminComponent } from './faq-admin/edit-admin/faq-edit-admin.component';
import { FaqViewAdminComponent } from './faq-admin/view-admin/faq-view-admin.component';
import { FaqListAdminComponent } from './faq-admin/list-admin/faq-list-admin.component';
import { CategorieSectionCreateAdminComponent } from './categorie-section-admin/create-admin/categorie-section-create-admin.component';
import { CategorieSectionEditAdminComponent } from './categorie-section-admin/edit-admin/categorie-section-edit-admin.component';
import { CategorieSectionViewAdminComponent } from './categorie-section-admin/view-admin/categorie-section-view-admin.component';
import { CategorieSectionListAdminComponent } from './categorie-section-admin/list-admin/categorie-section-list-admin.component';
import { PackStudentCreateAdminComponent } from './pack-student-admin/create-admin/pack-student-create-admin.component';
import { PackStudentEditAdminComponent } from './pack-student-admin/edit-admin/pack-student-edit-admin.component';
import { PackStudentViewAdminComponent } from './pack-student-admin/view-admin/pack-student-view-admin.component';
import { PackStudentListAdminComponent } from './pack-student-admin/list-admin/pack-student-list-admin.component';
import { GroupeEtudiantDetailCreateAdminComponent } from './groupe-etudiant-detail-admin/create-admin/groupe-etudiant-detail-create-admin.component';
import { GroupeEtudiantDetailEditAdminComponent } from './groupe-etudiant-detail-admin/edit-admin/groupe-etudiant-detail-edit-admin.component';
import { GroupeEtudiantDetailViewAdminComponent } from './groupe-etudiant-detail-admin/view-admin/groupe-etudiant-detail-view-admin.component';
import { GroupeEtudiantDetailListAdminComponent } from './groupe-etudiant-detail-admin/list-admin/groupe-etudiant-detail-list-admin.component';
import { TypeDeQuestionCreateAdminComponent } from './type-de-question-admin/create-admin/type-de-question-create-admin.component';
import { TypeDeQuestionEditAdminComponent } from './type-de-question-admin/edit-admin/type-de-question-edit-admin.component';
import { TypeDeQuestionViewAdminComponent } from './type-de-question-admin/view-admin/type-de-question-view-admin.component';
import { TypeDeQuestionListAdminComponent } from './type-de-question-admin/list-admin/type-de-question-list-admin.component';
import { TrancheHoraireProfCreateAdminComponent } from './tranche-horaire-prof-admin/create-admin/tranche-horaire-prof-create-admin.component';
import { TrancheHoraireProfEditAdminComponent } from './tranche-horaire-prof-admin/edit-admin/tranche-horaire-prof-edit-admin.component';
import { TrancheHoraireProfViewAdminComponent } from './tranche-horaire-prof-admin/view-admin/tranche-horaire-prof-view-admin.component';
import { TrancheHoraireProfListAdminComponent } from './tranche-horaire-prof-admin/list-admin/tranche-horaire-prof-list-admin.component';
import { FreeTrialformuleCreateAdminComponent } from './free-trialformule-admin/create-admin/free-trialformule-create-admin.component';
import { FreeTrialformuleEditAdminComponent } from './free-trialformule-admin/edit-admin/free-trialformule-edit-admin.component';
import { FreeTrialformuleViewAdminComponent } from './free-trialformule-admin/view-admin/free-trialformule-view-admin.component';
import { FreeTrialformuleListAdminComponent } from './free-trialformule-admin/list-admin/free-trialformule-list-admin.component';
import { EtatEtudiantScheduleCreateAdminComponent } from './etat-etudiant-schedule-admin/create-admin/etat-etudiant-schedule-create-admin.component';
import { EtatEtudiantScheduleEditAdminComponent } from './etat-etudiant-schedule-admin/edit-admin/etat-etudiant-schedule-edit-admin.component';
import { EtatEtudiantScheduleViewAdminComponent } from './etat-etudiant-schedule-admin/view-admin/etat-etudiant-schedule-view-admin.component';
import { EtatEtudiantScheduleListAdminComponent } from './etat-etudiant-schedule-admin/list-admin/etat-etudiant-schedule-list-admin.component';
import { HomeWorkQuestionCreateAdminComponent } from './home-work-question-admin/create-admin/home-work-question-create-admin.component';
import { HomeWorkQuestionEditAdminComponent } from './home-work-question-admin/edit-admin/home-work-question-edit-admin.component';
import { HomeWorkQuestionViewAdminComponent } from './home-work-question-admin/view-admin/home-work-question-view-admin.component';
import { HomeWorkQuestionListAdminComponent } from './home-work-question-admin/list-admin/home-work-question-list-admin.component';
import { QuestionCreateAdminComponent } from './question-admin/create-admin/question-create-admin.component';
import { QuestionEditAdminComponent } from './question-admin/edit-admin/question-edit-admin.component';
import { QuestionViewAdminComponent } from './question-admin/view-admin/question-view-admin.component';
import { QuestionListAdminComponent } from './question-admin/list-admin/question-list-admin.component';
import { RecommendTeacherCreateAdminComponent } from './recommend-teacher-admin/create-admin/recommend-teacher-create-admin.component';
import { RecommendTeacherEditAdminComponent } from './recommend-teacher-admin/edit-admin/recommend-teacher-edit-admin.component';
import { RecommendTeacherViewAdminComponent } from './recommend-teacher-admin/view-admin/recommend-teacher-view-admin.component';
import { RecommendTeacherListAdminComponent } from './recommend-teacher-admin/list-admin/recommend-teacher-list-admin.component';
import { PriceCreateAdminComponent } from './price-admin/create-admin/price-create-admin.component';
import { PriceEditAdminComponent } from './price-admin/edit-admin/price-edit-admin.component';
import { PriceViewAdminComponent } from './price-admin/view-admin/price-view-admin.component';
import { PriceListAdminComponent } from './price-admin/list-admin/price-list-admin.component';
import { CentreCreateAdminComponent } from './centre-admin/create-admin/centre-create-admin.component';
import { CentreEditAdminComponent } from './centre-admin/edit-admin/centre-edit-admin.component';
import { CentreViewAdminComponent } from './centre-admin/view-admin/centre-view-admin.component';
import { CentreListAdminComponent } from './centre-admin/list-admin/centre-list-admin.component';
import { ReclamationEtudiantCreateAdminComponent } from './reclamation-etudiant-admin/create-admin/reclamation-etudiant-create-admin.component';
import { ReclamationEtudiantEditAdminComponent } from './reclamation-etudiant-admin/edit-admin/reclamation-etudiant-edit-admin.component';
import { ReclamationEtudiantViewAdminComponent } from './reclamation-etudiant-admin/view-admin/reclamation-etudiant-view-admin.component';
import { ReclamationEtudiantListAdminComponent } from './reclamation-etudiant-admin/list-admin/reclamation-etudiant-list-admin.component';
import { SkillCreateAdminComponent } from './skill-admin/create-admin/skill-create-admin.component';
import { SkillEditAdminComponent } from './skill-admin/edit-admin/skill-edit-admin.component';
import { SkillViewAdminComponent } from './skill-admin/view-admin/skill-view-admin.component';
import { SkillListAdminComponent } from './skill-admin/list-admin/skill-list-admin.component';
import { ProfCreateAdminComponent } from './prof-admin/create-admin/prof-create-admin.component';
import { ProfEditAdminComponent } from './prof-admin/edit-admin/prof-edit-admin.component';
import { ProfViewAdminComponent } from './prof-admin/view-admin/prof-view-admin.component';
import { ProfListAdminComponent } from './prof-admin/list-admin/prof-list-admin.component';
import { WorkloadBonusCreateAdminComponent } from './workload-bonus-admin/create-admin/workload-bonus-create-admin.component';
import { WorkloadBonusEditAdminComponent } from './workload-bonus-admin/edit-admin/workload-bonus-edit-admin.component';
import { WorkloadBonusViewAdminComponent } from './workload-bonus-admin/view-admin/workload-bonus-view-admin.component';
import { WorkloadBonusListAdminComponent } from './workload-bonus-admin/list-admin/workload-bonus-list-admin.component';
import { LangueCreateAdminComponent } from './langue-admin/create-admin/langue-create-admin.component';
import { LangueEditAdminComponent } from './langue-admin/edit-admin/langue-edit-admin.component';
import { LangueViewAdminComponent } from './langue-admin/view-admin/langue-view-admin.component';
import { LangueListAdminComponent } from './langue-admin/list-admin/langue-list-admin.component';
import { PaiementCreateAdminComponent } from './paiement-admin/create-admin/paiement-create-admin.component';
import { PaiementEditAdminComponent } from './paiement-admin/edit-admin/paiement-edit-admin.component';
import { PaiementViewAdminComponent } from './paiement-admin/view-admin/paiement-view-admin.component';
import { PaiementListAdminComponent } from './paiement-admin/list-admin/paiement-list-admin.component';
import { TeacherLocalityCreateAdminComponent } from './teacher-locality-admin/create-admin/teacher-locality-create-admin.component';
import { TeacherLocalityEditAdminComponent } from './teacher-locality-admin/edit-admin/teacher-locality-edit-admin.component';
import { TeacherLocalityViewAdminComponent } from './teacher-locality-admin/view-admin/teacher-locality-view-admin.component';
import { TeacherLocalityListAdminComponent } from './teacher-locality-admin/list-admin/teacher-locality-list-admin.component';
import { FreeTrialStudentEmailTemplateCreateAdminComponent } from './free-trial-student-email-template-admin/create-admin/free-trial-student-email-template-create-admin.component';
import { FreeTrialStudentEmailTemplateEditAdminComponent } from './free-trial-student-email-template-admin/edit-admin/free-trial-student-email-template-edit-admin.component';
import { FreeTrialStudentEmailTemplateViewAdminComponent } from './free-trial-student-email-template-admin/view-admin/free-trial-student-email-template-view-admin.component';
import { FreeTrialStudentEmailTemplateListAdminComponent } from './free-trial-student-email-template-admin/list-admin/free-trial-student-email-template-list-admin.component';
import { ReponseCreateAdminComponent } from './reponse-admin/create-admin/reponse-create-admin.component';
import { ReponseEditAdminComponent } from './reponse-admin/edit-admin/reponse-edit-admin.component';
import { ReponseViewAdminComponent } from './reponse-admin/view-admin/reponse-view-admin.component';
import { ReponseListAdminComponent } from './reponse-admin/list-admin/reponse-list-admin.component';
import { InteretEtudiantCreateAdminComponent } from './interet-etudiant-admin/create-admin/interet-etudiant-create-admin.component';
import { InteretEtudiantEditAdminComponent } from './interet-etudiant-admin/edit-admin/interet-etudiant-edit-admin.component';
import { InteretEtudiantViewAdminComponent } from './interet-etudiant-admin/view-admin/interet-etudiant-view-admin.component';
import { InteretEtudiantListAdminComponent } from './interet-etudiant-admin/list-admin/interet-etudiant-list-admin.component';
import { QuizEtudiantCreateAdminComponent } from './quiz-etudiant-admin/create-admin/quiz-etudiant-create-admin.component';
import { QuizEtudiantEditAdminComponent } from './quiz-etudiant-admin/edit-admin/quiz-etudiant-edit-admin.component';
import { QuizEtudiantViewAdminComponent } from './quiz-etudiant-admin/view-admin/quiz-etudiant-view-admin.component';
import { QuizEtudiantListAdminComponent } from './quiz-etudiant-admin/list-admin/quiz-etudiant-list-admin.component';
import { DictionaryCreateAdminComponent } from './dictionary-admin/create-admin/dictionary-create-admin.component';
import { DictionaryEditAdminComponent } from './dictionary-admin/edit-admin/dictionary-edit-admin.component';
import { DictionaryViewAdminComponent } from './dictionary-admin/view-admin/dictionary-view-admin.component';
import { DictionaryListAdminComponent } from './dictionary-admin/list-admin/dictionary-list-admin.component';
import { SalaryCreateAdminComponent } from './salary-admin/create-admin/salary-create-admin.component';
import { SalaryEditAdminComponent } from './salary-admin/edit-admin/salary-edit-admin.component';
import { SalaryViewAdminComponent } from './salary-admin/view-admin/salary-view-admin.component';
import { SalaryListAdminComponent } from './salary-admin/list-admin/salary-list-admin.component';
import { EtatCoursCreateAdminComponent } from './etat-cours-admin/create-admin/etat-cours-create-admin.component';
import { EtatCoursEditAdminComponent } from './etat-cours-admin/edit-admin/etat-cours-edit-admin.component';
import { EtatCoursViewAdminComponent } from './etat-cours-admin/view-admin/etat-cours-view-admin.component';
import { EtatCoursListAdminComponent } from './etat-cours-admin/list-admin/etat-cours-list-admin.component';
import { ProfReviewCreateAdminComponent } from './prof-review-admin/create-admin/prof-review-create-admin.component';
import { ProfReviewEditAdminComponent } from './prof-review-admin/edit-admin/prof-review-edit-admin.component';
import { ProfReviewViewAdminComponent } from './prof-review-admin/view-admin/prof-review-view-admin.component';
import { ProfReviewListAdminComponent } from './prof-review-admin/list-admin/prof-review-list-admin.component';
import { ReclamationProfCreateAdminComponent } from './reclamation-prof-admin/create-admin/reclamation-prof-create-admin.component';
import { ReclamationProfEditAdminComponent } from './reclamation-prof-admin/edit-admin/reclamation-prof-edit-admin.component';
import { ReclamationProfViewAdminComponent } from './reclamation-prof-admin/view-admin/reclamation-prof-view-admin.component';
import { ReclamationProfListAdminComponent } from './reclamation-prof-admin/list-admin/reclamation-prof-list-admin.component';
import { VocabularyQuizCreateAdminComponent } from './vocabulary-quiz-admin/create-admin/vocabulary-quiz-create-admin.component';
import { VocabularyQuizEditAdminComponent } from './vocabulary-quiz-admin/edit-admin/vocabulary-quiz-edit-admin.component';
import { VocabularyQuizViewAdminComponent } from './vocabulary-quiz-admin/view-admin/vocabulary-quiz-view-admin.component';
import { VocabularyQuizListAdminComponent } from './vocabulary-quiz-admin/list-admin/vocabulary-quiz-list-admin.component';
import { FaqEtudiantCreateAdminComponent } from './faq-etudiant-admin/create-admin/faq-etudiant-create-admin.component';
import { FaqEtudiantEditAdminComponent } from './faq-etudiant-admin/edit-admin/faq-etudiant-edit-admin.component';
import { FaqEtudiantViewAdminComponent } from './faq-etudiant-admin/view-admin/faq-etudiant-view-admin.component';
import { FaqEtudiantListAdminComponent } from './faq-etudiant-admin/list-admin/faq-etudiant-list-admin.component';
import { FreeTrialTeacherEmailTemplateCreateAdminComponent } from './free-trial-teacher-email-template-admin/create-admin/free-trial-teacher-email-template-create-admin.component';
import { FreeTrialTeacherEmailTemplateEditAdminComponent } from './free-trial-teacher-email-template-admin/edit-admin/free-trial-teacher-email-template-edit-admin.component';
import { FreeTrialTeacherEmailTemplateViewAdminComponent } from './free-trial-teacher-email-template-admin/view-admin/free-trial-teacher-email-template-view-admin.component';
import { FreeTrialTeacherEmailTemplateListAdminComponent } from './free-trial-teacher-email-template-admin/list-admin/free-trial-teacher-email-template-list-admin.component';
import { VocabularyCreateAdminComponent } from './vocabulary-admin/create-admin/vocabulary-create-admin.component';
import { VocabularyEditAdminComponent } from './vocabulary-admin/edit-admin/vocabulary-edit-admin.component';
import { VocabularyViewAdminComponent } from './vocabulary-admin/view-admin/vocabulary-view-admin.component';
import { VocabularyListAdminComponent } from './vocabulary-admin/list-admin/vocabulary-list-admin.component';
import { EtudiantReviewCreateAdminComponent } from './etudiant-review-admin/create-admin/etudiant-review-create-admin.component';
import { EtudiantReviewEditAdminComponent } from './etudiant-review-admin/edit-admin/etudiant-review-edit-admin.component';
import { EtudiantReviewViewAdminComponent } from './etudiant-review-admin/view-admin/etudiant-review-view-admin.component';
import { EtudiantReviewListAdminComponent } from './etudiant-review-admin/list-admin/etudiant-review-list-admin.component';
import { FaqProfCreateAdminComponent } from './faq-prof-admin/create-admin/faq-prof-create-admin.component';
import { FaqProfEditAdminComponent } from './faq-prof-admin/edit-admin/faq-prof-edit-admin.component';
import { FaqProfViewAdminComponent } from './faq-prof-admin/view-admin/faq-prof-view-admin.component';
import { FaqProfListAdminComponent } from './faq-prof-admin/list-admin/faq-prof-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    InviteStudentCreateAdminComponent,
    InviteStudentListAdminComponent,
    InviteStudentViewAdminComponent,
    InviteStudentEditAdminComponent,
    NewsCreateAdminComponent,
    NewsListAdminComponent,
    NewsViewAdminComponent,
    NewsEditAdminComponent,
    WorkloadBonusProfCreateAdminComponent,
    WorkloadBonusProfListAdminComponent,
    WorkloadBonusProfViewAdminComponent,
    WorkloadBonusProfEditAdminComponent,
    ReponseEtudiantHomeWorkCreateAdminComponent,
    ReponseEtudiantHomeWorkListAdminComponent,
    ReponseEtudiantHomeWorkViewAdminComponent,
    ReponseEtudiantHomeWorkEditAdminComponent,
    HomeWorkCreateAdminComponent,
    HomeWorkListAdminComponent,
    HomeWorkViewAdminComponent,
    HomeWorkEditAdminComponent,
    HomeWorkEtudiantCreateAdminComponent,
    HomeWorkEtudiantListAdminComponent,
    HomeWorkEtudiantViewAdminComponent,
    HomeWorkEtudiantEditAdminComponent,
    GroupeEtudiantCreateAdminComponent,
    GroupeEtudiantListAdminComponent,
    GroupeEtudiantViewAdminComponent,
    GroupeEtudiantEditAdminComponent,
    ClassAverageBonusCreateAdminComponent,
    ClassAverageBonusListAdminComponent,
    ClassAverageBonusViewAdminComponent,
    ClassAverageBonusEditAdminComponent,
    ServicesCreateAdminComponent,
    ServicesListAdminComponent,
    ServicesViewAdminComponent,
    ServicesEditAdminComponent,
    CategorieProfCreateAdminComponent,
    CategorieProfListAdminComponent,
    CategorieProfViewAdminComponent,
    CategorieProfEditAdminComponent,
    ClassRoomCreateAdminComponent,
    ClassRoomListAdminComponent,
    ClassRoomViewAdminComponent,
    ClassRoomEditAdminComponent,
    ParcoursCreateAdminComponent,
    ParcoursListAdminComponent,
    ParcoursViewAdminComponent,
    ParcoursEditAdminComponent,
    NiveauEtudeCreateAdminComponent,
    NiveauEtudeListAdminComponent,
    NiveauEtudeViewAdminComponent,
    NiveauEtudeEditAdminComponent,
    SessionCoursCreateAdminComponent,
    SessionCoursListAdminComponent,
    SessionCoursViewAdminComponent,
    SessionCoursEditAdminComponent,
    InscriptionCreateAdminComponent,
    InscriptionListAdminComponent,
    InscriptionViewAdminComponent,
    InscriptionEditAdminComponent,
    EtatInscriptionCreateAdminComponent,
    EtatInscriptionListAdminComponent,
    EtatInscriptionViewAdminComponent,
    EtatInscriptionEditAdminComponent,
    ClassAverageBonusProfCreateAdminComponent,
    ClassAverageBonusProfListAdminComponent,
    ClassAverageBonusProfViewAdminComponent,
    ClassAverageBonusProfEditAdminComponent,
    EtudiantCreateAdminComponent,
    EtudiantListAdminComponent,
    EtudiantViewAdminComponent,
    EtudiantEditAdminComponent,
    FreeTrialConfigurationCreateAdminComponent,
    FreeTrialConfigurationListAdminComponent,
    FreeTrialConfigurationViewAdminComponent,
    FreeTrialConfigurationEditAdminComponent,
    TypeReclamationProfCreateAdminComponent,
    TypeReclamationProfListAdminComponent,
    TypeReclamationProfViewAdminComponent,
    TypeReclamationProfEditAdminComponent,
    FaqTypeCreateAdminComponent,
    FaqTypeListAdminComponent,
    FaqTypeViewAdminComponent,
    FaqTypeEditAdminComponent,
    CalendrierProfCreateAdminComponent,
    CalendrierProfListAdminComponent,
    CalendrierProfViewAdminComponent,
    CalendrierProfEditAdminComponent,
    AdminCreateAdminComponent,
    AdminListAdminComponent,
    AdminViewAdminComponent,
    AdminEditAdminComponent,
    TypeReclamationEtudiantCreateAdminComponent,
    TypeReclamationEtudiantListAdminComponent,
    TypeReclamationEtudiantViewAdminComponent,
    TypeReclamationEtudiantEditAdminComponent,
    QuizClassRoomCreateAdminComponent,
    QuizClassRoomListAdminComponent,
    QuizClassRoomViewAdminComponent,
    QuizClassRoomEditAdminComponent,
    NiveauEtudeCreateAdminComponent,
    NiveauEtudeListAdminComponent,
    NiveauEtudeViewAdminComponent,
    NiveauEtudeEditAdminComponent,
    StatutSocialCreateAdminComponent,
    StatutSocialListAdminComponent,
    StatutSocialViewAdminComponent,
    StatutSocialEditAdminComponent,
    QuizCreateAdminComponent,
    QuizListAdminComponent,
    QuizViewAdminComponent,
    QuizEditAdminComponent,
    GroupeEtudeCreateAdminComponent,
    GroupeEtudeListAdminComponent,
    GroupeEtudeViewAdminComponent,
    GroupeEtudeEditAdminComponent,
    TypeHomeWorkCreateAdminComponent,
    TypeHomeWorkListAdminComponent,
    TypeHomeWorkViewAdminComponent,
    TypeHomeWorkEditAdminComponent,
    CoursCreateAdminComponent,
    CoursListAdminComponent,
    CoursViewAdminComponent,
    CoursEditAdminComponent,
    FreeTrialTeacherWhatsTemplateCreateAdminComponent,
    FreeTrialTeacherWhatsTemplateListAdminComponent,
    FreeTrialTeacherWhatsTemplateViewAdminComponent,
    FreeTrialTeacherWhatsTemplateEditAdminComponent,
    SectionItemCreateAdminComponent,
    SectionItemListAdminComponent,
    SectionItemViewAdminComponent,
    SectionItemEditAdminComponent,
    FreeTrialCreateAdminComponent,
    FreeTrialListAdminComponent,
    FreeTrialViewAdminComponent,
    FreeTrialEditAdminComponent,
    SectionCreateAdminComponent,
    SectionListAdminComponent,
    SectionViewAdminComponent,
    SectionEditAdminComponent,
    EtudiantCoursCreateAdminComponent,
    EtudiantCoursListAdminComponent,
    EtudiantCoursViewAdminComponent,
    EtudiantCoursEditAdminComponent,
    FreeTrialStudentWhatsTemplateCreateAdminComponent,
    FreeTrialStudentWhatsTemplateListAdminComponent,
    FreeTrialStudentWhatsTemplateViewAdminComponent,
    FreeTrialStudentWhatsTemplateEditAdminComponent,
    LevelTestConfigurationCreateAdminComponent,
    LevelTestConfigurationListAdminComponent,
    LevelTestConfigurationViewAdminComponent,
    LevelTestConfigurationEditAdminComponent,
    StatutFreeTrialCreateAdminComponent,
    StatutFreeTrialListAdminComponent,
    StatutFreeTrialViewAdminComponent,
    StatutFreeTrialEditAdminComponent,
    ReponseEtudiantCreateAdminComponent,
    ReponseEtudiantListAdminComponent,
    ReponseEtudiantViewAdminComponent,
    ReponseEtudiantEditAdminComponent,
    EtatEtudiantCreateAdminComponent,
    EtatEtudiantListAdminComponent,
    EtatEtudiantViewAdminComponent,
    EtatEtudiantEditAdminComponent,
    FreeTrialDetailCreateAdminComponent,
    FreeTrialDetailListAdminComponent,
    FreeTrialDetailViewAdminComponent,
    FreeTrialDetailEditAdminComponent,
    ScheduleProfCreateAdminComponent,
    ScheduleProfListAdminComponent,
    ScheduleProfViewAdminComponent,
    ScheduleProfEditAdminComponent,
    FonctionCreateAdminComponent,
    FonctionListAdminComponent,
    FonctionViewAdminComponent,
    FonctionEditAdminComponent,
    HoweWorkQSTReponseCreateAdminComponent,
    HoweWorkQSTReponseListAdminComponent,
    HoweWorkQSTReponseViewAdminComponent,
    HoweWorkQSTReponseEditAdminComponent,
    ContactCreateAdminComponent,
    ContactListAdminComponent,
    ContactViewAdminComponent,
    ContactEditAdminComponent,
    TypeTeacherCreateAdminComponent,
    TypeTeacherListAdminComponent,
    TypeTeacherViewAdminComponent,
    TypeTeacherEditAdminComponent,
    EtudiantClassRoomCreateAdminComponent,
    EtudiantClassRoomListAdminComponent,
    EtudiantClassRoomViewAdminComponent,
    EtudiantClassRoomEditAdminComponent,
    EtatReponseCreateAdminComponent,
    EtatReponseListAdminComponent,
    EtatReponseViewAdminComponent,
    EtatReponseEditAdminComponent,
    ResultatHomeWorkCreateAdminComponent,
    ResultatHomeWorkListAdminComponent,
    ResultatHomeWorkViewAdminComponent,
    ResultatHomeWorkEditAdminComponent,
    ConfirmationTokenCreateAdminComponent,
    ConfirmationTokenListAdminComponent,
    ConfirmationTokenViewAdminComponent,
    ConfirmationTokenEditAdminComponent,
    SuperCategorieSectionCreateAdminComponent,
    SuperCategorieSectionListAdminComponent,
    SuperCategorieSectionViewAdminComponent,
    SuperCategorieSectionEditAdminComponent,
    FaqCreateAdminComponent,
    FaqListAdminComponent,
    FaqViewAdminComponent,
    FaqEditAdminComponent,
    CategorieSectionCreateAdminComponent,
    CategorieSectionListAdminComponent,
    CategorieSectionViewAdminComponent,
    CategorieSectionEditAdminComponent,
    PackStudentCreateAdminComponent,
    PackStudentListAdminComponent,
    PackStudentViewAdminComponent,
    PackStudentEditAdminComponent,
    GroupeEtudiantDetailCreateAdminComponent,
    GroupeEtudiantDetailListAdminComponent,
    GroupeEtudiantDetailViewAdminComponent,
    GroupeEtudiantDetailEditAdminComponent,
    TypeDeQuestionCreateAdminComponent,
    TypeDeQuestionListAdminComponent,
    TypeDeQuestionViewAdminComponent,
    TypeDeQuestionEditAdminComponent,
    TrancheHoraireProfCreateAdminComponent,
    TrancheHoraireProfListAdminComponent,
    TrancheHoraireProfViewAdminComponent,
    TrancheHoraireProfEditAdminComponent,
    FreeTrialformuleCreateAdminComponent,
    FreeTrialformuleListAdminComponent,
    FreeTrialformuleViewAdminComponent,
    FreeTrialformuleEditAdminComponent,
    EtatEtudiantScheduleCreateAdminComponent,
    EtatEtudiantScheduleListAdminComponent,
    EtatEtudiantScheduleViewAdminComponent,
    EtatEtudiantScheduleEditAdminComponent,
    HomeWorkQuestionCreateAdminComponent,
    HomeWorkQuestionListAdminComponent,
    HomeWorkQuestionViewAdminComponent,
    HomeWorkQuestionEditAdminComponent,
    QuestionCreateAdminComponent,
    QuestionListAdminComponent,
    QuestionViewAdminComponent,
    QuestionEditAdminComponent,
    RecommendTeacherCreateAdminComponent,
    RecommendTeacherListAdminComponent,
    RecommendTeacherViewAdminComponent,
    RecommendTeacherEditAdminComponent,
    PriceCreateAdminComponent,
    PriceListAdminComponent,
    PriceViewAdminComponent,
    PriceEditAdminComponent,
    CentreCreateAdminComponent,
    CentreListAdminComponent,
    CentreViewAdminComponent,
    CentreEditAdminComponent,
    ReclamationEtudiantCreateAdminComponent,
    ReclamationEtudiantListAdminComponent,
    ReclamationEtudiantViewAdminComponent,
    ReclamationEtudiantEditAdminComponent,
    SkillCreateAdminComponent,
    SkillListAdminComponent,
    SkillViewAdminComponent,
    SkillEditAdminComponent,
    ProfCreateAdminComponent,
    ProfListAdminComponent,
    ProfViewAdminComponent,
    ProfEditAdminComponent,
    WorkloadBonusCreateAdminComponent,
    WorkloadBonusListAdminComponent,
    WorkloadBonusViewAdminComponent,
    WorkloadBonusEditAdminComponent,
    LangueCreateAdminComponent,
    LangueListAdminComponent,
    LangueViewAdminComponent,
    LangueEditAdminComponent,
    PaiementCreateAdminComponent,
    PaiementListAdminComponent,
    PaiementViewAdminComponent,
    PaiementEditAdminComponent,
    TeacherLocalityCreateAdminComponent,
    TeacherLocalityListAdminComponent,
    TeacherLocalityViewAdminComponent,
    TeacherLocalityEditAdminComponent,
    FreeTrialStudentEmailTemplateCreateAdminComponent,
    FreeTrialStudentEmailTemplateListAdminComponent,
    FreeTrialStudentEmailTemplateViewAdminComponent,
    FreeTrialStudentEmailTemplateEditAdminComponent,
    ReponseCreateAdminComponent,
    ReponseListAdminComponent,
    ReponseViewAdminComponent,
    ReponseEditAdminComponent,
    InteretEtudiantCreateAdminComponent,
    InteretEtudiantListAdminComponent,
    InteretEtudiantViewAdminComponent,
    InteretEtudiantEditAdminComponent,
    QuizEtudiantCreateAdminComponent,
    QuizEtudiantListAdminComponent,
    QuizEtudiantViewAdminComponent,
    QuizEtudiantEditAdminComponent,
    DictionaryCreateAdminComponent,
    DictionaryListAdminComponent,
    DictionaryViewAdminComponent,
    DictionaryEditAdminComponent,
    SalaryCreateAdminComponent,
    SalaryListAdminComponent,
    SalaryViewAdminComponent,
    SalaryEditAdminComponent,
    EtatCoursCreateAdminComponent,
    EtatCoursListAdminComponent,
    EtatCoursViewAdminComponent,
    EtatCoursEditAdminComponent,
    ProfReviewCreateAdminComponent,
    ProfReviewListAdminComponent,
    ProfReviewViewAdminComponent,
    ProfReviewEditAdminComponent,
    ReclamationProfCreateAdminComponent,
    ReclamationProfListAdminComponent,
    ReclamationProfViewAdminComponent,
    ReclamationProfEditAdminComponent,
    VocabularyQuizCreateAdminComponent,
    VocabularyQuizListAdminComponent,
    VocabularyQuizViewAdminComponent,
    VocabularyQuizEditAdminComponent,
    FaqEtudiantCreateAdminComponent,
    FaqEtudiantListAdminComponent,
    FaqEtudiantViewAdminComponent,
    FaqEtudiantEditAdminComponent,
    FreeTrialTeacherEmailTemplateCreateAdminComponent,
    FreeTrialTeacherEmailTemplateListAdminComponent,
    FreeTrialTeacherEmailTemplateViewAdminComponent,
    FreeTrialTeacherEmailTemplateEditAdminComponent,
    VocabularyCreateAdminComponent,
    VocabularyListAdminComponent,
    VocabularyViewAdminComponent,
    VocabularyEditAdminComponent,
    EtudiantReviewCreateAdminComponent,
    EtudiantReviewListAdminComponent,
    EtudiantReviewViewAdminComponent,
    EtudiantReviewEditAdminComponent,
    FaqProfCreateAdminComponent,
    FaqProfListAdminComponent,
    FaqProfViewAdminComponent,
    FaqProfEditAdminComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
  ],
  exports: [
  InviteStudentCreateAdminComponent,
  InviteStudentListAdminComponent,
  InviteStudentViewAdminComponent,
  InviteStudentEditAdminComponent,
  NewsCreateAdminComponent,
  NewsListAdminComponent,
  NewsViewAdminComponent,
  NewsEditAdminComponent,
  WorkloadBonusProfCreateAdminComponent,
  WorkloadBonusProfListAdminComponent,
  WorkloadBonusProfViewAdminComponent,
  WorkloadBonusProfEditAdminComponent,
  ReponseEtudiantHomeWorkCreateAdminComponent,
  ReponseEtudiantHomeWorkListAdminComponent,
  ReponseEtudiantHomeWorkViewAdminComponent,
  ReponseEtudiantHomeWorkEditAdminComponent,
  HomeWorkCreateAdminComponent,
  HomeWorkListAdminComponent,
  HomeWorkViewAdminComponent,
  HomeWorkEditAdminComponent,
  HomeWorkEtudiantCreateAdminComponent,
  HomeWorkEtudiantListAdminComponent,
  HomeWorkEtudiantViewAdminComponent,
  HomeWorkEtudiantEditAdminComponent,
  GroupeEtudiantCreateAdminComponent,
  GroupeEtudiantListAdminComponent,
  GroupeEtudiantViewAdminComponent,
  GroupeEtudiantEditAdminComponent,
  ClassAverageBonusCreateAdminComponent,
  ClassAverageBonusListAdminComponent,
  ClassAverageBonusViewAdminComponent,
  ClassAverageBonusEditAdminComponent,
  ServicesCreateAdminComponent,
  ServicesListAdminComponent,
  ServicesViewAdminComponent,
  ServicesEditAdminComponent,
  CategorieProfCreateAdminComponent,
  CategorieProfListAdminComponent,
  CategorieProfViewAdminComponent,
  CategorieProfEditAdminComponent,
  ClassRoomCreateAdminComponent,
  ClassRoomListAdminComponent,
  ClassRoomViewAdminComponent,
  ClassRoomEditAdminComponent,
  ParcoursCreateAdminComponent,
  ParcoursListAdminComponent,
  ParcoursViewAdminComponent,
  ParcoursEditAdminComponent,
  NiveauEtudeCreateAdminComponent,
  NiveauEtudeListAdminComponent,
  NiveauEtudeViewAdminComponent,
  NiveauEtudeEditAdminComponent,
  SessionCoursCreateAdminComponent,
  SessionCoursListAdminComponent,
  SessionCoursViewAdminComponent,
  SessionCoursEditAdminComponent,
  InscriptionCreateAdminComponent,
  InscriptionListAdminComponent,
  InscriptionViewAdminComponent,
  InscriptionEditAdminComponent,
  EtatInscriptionCreateAdminComponent,
  EtatInscriptionListAdminComponent,
  EtatInscriptionViewAdminComponent,
  EtatInscriptionEditAdminComponent,
  ClassAverageBonusProfCreateAdminComponent,
  ClassAverageBonusProfListAdminComponent,
  ClassAverageBonusProfViewAdminComponent,
  ClassAverageBonusProfEditAdminComponent,
  EtudiantCreateAdminComponent,
  EtudiantListAdminComponent,
  EtudiantViewAdminComponent,
  EtudiantEditAdminComponent,
  FreeTrialConfigurationCreateAdminComponent,
  FreeTrialConfigurationListAdminComponent,
  FreeTrialConfigurationViewAdminComponent,
  FreeTrialConfigurationEditAdminComponent,
  TypeReclamationProfCreateAdminComponent,
  TypeReclamationProfListAdminComponent,
  TypeReclamationProfViewAdminComponent,
  TypeReclamationProfEditAdminComponent,
  FaqTypeCreateAdminComponent,
  FaqTypeListAdminComponent,
  FaqTypeViewAdminComponent,
  FaqTypeEditAdminComponent,
  CalendrierProfCreateAdminComponent,
  CalendrierProfListAdminComponent,
  CalendrierProfViewAdminComponent,
  CalendrierProfEditAdminComponent,
  AdminCreateAdminComponent,
  AdminListAdminComponent,
  AdminViewAdminComponent,
  AdminEditAdminComponent,
  TypeReclamationEtudiantCreateAdminComponent,
  TypeReclamationEtudiantListAdminComponent,
  TypeReclamationEtudiantViewAdminComponent,
  TypeReclamationEtudiantEditAdminComponent,
  QuizClassRoomCreateAdminComponent,
  QuizClassRoomListAdminComponent,
  QuizClassRoomViewAdminComponent,
  QuizClassRoomEditAdminComponent,
  NiveauEtudeCreateAdminComponent,
  NiveauEtudeListAdminComponent,
  NiveauEtudeViewAdminComponent,
  NiveauEtudeEditAdminComponent,
  StatutSocialCreateAdminComponent,
  StatutSocialListAdminComponent,
  StatutSocialViewAdminComponent,
  StatutSocialEditAdminComponent,
  QuizCreateAdminComponent,
  QuizListAdminComponent,
  QuizViewAdminComponent,
  QuizEditAdminComponent,
  GroupeEtudeCreateAdminComponent,
  GroupeEtudeListAdminComponent,
  GroupeEtudeViewAdminComponent,
  GroupeEtudeEditAdminComponent,
  TypeHomeWorkCreateAdminComponent,
  TypeHomeWorkListAdminComponent,
  TypeHomeWorkViewAdminComponent,
  TypeHomeWorkEditAdminComponent,
  CoursCreateAdminComponent,
  CoursListAdminComponent,
  CoursViewAdminComponent,
  CoursEditAdminComponent,
  FreeTrialTeacherWhatsTemplateCreateAdminComponent,
  FreeTrialTeacherWhatsTemplateListAdminComponent,
  FreeTrialTeacherWhatsTemplateViewAdminComponent,
  FreeTrialTeacherWhatsTemplateEditAdminComponent,
  SectionItemCreateAdminComponent,
  SectionItemListAdminComponent,
  SectionItemViewAdminComponent,
  SectionItemEditAdminComponent,
  FreeTrialCreateAdminComponent,
  FreeTrialListAdminComponent,
  FreeTrialViewAdminComponent,
  FreeTrialEditAdminComponent,
  SectionCreateAdminComponent,
  SectionListAdminComponent,
  SectionViewAdminComponent,
  SectionEditAdminComponent,
  EtudiantCoursCreateAdminComponent,
  EtudiantCoursListAdminComponent,
  EtudiantCoursViewAdminComponent,
  EtudiantCoursEditAdminComponent,
  FreeTrialStudentWhatsTemplateCreateAdminComponent,
  FreeTrialStudentWhatsTemplateListAdminComponent,
  FreeTrialStudentWhatsTemplateViewAdminComponent,
  FreeTrialStudentWhatsTemplateEditAdminComponent,
  LevelTestConfigurationCreateAdminComponent,
  LevelTestConfigurationListAdminComponent,
  LevelTestConfigurationViewAdminComponent,
  LevelTestConfigurationEditAdminComponent,
  StatutFreeTrialCreateAdminComponent,
  StatutFreeTrialListAdminComponent,
  StatutFreeTrialViewAdminComponent,
  StatutFreeTrialEditAdminComponent,
  ReponseEtudiantCreateAdminComponent,
  ReponseEtudiantListAdminComponent,
  ReponseEtudiantViewAdminComponent,
  ReponseEtudiantEditAdminComponent,
  EtatEtudiantCreateAdminComponent,
  EtatEtudiantListAdminComponent,
  EtatEtudiantViewAdminComponent,
  EtatEtudiantEditAdminComponent,
  FreeTrialDetailCreateAdminComponent,
  FreeTrialDetailListAdminComponent,
  FreeTrialDetailViewAdminComponent,
  FreeTrialDetailEditAdminComponent,
  ScheduleProfCreateAdminComponent,
  ScheduleProfListAdminComponent,
  ScheduleProfViewAdminComponent,
  ScheduleProfEditAdminComponent,
  FonctionCreateAdminComponent,
  FonctionListAdminComponent,
  FonctionViewAdminComponent,
  FonctionEditAdminComponent,
  HoweWorkQSTReponseCreateAdminComponent,
  HoweWorkQSTReponseListAdminComponent,
  HoweWorkQSTReponseViewAdminComponent,
  HoweWorkQSTReponseEditAdminComponent,
  ContactCreateAdminComponent,
  ContactListAdminComponent,
  ContactViewAdminComponent,
  ContactEditAdminComponent,
  TypeTeacherCreateAdminComponent,
  TypeTeacherListAdminComponent,
  TypeTeacherViewAdminComponent,
  TypeTeacherEditAdminComponent,
  EtudiantClassRoomCreateAdminComponent,
  EtudiantClassRoomListAdminComponent,
  EtudiantClassRoomViewAdminComponent,
  EtudiantClassRoomEditAdminComponent,
  EtatReponseCreateAdminComponent,
  EtatReponseListAdminComponent,
  EtatReponseViewAdminComponent,
  EtatReponseEditAdminComponent,
  ResultatHomeWorkCreateAdminComponent,
  ResultatHomeWorkListAdminComponent,
  ResultatHomeWorkViewAdminComponent,
  ResultatHomeWorkEditAdminComponent,
  ConfirmationTokenCreateAdminComponent,
  ConfirmationTokenListAdminComponent,
  ConfirmationTokenViewAdminComponent,
  ConfirmationTokenEditAdminComponent,
  SuperCategorieSectionCreateAdminComponent,
  SuperCategorieSectionListAdminComponent,
  SuperCategorieSectionViewAdminComponent,
  SuperCategorieSectionEditAdminComponent,
  FaqCreateAdminComponent,
  FaqListAdminComponent,
  FaqViewAdminComponent,
  FaqEditAdminComponent,
  CategorieSectionCreateAdminComponent,
  CategorieSectionListAdminComponent,
  CategorieSectionViewAdminComponent,
  CategorieSectionEditAdminComponent,
  PackStudentCreateAdminComponent,
  PackStudentListAdminComponent,
  PackStudentViewAdminComponent,
  PackStudentEditAdminComponent,
  GroupeEtudiantDetailCreateAdminComponent,
  GroupeEtudiantDetailListAdminComponent,
  GroupeEtudiantDetailViewAdminComponent,
  GroupeEtudiantDetailEditAdminComponent,
  TypeDeQuestionCreateAdminComponent,
  TypeDeQuestionListAdminComponent,
  TypeDeQuestionViewAdminComponent,
  TypeDeQuestionEditAdminComponent,
  TrancheHoraireProfCreateAdminComponent,
  TrancheHoraireProfListAdminComponent,
  TrancheHoraireProfViewAdminComponent,
  TrancheHoraireProfEditAdminComponent,
  FreeTrialformuleCreateAdminComponent,
  FreeTrialformuleListAdminComponent,
  FreeTrialformuleViewAdminComponent,
  FreeTrialformuleEditAdminComponent,
  EtatEtudiantScheduleCreateAdminComponent,
  EtatEtudiantScheduleListAdminComponent,
  EtatEtudiantScheduleViewAdminComponent,
  EtatEtudiantScheduleEditAdminComponent,
  HomeWorkQuestionCreateAdminComponent,
  HomeWorkQuestionListAdminComponent,
  HomeWorkQuestionViewAdminComponent,
  HomeWorkQuestionEditAdminComponent,
  QuestionCreateAdminComponent,
  QuestionListAdminComponent,
  QuestionViewAdminComponent,
  QuestionEditAdminComponent,
  RecommendTeacherCreateAdminComponent,
  RecommendTeacherListAdminComponent,
  RecommendTeacherViewAdminComponent,
  RecommendTeacherEditAdminComponent,
  PriceCreateAdminComponent,
  PriceListAdminComponent,
  PriceViewAdminComponent,
  PriceEditAdminComponent,
  CentreCreateAdminComponent,
  CentreListAdminComponent,
  CentreViewAdminComponent,
  CentreEditAdminComponent,
  ReclamationEtudiantCreateAdminComponent,
  ReclamationEtudiantListAdminComponent,
  ReclamationEtudiantViewAdminComponent,
  ReclamationEtudiantEditAdminComponent,
  SkillCreateAdminComponent,
  SkillListAdminComponent,
  SkillViewAdminComponent,
  SkillEditAdminComponent,
  ProfCreateAdminComponent,
  ProfListAdminComponent,
  ProfViewAdminComponent,
  ProfEditAdminComponent,
  WorkloadBonusCreateAdminComponent,
  WorkloadBonusListAdminComponent,
  WorkloadBonusViewAdminComponent,
  WorkloadBonusEditAdminComponent,
  LangueCreateAdminComponent,
  LangueListAdminComponent,
  LangueViewAdminComponent,
  LangueEditAdminComponent,
  PaiementCreateAdminComponent,
  PaiementListAdminComponent,
  PaiementViewAdminComponent,
  PaiementEditAdminComponent,
  TeacherLocalityCreateAdminComponent,
  TeacherLocalityListAdminComponent,
  TeacherLocalityViewAdminComponent,
  TeacherLocalityEditAdminComponent,
  FreeTrialStudentEmailTemplateCreateAdminComponent,
  FreeTrialStudentEmailTemplateListAdminComponent,
  FreeTrialStudentEmailTemplateViewAdminComponent,
  FreeTrialStudentEmailTemplateEditAdminComponent,
  ReponseCreateAdminComponent,
  ReponseListAdminComponent,
  ReponseViewAdminComponent,
  ReponseEditAdminComponent,
  InteretEtudiantCreateAdminComponent,
  InteretEtudiantListAdminComponent,
  InteretEtudiantViewAdminComponent,
  InteretEtudiantEditAdminComponent,
  QuizEtudiantCreateAdminComponent,
  QuizEtudiantListAdminComponent,
  QuizEtudiantViewAdminComponent,
  QuizEtudiantEditAdminComponent,
  DictionaryCreateAdminComponent,
  DictionaryListAdminComponent,
  DictionaryViewAdminComponent,
  DictionaryEditAdminComponent,
  SalaryCreateAdminComponent,
  SalaryListAdminComponent,
  SalaryViewAdminComponent,
  SalaryEditAdminComponent,
  EtatCoursCreateAdminComponent,
  EtatCoursListAdminComponent,
  EtatCoursViewAdminComponent,
  EtatCoursEditAdminComponent,
  ProfReviewCreateAdminComponent,
  ProfReviewListAdminComponent,
  ProfReviewViewAdminComponent,
  ProfReviewEditAdminComponent,
  ReclamationProfCreateAdminComponent,
  ReclamationProfListAdminComponent,
  ReclamationProfViewAdminComponent,
  ReclamationProfEditAdminComponent,
  VocabularyQuizCreateAdminComponent,
  VocabularyQuizListAdminComponent,
  VocabularyQuizViewAdminComponent,
  VocabularyQuizEditAdminComponent,
  FaqEtudiantCreateAdminComponent,
  FaqEtudiantListAdminComponent,
  FaqEtudiantViewAdminComponent,
  FaqEtudiantEditAdminComponent,
  FreeTrialTeacherEmailTemplateCreateAdminComponent,
  FreeTrialTeacherEmailTemplateListAdminComponent,
  FreeTrialTeacherEmailTemplateViewAdminComponent,
  FreeTrialTeacherEmailTemplateEditAdminComponent,
  VocabularyCreateAdminComponent,
  VocabularyListAdminComponent,
  VocabularyViewAdminComponent,
  VocabularyEditAdminComponent,
  EtudiantReviewCreateAdminComponent,
  EtudiantReviewListAdminComponent,
  EtudiantReviewViewAdminComponent,
  EtudiantReviewEditAdminComponent,
  FaqProfCreateAdminComponent,
  FaqProfListAdminComponent,
  FaqProfViewAdminComponent,
  FaqProfEditAdminComponent,
  ],
  entryComponents: [],
})
export class AlcAdminModule { }