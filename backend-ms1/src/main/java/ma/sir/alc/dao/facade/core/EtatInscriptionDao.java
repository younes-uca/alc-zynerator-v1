package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtatInscription;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.EtatInscription;
import java.util.List;


@Repository
public interface EtatInscriptionDao extends AbstractRepository<EtatInscription,Long>  {
    EtatInscription findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


}
