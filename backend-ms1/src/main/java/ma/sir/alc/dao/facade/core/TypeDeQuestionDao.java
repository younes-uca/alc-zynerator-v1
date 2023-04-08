package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.TypeDeQuestion;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.TypeDeQuestion;
import java.util.List;


@Repository
public interface TypeDeQuestionDao extends AbstractRepository<TypeDeQuestion,Long>  {
    TypeDeQuestion findByRef(String ref);
    int deleteByRef(String ref);


}
