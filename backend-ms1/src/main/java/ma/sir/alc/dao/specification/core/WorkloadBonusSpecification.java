package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.WorkloadBonusCriteria;
import ma.sir.alc.bean.core.WorkloadBonus;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class WorkloadBonusSpecification extends  AbstractSpecification<WorkloadBonusCriteria, WorkloadBonus>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateFk("workloadBonus","id", criteria.getWorkloadBonus()==null?null:criteria.getWorkloadBonus().getId());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("salary","id", criteria.getSalary()==null?null:criteria.getSalary().getId());
        addPredicateFk("salary","code", criteria.getSalary()==null?null:criteria.getSalary().getCode());
    }

    public WorkloadBonusSpecification(WorkloadBonusCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusSpecification(WorkloadBonusCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
