package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtatEtudiantScheduleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantScheduleHistoryDao extends AbstractHistoryRepository<EtatEtudiantScheduleHistory,Long> {

}
