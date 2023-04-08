package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.SalaryCriteria;
import ma.sir.alc.bean.core.Salary;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SalarySpecification extends  AbstractSpecification<SalaryCriteria, Salary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("nbrSessionMensuel", criteria.getNbrSessionMensuel(), criteria.getNbrSessionMensuelMin(), criteria.getNbrSessionMensuelMax());
        addPredicateBool("payer", criteria.getPayer());
        addPredicateBigDecimal("totalPayment", criteria.getTotalPayment(), criteria.getTotalPaymentMin(), criteria.getTotalPaymentMax());
        addPredicateBigDecimal("totalBonusClassAverage", criteria.getTotalBonusClassAverage(), criteria.getTotalBonusClassAverageMin(), criteria.getTotalBonusClassAverageMax());
        addPredicateBigDecimal("totalBonusWorkload", criteria.getTotalBonusWorkload(), criteria.getTotalBonusWorkloadMin(), criteria.getTotalBonusWorkloadMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public SalarySpecification(SalaryCriteria criteria) {
        super(criteria);
    }

    public SalarySpecification(SalaryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
