package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.sir.alc.bean.core.HoweWorkQSTReponse;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class HoweWorkQSTReponseSpecification extends  AbstractSpecification<HoweWorkQSTReponseCriteria, HoweWorkQSTReponse>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
        addPredicateInt("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicateFk("etatReponse","id", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getId());
        addPredicateFk("etatReponse","code", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getCode());
        addPredicateFk("homeWorkQuestion","id", criteria.getHomeWorkQuestion()==null?null:criteria.getHomeWorkQuestion().getId());
        addPredicateFk("homeWorkQuestion","ref", criteria.getHomeWorkQuestion()==null?null:criteria.getHomeWorkQuestion().getRef());
    }

    public HoweWorkQSTReponseSpecification(HoweWorkQSTReponseCriteria criteria) {
        super(criteria);
    }

    public HoweWorkQSTReponseSpecification(HoweWorkQSTReponseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
