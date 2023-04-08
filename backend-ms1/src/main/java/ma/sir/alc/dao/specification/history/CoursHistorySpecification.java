package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.CoursHistoryCriteria;
import ma.sir.alc.bean.history.CoursHistory;


public class CoursHistorySpecification extends AbstractHistorySpecification<CoursHistoryCriteria, CoursHistory> {

    public CoursHistorySpecification(CoursHistoryCriteria criteria) {
        super(criteria);
    }

    public CoursHistorySpecification(CoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
