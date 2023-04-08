package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Cours;
import ma.sir.alc.dao.criteria.core.CoursCriteria;
import ma.sir.alc.dao.criteria.history.CoursHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface CoursAdminService extends  IService<Cours,CoursCriteria, CoursHistoryCriteria>  {

    List<Cours> findByEtatCoursId(Long id);
    int deleteByEtatCoursId(Long id);
    List<Cours> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
