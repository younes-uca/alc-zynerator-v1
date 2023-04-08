package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.sir.alc.bean.history.HomeWorkQuestionHistory;


public class HomeWorkQuestionHistorySpecification extends AbstractHistorySpecification<HomeWorkQuestionHistoryCriteria, HomeWorkQuestionHistory> {

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
