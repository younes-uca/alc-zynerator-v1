package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ServicesHistoryCriteria;
import ma.sir.alc.bean.history.ServicesHistory;


public class ServicesHistorySpecification extends AbstractHistorySpecification<ServicesHistoryCriteria, ServicesHistory> {

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria) {
        super(criteria);
    }

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
