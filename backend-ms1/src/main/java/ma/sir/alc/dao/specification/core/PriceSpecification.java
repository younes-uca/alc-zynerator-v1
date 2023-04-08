package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.PriceCriteria;
import ma.sir.alc.bean.core.Price;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PriceSpecification extends  AbstractSpecification<PriceCriteria, Price>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateBigDecimal("oldPrice", criteria.getOldPrice(), criteria.getOldPriceMin(), criteria.getOldPriceMax());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
        addPredicateBigDecimal("nreCourse", criteria.getNreCourse(), criteria.getNreCourseMin(), criteria.getNreCourseMax());
        addPredicateBigDecimal("nreHours", criteria.getNreHours(), criteria.getNreHoursMin(), criteria.getNreHoursMax());
        addPredicateBigDecimal("nreMonth", criteria.getNreMonth(), criteria.getNreMonthMin(), criteria.getNreMonthMax());
        addPredicateBool("forGroup", criteria.getForGroup());
    }

    public PriceSpecification(PriceCriteria criteria) {
        super(criteria);
    }

    public PriceSpecification(PriceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
