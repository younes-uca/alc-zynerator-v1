package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ClassAverageBonusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusHistoryDao extends AbstractHistoryRepository<ClassAverageBonusHistory,Long> {

}
