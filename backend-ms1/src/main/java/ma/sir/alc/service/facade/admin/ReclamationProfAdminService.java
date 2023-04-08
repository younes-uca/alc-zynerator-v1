package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ReclamationProf;
import ma.sir.alc.dao.criteria.core.ReclamationProfCriteria;
import ma.sir.alc.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ReclamationProfAdminService extends  IService<ReclamationProf,ReclamationProfCriteria, ReclamationProfHistoryCriteria>  {

    List<ReclamationProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<ReclamationProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ReclamationProf> findByTypeReclamationProfId(Long id);
    int deleteByTypeReclamationProfId(Long id);



}
