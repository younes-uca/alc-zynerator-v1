package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ProfCriteria;
import ma.sir.alc.bean.core.Prof;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProfSpecification extends  AbstractSpecification<ProfCriteria, Prof>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("about", criteria.getAbout(),criteria.getAboutLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicateBool("credentialsNonExpired", criteria.getCredentialsNonExpired());
        addPredicateBool("enabled", criteria.getEnabled());
        addPredicateBool("accountNonExpired", criteria.getAccountNonExpired());
        addPredicateBool("accountNonLocked", criteria.getAccountNonLocked());
        addPredicateBool("passwordChanged", criteria.getPasswordChanged());
        addPredicate("createdAt", criteria.getCreatedAt(),criteria.getCreatedAtLike());
        addPredicate("updatedAt", criteria.getUpdatedAt(),criteria.getUpdatedAtLike());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicateFk("levelMin","id", criteria.getLevelMin()==null?null:criteria.getLevelMin().getId());
        addPredicateFk("levelMin","code", criteria.getLevelMin()==null?null:criteria.getLevelMin().getCode());
        addPredicateFk("levelMax","id", criteria.getLevelMax()==null?null:criteria.getLevelMax().getId());
        addPredicateFk("levelMax","code", criteria.getLevelMax()==null?null:criteria.getLevelMax().getCode());
        addPredicateFk("categorieProf","id", criteria.getCategorieProf()==null?null:criteria.getCategorieProf().getId());
        addPredicateFk("categorieProf","code", criteria.getCategorieProf()==null?null:criteria.getCategorieProf().getCode());
        addPredicateFk("typeTeacher","id", criteria.getTypeTeacher()==null?null:criteria.getTypeTeacher().getId());
        addPredicateFk("typeTeacher","code", criteria.getTypeTeacher()==null?null:criteria.getTypeTeacher().getCode());
    }

    public ProfSpecification(ProfCriteria criteria) {
        super(criteria);
    }

    public ProfSpecification(ProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
