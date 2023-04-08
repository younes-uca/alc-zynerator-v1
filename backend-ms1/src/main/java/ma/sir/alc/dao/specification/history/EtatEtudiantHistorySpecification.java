package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.EtatEtudiantHistory;


public class EtatEtudiantHistorySpecification extends AbstractHistorySpecification<EtatEtudiantHistoryCriteria, EtatEtudiantHistory> {

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
