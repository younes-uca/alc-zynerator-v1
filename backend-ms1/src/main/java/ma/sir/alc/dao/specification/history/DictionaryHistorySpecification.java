package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.alc.bean.history.DictionaryHistory;


public class DictionaryHistorySpecification extends AbstractHistorySpecification<DictionaryHistoryCriteria, DictionaryHistory> {

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria) {
        super(criteria);
    }

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
