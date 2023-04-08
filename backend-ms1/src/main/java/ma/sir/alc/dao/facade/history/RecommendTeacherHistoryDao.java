package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.RecommendTeacherHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendTeacherHistoryDao extends AbstractHistoryRepository<RecommendTeacherHistory,Long> {

}
