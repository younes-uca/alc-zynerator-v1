package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantHistoryDao extends AbstractHistoryRepository<EtudiantHistory,Long> {

}
