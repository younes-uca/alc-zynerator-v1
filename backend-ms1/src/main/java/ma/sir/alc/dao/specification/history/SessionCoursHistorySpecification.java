package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.sir.alc.bean.history.SessionCoursHistory;


public class SessionCoursHistorySpecification extends AbstractHistorySpecification<SessionCoursHistoryCriteria, SessionCoursHistory> {

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
