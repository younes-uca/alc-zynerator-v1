package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.PriceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceHistoryDao extends AbstractHistoryRepository<PriceHistory,Long> {

}
