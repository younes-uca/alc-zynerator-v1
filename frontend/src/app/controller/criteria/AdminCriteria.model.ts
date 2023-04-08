//import {User} from './User.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class AdminCriteria  extends BaseCriteria  //extends User{

    public description: string;
    public descriptionLike: string;
    public credentialsNonExpired: null | boolean;
    public enabled: null | boolean;
    public accountNonExpired: null | boolean;
    public accountNonLocked: null | boolean;
    public passwordChanged: null | boolean;
    public createdAt: Date;
    public createdAtFrom: Date;
    public createdAtTo: Date;
    public updatedAt: Date;
    public updatedAtFrom: Date;
    public updatedAtTo: Date;
    public username: string;
    public usernameLike: string;
    public password: string;
    public passwordLike: string;
    public prenom: string;
    public prenomLike: string;
    public nom: string;
    public nomLike: string;

}
