package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfHistoryDao extends AbstractHistoryRepository<ProfHistory,Long> {

}
