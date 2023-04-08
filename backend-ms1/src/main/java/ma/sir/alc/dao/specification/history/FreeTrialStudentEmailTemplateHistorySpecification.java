package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialStudentEmailTemplateHistory;


public class FreeTrialStudentEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateHistory> {

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
