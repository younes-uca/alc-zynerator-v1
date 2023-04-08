package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Vocabulary;
import ma.sir.alc.dao.criteria.core.VocabularyCriteria;
import ma.sir.alc.dao.criteria.history.VocabularyHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface VocabularyAdminService extends  IService<Vocabulary,VocabularyCriteria, VocabularyHistoryCriteria>  {

    List<Vocabulary> findBySectionId(Long id);
    int deleteBySectionId(Long id);
    List<Vocabulary> findByVocabularyQuizId(Long id);
    int deleteByVocabularyQuizId(Long id);



}
