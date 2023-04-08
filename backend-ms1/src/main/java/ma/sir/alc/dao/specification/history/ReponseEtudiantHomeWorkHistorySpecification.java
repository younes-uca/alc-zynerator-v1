package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.sir.alc.bean.history.ReponseEtudiantHomeWorkHistory;


public class ReponseEtudiantHomeWorkHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkHistory> {

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
