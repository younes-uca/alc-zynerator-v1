package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.sir.alc.bean.history.ClassAverageBonusHistory;


public class ClassAverageBonusHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusHistoryCriteria, ClassAverageBonusHistory> {

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
