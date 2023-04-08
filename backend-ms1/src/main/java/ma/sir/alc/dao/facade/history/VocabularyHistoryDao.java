package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.VocabularyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyHistoryDao extends AbstractHistoryRepository<VocabularyHistory,Long> {

}
