package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Reponse;
import ma.sir.alc.dao.criteria.core.ReponseCriteria;
import ma.sir.alc.dao.criteria.history.ReponseHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ReponseAdminService extends  IService<Reponse,ReponseCriteria, ReponseHistoryCriteria>  {

    List<Reponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<Reponse> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);



}
