package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.EtudiantClassRoomHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantClassRoomHistoryDao extends AbstractHistoryRepository<EtudiantClassRoomHistory,Long> {

}
