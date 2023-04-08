import {SalaryCriteria} from './SalaryCriteria.model';
import {ProfCriteria} from './ProfCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class ClassAverageBonusProfCriteria  extends BaseCriteria {

    public id: number;
     public mois: number;
     public moisMin: number;
     public moisMax: number;
     public annee: number;
     public anneeMin: number;
     public anneeMax: number;
  public prof: ProfCriteria ;
  public salary: SalaryCriteria ;

}
