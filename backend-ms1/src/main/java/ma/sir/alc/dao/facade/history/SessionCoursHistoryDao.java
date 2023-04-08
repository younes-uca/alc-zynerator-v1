package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.SessionCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionCoursHistoryDao extends AbstractHistoryRepository<SessionCoursHistory,Long> {

}
