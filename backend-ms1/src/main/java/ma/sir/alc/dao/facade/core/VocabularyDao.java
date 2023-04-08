package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Vocabulary;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface VocabularyDao extends AbstractRepository<Vocabulary,Long>  {

    List<Vocabulary> findBySectionId(Long id);
    int deleteBySectionId(Long id);
    List<Vocabulary> findByVocabularyQuizId(Long id);
    int deleteByVocabularyQuizId(Long id);

}
