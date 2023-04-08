package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.LevelTestConfigurationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelTestConfigurationHistoryDao extends AbstractHistoryRepository<LevelTestConfigurationHistory,Long> {

}
