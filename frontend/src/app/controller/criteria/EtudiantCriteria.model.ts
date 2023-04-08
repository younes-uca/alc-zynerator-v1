import {ParcoursCriteria} from './ParcoursCriteria.model';
import {QuizEtudiantCriteria} from './QuizEtudiantCriteria.model';
import {EtatEtudiantScheduleCriteria} from './EtatEtudiantScheduleCriteria.model';
import {InteretEtudiantCriteria} from './InteretEtudiantCriteria.model';
import {StatutSocialCriteria} from './StatutSocialCriteria.model';
import {LangueCriteria} from './LangueCriteria.model';
import {GroupeEtudeCriteria} from './GroupeEtudeCriteria.model';
import {SkillCriteria} from './SkillCriteria.model';
import {FonctionCriteria} from './FonctionCriteria.model';
import {PackStudentCriteria} from './PackStudentCriteria.model';
import {GroupeEtudiantDetailCriteria} from './GroupeEtudiantDetailCriteria.model';
import {TeacherLocalityCriteria} from './TeacherLocalityCriteria.model';
import {NiveauEtudeCriteria} from './NiveauEtudeCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class EtudiantCriteria  extends BaseCriteria {

    public id: number;
    public ref: string;
    public refLike: string;
    public groupOption: string;
    public groupOptionLike: string;
    public email: string;
    public emailLike: string;
  public teacherLocality: TeacherLocalityCriteria ;
  public etatEtudiantSchedule: EtatEtudiantScheduleCriteria ;
  public parcours: ParcoursCriteria ;
  public groupeEtude: GroupeEtudeCriteria ;
  public packStudent: PackStudentCriteria ;
  public statutSocial: StatutSocialCriteria ;
  public interetEtudiant: InteretEtudiantCriteria ;
  public niveauEtude: NiveauEtudeCriteria ;
  public skill: SkillCriteria ;
  public fonction: FonctionCriteria ;
  public langue: LangueCriteria ;
      public quizEtudiants: Array<QuizEtudiantCriteria>;
      public groupeEtudiantDetails: Array<GroupeEtudiantDetailCriteria>;

}
