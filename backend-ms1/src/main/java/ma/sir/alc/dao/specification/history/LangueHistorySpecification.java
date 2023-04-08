package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.LangueHistoryCriteria;
import ma.sir.alc.bean.history.LangueHistory;


public class LangueHistorySpecification extends AbstractHistorySpecification<LangueHistoryCriteria, LangueHistory> {

    public LangueHistorySpecification(LangueHistoryCriteria criteria) {
        super(criteria);
    }

    public LangueHistorySpecification(LangueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
