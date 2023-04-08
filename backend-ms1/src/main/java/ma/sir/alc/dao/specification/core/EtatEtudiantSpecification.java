package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.EtatEtudiantCriteria;
import ma.sir.alc.bean.core.EtatEtudiant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtatEtudiantSpecification extends  AbstractSpecification<EtatEtudiantCriteria, EtatEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("firstName", criteria.getFirstName(),criteria.getFirstNameLike());
        addPredicate("lastName", criteria.getLastName(),criteria.getLastNameLike());
        addPredicate("nationnalite", criteria.getNationnalite(),criteria.getNationnaliteLike());
        addPredicate("schedule1", criteria.getSchedule1(),criteria.getSchedule1Like());
        addPredicate("schedule2", criteria.getSchedule2(),criteria.getSchedule2Like());
        addPredicate("lastClass", criteria.getLastClass(),criteria.getLastClassLike());
        addPredicate("nbrClass", criteria.getNbrClass(),criteria.getNbrClassLike());
        addPredicate("etat", criteria.getEtat(),criteria.getEtatLike());
        addPredicateLong("etatNumber", criteria.getEtatNumber(), criteria.getEtatNumberMin(), criteria.getEtatNumberMax());
    }

    public EtatEtudiantSpecification(EtatEtudiantCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantSpecification(EtatEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
