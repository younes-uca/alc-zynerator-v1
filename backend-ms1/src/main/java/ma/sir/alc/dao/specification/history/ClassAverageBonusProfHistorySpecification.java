package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.sir.alc.bean.history.ClassAverageBonusProfHistory;


public class ClassAverageBonusProfHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfHistory> {

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
