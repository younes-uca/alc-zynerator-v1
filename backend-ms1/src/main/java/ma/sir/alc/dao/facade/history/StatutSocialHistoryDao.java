package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.StatutSocialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutSocialHistoryDao extends AbstractHistoryRepository<StatutSocialHistory,Long> {

}
