package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.QuizClassRoomCriteria;
import ma.sir.alc.bean.core.QuizClassRoom;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class QuizClassRoomSpecification extends  AbstractSpecification<QuizClassRoomCriteria, QuizClassRoom>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("classRoom","id", criteria.getClassRoom()==null?null:criteria.getClassRoom().getId());
        addPredicateFk("quiz","id", criteria.getQuiz()==null?null:criteria.getQuiz().getId());
        addPredicateFk("quiz","ref", criteria.getQuiz()==null?null:criteria.getQuiz().getRef());
    }

    public QuizClassRoomSpecification(QuizClassRoomCriteria criteria) {
        super(criteria);
    }

    public QuizClassRoomSpecification(QuizClassRoomCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
