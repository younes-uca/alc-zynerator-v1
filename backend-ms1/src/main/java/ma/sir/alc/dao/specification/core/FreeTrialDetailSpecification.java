package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.FreeTrialDetailCriteria;
import ma.sir.alc.bean.core.FreeTrialDetail;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialDetailSpecification extends  AbstractSpecification<FreeTrialDetailCriteria, FreeTrialDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBool("presence", criteria.getPresence());
        addPredicateBool("whatsUpMessageSent", criteria.getWhatsUpMessageSent());
        addPredicate("dateEnvoiwhatsUpMessage", criteria.getDateEnvoiwhatsUpMessage(), criteria.getDateEnvoiwhatsUpMessageFrom(), criteria.getDateEnvoiwhatsUpMessageTo());
        addPredicateBool("emailMessageSent", criteria.getEmailMessageSent());
        addPredicate("dateEnvoiEmailMessage", criteria.getDateEnvoiEmailMessage(), criteria.getDateEnvoiEmailMessageFrom(), criteria.getDateEnvoiEmailMessageTo());
        addPredicateBool("abonne", criteria.getAbonne());
        addPredicateFk("freeTrial","id", criteria.getFreeTrial()==null?null:criteria.getFreeTrial().getId());
        addPredicateFk("freeTrial","reference", criteria.getFreeTrial()==null?null:criteria.getFreeTrial().getReference());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public FreeTrialDetailSpecification(FreeTrialDetailCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailSpecification(FreeTrialDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
