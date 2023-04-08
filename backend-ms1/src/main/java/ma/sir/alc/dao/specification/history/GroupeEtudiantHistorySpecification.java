package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.GroupeEtudiantHistory;


public class GroupeEtudiantHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantHistoryCriteria, GroupeEtudiantHistory> {

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
