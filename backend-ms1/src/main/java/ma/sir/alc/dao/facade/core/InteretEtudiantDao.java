package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.InteretEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.InteretEtudiant;
import java.util.List;


@Repository
public interface InteretEtudiantDao extends AbstractRepository<InteretEtudiant,Long>  {
    InteretEtudiant findByCode(String code);
    int deleteByCode(String code);


}
