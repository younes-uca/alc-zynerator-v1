package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.PackStudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PackStudentHistoryDao extends AbstractHistoryRepository<PackStudentHistory,Long> {

}
