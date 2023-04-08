package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.News;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.News;
import java.util.List;


@Repository
public interface NewsDao extends AbstractRepository<News,Long>  {
    News findByRef(String ref);
    int deleteByRef(String ref);


}
