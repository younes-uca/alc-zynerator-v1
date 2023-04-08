package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FaqTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqTypeHistoryDao extends AbstractHistoryRepository<FaqTypeHistory,Long> {

}
