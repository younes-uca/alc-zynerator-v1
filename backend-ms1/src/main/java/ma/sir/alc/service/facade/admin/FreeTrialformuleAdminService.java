package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.FreeTrialformule;
import ma.sir.alc.dao.criteria.core.FreeTrialformuleCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface FreeTrialformuleAdminService extends  IService<FreeTrialformule,FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria>  {

    List<FreeTrialformule> findByInscriptionId(Long id);
    int deleteByInscriptionId(Long id);



}
