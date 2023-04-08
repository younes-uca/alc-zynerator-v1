package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.ReclamationEtudiantHistory;


public class ReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<ReclamationEtudiantHistoryCriteria, ReclamationEtudiantHistory> {

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
