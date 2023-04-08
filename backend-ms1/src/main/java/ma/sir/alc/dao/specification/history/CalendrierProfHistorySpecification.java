package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.alc.bean.history.CalendrierProfHistory;


public class CalendrierProfHistorySpecification extends AbstractHistorySpecification<CalendrierProfHistoryCriteria, CalendrierProfHistory> {

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
