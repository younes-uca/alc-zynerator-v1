package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialTeacherWhatsTemplateHistory;


public class FreeTrialTeacherWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateHistory> {

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
