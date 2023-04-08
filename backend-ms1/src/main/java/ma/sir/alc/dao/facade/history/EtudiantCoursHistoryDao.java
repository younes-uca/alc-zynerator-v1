package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtudiantCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantCoursHistoryDao extends AbstractHistoryRepository<EtudiantCoursHistory,Long> {

}
