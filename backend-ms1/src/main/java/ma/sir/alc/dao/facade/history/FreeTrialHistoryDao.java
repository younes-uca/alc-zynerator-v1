package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FreeTrialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialHistoryDao extends AbstractHistoryRepository<FreeTrialHistory,Long> {

}
