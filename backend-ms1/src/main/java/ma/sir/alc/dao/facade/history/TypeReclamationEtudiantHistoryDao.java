package ma.sir.alc.dao.facade.history;

import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.bean.history.TypeReclamationEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeReclamationEtudiantHistoryDao extends AbstractHistoryRepository<TypeReclamationEtudiantHistory,Long> {

}
