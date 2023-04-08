package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.alc.bean.history.FaqHistory;


public class FaqHistorySpecification extends AbstractHistorySpecification<FaqHistoryCriteria, FaqHistory> {

    public FaqHistorySpecification(FaqHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqHistorySpecification(FaqHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
