package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.CategorieProfHistoryCriteria;
import ma.sir.alc.bean.history.CategorieProfHistory;


public class CategorieProfHistorySpecification extends AbstractHistorySpecification<CategorieProfHistoryCriteria, CategorieProfHistory> {

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
