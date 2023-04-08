package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.sir.alc.bean.history.GroupeEtudeHistory;


public class GroupeEtudeHistorySpecification extends AbstractHistorySpecification<GroupeEtudeHistoryCriteria, GroupeEtudeHistory> {

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
