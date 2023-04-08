package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.FaqEtudiantHistory;


public class FaqEtudiantHistorySpecification extends AbstractHistorySpecification<FaqEtudiantHistoryCriteria, FaqEtudiantHistory> {

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
