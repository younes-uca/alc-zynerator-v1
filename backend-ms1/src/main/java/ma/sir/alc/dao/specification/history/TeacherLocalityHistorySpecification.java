package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.alc.bean.history.TeacherLocalityHistory;


public class TeacherLocalityHistorySpecification extends AbstractHistorySpecification<TeacherLocalityHistoryCriteria, TeacherLocalityHistory> {

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria) {
        super(criteria);
    }

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
