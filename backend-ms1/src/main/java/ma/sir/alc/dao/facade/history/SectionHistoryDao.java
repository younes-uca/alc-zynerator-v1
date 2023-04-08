package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.SectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionHistoryDao extends AbstractHistoryRepository<SectionHistory,Long> {

}
