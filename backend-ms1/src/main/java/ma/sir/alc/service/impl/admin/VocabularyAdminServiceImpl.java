package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Vocabulary;
import ma.sir.alc.bean.history.VocabularyHistory;
import ma.sir.alc.dao.criteria.core.VocabularyCriteria;
import ma.sir.alc.dao.criteria.history.VocabularyHistoryCriteria;
import ma.sir.alc.dao.facade.core.VocabularyDao;
import ma.sir.alc.dao.facade.history.VocabularyHistoryDao;
import ma.sir.alc.dao.specification.core.VocabularySpecification;
import ma.sir.alc.service.facade.admin.VocabularyAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.VocabularyQuizAdminService ;
import ma.sir.alc.service.facade.admin.SectionAdminService ;


import java.util.List;
@Service
public class VocabularyAdminServiceImpl extends AbstractServiceImpl<Vocabulary,VocabularyHistory, VocabularyCriteria, VocabularyHistoryCriteria, VocabularyDao,
VocabularyHistoryDao> implements VocabularyAdminService {



    public List<Vocabulary> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }
    public List<Vocabulary> findByVocabularyQuizId(Long id){
        return dao.findByVocabularyQuizId(id);
    }
    public int deleteByVocabularyQuizId(Long id){
        return dao.deleteByVocabularyQuizId(id);
    }

    public void configure() {
        super.configure(Vocabulary.class,VocabularyHistory.class, VocabularyHistoryCriteria.class, VocabularySpecification.class);
    }

    @Autowired
    private VocabularyQuizAdminService vocabularyQuizService ;
    @Autowired
    private SectionAdminService sectionService ;
    public VocabularyAdminServiceImpl(VocabularyDao dao, VocabularyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}