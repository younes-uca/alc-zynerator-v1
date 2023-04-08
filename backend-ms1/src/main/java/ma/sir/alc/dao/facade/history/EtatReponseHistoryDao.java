package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtatReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReponseHistoryDao extends AbstractHistoryRepository<EtatReponseHistory,Long> {

}
