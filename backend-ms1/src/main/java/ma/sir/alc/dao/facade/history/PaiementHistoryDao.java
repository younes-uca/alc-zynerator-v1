package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.PaiementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementHistoryDao extends AbstractHistoryRepository<PaiementHistory,Long> {

}
