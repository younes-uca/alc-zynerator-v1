package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.LangueHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueHistoryDao extends AbstractHistoryRepository<LangueHistory,Long> {

}
