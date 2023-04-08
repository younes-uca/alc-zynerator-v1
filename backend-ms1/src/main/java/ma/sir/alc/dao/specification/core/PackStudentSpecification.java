package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.PackStudentCriteria;
import ma.sir.alc.bean.core.PackStudent;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PackStudentSpecification extends  AbstractSpecification<PackStudentCriteria, PackStudent>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("nombreCours", criteria.getNombreCours(), criteria.getNombreCoursMin(), criteria.getNombreCoursMax());
        addPredicateBool("forGroupe", criteria.getForGroupe());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("preRequisites", criteria.getPreRequisites(),criteria.getPreRequisitesLike());
        addPredicate("whyTakeThisCourse", criteria.getWhyTakeThisCourse(),criteria.getWhyTakeThisCourseLike());
        addPredicate("expectations", criteria.getExpectations(),criteria.getExpectationsLike());
        addPredicate("imgUrl", criteria.getImgUrl(),criteria.getImgUrlLike());
        addPredicateInt("totalStudents", criteria.getTotalStudents(), criteria.getTotalStudentsMin(), criteria.getTotalStudentsMax());
        addPredicate("rating", criteria.getRating(),criteria.getRatingLike());
        addPredicate("oldPrice", criteria.getOldPrice(),criteria.getOldPriceLike());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
        addPredicateFk("price","id", criteria.getPrice()==null?null:criteria.getPrice().getId());
    }

    public PackStudentSpecification(PackStudentCriteria criteria) {
        super(criteria);
    }

    public PackStudentSpecification(PackStudentCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
