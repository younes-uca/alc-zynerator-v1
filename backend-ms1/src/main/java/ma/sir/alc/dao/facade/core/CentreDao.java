package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Centre;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Centre;
import java.util.List;


@Repository
public interface CentreDao extends AbstractRepository<Centre,Long>  {
    Centre findByRef(String ref);
    int deleteByRef(String ref);


}
