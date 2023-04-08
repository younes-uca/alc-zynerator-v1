package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ConfirmationTokenCriteria;
import ma.sir.alc.bean.core.ConfirmationToken;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ConfirmationTokenSpecification extends  AbstractSpecification<ConfirmationTokenCriteria, ConfirmationToken>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("token", criteria.getToken(),criteria.getTokenLike());
        addPredicate("expiresAt", criteria.getExpiresAt(), criteria.getExpiresAtFrom(), criteria.getExpiresAtTo());
        addPredicate("createdAt", criteria.getCreatedAt(), criteria.getCreatedAtFrom(), criteria.getCreatedAtTo());
        addPredicate("confirmedAt", criteria.getConfirmedAt(), criteria.getConfirmedAtFrom(), criteria.getConfirmedAtTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public ConfirmationTokenSpecification(ConfirmationTokenCriteria criteria) {
        super(criteria);
    }

    public ConfirmationTokenSpecification(ConfirmationTokenCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
