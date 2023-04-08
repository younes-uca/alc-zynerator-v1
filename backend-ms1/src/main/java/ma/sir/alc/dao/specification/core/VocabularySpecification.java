package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.VocabularyCriteria;
import ma.sir.alc.bean.core.Vocabulary;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class VocabularySpecification extends  AbstractSpecification<VocabularyCriteria, Vocabulary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateLong("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicate("word", criteria.getWord(),criteria.getWordLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("result", criteria.getResult(),criteria.getResultLike());
        addPredicate("explication", criteria.getExplication(),criteria.getExplicationLike());
        addPredicate("exemple", criteria.getExemple(),criteria.getExempleLike());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicateFk("section","id", criteria.getSection()==null?null:criteria.getSection().getId());
        addPredicateFk("section","code", criteria.getSection()==null?null:criteria.getSection().getCode());
        addPredicateFk("vocabularyQuiz","id", criteria.getVocabularyQuiz()==null?null:criteria.getVocabularyQuiz().getId());
    }

    public VocabularySpecification(VocabularyCriteria criteria) {
        super(criteria);
    }

    public VocabularySpecification(VocabularyCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
