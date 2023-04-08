package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.sir.alc.bean.history.ClassRoomHistory;


public class ClassRoomHistorySpecification extends AbstractHistorySpecification<ClassRoomHistoryCriteria, ClassRoomHistory> {

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassRoomHistorySpecification(ClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
