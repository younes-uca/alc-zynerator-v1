package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ScheduleProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleProfHistoryDao extends AbstractHistoryRepository<ScheduleProfHistory,Long> {

}
