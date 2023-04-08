package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ParcoursHistoryCriteria;
import ma.sir.alc.bean.history.ParcoursHistory;


public class ParcoursHistorySpecification extends AbstractHistorySpecification<ParcoursHistoryCriteria, ParcoursHistory> {

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria) {
        super(criteria);
    }

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
