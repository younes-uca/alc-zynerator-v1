import {FaqTypeCriteria} from './FaqTypeCriteria.model';
import {EtudiantCriteria} from './EtudiantCriteria.model';
import {AdminCriteria} from './AdminCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class FaqEtudiantCriteria  extends BaseCriteria {

    public id: number;
    public description: string;
    public descriptionLike: string;
    public libelle: string;
    public libelleLike: string;
  public etudiant: EtudiantCriteria ;
  public admin: AdminCriteria ;
  public faqType: FaqTypeCriteria ;

}
