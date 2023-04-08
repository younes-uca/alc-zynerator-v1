package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.ClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomHistoryDao extends AbstractHistoryRepository<ClassRoomHistory,Long> {

}
