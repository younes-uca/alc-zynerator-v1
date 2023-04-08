package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.SuperCategorieSectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperCategorieSectionHistoryDao extends AbstractHistoryRepository<SuperCategorieSectionHistory,Long> {

}
