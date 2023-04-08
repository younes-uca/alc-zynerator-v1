package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.WorkloadBonusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusHistoryDao extends AbstractHistoryRepository<WorkloadBonusHistory,Long> {

}
