package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.AdminHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminHistoryDao extends AbstractHistoryRepository<AdminHistory,Long> {

}
