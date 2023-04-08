package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.QuestionCriteria;
import ma.sir.alc.bean.core.Question;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class QuestionSpecification extends  AbstractSpecification<QuestionCriteria, Question>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("urlImg", criteria.getUrlImg(),criteria.getUrlImgLike());
        addPredicate("urlVideo", criteria.getUrlVideo(),criteria.getUrlVideoLike());
        addPredicateLong("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicateBigDecimal("pointReponseJuste", criteria.getPointReponseJuste(), criteria.getPointReponseJusteMin(), criteria.getPointReponseJusteMax());
        addPredicateBigDecimal("pointReponsefausse", criteria.getPointReponsefausse(), criteria.getPointReponsefausseMin(), criteria.getPointReponsefausseMax());
        addPredicateFk("typeDeQuestion","id", criteria.getTypeDeQuestion()==null?null:criteria.getTypeDeQuestion().getId());
        addPredicateFk("typeDeQuestion","ref", criteria.getTypeDeQuestion()==null?null:criteria.getTypeDeQuestion().getRef());
        addPredicateFk("quiz","id", criteria.getQuiz()==null?null:criteria.getQuiz().getId());
        addPredicateFk("quiz","ref", criteria.getQuiz()==null?null:criteria.getQuiz().getRef());
        addPredicateFk("homeWork","id", criteria.getHomeWork()==null?null:criteria.getHomeWork().getId());
    }

    public QuestionSpecification(QuestionCriteria criteria) {
        super(criteria);
    }

    public QuestionSpecification(QuestionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
