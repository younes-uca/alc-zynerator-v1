package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtatEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.EtatEtudiant;
import java.util.List;


@Repository
public interface EtatEtudiantDao extends AbstractRepository<EtatEtudiant,Long>  {
    EtatEtudiant findByReference(String reference);
    int deleteByReference(String reference);


}
