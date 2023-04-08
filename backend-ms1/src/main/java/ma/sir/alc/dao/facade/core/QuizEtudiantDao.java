package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.QuizEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.QuizEtudiant;
import java.util.List;


@Repository
public interface QuizEtudiantDao extends AbstractRepository<QuizEtudiant,Long>  {
    QuizEtudiant findByRef(String ref);
    int deleteByRef(String ref);

    List<QuizEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<QuizEtudiant> findByQuizId(Long id);
    int deleteByQuizId(Long id);

}
