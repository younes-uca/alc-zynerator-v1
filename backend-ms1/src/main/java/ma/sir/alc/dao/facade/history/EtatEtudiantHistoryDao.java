package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtatEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantHistoryDao extends AbstractHistoryRepository<EtatEtudiantHistory,Long> {

}
