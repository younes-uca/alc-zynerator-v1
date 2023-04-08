package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.sir.alc.bean.history.StatutFreeTrialHistory;


public class StatutFreeTrialHistorySpecification extends AbstractHistorySpecification<StatutFreeTrialHistoryCriteria, StatutFreeTrialHistory> {

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
