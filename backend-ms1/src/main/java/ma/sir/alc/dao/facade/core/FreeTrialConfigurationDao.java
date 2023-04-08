package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.FreeTrialConfiguration;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FreeTrialConfigurationDao extends AbstractRepository<FreeTrialConfiguration,Long>  {


}
