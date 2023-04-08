package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.WorkloadBonus;
import ma.sir.alc.dao.criteria.core.WorkloadBonusCriteria;
import ma.sir.alc.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface WorkloadBonusAdminService extends  IService<WorkloadBonus,WorkloadBonusCriteria, WorkloadBonusHistoryCriteria>  {

    List<WorkloadBonus> findByWorkloadBonusId(Long id);
    int deleteByWorkloadBonusId(Long id);
    List<WorkloadBonus> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<WorkloadBonus> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
