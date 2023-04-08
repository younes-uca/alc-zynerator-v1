package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.TypeReclamationEtudiantHistory;


public class TypeReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantHistory> {

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
