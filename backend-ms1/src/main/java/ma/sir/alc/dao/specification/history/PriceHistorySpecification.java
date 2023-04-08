package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.sir.alc.bean.history.PriceHistory;


public class PriceHistorySpecification extends AbstractHistorySpecification<PriceHistoryCriteria, PriceHistory> {

    public PriceHistorySpecification(PriceHistoryCriteria criteria) {
        super(criteria);
    }

    public PriceHistorySpecification(PriceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
