package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.VocabularyQuiz;
import ma.sir.alc.bean.history.VocabularyQuizHistory;
import ma.sir.alc.dao.criteria.core.VocabularyQuizCriteria;
import ma.sir.alc.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.sir.alc.dao.facade.core.VocabularyQuizDao;
import ma.sir.alc.dao.facade.history.VocabularyQuizHistoryDao;
import ma.sir.alc.dao.specification.core.VocabularyQuizSpecification;
import ma.sir.alc.service.facade.admin.VocabularyQuizAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.Vocabulary;

import ma.sir.alc.service.facade.admin.VocabularyAdminService ;
import ma.sir.alc.service.facade.admin.SectionAdminService ;


import java.util.List;
@Service
public class VocabularyQuizAdminServiceImpl extends AbstractServiceImpl<VocabularyQuiz,VocabularyQuizHistory, VocabularyQuizCriteria, VocabularyQuizHistoryCriteria, VocabularyQuizDao,
VocabularyQuizHistoryDao> implements VocabularyQuizAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public VocabularyQuiz create(VocabularyQuiz t) {
        super.create(t);
        if (t.getVocabularys() != null) {
                t.getVocabularys().forEach(element-> {
                    element.setVocabularyQuiz(t);
                    vocabularyService.create(element);
            });
        }
        return t;
    }

    public VocabularyQuiz findWithAssociatedLists(Long id){
        VocabularyQuiz result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setVocabularys(vocabularyService.findByVocabularyQuizId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        vocabularyService.deleteByVocabularyQuizId(id);
    }


    public void updateWithAssociatedLists(VocabularyQuiz vocabularyQuiz){
    if(vocabularyQuiz !=null && vocabularyQuiz.getId() != null){
            List<List<Vocabulary>> resultVocabularys= vocabularyService.getToBeSavedAndToBeDeleted(vocabularyService.findByVocabularyQuizId(vocabularyQuiz.getId()),vocabularyQuiz.getVocabularys());
            vocabularyService.delete(resultVocabularys.get(1));
            ListUtil.emptyIfNull(resultVocabularys.get(0)).forEach(e -> e.setVocabularyQuiz(vocabularyQuiz));
            vocabularyService.update(resultVocabularys.get(0),true);
    }
    }


    public List<VocabularyQuiz> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }

    public void configure() {
        super.configure(VocabularyQuiz.class,VocabularyQuizHistory.class, VocabularyQuizHistoryCriteria.class, VocabularyQuizSpecification.class);
    }

    @Autowired
    private VocabularyAdminService vocabularyService ;
    @Autowired
    private SectionAdminService sectionService ;
    public VocabularyQuizAdminServiceImpl(VocabularyQuizDao dao, VocabularyQuizHistoryDao historyDao) {
        super(dao, historyDao);
    }

}