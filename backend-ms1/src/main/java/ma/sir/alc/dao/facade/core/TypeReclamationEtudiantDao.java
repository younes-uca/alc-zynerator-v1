package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.TypeReclamationEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.TypeReclamationEtudiant;
import java.util.List;


@Repository
public interface TypeReclamationEtudiantDao extends AbstractRepository<TypeReclamationEtudiant,Long>  {
    TypeReclamationEtudiant findByCode(String code);
    int deleteByCode(String code);


}
