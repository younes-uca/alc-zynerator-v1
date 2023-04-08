package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ReclamationProfCriteria;
import ma.sir.alc.bean.core.ReclamationProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ReclamationProfSpecification extends  AbstractSpecification<ReclamationProfCriteria, ReclamationProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateReclamation", criteria.getDateReclamation(), criteria.getDateReclamationFrom(), criteria.getDateReclamationTo());
        addPredicateBool("traite", criteria.getTraite());
        addPredicate("dateTraitement", criteria.getDateTraitement(), criteria.getDateTraitementFrom(), criteria.getDateTraitementTo());
        addPredicate("dateReponse", criteria.getDateReponse(), criteria.getDateReponseFrom(), criteria.getDateReponseTo());
        addPredicateBool("postView", criteria.getPostView());
        addPredicate("objetReclamationProf", criteria.getObjetReclamationProf(),criteria.getObjetReclamationProfLike());
        addPredicateFk("admin","id", criteria.getAdmin()==null?null:criteria.getAdmin().getId());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("typeReclamationProf","id", criteria.getTypeReclamationProf()==null?null:criteria.getTypeReclamationProf().getId());
        addPredicateFk("typeReclamationProf","code", criteria.getTypeReclamationProf()==null?null:criteria.getTypeReclamationProf().getCode());
    }

    public ReclamationProfSpecification(ReclamationProfCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfSpecification(ReclamationProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
