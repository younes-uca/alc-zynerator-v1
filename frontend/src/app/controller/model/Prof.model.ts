import {ParcoursDto} from './Parcours.model';
import {TypeTeacherDto} from './TypeTeacher.model';
import {RecommendTeacherDto} from './RecommendTeacher.model';
import {CategorieProfDto} from './CategorieProf.model';
import {TrancheHoraireProfDto} from './TrancheHoraireProf.model';
import {ClassRoomDto} from './ClassRoom.model';
import {User} from './User.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

export class ProfDto  extends User{

    public ref: string;
    public about: string;
    public email: string;
   public credentialsNonExpired: null | boolean;
   public enabled: null | boolean;
   public accountNonExpired: null | boolean;
   public accountNonLocked: null | boolean;
   public passwordChanged: null | boolean;
   public createdAt: Date;
   public updatedAt: Date;
    public username: string;
    public password: string;
    public prenom: string;
    public nom: string;
    public createdAtMax: string ;
    public createdAtMin: string ;
    public updatedAtMax: string ;
    public updatedAtMin: string ;
    public levelMin: ParcoursDto ;
    public levelMax: ParcoursDto ;
    public categorieProf: CategorieProfDto ;
    public typeTeacher: TypeTeacherDto ;
     public trancheHoraireProfList: Array<TrancheHoraireProfDto>;
     public classRooms: Array<ClassRoomDto>;
     public recommendTeachers: Array<RecommendTeacherDto>;

}
