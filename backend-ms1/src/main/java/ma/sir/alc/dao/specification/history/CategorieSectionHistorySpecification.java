package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.sir.alc.bean.history.CategorieSectionHistory;


public class CategorieSectionHistorySpecification extends AbstractHistorySpecification<CategorieSectionHistoryCriteria, CategorieSectionHistory> {

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
