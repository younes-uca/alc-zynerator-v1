package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.sir.alc.bean.history.ConfirmationTokenHistory;


public class ConfirmationTokenHistorySpecification extends AbstractHistorySpecification<ConfirmationTokenHistoryCriteria, ConfirmationTokenHistory> {

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria) {
        super(criteria);
    }

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
