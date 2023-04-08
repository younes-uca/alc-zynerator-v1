package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ReclamationProf;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.ReclamationProf;
import java.util.List;


@Repository
public interface ReclamationProfDao extends AbstractRepository<ReclamationProf,Long>  {
    ReclamationProf findByReference(String reference);
    int deleteByReference(String reference);

    List<ReclamationProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<ReclamationProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ReclamationProf> findByTypeReclamationProfId(Long id);
    int deleteByTypeReclamationProfId(Long id);

}
