package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.WorkloadBonusProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusProfHistoryDao extends AbstractHistoryRepository<WorkloadBonusProfHistory,Long> {

}
