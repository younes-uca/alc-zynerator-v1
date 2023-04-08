package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialConfigurationHistory;


public class FreeTrialConfigurationHistorySpecification extends AbstractHistorySpecification<FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationHistory> {

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
