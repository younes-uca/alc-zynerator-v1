package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ReponseEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseEtudiantHistoryDao extends AbstractHistoryRepository<ReponseEtudiantHistory,Long> {

}
