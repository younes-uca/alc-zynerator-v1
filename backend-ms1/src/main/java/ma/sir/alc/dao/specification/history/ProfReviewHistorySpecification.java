package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.sir.alc.bean.history.ProfReviewHistory;


public class ProfReviewHistorySpecification extends AbstractHistorySpecification<ProfReviewHistoryCriteria, ProfReviewHistory> {

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
