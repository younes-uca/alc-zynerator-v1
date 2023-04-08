package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.CalendrierProf;
import ma.sir.alc.dao.criteria.core.CalendrierProfCriteria;
import ma.sir.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface CalendrierProfAdminService extends  IService<CalendrierProf,CalendrierProfCriteria, CalendrierProfHistoryCriteria>  {

    List<CalendrierProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<CalendrierProf> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
