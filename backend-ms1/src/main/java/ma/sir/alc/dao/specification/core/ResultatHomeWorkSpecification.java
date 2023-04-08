package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ResultatHomeWorkCriteria;
import ma.sir.alc.bean.core.ResultatHomeWork;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ResultatHomeWorkSpecification extends  AbstractSpecification<ResultatHomeWorkCriteria, ResultatHomeWork>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public ResultatHomeWorkSpecification(ResultatHomeWorkCriteria criteria) {
        super(criteria);
    }

    public ResultatHomeWorkSpecification(ResultatHomeWorkCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
