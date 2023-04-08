package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.FreeTrialCriteria;
import ma.sir.alc.bean.core.FreeTrial;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialSpecification extends  AbstractSpecification<FreeTrialCriteria, FreeTrial>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateFreeTrial", criteria.getDateFreeTrial(), criteria.getDateFreeTrialFrom(), criteria.getDateFreeTrialTo());
        addPredicate("link", criteria.getLink(),criteria.getLinkLike());
        addPredicateBool("emailTeacherSent", criteria.getEmailTeacherSent());
        addPredicate("emailTeacherSendingDate", criteria.getEmailTeacherSendingDate(), criteria.getEmailTeacherSendingDateFrom(), criteria.getEmailTeacherSendingDateTo());
        addPredicateBool("whatsTeacherSent", criteria.getWhatsTeacherSent());
        addPredicate("whatsTeacherSendingDate", criteria.getWhatsTeacherSendingDate(), criteria.getWhatsTeacherSendingDateFrom(), criteria.getWhatsTeacherSendingDateTo());
        addPredicate("dateFreeTrialPremierRappel", criteria.getDateFreeTrialPremierRappel(), criteria.getDateFreeTrialPremierRappelFrom(), criteria.getDateFreeTrialPremierRappelTo());
        addPredicate("dateFreeTrialPremierDeuxiemeRappel", criteria.getDateFreeTrialPremierDeuxiemeRappel(), criteria.getDateFreeTrialPremierDeuxiemeRappelFrom(), criteria.getDateFreeTrialPremierDeuxiemeRappelTo());
        addPredicateInt("nombreStudentTotal", criteria.getNombreStudentTotal(), criteria.getNombreStudentTotalMin(), criteria.getNombreStudentTotalMax());
        addPredicateInt("nombreStudentAbonne", criteria.getNombreStudentAbonne(), criteria.getNombreStudentAbonneMin(), criteria.getNombreStudentAbonneMax());
        addPredicateInt("nombreStudentPresent", criteria.getNombreStudentPresent(), criteria.getNombreStudentPresentMin(), criteria.getNombreStudentPresentMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("niveauEtude","id", criteria.getNiveauEtude()==null?null:criteria.getNiveauEtude().getId());
        addPredicateFk("niveauEtude","code", criteria.getNiveauEtude()==null?null:criteria.getNiveauEtude().getCode());
        addPredicateFk("freeTrialStudentWhatsTemplate","id", criteria.getFreeTrialStudentWhatsTemplate()==null?null:criteria.getFreeTrialStudentWhatsTemplate().getId());
        addPredicateFk("freeTrialStudentEmailTemplate","id", criteria.getFreeTrialStudentEmailTemplate()==null?null:criteria.getFreeTrialStudentEmailTemplate().getId());
        addPredicateFk("freeTrialTeacherEmailTemplate","id", criteria.getFreeTrialTeacherEmailTemplate()==null?null:criteria.getFreeTrialTeacherEmailTemplate().getId());
        addPredicateFk("freeTrialTeacherWhatsTemplate","id", criteria.getFreeTrialTeacherWhatsTemplate()==null?null:criteria.getFreeTrialTeacherWhatsTemplate().getId());
        addPredicateFk("freeTrialConfiguration","id", criteria.getFreeTrialConfiguration()==null?null:criteria.getFreeTrialConfiguration().getId());
        addPredicateFk("statutFreeTrial","id", criteria.getStatutFreeTrial()==null?null:criteria.getStatutFreeTrial().getId());
        addPredicateFk("statutFreeTrial","code", criteria.getStatutFreeTrial()==null?null:criteria.getStatutFreeTrial().getCode());
    }

    public FreeTrialSpecification(FreeTrialCriteria criteria) {
        super(criteria);
    }

    public FreeTrialSpecification(FreeTrialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
