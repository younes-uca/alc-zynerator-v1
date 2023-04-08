package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.CentreHistoryCriteria;
import ma.sir.alc.bean.history.CentreHistory;


public class CentreHistorySpecification extends AbstractHistorySpecification<CentreHistoryCriteria, CentreHistory> {

    public CentreHistorySpecification(CentreHistoryCriteria criteria) {
        super(criteria);
    }

    public CentreHistorySpecification(CentreHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
