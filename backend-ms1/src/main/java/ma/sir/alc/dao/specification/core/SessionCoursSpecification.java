package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.SessionCoursCriteria;
import ma.sir.alc.bean.core.SessionCours;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SessionCoursSpecification extends  AbstractSpecification<SessionCoursCriteria, SessionCours>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicateBigDecimal("duree", criteria.getDuree(), criteria.getDureeMin(), criteria.getDureeMax());
        addPredicateBigDecimal("totalheure", criteria.getTotalheure(), criteria.getTotalheureMin(), criteria.getTotalheureMax());
        addPredicateBigDecimal("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateBigDecimal("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicateBool("payer", criteria.getPayer());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("cours","id", criteria.getCours()==null?null:criteria.getCours().getId());
        addPredicateFk("cours","code", criteria.getCours()==null?null:criteria.getCours().getCode());
        addPredicateFk("groupeEtudiant","id", criteria.getGroupeEtudiant()==null?null:criteria.getGroupeEtudiant().getId());
        addPredicateFk("salary","id", criteria.getSalary()==null?null:criteria.getSalary().getId());
        addPredicateFk("salary","code", criteria.getSalary()==null?null:criteria.getSalary().getCode());
    }

    public SessionCoursSpecification(SessionCoursCriteria criteria) {
        super(criteria);
    }

    public SessionCoursSpecification(SessionCoursCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
