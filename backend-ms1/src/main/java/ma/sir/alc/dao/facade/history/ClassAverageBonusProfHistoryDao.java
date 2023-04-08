package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ClassAverageBonusProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusProfHistoryDao extends AbstractHistoryRepository<ClassAverageBonusProfHistory,Long> {

}
