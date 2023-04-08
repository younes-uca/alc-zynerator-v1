package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FaqProfHistoryCriteria;
import ma.sir.alc.bean.history.FaqProfHistory;


public class FaqProfHistorySpecification extends AbstractHistorySpecification<FaqProfHistoryCriteria, FaqProfHistory> {

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
