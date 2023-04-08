package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.AdminCriteria;
import ma.sir.alc.bean.core.Admin;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AdminSpecification extends  AbstractSpecification<AdminCriteria, Admin>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("description", criteria.getDescription(),criteria.getDescriptionLike());
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
    }

    public AdminSpecification(AdminCriteria criteria) {
        super(criteria);
    }

    public AdminSpecification(AdminCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
