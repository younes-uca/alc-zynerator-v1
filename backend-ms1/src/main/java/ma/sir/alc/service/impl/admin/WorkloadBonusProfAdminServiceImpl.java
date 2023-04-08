package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.WorkloadBonusProf;
import ma.sir.alc.bean.history.WorkloadBonusProfHistory;
import ma.sir.alc.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.sir.alc.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.sir.alc.dao.facade.core.WorkloadBonusProfDao;
import ma.sir.alc.dao.facade.history.WorkloadBonusProfHistoryDao;
import ma.sir.alc.dao.specification.core.WorkloadBonusProfSpecification;
import ma.sir.alc.service.facade.admin.WorkloadBonusProfAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class WorkloadBonusProfAdminServiceImpl extends AbstractServiceImpl<WorkloadBonusProf,WorkloadBonusProfHistory, WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria, WorkloadBonusProfDao,
WorkloadBonusProfHistoryDao> implements WorkloadBonusProfAdminService {


    public WorkloadBonusProf findByReferenceEntity(WorkloadBonusProf t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(WorkloadBonusProf.class,WorkloadBonusProfHistory.class, WorkloadBonusProfHistoryCriteria.class, WorkloadBonusProfSpecification.class);
    }

    public WorkloadBonusProfAdminServiceImpl(WorkloadBonusProfDao dao, WorkloadBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}