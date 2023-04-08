package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.VocabularyQuiz;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface VocabularyQuizDao extends AbstractRepository<VocabularyQuiz,Long>  {

    List<VocabularyQuiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);

}
