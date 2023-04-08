package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.PackStudent;
import ma.sir.alc.dao.criteria.core.PackStudentCriteria;
import ma.sir.alc.dao.criteria.history.PackStudentHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface PackStudentAdminService extends  IService<PackStudent,PackStudentCriteria, PackStudentHistoryCriteria>  {

    List<PackStudent> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<PackStudent> findByPriceId(Long id);
    int deleteByPriceId(Long id);



}
