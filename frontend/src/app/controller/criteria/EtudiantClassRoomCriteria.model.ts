import {EtudiantCriteria} from './EtudiantCriteria.model';
import {ClassRoomCriteria} from './ClassRoomCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class EtudiantClassRoomCriteria  extends BaseCriteria {

    public id: number;
  public classRoom: ClassRoomCriteria ;
  public etudiant: EtudiantCriteria ;

}
