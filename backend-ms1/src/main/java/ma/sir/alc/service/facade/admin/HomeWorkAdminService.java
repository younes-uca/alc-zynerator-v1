package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.HomeWork;
import ma.sir.alc.dao.criteria.core.HomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface HomeWorkAdminService extends  IService<HomeWork,HomeWorkCriteria, HomeWorkHistoryCriteria>  {

    List<HomeWork> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<HomeWork> findByTypeHomeWorkId(Long id);
    int deleteByTypeHomeWorkId(Long id);



}
