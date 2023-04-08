package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialTeacherEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialTeacherEmailTemplateHistory,Long> {

}
