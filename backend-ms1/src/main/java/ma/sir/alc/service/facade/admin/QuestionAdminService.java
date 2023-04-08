package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Question;
import ma.sir.alc.dao.criteria.core.QuestionCriteria;
import ma.sir.alc.dao.criteria.history.QuestionHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface QuestionAdminService extends  IService<Question,QuestionCriteria, QuestionHistoryCriteria>  {

    List<Question> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<Question> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Question> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);



}
