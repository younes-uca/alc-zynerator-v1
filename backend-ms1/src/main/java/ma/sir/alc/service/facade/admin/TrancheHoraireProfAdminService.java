package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.TrancheHoraireProf;
import ma.sir.alc.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.sir.alc.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface TrancheHoraireProfAdminService extends  IService<TrancheHoraireProf,TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria>  {

    List<TrancheHoraireProf> findByProfId(Long id);
    int deleteByProfId(Long id);



}
