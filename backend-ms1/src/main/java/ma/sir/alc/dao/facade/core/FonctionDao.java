package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Fonction;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Fonction;
import java.util.List;


@Repository
public interface FonctionDao extends AbstractRepository<Fonction,Long>  {
    Fonction findByCode(String code);
    int deleteByCode(String code);


}
