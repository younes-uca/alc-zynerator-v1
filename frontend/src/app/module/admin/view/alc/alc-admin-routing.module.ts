
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { InviteStudentListAdminComponent } from './invite-student-admin/list-admin/invite-student-list-admin.component';
import { NewsListAdminComponent } from './news-admin/list-admin/news-list-admin.component';
import { WorkloadBonusProfListAdminComponent } from './workload-bonus-prof-admin/list-admin/workload-bonus-prof-list-admin.component';
import { ReponseEtudiantHomeWorkListAdminComponent } from './reponse-etudiant-home-work-admin/list-admin/reponse-etudiant-home-work-list-admin.component';
import { HomeWorkListAdminComponent } from './home-work-admin/list-admin/home-work-list-admin.component';
import { HomeWorkEtudiantListAdminComponent } from './home-work-etudiant-admin/list-admin/home-work-etudiant-list-admin.component';
import { GroupeEtudiantListAdminComponent } from './groupe-etudiant-admin/list-admin/groupe-etudiant-list-admin.component';
import { ClassAverageBonusListAdminComponent } from './class-average-bonus-admin/list-admin/class-average-bonus-list-admin.component';
import { ServicesListAdminComponent } from './services-admin/list-admin/services-list-admin.component';
import { CategorieProfListAdminComponent } from './categorie-prof-admin/list-admin/categorie-prof-list-admin.component';
import { ClassRoomListAdminComponent } from './class-room-admin/list-admin/class-room-list-admin.component';
import { ParcoursListAdminComponent } from './parcours-admin/list-admin/parcours-list-admin.component';
import { NiveauEtudeListAdminComponent } from './niveau-etude-admin/list-admin/niveau-etude-list-admin.component';
import { SessionCoursListAdminComponent } from './session-cours-admin/list-admin/session-cours-list-admin.component';
import { InscriptionListAdminComponent } from './inscription-admin/list-admin/inscription-list-admin.component';
import { EtatInscriptionListAdminComponent } from './etat-inscription-admin/list-admin/etat-inscription-list-admin.component';
import { ClassAverageBonusProfListAdminComponent } from './class-average-bonus-prof-admin/list-admin/class-average-bonus-prof-list-admin.component';
import { EtudiantListAdminComponent } from './etudiant-admin/list-admin/etudiant-list-admin.component';
import { FreeTrialConfigurationListAdminComponent } from './free-trial-configuration-admin/list-admin/free-trial-configuration-list-admin.component';
import { TypeReclamationProfListAdminComponent } from './type-reclamation-prof-admin/list-admin/type-reclamation-prof-list-admin.component';
import { FaqTypeListAdminComponent } from './faq-type-admin/list-admin/faq-type-list-admin.component';
import { CalendrierProfListAdminComponent } from './calendrier-prof-admin/list-admin/calendrier-prof-list-admin.component';
import { AdminListAdminComponent } from './admin-admin/list-admin/admin-list-admin.component';
import { TypeReclamationEtudiantListAdminComponent } from './type-reclamation-etudiant-admin/list-admin/type-reclamation-etudiant-list-admin.component';
import { QuizClassRoomListAdminComponent } from './quiz-class-room-admin/list-admin/quiz-class-room-list-admin.component';
import { NiveauEtudeListAdminComponent } from './niveau-etude-admin/list-admin/niveau-etude-list-admin.component';
import { StatutSocialListAdminComponent } from './statut-social-admin/list-admin/statut-social-list-admin.component';
import { QuizListAdminComponent } from './quiz-admin/list-admin/quiz-list-admin.component';
import { GroupeEtudeListAdminComponent } from './groupe-etude-admin/list-admin/groupe-etude-list-admin.component';
import { TypeHomeWorkListAdminComponent } from './type-home-work-admin/list-admin/type-home-work-list-admin.component';
import { CoursListAdminComponent } from './cours-admin/list-admin/cours-list-admin.component';
import { FreeTrialTeacherWhatsTemplateListAdminComponent } from './free-trial-teacher-whats-template-admin/list-admin/free-trial-teacher-whats-template-list-admin.component';
import { SectionItemListAdminComponent } from './section-item-admin/list-admin/section-item-list-admin.component';
import { FreeTrialListAdminComponent } from './free-trial-admin/list-admin/free-trial-list-admin.component';
import { SectionListAdminComponent } from './section-admin/list-admin/section-list-admin.component';
import { EtudiantCoursListAdminComponent } from './etudiant-cours-admin/list-admin/etudiant-cours-list-admin.component';
import { FreeTrialStudentWhatsTemplateListAdminComponent } from './free-trial-student-whats-template-admin/list-admin/free-trial-student-whats-template-list-admin.component';
import { LevelTestConfigurationListAdminComponent } from './level-test-configuration-admin/list-admin/level-test-configuration-list-admin.component';
import { StatutFreeTrialListAdminComponent } from './statut-free-trial-admin/list-admin/statut-free-trial-list-admin.component';
import { ReponseEtudiantListAdminComponent } from './reponse-etudiant-admin/list-admin/reponse-etudiant-list-admin.component';
import { EtatEtudiantListAdminComponent } from './etat-etudiant-admin/list-admin/etat-etudiant-list-admin.component';
import { FreeTrialDetailListAdminComponent } from './free-trial-detail-admin/list-admin/free-trial-detail-list-admin.component';
import { ScheduleProfListAdminComponent } from './schedule-prof-admin/list-admin/schedule-prof-list-admin.component';
import { FonctionListAdminComponent } from './fonction-admin/list-admin/fonction-list-admin.component';
import { HoweWorkQSTReponseListAdminComponent } from './howe-work-q-s-t-reponse-admin/list-admin/howe-work-q-s-t-reponse-list-admin.component';
import { ContactListAdminComponent } from './contact-admin/list-admin/contact-list-admin.component';
import { TypeTeacherListAdminComponent } from './type-teacher-admin/list-admin/type-teacher-list-admin.component';
import { EtudiantClassRoomListAdminComponent } from './etudiant-class-room-admin/list-admin/etudiant-class-room-list-admin.component';
import { EtatReponseListAdminComponent } from './etat-reponse-admin/list-admin/etat-reponse-list-admin.component';
import { ResultatHomeWorkListAdminComponent } from './resultat-home-work-admin/list-admin/resultat-home-work-list-admin.component';
import { ConfirmationTokenListAdminComponent } from './confirmation-token-admin/list-admin/confirmation-token-list-admin.component';
import { SuperCategorieSectionListAdminComponent } from './super-categorie-section-admin/list-admin/super-categorie-section-list-admin.component';
import { FaqListAdminComponent } from './faq-admin/list-admin/faq-list-admin.component';
import { CategorieSectionListAdminComponent } from './categorie-section-admin/list-admin/categorie-section-list-admin.component';
import { PackStudentListAdminComponent } from './pack-student-admin/list-admin/pack-student-list-admin.component';
import { GroupeEtudiantDetailListAdminComponent } from './groupe-etudiant-detail-admin/list-admin/groupe-etudiant-detail-list-admin.component';
import { TypeDeQuestionListAdminComponent } from './type-de-question-admin/list-admin/type-de-question-list-admin.component';
import { TrancheHoraireProfListAdminComponent } from './tranche-horaire-prof-admin/list-admin/tranche-horaire-prof-list-admin.component';
import { FreeTrialformuleListAdminComponent } from './free-trialformule-admin/list-admin/free-trialformule-list-admin.component';
import { EtatEtudiantScheduleListAdminComponent } from './etat-etudiant-schedule-admin/list-admin/etat-etudiant-schedule-list-admin.component';
import { HomeWorkQuestionListAdminComponent } from './home-work-question-admin/list-admin/home-work-question-list-admin.component';
import { QuestionListAdminComponent } from './question-admin/list-admin/question-list-admin.component';
import { RecommendTeacherListAdminComponent } from './recommend-teacher-admin/list-admin/recommend-teacher-list-admin.component';
import { PriceListAdminComponent } from './price-admin/list-admin/price-list-admin.component';
import { CentreListAdminComponent } from './centre-admin/list-admin/centre-list-admin.component';
import { ReclamationEtudiantListAdminComponent } from './reclamation-etudiant-admin/list-admin/reclamation-etudiant-list-admin.component';
import { SkillListAdminComponent } from './skill-admin/list-admin/skill-list-admin.component';
import { ProfListAdminComponent } from './prof-admin/list-admin/prof-list-admin.component';
import { WorkloadBonusListAdminComponent } from './workload-bonus-admin/list-admin/workload-bonus-list-admin.component';
import { LangueListAdminComponent } from './langue-admin/list-admin/langue-list-admin.component';
import { PaiementListAdminComponent } from './paiement-admin/list-admin/paiement-list-admin.component';
import { TeacherLocalityListAdminComponent } from './teacher-locality-admin/list-admin/teacher-locality-list-admin.component';
import { FreeTrialStudentEmailTemplateListAdminComponent } from './free-trial-student-email-template-admin/list-admin/free-trial-student-email-template-list-admin.component';
import { ReponseListAdminComponent } from './reponse-admin/list-admin/reponse-list-admin.component';
import { InteretEtudiantListAdminComponent } from './interet-etudiant-admin/list-admin/interet-etudiant-list-admin.component';
import { QuizEtudiantListAdminComponent } from './quiz-etudiant-admin/list-admin/quiz-etudiant-list-admin.component';
import { DictionaryListAdminComponent } from './dictionary-admin/list-admin/dictionary-list-admin.component';
import { SalaryListAdminComponent } from './salary-admin/list-admin/salary-list-admin.component';
import { EtatCoursListAdminComponent } from './etat-cours-admin/list-admin/etat-cours-list-admin.component';
import { ProfReviewListAdminComponent } from './prof-review-admin/list-admin/prof-review-list-admin.component';
import { ReclamationProfListAdminComponent } from './reclamation-prof-admin/list-admin/reclamation-prof-list-admin.component';
import { VocabularyQuizListAdminComponent } from './vocabulary-quiz-admin/list-admin/vocabulary-quiz-list-admin.component';
import { FaqEtudiantListAdminComponent } from './faq-etudiant-admin/list-admin/faq-etudiant-list-admin.component';
import { FreeTrialTeacherEmailTemplateListAdminComponent } from './free-trial-teacher-email-template-admin/list-admin/free-trial-teacher-email-template-list-admin.component';
import { VocabularyListAdminComponent } from './vocabulary-admin/list-admin/vocabulary-list-admin.component';
import { EtudiantReviewListAdminComponent } from './etudiant-review-admin/list-admin/etudiant-review-list-admin.component';
import { FaqProfListAdminComponent } from './faq-prof-admin/list-admin/faq-prof-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'invite-student',
                            children: [
                                {
                                    path: 'list',
                                    component: InviteStudentListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'news',
                            children: [
                                {
                                    path: 'list',
                                    component: NewsListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'workload-bonus-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: WorkloadBonusProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'reponse-etudiant-home-work',
                            children: [
                                {
                                    path: 'list',
                                    component: ReponseEtudiantHomeWorkListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'home-work',
                            children: [
                                {
                                    path: 'list',
                                    component: HomeWorkListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'home-work-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: HomeWorkEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'groupe-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: GroupeEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'class-average-bonus',
                            children: [
                                {
                                    path: 'list',
                                    component: ClassAverageBonusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'services',
                            children: [
                                {
                                    path: 'list',
                                    component: ServicesListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'categorie-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: CategorieProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'class-room',
                            children: [
                                {
                                    path: 'list',
                                    component: ClassRoomListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'parcours',
                            children: [
                                {
                                    path: 'list',
                                    component: ParcoursListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'niveau-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauEtudeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'session-cours',
                            children: [
                                {
                                    path: 'list',
                                    component: SessionCoursListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'inscription',
                            children: [
                                {
                                    path: 'list',
                                    component: InscriptionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-inscription',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatInscriptionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'class-average-bonus-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: ClassAverageBonusProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: EtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial-configuration',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialConfigurationListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-reclamation-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeReclamationProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'faq-type',
                            children: [
                                {
                                    path: 'list',
                                    component: FaqTypeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'calendrier-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: CalendrierProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'admin',
                            children: [
                                {
                                    path: 'list',
                                    component: AdminListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-reclamation-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeReclamationEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'quiz-class-room',
                            children: [
                                {
                                    path: 'list',
                                    component: QuizClassRoomListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'niveau-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: NiveauEtudeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'statut-social',
                            children: [
                                {
                                    path: 'list',
                                    component: StatutSocialListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'quiz',
                            children: [
                                {
                                    path: 'list',
                                    component: QuizListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'groupe-etude',
                            children: [
                                {
                                    path: 'list',
                                    component: GroupeEtudeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-home-work',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeHomeWorkListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'cours',
                            children: [
                                {
                                    path: 'list',
                                    component: CoursListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial-teacher-whats-template',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialTeacherWhatsTemplateListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'section-item',
                            children: [
                                {
                                    path: 'list',
                                    component: SectionItemListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'section',
                            children: [
                                {
                                    path: 'list',
                                    component: SectionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etudiant-cours',
                            children: [
                                {
                                    path: 'list',
                                    component: EtudiantCoursListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial-student-whats-template',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialStudentWhatsTemplateListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'level-test-configuration',
                            children: [
                                {
                                    path: 'list',
                                    component: LevelTestConfigurationListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'statut-free-trial',
                            children: [
                                {
                                    path: 'list',
                                    component: StatutFreeTrialListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'reponse-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: ReponseEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial-detail',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialDetailListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'schedule-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: ScheduleProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'fonction',
                            children: [
                                {
                                    path: 'list',
                                    component: FonctionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'howe-work-q-s-t-reponse',
                            children: [
                                {
                                    path: 'list',
                                    component: HoweWorkQSTReponseListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'contact',
                            children: [
                                {
                                    path: 'list',
                                    component: ContactListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-teacher',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeTeacherListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etudiant-class-room',
                            children: [
                                {
                                    path: 'list',
                                    component: EtudiantClassRoomListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-reponse',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatReponseListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'resultat-home-work',
                            children: [
                                {
                                    path: 'list',
                                    component: ResultatHomeWorkListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'confirmation-token',
                            children: [
                                {
                                    path: 'list',
                                    component: ConfirmationTokenListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'super-categorie-section',
                            children: [
                                {
                                    path: 'list',
                                    component: SuperCategorieSectionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'faq',
                            children: [
                                {
                                    path: 'list',
                                    component: FaqListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'categorie-section',
                            children: [
                                {
                                    path: 'list',
                                    component: CategorieSectionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'pack-student',
                            children: [
                                {
                                    path: 'list',
                                    component: PackStudentListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'groupe-etudiant-detail',
                            children: [
                                {
                                    path: 'list',
                                    component: GroupeEtudiantDetailListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-de-question',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeDeQuestionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'tranche-horaire-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: TrancheHoraireProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trialformule',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialformuleListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-etudiant-schedule',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatEtudiantScheduleListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'home-work-question',
                            children: [
                                {
                                    path: 'list',
                                    component: HomeWorkQuestionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'question',
                            children: [
                                {
                                    path: 'list',
                                    component: QuestionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'recommend-teacher',
                            children: [
                                {
                                    path: 'list',
                                    component: RecommendTeacherListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'price',
                            children: [
                                {
                                    path: 'list',
                                    component: PriceListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'centre',
                            children: [
                                {
                                    path: 'list',
                                    component: CentreListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'reclamation-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: ReclamationEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'skill',
                            children: [
                                {
                                    path: 'list',
                                    component: SkillListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'prof',
                            children: [
                                {
                                    path: 'list',
                                    component: ProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'workload-bonus',
                            children: [
                                {
                                    path: 'list',
                                    component: WorkloadBonusListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'langue',
                            children: [
                                {
                                    path: 'list',
                                    component: LangueListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'paiement',
                            children: [
                                {
                                    path: 'list',
                                    component: PaiementListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'teacher-locality',
                            children: [
                                {
                                    path: 'list',
                                    component: TeacherLocalityListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial-student-email-template',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialStudentEmailTemplateListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'reponse',
                            children: [
                                {
                                    path: 'list',
                                    component: ReponseListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'interet-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: InteretEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'quiz-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: QuizEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'dictionary',
                            children: [
                                {
                                    path: 'list',
                                    component: DictionaryListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'salary',
                            children: [
                                {
                                    path: 'list',
                                    component: SalaryListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-cours',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatCoursListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'prof-review',
                            children: [
                                {
                                    path: 'list',
                                    component: ProfReviewListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'reclamation-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: ReclamationProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'vocabulary-quiz',
                            children: [
                                {
                                    path: 'list',
                                    component: VocabularyQuizListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'faq-etudiant',
                            children: [
                                {
                                    path: 'list',
                                    component: FaqEtudiantListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'free-trial-teacher-email-template',
                            children: [
                                {
                                    path: 'list',
                                    component: FreeTrialTeacherEmailTemplateListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'vocabulary',
                            children: [
                                {
                                    path: 'list',
                                    component: VocabularyListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etudiant-review',
                            children: [
                                {
                                    path: 'list',
                                    component: EtudiantReviewListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'faq-prof',
                            children: [
                                {
                                    path: 'list',
                                    component: FaqProfListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class AlcAdminRoutingModule { }
