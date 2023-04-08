package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.sir.alc.bean.history.QuizEtudiantHistory;


public class QuizEtudiantHistorySpecification extends AbstractHistorySpecification<QuizEtudiantHistoryCriteria, QuizEtudiantHistory> {

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
