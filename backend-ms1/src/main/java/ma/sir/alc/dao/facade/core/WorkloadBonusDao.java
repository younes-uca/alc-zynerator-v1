package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.WorkloadBonus;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface WorkloadBonusDao extends AbstractRepository<WorkloadBonus,Long>  {

    List<WorkloadBonus> findByWorkloadBonusId(Long id);
    int deleteByWorkloadBonusId(Long id);
    List<WorkloadBonus> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<WorkloadBonus> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);

}
