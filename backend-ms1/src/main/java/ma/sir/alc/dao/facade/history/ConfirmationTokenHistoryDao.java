package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ConfirmationTokenHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenHistoryDao extends AbstractHistoryRepository<ConfirmationTokenHistory,Long> {

}
