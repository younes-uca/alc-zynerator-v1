package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.FaqProf;
import ma.sir.alc.dao.criteria.core.FaqProfCriteria;
import ma.sir.alc.dao.criteria.history.FaqProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface FaqProfAdminService extends  IService<FaqProf,FaqProfCriteria, FaqProfHistoryCriteria>  {

    List<FaqProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FaqProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqProf> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
