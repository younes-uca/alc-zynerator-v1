package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.sir.alc.bean.history.TypeTeacherHistory;


public class TypeTeacherHistorySpecification extends AbstractHistorySpecification<TypeTeacherHistoryCriteria, TypeTeacherHistory> {

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
