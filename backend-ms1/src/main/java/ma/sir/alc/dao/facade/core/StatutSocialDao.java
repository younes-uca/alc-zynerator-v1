package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.StatutSocial;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.StatutSocial;
import java.util.List;


@Repository
public interface StatutSocialDao extends AbstractRepository<StatutSocial,Long>  {
    StatutSocial findByCode(String code);
    int deleteByCode(String code);


}
