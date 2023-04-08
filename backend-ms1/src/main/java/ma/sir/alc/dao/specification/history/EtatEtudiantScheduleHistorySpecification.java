package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.sir.alc.bean.history.EtatEtudiantScheduleHistory;


public class EtatEtudiantScheduleHistorySpecification extends AbstractHistorySpecification<EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleHistory> {

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
