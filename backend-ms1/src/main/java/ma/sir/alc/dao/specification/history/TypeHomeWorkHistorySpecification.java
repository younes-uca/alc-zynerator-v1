package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.sir.alc.bean.history.TypeHomeWorkHistory;


public class TypeHomeWorkHistorySpecification extends AbstractHistorySpecification<TypeHomeWorkHistoryCriteria, TypeHomeWorkHistory> {

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
