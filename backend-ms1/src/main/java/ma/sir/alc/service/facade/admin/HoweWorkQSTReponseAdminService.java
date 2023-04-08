package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.HoweWorkQSTReponse;
import ma.sir.alc.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.sir.alc.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface HoweWorkQSTReponseAdminService extends  IService<HoweWorkQSTReponse,HoweWorkQSTReponseCriteria, HoweWorkQSTReponseHistoryCriteria>  {

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
