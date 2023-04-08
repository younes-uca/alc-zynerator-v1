package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.VocabularyQuiz;
import ma.sir.alc.dao.criteria.core.VocabularyQuizCriteria;
import ma.sir.alc.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface VocabularyQuizAdminService extends  IService<VocabularyQuiz,VocabularyQuizCriteria, VocabularyQuizHistoryCriteria>  {

    List<VocabularyQuiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
