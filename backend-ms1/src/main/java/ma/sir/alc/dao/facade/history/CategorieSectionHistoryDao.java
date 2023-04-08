package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.CategorieSectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieSectionHistoryDao extends AbstractHistoryRepository<CategorieSectionHistory,Long> {

}
