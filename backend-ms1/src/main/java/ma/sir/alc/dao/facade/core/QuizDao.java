package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Quiz;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Quiz;
import java.util.List;


@Repository
public interface QuizDao extends AbstractRepository<Quiz,Long>  {
    Quiz findByRef(String ref);
    int deleteByRef(String ref);

    List<Quiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);

}
