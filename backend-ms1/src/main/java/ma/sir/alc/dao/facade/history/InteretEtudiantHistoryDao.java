package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.InteretEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InteretEtudiantHistoryDao extends AbstractHistoryRepository<InteretEtudiantHistory,Long> {

}
