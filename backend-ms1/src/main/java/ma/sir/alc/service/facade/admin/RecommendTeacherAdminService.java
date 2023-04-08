package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.RecommendTeacher;
import ma.sir.alc.dao.criteria.core.RecommendTeacherCriteria;
import ma.sir.alc.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface RecommendTeacherAdminService extends  IService<RecommendTeacher,RecommendTeacherCriteria, RecommendTeacherHistoryCriteria>  {

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);



}
