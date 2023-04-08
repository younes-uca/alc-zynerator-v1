package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.sir.alc.bean.history.HoweWorkQSTReponseHistory;


public class HoweWorkQSTReponseHistorySpecification extends AbstractHistorySpecification<HoweWorkQSTReponseHistoryCriteria, HoweWorkQSTReponseHistory> {

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
