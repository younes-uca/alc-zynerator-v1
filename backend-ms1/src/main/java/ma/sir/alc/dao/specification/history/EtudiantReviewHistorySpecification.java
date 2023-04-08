package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.sir.alc.bean.history.EtudiantReviewHistory;


public class EtudiantReviewHistorySpecification extends AbstractHistorySpecification<EtudiantReviewHistoryCriteria, EtudiantReviewHistory> {

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
