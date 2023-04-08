package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.CoursCriteria;
import ma.sir.alc.bean.core.Cours;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CoursSpecification extends  AbstractSpecification<CoursCriteria, Cours>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicateInt("nombreSectionFinalise", criteria.getNombreSectionFinalise(), criteria.getNombreSectionFinaliseMin(), criteria.getNombreSectionFinaliseMax());
        addPredicateInt("nombreSectionEnCours", criteria.getNombreSectionEnCours(), criteria.getNombreSectionEnCoursMin(), criteria.getNombreSectionEnCoursMax());
        addPredicateInt("nombreLinkEnCours", criteria.getNombreLinkEnCours(), criteria.getNombreLinkEnCoursMin(), criteria.getNombreLinkEnCoursMax());
        addPredicateInt("nombreLinkFinalise", criteria.getNombreLinkFinalise(), criteria.getNombreLinkFinaliseMin(), criteria.getNombreLinkFinaliseMax());
        addPredicateInt("numeroOrder", criteria.getNumeroOrder(), criteria.getNumeroOrderMin(), criteria.getNumeroOrderMax());
        addPredicateFk("etatCours","id", criteria.getEtatCours()==null?null:criteria.getEtatCours().getId());
        addPredicateFk("etatCours","code", criteria.getEtatCours()==null?null:criteria.getEtatCours().getCode());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
    }

    public CoursSpecification(CoursCriteria criteria) {
        super(criteria);
    }

    public CoursSpecification(CoursCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
