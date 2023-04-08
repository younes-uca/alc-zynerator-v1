package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.HomeWorkEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkEtudiantHistoryDao extends AbstractHistoryRepository<HomeWorkEtudiantHistory,Long> {

}
