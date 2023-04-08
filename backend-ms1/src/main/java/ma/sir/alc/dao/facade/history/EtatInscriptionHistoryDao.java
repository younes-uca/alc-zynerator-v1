package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtatInscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatInscriptionHistoryDao extends AbstractHistoryRepository<EtatInscriptionHistory,Long> {

}
