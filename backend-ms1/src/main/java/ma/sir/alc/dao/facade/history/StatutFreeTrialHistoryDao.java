package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.StatutFreeTrialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutFreeTrialHistoryDao extends AbstractHistoryRepository<StatutFreeTrialHistory,Long> {

}
