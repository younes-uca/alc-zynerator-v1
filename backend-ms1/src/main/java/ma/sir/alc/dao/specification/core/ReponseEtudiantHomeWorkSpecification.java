package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.sir.alc.bean.core.ReponseEtudiantHomeWork;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ReponseEtudiantHomeWorkSpecification extends  AbstractSpecification<ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWork>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("answer", criteria.getAnswer(),criteria.getAnswerLike());
        addPredicate("profNote", criteria.getProfNote(),criteria.getProfNoteLike());
        addPredicateBigDecimal("note", criteria.getNote(), criteria.getNoteMin(), criteria.getNoteMax());
        addPredicateFk("howeWorkQSTReponse","id", criteria.getHoweWorkQSTReponse()==null?null:criteria.getHoweWorkQSTReponse().getId());
        addPredicateFk("howeWorkQSTReponse","ref", criteria.getHoweWorkQSTReponse()==null?null:criteria.getHoweWorkQSTReponse().getRef());
        addPredicateFk("homeWorkEtudiant","id", criteria.getHomeWorkEtudiant()==null?null:criteria.getHomeWorkEtudiant().getId());
        addPredicateFk("homeWorkQuestion","id", criteria.getHomeWorkQuestion()==null?null:criteria.getHomeWorkQuestion().getId());
        addPredicateFk("homeWorkQuestion","ref", criteria.getHomeWorkQuestion()==null?null:criteria.getHomeWorkQuestion().getRef());
    }

    public ReponseEtudiantHomeWorkSpecification(ReponseEtudiantHomeWorkCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHomeWorkSpecification(ReponseEtudiantHomeWorkCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
