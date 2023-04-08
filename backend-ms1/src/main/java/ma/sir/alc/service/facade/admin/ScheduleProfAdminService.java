package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ScheduleProf;
import ma.sir.alc.dao.criteria.core.ScheduleProfCriteria;
import ma.sir.alc.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ScheduleProfAdminService extends  IService<ScheduleProf,ScheduleProfCriteria, ScheduleProfHistoryCriteria>  {

    List<ScheduleProf> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<ScheduleProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ScheduleProf> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
