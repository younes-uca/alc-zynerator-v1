package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtatCours;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.EtatCours;
import java.util.List;


@Repository
public interface EtatCoursDao extends AbstractRepository<EtatCours,Long>  {
    EtatCours findByCode(String code);
    int deleteByCode(String code);


}
