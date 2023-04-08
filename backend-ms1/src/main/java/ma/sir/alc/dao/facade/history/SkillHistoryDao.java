package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.SkillHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillHistoryDao extends AbstractHistoryRepository<SkillHistory,Long> {

}
