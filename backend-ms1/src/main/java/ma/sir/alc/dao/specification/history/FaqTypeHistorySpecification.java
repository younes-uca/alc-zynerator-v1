package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.sir.alc.bean.history.FaqTypeHistory;


public class FaqTypeHistorySpecification extends AbstractHistorySpecification<FaqTypeHistoryCriteria, FaqTypeHistory> {

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
