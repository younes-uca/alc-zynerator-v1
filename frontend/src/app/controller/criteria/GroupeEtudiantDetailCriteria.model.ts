import {EtudiantCriteria} from './EtudiantCriteria.model';
import {GroupeEtudiantCriteria} from './GroupeEtudiantCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class GroupeEtudiantDetailCriteria  extends BaseCriteria {

    public id: number;
  public groupeEtudiant: GroupeEtudiantCriteria ;
  public etudiant: EtudiantCriteria ;

}
