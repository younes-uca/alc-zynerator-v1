package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.sir.alc.bean.history.TypeReclamationProfHistory;


public class TypeReclamationProfHistorySpecification extends AbstractHistorySpecification<TypeReclamationProfHistoryCriteria, TypeReclamationProfHistory> {

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
