package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.FreeTrialDetail;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FreeTrialDetailDao extends AbstractRepository<FreeTrialDetail,Long>  {

    List<FreeTrialDetail> findByFreeTrialId(Long id);
    int deleteByFreeTrialId(Long id);
    List<FreeTrialDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
