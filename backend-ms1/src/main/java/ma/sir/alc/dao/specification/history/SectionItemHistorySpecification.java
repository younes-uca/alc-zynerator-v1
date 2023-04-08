package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.SectionItemHistoryCriteria;
import ma.sir.alc.bean.history.SectionItemHistory;


public class SectionItemHistorySpecification extends AbstractHistorySpecification<SectionItemHistoryCriteria, SectionItemHistory> {

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
