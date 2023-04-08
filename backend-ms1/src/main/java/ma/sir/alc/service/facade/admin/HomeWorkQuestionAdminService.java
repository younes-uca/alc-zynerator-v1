package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.HomeWorkQuestion;
import ma.sir.alc.dao.criteria.core.HomeWorkQuestionCriteria;
import ma.sir.alc.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface HomeWorkQuestionAdminService extends  IService<HomeWorkQuestion,HomeWorkQuestionCriteria, HomeWorkQuestionHistoryCriteria>  {

    List<HomeWorkQuestion> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<HomeWorkQuestion> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
