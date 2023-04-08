package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialConfiguration;
import ma.sir.alc.bean.history.FreeTrialConfigurationHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialConfigurationDao;
import ma.sir.alc.dao.facade.history.FreeTrialConfigurationHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialConfigurationSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialConfigurationAdminServiceImpl extends AbstractServiceImpl<FreeTrialConfiguration,FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationDao,
FreeTrialConfigurationHistoryDao> implements FreeTrialConfigurationAdminService {




    public void configure() {
        super.configure(FreeTrialConfiguration.class,FreeTrialConfigurationHistory.class, FreeTrialConfigurationHistoryCriteria.class, FreeTrialConfigurationSpecification.class);
    }

    public FreeTrialConfigurationAdminServiceImpl(FreeTrialConfigurationDao dao, FreeTrialConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}