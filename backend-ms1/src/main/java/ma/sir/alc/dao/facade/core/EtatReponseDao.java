package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtatReponse;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.EtatReponse;
import java.util.List;


@Repository
public interface EtatReponseDao extends AbstractRepository<EtatReponse,Long>  {
    EtatReponse findByCode(String code);
    int deleteByCode(String code);


}
