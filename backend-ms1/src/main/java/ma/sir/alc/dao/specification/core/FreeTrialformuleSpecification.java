package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.FreeTrialformuleCriteria;
import ma.sir.alc.bean.core.FreeTrialformule;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialformuleSpecification extends  AbstractSpecification<FreeTrialformuleCriteria, FreeTrialformule>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("dayspeerweek", criteria.getDayspeerweek(),criteria.getDayspeerweekLike());
        addPredicate("timeperday", criteria.getTimeperday(),criteria.getTimeperdayLike());
        addPredicate("teacherGenderoption", criteria.getTeacherGenderoption(),criteria.getTeacherGenderoptionLike());
        addPredicate("teacherAgeRange", criteria.getTeacherAgeRange(),criteria.getTeacherAgeRangeLike());
        addPredicate("teacherPersonnality", criteria.getTeacherPersonnality(),criteria.getTeacherPersonnalityLike());
        addPredicateBool("status", criteria.getStatus());
        addPredicate("dateConfirmation", criteria.getDateConfirmation(), criteria.getDateConfirmationFrom(), criteria.getDateConfirmationTo());
        addPredicateFk("inscription","id", criteria.getInscription()==null?null:criteria.getInscription().getId());
    }

    public FreeTrialformuleSpecification(FreeTrialformuleCriteria criteria) {
        super(criteria);
    }

    public FreeTrialformuleSpecification(FreeTrialformuleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
