package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.sir.alc.bean.history.InviteStudentHistory;


public class InviteStudentHistorySpecification extends AbstractHistorySpecification<InviteStudentHistoryCriteria, InviteStudentHistory> {

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
