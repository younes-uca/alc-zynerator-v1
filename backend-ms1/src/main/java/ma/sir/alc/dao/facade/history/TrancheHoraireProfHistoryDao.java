package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TrancheHoraireProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TrancheHoraireProfHistoryDao extends AbstractHistoryRepository<TrancheHoraireProfHistory,Long> {

}
