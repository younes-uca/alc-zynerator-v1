package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.QuizHistoryCriteria;
import ma.sir.alc.bean.history.QuizHistory;


public class QuizHistorySpecification extends AbstractHistorySpecification<QuizHistoryCriteria, QuizHistory> {

    public QuizHistorySpecification(QuizHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizHistorySpecification(QuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
