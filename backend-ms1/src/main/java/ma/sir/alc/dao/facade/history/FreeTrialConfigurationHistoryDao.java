package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FreeTrialConfigurationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialConfigurationHistoryDao extends AbstractHistoryRepository<FreeTrialConfigurationHistory,Long> {

}
