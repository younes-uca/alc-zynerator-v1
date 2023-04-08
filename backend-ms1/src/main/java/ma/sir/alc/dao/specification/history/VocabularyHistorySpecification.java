package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.VocabularyHistoryCriteria;
import ma.sir.alc.bean.history.VocabularyHistory;


public class VocabularyHistorySpecification extends AbstractHistorySpecification<VocabularyHistoryCriteria, VocabularyHistory> {

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
