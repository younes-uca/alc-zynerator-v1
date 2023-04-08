package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.NiveauEtude;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.NiveauEtude;
import java.util.List;


@Repository
public interface NiveauEtudeDao extends AbstractRepository<NiveauEtude,Long>  {
    NiveauEtude findByCode(String code);
    int deleteByCode(String code);


}
