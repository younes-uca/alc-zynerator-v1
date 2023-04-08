package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.SalaryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryHistoryDao extends AbstractHistoryRepository<SalaryHistory,Long> {

}
