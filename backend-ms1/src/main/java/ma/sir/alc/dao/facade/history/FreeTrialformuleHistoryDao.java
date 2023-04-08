package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FreeTrialformuleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialformuleHistoryDao extends AbstractHistoryRepository<FreeTrialformuleHistory,Long> {

}
