package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ProfReviewHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfReviewHistoryDao extends AbstractHistoryRepository<ProfReviewHistory,Long> {

}
