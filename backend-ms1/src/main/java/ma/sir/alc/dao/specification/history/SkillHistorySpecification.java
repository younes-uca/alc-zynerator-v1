package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.SkillHistoryCriteria;
import ma.sir.alc.bean.history.SkillHistory;


public class SkillHistorySpecification extends AbstractHistorySpecification<SkillHistoryCriteria, SkillHistory> {

    public SkillHistorySpecification(SkillHistoryCriteria criteria) {
        super(criteria);
    }

    public SkillHistorySpecification(SkillHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
