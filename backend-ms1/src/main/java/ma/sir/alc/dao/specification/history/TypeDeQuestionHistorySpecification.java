package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.sir.alc.bean.history.TypeDeQuestionHistory;


public class TypeDeQuestionHistorySpecification extends AbstractHistorySpecification<TypeDeQuestionHistoryCriteria, TypeDeQuestionHistory> {

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
