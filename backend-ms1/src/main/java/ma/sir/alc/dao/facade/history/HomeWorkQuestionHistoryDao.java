package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.HomeWorkQuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkQuestionHistoryDao extends AbstractHistoryRepository<HomeWorkQuestionHistory,Long> {

}
