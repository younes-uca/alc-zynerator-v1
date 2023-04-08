package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.FreeTrialStudentEmailTemplateHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialStudentEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialStudentEmailTemplateHistory,Long> {

}
