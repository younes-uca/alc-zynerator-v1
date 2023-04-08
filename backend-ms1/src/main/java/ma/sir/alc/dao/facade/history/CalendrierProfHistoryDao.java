package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.CalendrierProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendrierProfHistoryDao extends AbstractHistoryRepository<CalendrierProfHistory,Long> {

}
