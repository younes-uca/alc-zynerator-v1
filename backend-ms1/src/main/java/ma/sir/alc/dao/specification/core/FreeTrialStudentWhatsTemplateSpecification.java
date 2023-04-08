package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.sir.alc.bean.core.FreeTrialStudentWhatsTemplate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FreeTrialStudentWhatsTemplateSpecification extends  AbstractSpecification<FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialStudentWhatsTemplateSpecification(FreeTrialStudentWhatsTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateSpecification(FreeTrialStudentWhatsTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
