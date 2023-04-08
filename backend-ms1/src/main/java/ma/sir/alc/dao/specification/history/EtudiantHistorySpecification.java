package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.alc.bean.history.EtudiantHistory;


public class EtudiantHistorySpecification extends AbstractHistorySpecification<EtudiantHistoryCriteria, EtudiantHistory> {

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
