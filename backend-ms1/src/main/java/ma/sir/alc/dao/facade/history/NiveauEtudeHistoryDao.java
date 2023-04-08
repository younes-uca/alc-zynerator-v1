package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.NiveauEtudeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauEtudeHistoryDao extends AbstractHistoryRepository<NiveauEtudeHistory,Long> {

}
