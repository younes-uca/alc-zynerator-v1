package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.sir.alc.bean.history.EtudiantClassRoomHistory;


public class EtudiantClassRoomHistorySpecification extends AbstractHistorySpecification<EtudiantClassRoomHistoryCriteria, EtudiantClassRoomHistory> {

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantClassRoomHistorySpecification(EtudiantClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
