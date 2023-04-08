package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.SectionHistoryCriteria;
import ma.sir.alc.bean.history.SectionHistory;


public class SectionHistorySpecification extends AbstractHistorySpecification<SectionHistoryCriteria, SectionHistory> {

    public SectionHistorySpecification(SectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionHistorySpecification(SectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
