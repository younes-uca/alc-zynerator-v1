package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.sir.alc.bean.history.NiveauEtudeHistory;


public class NiveauEtudeHistorySpecification extends AbstractHistorySpecification<NiveauEtudeHistoryCriteria, NiveauEtudeHistory> {

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
