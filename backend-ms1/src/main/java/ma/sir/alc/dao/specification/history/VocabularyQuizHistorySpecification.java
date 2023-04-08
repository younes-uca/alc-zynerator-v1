package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.sir.alc.bean.history.VocabularyQuizHistory;


public class VocabularyQuizHistorySpecification extends AbstractHistorySpecification<VocabularyQuizHistoryCriteria, VocabularyQuizHistory> {

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
