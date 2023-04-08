package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TypeDeQuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDeQuestionHistoryDao extends AbstractHistoryRepository<TypeDeQuestionHistory,Long> {

}
