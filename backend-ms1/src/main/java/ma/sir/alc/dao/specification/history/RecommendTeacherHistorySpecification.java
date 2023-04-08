package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.sir.alc.bean.history.RecommendTeacherHistory;


public class RecommendTeacherHistorySpecification extends AbstractHistorySpecification<RecommendTeacherHistoryCriteria, RecommendTeacherHistory> {

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
