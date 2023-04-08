package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TypeReclamationProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationProfHistoryDao extends AbstractHistoryRepository<TypeReclamationProfHistory,Long> {

}
