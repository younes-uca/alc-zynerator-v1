package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialHistory;


public class FreeTrialHistorySpecification extends AbstractHistorySpecification<FreeTrialHistoryCriteria, FreeTrialHistory> {

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
