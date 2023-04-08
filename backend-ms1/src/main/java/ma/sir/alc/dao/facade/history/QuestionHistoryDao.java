package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.QuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionHistoryDao extends AbstractHistoryRepository<QuestionHistory,Long> {

}
