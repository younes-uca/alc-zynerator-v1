package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.alc.bean.history.TrancheHoraireProfHistory;


public class TrancheHoraireProfHistorySpecification extends AbstractHistorySpecification<TrancheHoraireProfHistoryCriteria, TrancheHoraireProfHistory> {

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
