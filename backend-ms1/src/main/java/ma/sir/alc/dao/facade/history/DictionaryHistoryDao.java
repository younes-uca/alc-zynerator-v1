package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.DictionaryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryHistoryDao extends AbstractHistoryRepository<DictionaryHistory,Long> {

}
