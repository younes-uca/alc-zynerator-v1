package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.FaqEtudiant;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FaqEtudiantDao extends AbstractRepository<FaqEtudiant,Long>  {

    List<FaqEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<FaqEtudiant> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqEtudiant> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);

}
