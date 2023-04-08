package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.sir.alc.bean.history.WorkloadBonusHistory;


public class WorkloadBonusHistorySpecification extends AbstractHistorySpecification<WorkloadBonusHistoryCriteria, WorkloadBonusHistory> {

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
