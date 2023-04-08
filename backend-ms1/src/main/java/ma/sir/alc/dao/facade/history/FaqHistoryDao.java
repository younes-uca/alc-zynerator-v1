package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FaqHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqHistoryDao extends AbstractHistoryRepository<FaqHistory,Long> {

}
