import {EtudiantCriteria} from './EtudiantCriteria.model';
import {CoursCriteria} from './CoursCriteria.model';
import {ProfCriteria} from './ProfCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class ProfReviewCriteria  extends BaseCriteria {

    public id: number;
     public review: number;
     public reviewMin: number;
     public reviewMax: number;
    public comment: string;
    public commentLike: string;
    public dateReview: Date;
    public dateReviewFrom: Date;
    public dateReviewTo: Date;
  public etudiant: EtudiantCriteria ;
  public prof: ProfCriteria ;
  public cours: CoursCriteria ;

}
