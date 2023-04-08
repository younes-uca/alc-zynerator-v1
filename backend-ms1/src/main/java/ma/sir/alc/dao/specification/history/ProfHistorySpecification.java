package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ProfHistoryCriteria;
import ma.sir.alc.bean.history.ProfHistory;


public class ProfHistorySpecification extends AbstractHistorySpecification<ProfHistoryCriteria, ProfHistory> {

    public ProfHistorySpecification(ProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfHistorySpecification(ProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
