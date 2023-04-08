package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.DictionaryCriteria;
import ma.sir.alc.bean.core.Dictionary;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DictionarySpecification extends  AbstractSpecification<DictionaryCriteria, Dictionary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("word", criteria.getWord(),criteria.getWordLike());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public DictionarySpecification(DictionaryCriteria criteria) {
        super(criteria);
    }

    public DictionarySpecification(DictionaryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
