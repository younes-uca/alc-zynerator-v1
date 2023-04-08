package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.QuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizHistoryDao extends AbstractHistoryRepository<QuizHistory,Long> {

}
