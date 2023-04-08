package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.FaqType;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FaqTypeDao extends AbstractRepository<FaqType,Long>  {


}
