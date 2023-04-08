package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Question;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Question;
import java.util.List;


@Repository
public interface QuestionDao extends AbstractRepository<Question,Long>  {
    Question findByLibelle(String libelle);
    int deleteByLibelle(String libelle);

    List<Question> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<Question> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Question> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);

}
