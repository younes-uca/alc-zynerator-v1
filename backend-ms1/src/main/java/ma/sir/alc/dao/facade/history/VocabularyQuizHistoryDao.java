package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.VocabularyQuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyQuizHistoryDao extends AbstractHistoryRepository<VocabularyQuizHistory,Long> {

}
