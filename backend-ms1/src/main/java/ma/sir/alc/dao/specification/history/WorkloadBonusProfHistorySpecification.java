package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.sir.alc.bean.history.WorkloadBonusProfHistory;


public class WorkloadBonusProfHistorySpecification extends AbstractHistorySpecification<WorkloadBonusProfHistoryCriteria, WorkloadBonusProfHistory> {

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
