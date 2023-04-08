package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.GroupeEtudeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudeHistoryDao extends AbstractHistoryRepository<GroupeEtudeHistory,Long> {

}
