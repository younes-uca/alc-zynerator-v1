package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.QuizEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizEtudiantHistoryDao extends AbstractHistoryRepository<QuizEtudiantHistory,Long> {

}
