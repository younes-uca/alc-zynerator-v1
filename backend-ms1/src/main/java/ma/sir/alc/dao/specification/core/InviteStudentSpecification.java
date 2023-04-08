package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.InviteStudentCriteria;
import ma.sir.alc.bean.core.InviteStudent;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class InviteStudentSpecification extends  AbstractSpecification<InviteStudentCriteria, InviteStudent>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBool("isAccepted", criteria.getIsAccepted());
        addPredicateBool("isPaidPack", criteria.getIsPaidPack());
        addPredicate("emailInvited", criteria.getEmailInvited(),criteria.getEmailInvitedLike());
        addPredicate("dateSentInvitation", criteria.getDateSentInvitation(), criteria.getDateSentInvitationFrom(), criteria.getDateSentInvitationTo());
        addPredicate("dateAcceptInvitation", criteria.getDateAcceptInvitation(), criteria.getDateAcceptInvitationFrom(), criteria.getDateAcceptInvitationTo());
        addPredicate("datePayPack", criteria.getDatePayPack(), criteria.getDatePayPackFrom(), criteria.getDatePayPackTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public InviteStudentSpecification(InviteStudentCriteria criteria) {
        super(criteria);
    }

    public InviteStudentSpecification(InviteStudentCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
