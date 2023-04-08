package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ReclamationProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationProfHistoryDao extends AbstractHistoryRepository<ReclamationProfHistory,Long> {

}
