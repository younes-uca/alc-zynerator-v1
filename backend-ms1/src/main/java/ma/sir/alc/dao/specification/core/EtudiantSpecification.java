package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.EtudiantCriteria;
import ma.sir.alc.bean.core.Etudiant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EtudiantSpecification extends  AbstractSpecification<EtudiantCriteria, Etudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("groupOption", criteria.getGroupOption(),criteria.getGroupOptionLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicateFk("teacherLocality","id", criteria.getTeacherLocality()==null?null:criteria.getTeacherLocality().getId());
        addPredicateFk("teacherLocality","code", criteria.getTeacherLocality()==null?null:criteria.getTeacherLocality().getCode());
        addPredicateFk("etatEtudiantSchedule","id", criteria.getEtatEtudiantSchedule()==null?null:criteria.getEtatEtudiantSchedule().getId());
        addPredicateFk("etatEtudiantSchedule","libelle", criteria.getEtatEtudiantSchedule()==null?null:criteria.getEtatEtudiantSchedule().getLibelle());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
        addPredicateFk("groupeEtude","id", criteria.getGroupeEtude()==null?null:criteria.getGroupeEtude().getId());
        addPredicateFk("packStudent","id", criteria.getPackStudent()==null?null:criteria.getPackStudent().getId());
        addPredicateFk("packStudent","code", criteria.getPackStudent()==null?null:criteria.getPackStudent().getCode());
        addPredicateFk("statutSocial","id", criteria.getStatutSocial()==null?null:criteria.getStatutSocial().getId());
        addPredicateFk("statutSocial","code", criteria.getStatutSocial()==null?null:criteria.getStatutSocial().getCode());
        addPredicateFk("interetEtudiant","id", criteria.getInteretEtudiant()==null?null:criteria.getInteretEtudiant().getId());
        addPredicateFk("interetEtudiant","code", criteria.getInteretEtudiant()==null?null:criteria.getInteretEtudiant().getCode());
        addPredicateFk("niveauEtude","id", criteria.getNiveauEtude()==null?null:criteria.getNiveauEtude().getId());
        addPredicateFk("niveauEtude","code", criteria.getNiveauEtude()==null?null:criteria.getNiveauEtude().getCode());
        addPredicateFk("skill","id", criteria.getSkill()==null?null:criteria.getSkill().getId());
        addPredicateFk("skill","code", criteria.getSkill()==null?null:criteria.getSkill().getCode());
        addPredicateFk("fonction","id", criteria.getFonction()==null?null:criteria.getFonction().getId());
        addPredicateFk("fonction","code", criteria.getFonction()==null?null:criteria.getFonction().getCode());
        addPredicateFk("langue","id", criteria.getLangue()==null?null:criteria.getLangue().getId());
        addPredicateFk("langue","libelle", criteria.getLangue()==null?null:criteria.getLangue().getLibelle());
    }

    public EtudiantSpecification(EtudiantCriteria criteria) {
        super(criteria);
    }

    public EtudiantSpecification(EtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
