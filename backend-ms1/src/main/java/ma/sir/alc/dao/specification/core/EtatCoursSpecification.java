package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.EtatCoursCriteria;
import ma.sir.alc.bean.core.EtatCours;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatCoursSpecification extends  AbstractSpecification<EtatCoursCriteria, EtatCours>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public EtatCoursSpecification(EtatCoursCriteria criteria) {
        super(criteria);
    }

    public EtatCoursSpecification(EtatCoursCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
