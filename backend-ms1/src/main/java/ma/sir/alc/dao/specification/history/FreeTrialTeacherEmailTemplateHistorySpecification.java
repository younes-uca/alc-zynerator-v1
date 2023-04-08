package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;


public class FreeTrialTeacherEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateHistory> {

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
