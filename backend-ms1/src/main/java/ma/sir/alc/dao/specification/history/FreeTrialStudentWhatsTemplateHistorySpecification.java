package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.sir.alc.bean.history.FreeTrialStudentWhatsTemplateHistory;


public class FreeTrialStudentWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateHistory> {

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
