package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.sir.alc.bean.history.EtatCoursHistory;


public class EtatCoursHistorySpecification extends AbstractHistorySpecification<EtatCoursHistoryCriteria, EtatCoursHistory> {

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatCoursHistorySpecification(EtatCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
