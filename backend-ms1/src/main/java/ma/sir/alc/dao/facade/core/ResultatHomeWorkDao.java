package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ResultatHomeWork;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.ResultatHomeWork;
import java.util.List;


@Repository
public interface ResultatHomeWorkDao extends AbstractRepository<ResultatHomeWork,Long>  {
    ResultatHomeWork findByCode(String code);
    int deleteByCode(String code);


}
