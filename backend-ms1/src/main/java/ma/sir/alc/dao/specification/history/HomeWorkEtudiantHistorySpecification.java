package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.HomeWorkEtudiantHistory;


public class HomeWorkEtudiantHistorySpecification extends AbstractHistorySpecification<HomeWorkEtudiantHistoryCriteria, HomeWorkEtudiantHistory> {

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
