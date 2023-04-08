package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.GroupeEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudiantHistoryDao extends AbstractHistoryRepository<GroupeEtudiantHistory,Long> {

}
