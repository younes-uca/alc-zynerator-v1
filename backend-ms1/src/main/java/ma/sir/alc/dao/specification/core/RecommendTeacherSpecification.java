package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.RecommendTeacherCriteria;
import ma.sir.alc.bean.core.RecommendTeacher;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class RecommendTeacherSpecification extends  AbstractSpecification<RecommendTeacherCriteria, RecommendTeacher>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateInt("nombrevote", criteria.getNombrevote(), criteria.getNombrevoteMin(), criteria.getNombrevoteMax());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("telephone", criteria.getTelephone(),criteria.getTelephoneLike());
        addPredicate("login", criteria.getLogin(),criteria.getLoginLike());
        addPredicate("dateRecommamdation", criteria.getDateRecommamdation(), criteria.getDateRecommamdationFrom(), criteria.getDateRecommamdationTo());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public RecommendTeacherSpecification(RecommendTeacherCriteria criteria) {
        super(criteria);
    }

    public RecommendTeacherSpecification(RecommendTeacherCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
