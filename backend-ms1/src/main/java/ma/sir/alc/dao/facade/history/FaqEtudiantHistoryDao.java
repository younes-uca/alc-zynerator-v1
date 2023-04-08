package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FaqEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqEtudiantHistoryDao extends AbstractHistoryRepository<FaqEtudiantHistory,Long> {

}
