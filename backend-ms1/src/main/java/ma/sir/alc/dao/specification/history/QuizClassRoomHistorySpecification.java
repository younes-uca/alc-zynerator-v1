package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.alc.bean.history.QuizClassRoomHistory;


public class QuizClassRoomHistorySpecification extends AbstractHistorySpecification<QuizClassRoomHistoryCriteria, QuizClassRoomHistory> {

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
