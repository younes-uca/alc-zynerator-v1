package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ReponseHistoryCriteria;
import ma.sir.alc.bean.history.ReponseHistory;


public class ReponseHistorySpecification extends AbstractHistorySpecification<ReponseHistoryCriteria, ReponseHistory> {

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseHistorySpecification(ReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
