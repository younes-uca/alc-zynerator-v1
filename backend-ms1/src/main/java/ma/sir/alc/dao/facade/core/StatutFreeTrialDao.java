package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.StatutFreeTrial;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.StatutFreeTrial;
import java.util.List;


@Repository
public interface StatutFreeTrialDao extends AbstractRepository<StatutFreeTrial,Long>  {
    StatutFreeTrial findByCode(String code);
    int deleteByCode(String code);


}
