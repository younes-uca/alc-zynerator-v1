package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.InteretEtudiantHistory;


public class InteretEtudiantHistorySpecification extends AbstractHistorySpecification<InteretEtudiantHistoryCriteria, InteretEtudiantHistory> {

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
