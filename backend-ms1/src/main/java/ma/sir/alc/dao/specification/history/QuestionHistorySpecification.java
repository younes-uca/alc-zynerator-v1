package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.QuestionHistoryCriteria;
import ma.sir.alc.bean.history.QuestionHistory;


public class QuestionHistorySpecification extends AbstractHistorySpecification<QuestionHistoryCriteria, QuestionHistory> {

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
