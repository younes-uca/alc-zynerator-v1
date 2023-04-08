package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.HomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkHistoryDao extends AbstractHistoryRepository<HomeWorkHistory,Long> {

}
