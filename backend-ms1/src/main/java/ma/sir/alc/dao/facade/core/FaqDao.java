package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Faq;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FaqDao extends AbstractRepository<Faq,Long>  {

    List<Faq> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);

}
