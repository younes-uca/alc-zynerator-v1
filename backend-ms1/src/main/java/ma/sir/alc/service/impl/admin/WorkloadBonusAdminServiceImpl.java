package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.WorkloadBonus;
import ma.sir.alc.bean.history.WorkloadBonusHistory;
import ma.sir.alc.dao.criteria.core.WorkloadBonusCriteria;
import ma.sir.alc.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.sir.alc.dao.facade.core.WorkloadBonusDao;
import ma.sir.alc.dao.facade.history.WorkloadBonusHistoryDao;
import ma.sir.alc.dao.specification.core.WorkloadBonusSpecification;
import ma.sir.alc.service.facade.admin.WorkloadBonusAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.ProfAdminService ;
import ma.sir.alc.service.facade.admin.SalaryAdminService ;


import java.util.List;
@Service
public class WorkloadBonusAdminServiceImpl extends AbstractServiceImpl<WorkloadBonus,WorkloadBonusHistory, WorkloadBonusCriteria, WorkloadBonusHistoryCriteria, WorkloadBonusDao,
WorkloadBonusHistoryDao> implements WorkloadBonusAdminService {



    public List<WorkloadBonus> findByWorkloadBonusId(Long id){
        return dao.findByWorkloadBonusId(id);
    }
    public int deleteByWorkloadBonusId(Long id){
        return dao.deleteByWorkloadBonusId(id);
    }
    public List<WorkloadBonus> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<WorkloadBonus> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }

    public void configure() {
        super.configure(WorkloadBonus.class,WorkloadBonusHistory.class, WorkloadBonusHistoryCriteria.class, WorkloadBonusSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private SalaryAdminService salaryService ;
    public WorkloadBonusAdminServiceImpl(WorkloadBonusDao dao, WorkloadBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}