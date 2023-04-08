package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.sir.alc.bean.history.StatutSocialHistory;


public class StatutSocialHistorySpecification extends AbstractHistorySpecification<StatutSocialHistoryCriteria, StatutSocialHistory> {

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
