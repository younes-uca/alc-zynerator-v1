import {ParcoursCriteria} from './ParcoursCriteria.model';
import {QuizCriteria} from './QuizCriteria.model';
import {SkillCriteria} from './SkillCriteria.model';
import {InteretEtudiantCriteria} from './InteretEtudiantCriteria.model';
import {FonctionCriteria} from './FonctionCriteria.model';
import {EtudiantCriteria} from './EtudiantCriteria.model';
import {EtatInscriptionCriteria} from './EtatInscriptionCriteria.model';
import {StatutSocialCriteria} from './StatutSocialCriteria.model';
import {PackStudentCriteria} from './PackStudentCriteria.model';
import {GroupeEtudeCriteria} from './GroupeEtudeCriteria.model';
import {NiveauEtudeCriteria} from './NiveauEtudeCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class InscriptionCriteria  extends BaseCriteria {

    public id: number;
     public numeroInscription: number;
     public numeroInscriptionMin: number;
     public numeroInscriptionMax: number;
     public noteQuizNiveau: number;
     public noteQuizNiveauMin: number;
     public noteQuizNiveauMax: number;
    public quizFinished: null | boolean;
    public dateRegistration: string;
    public dateRegistrationLike: string;
    public datedebutinscription: Date;
    public datedebutinscriptionFrom: Date;
    public datedebutinscriptionTo: Date;
    public datefininscription: Date;
    public datefininscriptionFrom: Date;
    public datefininscriptionTo: Date;
    public skype: string;
    public skypeLike: string;
  public etudiant: EtudiantCriteria ;
  public etatInscription: EtatInscriptionCriteria ;
  public parcours: ParcoursCriteria ;
  public groupeEtude: GroupeEtudeCriteria ;
  public statutSocial: StatutSocialCriteria ;
  public interetEtudiant: InteretEtudiantCriteria ;
  public niveauEtude: NiveauEtudeCriteria ;
  public fonction: FonctionCriteria ;
  public quizNiveau: QuizCriteria ;
  public packStudent: PackStudentCriteria ;
  public skill: SkillCriteria ;

}
