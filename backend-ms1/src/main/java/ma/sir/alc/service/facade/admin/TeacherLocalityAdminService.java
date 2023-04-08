package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.TeacherLocality;
import ma.sir.alc.dao.criteria.core.TeacherLocalityCriteria;
import ma.sir.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface TeacherLocalityAdminService extends  IService<TeacherLocality,TeacherLocalityCriteria, TeacherLocalityHistoryCriteria>  {

    Long getNextOrdre();



}
