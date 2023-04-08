package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.FaqProfCriteria;
import ma.sir.alc.bean.core.FaqProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FaqProfSpecification extends  AbstractSpecification<FaqProfCriteria, FaqProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("admin","id", criteria.getAdmin()==null?null:criteria.getAdmin().getId());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
    }

    public FaqProfSpecification(FaqProfCriteria criteria) {
        super(criteria);
    }

    public FaqProfSpecification(FaqProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
