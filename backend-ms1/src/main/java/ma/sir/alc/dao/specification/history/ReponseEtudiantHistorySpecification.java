package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.ReponseEtudiantHistory;


public class ReponseEtudiantHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHistoryCriteria, ReponseEtudiantHistory> {

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
