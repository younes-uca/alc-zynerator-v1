package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ParcoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcoursHistoryDao extends AbstractHistoryRepository<ParcoursHistory,Long> {

}
