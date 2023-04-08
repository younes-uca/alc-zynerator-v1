package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.CategorieProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProfHistoryDao extends AbstractHistoryRepository<CategorieProfHistory,Long> {

}
