package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FaqType;
import ma.sir.alc.bean.history.FaqTypeHistory;
import ma.sir.alc.dao.criteria.core.FaqTypeCriteria;
import ma.sir.alc.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.sir.alc.dao.facade.core.FaqTypeDao;
import ma.sir.alc.dao.facade.history.FaqTypeHistoryDao;
import ma.sir.alc.dao.specification.core.FaqTypeSpecification;
import ma.sir.alc.service.facade.admin.FaqTypeAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FaqTypeAdminServiceImpl extends AbstractServiceImpl<FaqType,FaqTypeHistory, FaqTypeCriteria, FaqTypeHistoryCriteria, FaqTypeDao,
FaqTypeHistoryDao> implements FaqTypeAdminService {




    public void configure() {
        super.configure(FaqType.class,FaqTypeHistory.class, FaqTypeHistoryCriteria.class, FaqTypeSpecification.class);
    }

    public FaqTypeAdminServiceImpl(FaqTypeDao dao, FaqTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}