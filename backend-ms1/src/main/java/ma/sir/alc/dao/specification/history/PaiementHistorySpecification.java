package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.alc.bean.history.PaiementHistory;


public class PaiementHistorySpecification extends AbstractHistorySpecification<PaiementHistoryCriteria, PaiementHistory> {

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
