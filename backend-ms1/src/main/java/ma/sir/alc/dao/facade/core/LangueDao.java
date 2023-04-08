package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Langue;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Langue;
import java.util.List;


@Repository
public interface LangueDao extends AbstractRepository<Langue,Long>  {
    Langue findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


}
