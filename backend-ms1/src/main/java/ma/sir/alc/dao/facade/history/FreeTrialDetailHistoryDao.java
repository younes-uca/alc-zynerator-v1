package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FreeTrialDetailHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialDetailHistoryDao extends AbstractHistoryRepository<FreeTrialDetailHistory,Long> {

}
