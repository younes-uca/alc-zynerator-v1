package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.PackStudentHistoryCriteria;
import ma.sir.alc.bean.history.PackStudentHistory;


public class PackStudentHistorySpecification extends AbstractHistorySpecification<PackStudentHistoryCriteria, PackStudentHistory> {

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
