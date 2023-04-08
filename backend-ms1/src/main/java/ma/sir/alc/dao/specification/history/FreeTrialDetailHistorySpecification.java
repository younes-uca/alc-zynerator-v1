package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialDetailHistory;


public class FreeTrialDetailHistorySpecification extends AbstractHistorySpecification<FreeTrialDetailHistoryCriteria, FreeTrialDetailHistory> {

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
