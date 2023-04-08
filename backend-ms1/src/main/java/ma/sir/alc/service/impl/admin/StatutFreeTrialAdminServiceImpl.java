package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.StatutFreeTrial;
import ma.sir.alc.bean.history.StatutFreeTrialHistory;
import ma.sir.alc.dao.criteria.core.StatutFreeTrialCriteria;
import ma.sir.alc.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.sir.alc.dao.facade.core.StatutFreeTrialDao;
import ma.sir.alc.dao.facade.history.StatutFreeTrialHistoryDao;
import ma.sir.alc.dao.specification.core.StatutFreeTrialSpecification;
import ma.sir.alc.service.facade.admin.StatutFreeTrialAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class StatutFreeTrialAdminServiceImpl extends AbstractServiceImpl<StatutFreeTrial,StatutFreeTrialHistory, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria, StatutFreeTrialDao,
StatutFreeTrialHistoryDao> implements StatutFreeTrialAdminService {


    public StatutFreeTrial findByReferenceEntity(StatutFreeTrial t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(StatutFreeTrial.class,StatutFreeTrialHistory.class, StatutFreeTrialHistoryCriteria.class, StatutFreeTrialSpecification.class);
    }

    public StatutFreeTrialAdminServiceImpl(StatutFreeTrialDao dao, StatutFreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}