package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.sir.alc.bean.history.ReclamationProfHistory;


public class ReclamationProfHistorySpecification extends AbstractHistorySpecification<ReclamationProfHistoryCriteria, ReclamationProfHistory> {

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
