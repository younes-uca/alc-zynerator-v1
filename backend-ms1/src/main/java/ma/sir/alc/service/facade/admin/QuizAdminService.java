package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Quiz;
import ma.sir.alc.dao.criteria.core.QuizCriteria;
import ma.sir.alc.dao.criteria.history.QuizHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface QuizAdminService extends  IService<Quiz,QuizCriteria, QuizHistoryCriteria>  {

    List<Quiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
