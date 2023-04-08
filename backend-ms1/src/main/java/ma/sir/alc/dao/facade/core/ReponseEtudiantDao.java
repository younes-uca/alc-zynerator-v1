package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ReponseEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.ReponseEtudiant;
import java.util.List;


@Repository
public interface ReponseEtudiantDao extends AbstractRepository<ReponseEtudiant,Long>  {
    ReponseEtudiant findByRef(String ref);
    int deleteByRef(String ref);

    List<ReponseEtudiant> findByReponseId(Long id);
    int deleteByReponseId(Long id);
    List<ReponseEtudiant> findByQuizEtudiantId(Long id);
    int deleteByQuizEtudiantId(Long id);
    List<ReponseEtudiant> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);

}
