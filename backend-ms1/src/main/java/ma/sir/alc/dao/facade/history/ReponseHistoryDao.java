package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseHistoryDao extends AbstractHistoryRepository<ReponseHistory,Long> {

}
