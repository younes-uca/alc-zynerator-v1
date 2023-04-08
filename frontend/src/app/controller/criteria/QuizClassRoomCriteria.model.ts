import {QuizCriteria} from './QuizCriteria.model';
import {ClassRoomCriteria} from './ClassRoomCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class QuizClassRoomCriteria  extends BaseCriteria {

    public id: number;
  public classRoom: ClassRoomCriteria ;
  public quiz: QuizCriteria ;

}
