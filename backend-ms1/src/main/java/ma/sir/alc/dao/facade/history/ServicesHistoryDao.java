package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ServicesHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesHistoryDao extends AbstractHistoryRepository<ServicesHistory,Long> {

}
