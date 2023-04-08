package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.FreeTrialformule;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.FreeTrialformule;
import java.util.List;


@Repository
public interface FreeTrialformuleDao extends AbstractRepository<FreeTrialformule,Long>  {
    FreeTrialformule findByCode(String code);
    int deleteByCode(String code);

    List<FreeTrialformule> findByInscriptionId(Long id);
    int deleteByInscriptionId(Long id);

}
