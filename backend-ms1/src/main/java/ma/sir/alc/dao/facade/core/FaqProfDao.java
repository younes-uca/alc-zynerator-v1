package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.FaqProf;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FaqProfDao extends AbstractRepository<FaqProf,Long>  {

    List<FaqProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FaqProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqProf> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);

}
