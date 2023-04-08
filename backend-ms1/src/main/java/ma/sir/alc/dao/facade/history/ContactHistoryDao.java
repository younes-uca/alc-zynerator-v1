package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ContactHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactHistoryDao extends AbstractHistoryRepository<ContactHistory,Long> {

}
