package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.CoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursHistoryDao extends AbstractHistoryRepository<CoursHistory,Long> {

}
