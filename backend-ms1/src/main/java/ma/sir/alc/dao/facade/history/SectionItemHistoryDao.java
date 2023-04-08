package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.SectionItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionItemHistoryDao extends AbstractHistoryRepository<SectionItemHistory,Long> {

}
