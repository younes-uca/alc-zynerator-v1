package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Price;
import ma.sir.alc.bean.history.PriceHistory;
import ma.sir.alc.dao.criteria.core.PriceCriteria;
import ma.sir.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.sir.alc.dao.facade.core.PriceDao;
import ma.sir.alc.dao.facade.history.PriceHistoryDao;
import ma.sir.alc.dao.specification.core.PriceSpecification;
import ma.sir.alc.service.facade.admin.PriceAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class PriceAdminServiceImpl extends AbstractServiceImpl<Price,PriceHistory, PriceCriteria, PriceHistoryCriteria, PriceDao,
PriceHistoryDao> implements PriceAdminService {




    public void configure() {
        super.configure(Price.class,PriceHistory.class, PriceHistoryCriteria.class, PriceSpecification.class);
    }

    public PriceAdminServiceImpl(PriceDao dao, PriceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}