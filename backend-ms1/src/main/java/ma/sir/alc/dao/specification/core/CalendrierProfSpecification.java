package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.CalendrierProfCriteria;
import ma.sir.alc.bean.core.CalendrierProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CalendrierProfSpecification extends  AbstractSpecification<CalendrierProfCriteria, CalendrierProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("startTime", criteria.getStartTime(),criteria.getStartTimeLike());
        addPredicate("endTime", criteria.getEndTime(),criteria.getEndTimeLike());
        addPredicate("startRecur", criteria.getStartRecur(), criteria.getStartRecurFrom(), criteria.getStartRecurTo());
        addPredicate("endRecur", criteria.getEndRecur(), criteria.getEndRecurFrom(), criteria.getEndRecurTo());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public CalendrierProfSpecification(CalendrierProfCriteria criteria) {
        super(criteria);
    }

    public CalendrierProfSpecification(CalendrierProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
