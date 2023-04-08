package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.sir.alc.bean.history.SuperCategorieSectionHistory;


public class SuperCategorieSectionHistorySpecification extends AbstractHistorySpecification<SuperCategorieSectionHistoryCriteria, SuperCategorieSectionHistory> {

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
