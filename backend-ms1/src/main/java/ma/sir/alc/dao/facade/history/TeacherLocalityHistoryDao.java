package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TeacherLocalityHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherLocalityHistoryDao extends AbstractHistoryRepository<TeacherLocalityHistory,Long> {

}
