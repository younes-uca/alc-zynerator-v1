package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.InscriptionHistoryCriteria;
import ma.sir.alc.bean.history.InscriptionHistory;


public class InscriptionHistorySpecification extends AbstractHistorySpecification<InscriptionHistoryCriteria, InscriptionHistory> {

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public InscriptionHistorySpecification(InscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
