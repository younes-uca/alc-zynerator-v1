package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.sir.alc.bean.history.EtatReponseHistory;


public class EtatReponseHistorySpecification extends AbstractHistorySpecification<EtatReponseHistoryCriteria, EtatReponseHistory> {

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
