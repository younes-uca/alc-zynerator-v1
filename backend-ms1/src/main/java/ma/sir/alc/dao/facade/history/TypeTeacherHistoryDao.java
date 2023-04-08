package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TypeTeacherHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTeacherHistoryDao extends AbstractHistoryRepository<TypeTeacherHistory,Long> {

}
