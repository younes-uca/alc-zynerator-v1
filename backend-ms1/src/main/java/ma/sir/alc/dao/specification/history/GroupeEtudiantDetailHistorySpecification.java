package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.sir.alc.bean.history.GroupeEtudiantDetailHistory;


public class GroupeEtudiantDetailHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailHistory> {

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
