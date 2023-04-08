package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.sir.alc.bean.history.LevelTestConfigurationHistory;


public class LevelTestConfigurationHistorySpecification extends AbstractHistorySpecification<LevelTestConfigurationHistoryCriteria, LevelTestConfigurationHistory> {

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
