package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.SalaryHistoryCriteria;
import ma.sir.alc.bean.history.SalaryHistory;


public class SalaryHistorySpecification extends AbstractHistorySpecification<SalaryHistoryCriteria, SalaryHistory> {

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria) {
        super(criteria);
    }

    public SalaryHistorySpecification(SalaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
