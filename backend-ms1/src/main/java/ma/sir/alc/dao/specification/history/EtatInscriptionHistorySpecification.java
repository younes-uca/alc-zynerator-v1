package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.sir.alc.bean.history.EtatInscriptionHistory;


public class EtatInscriptionHistorySpecification extends AbstractHistorySpecification<EtatInscriptionHistoryCriteria, EtatInscriptionHistory> {

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
