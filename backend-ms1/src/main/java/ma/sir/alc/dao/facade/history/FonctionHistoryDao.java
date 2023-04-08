package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FonctionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionHistoryDao extends AbstractHistoryRepository<FonctionHistory,Long> {

}
