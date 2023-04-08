package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.GroupeEtudiantCriteria;
import ma.sir.alc.bean.core.GroupeEtudiant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class GroupeEtudiantSpecification extends  AbstractSpecification<GroupeEtudiantCriteria, GroupeEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("niveau", criteria.getNiveau(),criteria.getNiveauLike());
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
        addPredicateLong("nombrePlace", criteria.getNombrePlace(), criteria.getNombrePlaceMin(), criteria.getNombrePlaceMax());
        addPredicateLong("nombrePlacevide", criteria.getNombrePlacevide(), criteria.getNombrePlacevideMin(), criteria.getNombrePlacevideMax());
        addPredicateLong("nombrePlaceNonVide", criteria.getNombrePlaceNonVide(), criteria.getNombrePlaceNonVideMin(), criteria.getNombrePlaceNonVideMax());
        addPredicateFk("groupeEtude","id", criteria.getGroupeEtude()==null?null:criteria.getGroupeEtude().getId());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public GroupeEtudiantSpecification(GroupeEtudiantCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantSpecification(GroupeEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
