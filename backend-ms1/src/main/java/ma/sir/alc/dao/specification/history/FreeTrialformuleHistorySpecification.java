package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialformuleHistory;


public class FreeTrialformuleHistorySpecification extends AbstractHistorySpecification<FreeTrialformuleHistoryCriteria, FreeTrialformuleHistory> {

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
