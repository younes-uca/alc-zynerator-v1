package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ResultatHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatHomeWorkHistoryDao extends AbstractHistoryRepository<ResultatHomeWorkHistory,Long> {

}
