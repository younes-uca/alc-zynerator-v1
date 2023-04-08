package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ReclamationEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.ReclamationEtudiant;
import java.util.List;


@Repository
public interface ReclamationEtudiantDao extends AbstractRepository<ReclamationEtudiant,Long>  {
    ReclamationEtudiant findByReference(String reference);
    int deleteByReference(String reference);

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);

}
