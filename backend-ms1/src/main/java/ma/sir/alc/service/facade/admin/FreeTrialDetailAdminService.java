package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.FreeTrialDetail;
import ma.sir.alc.dao.criteria.core.FreeTrialDetailCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface FreeTrialDetailAdminService extends  IService<FreeTrialDetail,FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria>  {

    List<FreeTrialDetail> findByFreeTrialId(Long id);
    int deleteByFreeTrialId(Long id);
    List<FreeTrialDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
