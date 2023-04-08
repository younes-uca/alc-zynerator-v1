package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.FonctionHistoryCriteria;
import ma.sir.alc.bean.history.FonctionHistory;


public class FonctionHistorySpecification extends AbstractHistorySpecification<FonctionHistoryCriteria, FonctionHistory> {

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria) {
        super(criteria);
    }

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
