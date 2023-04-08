package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TypeHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeHomeWorkHistoryDao extends AbstractHistoryRepository<TypeHomeWorkHistory,Long> {

}
