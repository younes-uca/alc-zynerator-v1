package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.sir.alc.bean.history.EtudiantCoursHistory;


public class EtudiantCoursHistorySpecification extends AbstractHistorySpecification<EtudiantCoursHistoryCriteria, EtudiantCoursHistory> {

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
