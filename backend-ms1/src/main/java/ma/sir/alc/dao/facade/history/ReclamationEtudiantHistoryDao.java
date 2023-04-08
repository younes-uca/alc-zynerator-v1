package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ReclamationEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationEtudiantHistoryDao extends AbstractHistoryRepository<ReclamationEtudiantHistory,Long> {

}
