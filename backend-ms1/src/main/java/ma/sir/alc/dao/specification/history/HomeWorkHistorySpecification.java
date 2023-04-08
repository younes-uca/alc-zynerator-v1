package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.sir.alc.bean.history.HomeWorkHistory;


public class HomeWorkHistorySpecification extends AbstractHistorySpecification<HomeWorkHistoryCriteria, HomeWorkHistory> {

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
