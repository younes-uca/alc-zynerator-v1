package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.InscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionHistoryDao extends AbstractHistoryRepository<InscriptionHistory,Long> {

}
