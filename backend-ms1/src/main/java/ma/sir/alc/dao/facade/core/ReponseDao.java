package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Reponse;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Reponse;
import java.util.List;


@Repository
public interface ReponseDao extends AbstractRepository<Reponse,Long>  {
    Reponse findByRef(String ref);
    int deleteByRef(String ref);

    List<Reponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<Reponse> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);

}
