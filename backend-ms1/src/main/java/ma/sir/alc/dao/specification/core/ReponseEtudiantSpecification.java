package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantCriteria;
import ma.sir.alc.bean.core.ReponseEtudiant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ReponseEtudiantSpecification extends  AbstractSpecification<ReponseEtudiantCriteria, ReponseEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("answer", criteria.getAnswer(),criteria.getAnswerLike());
        addPredicateBigDecimal("note", criteria.getNote(), criteria.getNoteMin(), criteria.getNoteMax());
        addPredicateFk("reponse","id", criteria.getReponse()==null?null:criteria.getReponse().getId());
        addPredicateFk("reponse","ref", criteria.getReponse()==null?null:criteria.getReponse().getRef());
        addPredicateFk("quizEtudiant","id", criteria.getQuizEtudiant()==null?null:criteria.getQuizEtudiant().getId());
        addPredicateFk("quizEtudiant","ref", criteria.getQuizEtudiant()==null?null:criteria.getQuizEtudiant().getRef());
        addPredicateFk("question","id", criteria.getQuestion()==null?null:criteria.getQuestion().getId());
        addPredicateFk("question","libelle", criteria.getQuestion()==null?null:criteria.getQuestion().getLibelle());
    }

    public ReponseEtudiantSpecification(ReponseEtudiantCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantSpecification(ReponseEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
