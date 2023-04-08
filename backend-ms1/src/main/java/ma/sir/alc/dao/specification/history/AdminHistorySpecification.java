package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.AdminHistoryCriteria;
import ma.sir.alc.bean.history.AdminHistory;


public class AdminHistorySpecification extends AbstractHistorySpecification<AdminHistoryCriteria, AdminHistory> {

    public AdminHistorySpecification(AdminHistoryCriteria criteria) {
        super(criteria);
    }

    public AdminHistorySpecification(AdminHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
