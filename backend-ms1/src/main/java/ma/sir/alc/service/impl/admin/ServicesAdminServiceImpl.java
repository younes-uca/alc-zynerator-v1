package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Services;
import ma.sir.alc.bean.history.ServicesHistory;
import ma.sir.alc.dao.criteria.core.ServicesCriteria;
import ma.sir.alc.dao.criteria.history.ServicesHistoryCriteria;
import ma.sir.alc.dao.facade.core.ServicesDao;
import ma.sir.alc.dao.facade.history.ServicesHistoryDao;
import ma.sir.alc.dao.specification.core.ServicesSpecification;
import ma.sir.alc.service.facade.admin.ServicesAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ServicesAdminServiceImpl extends AbstractServiceImpl<Services,ServicesHistory, ServicesCriteria, ServicesHistoryCriteria, ServicesDao,
ServicesHistoryDao> implements ServicesAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Services findByReferenceEntity(Services t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Services.class,ServicesHistory.class, ServicesHistoryCriteria.class, ServicesSpecification.class);
    }

    public ServicesAdminServiceImpl(ServicesDao dao, ServicesHistoryDao historyDao) {
        super(dao, historyDao);
    }

}