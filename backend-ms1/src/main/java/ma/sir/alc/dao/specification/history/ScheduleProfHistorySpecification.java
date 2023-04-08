package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.sir.alc.bean.history.ScheduleProfHistory;


public class ScheduleProfHistorySpecification extends AbstractHistorySpecification<ScheduleProfHistoryCriteria, ScheduleProfHistory> {

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ScheduleProfHistorySpecification(ScheduleProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
