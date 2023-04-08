package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Quiz;
import ma.sir.alc.bean.history.QuizHistory;
import ma.sir.alc.dao.criteria.core.QuizCriteria;
import ma.sir.alc.dao.criteria.history.QuizHistoryCriteria;
import ma.sir.alc.dao.facade.core.QuizDao;
import ma.sir.alc.dao.facade.history.QuizHistoryDao;
import ma.sir.alc.dao.specification.core.QuizSpecification;
import ma.sir.alc.service.facade.admin.QuizAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.Question;
import ma.sir.alc.bean.core.QuizEtudiant;

import ma.sir.alc.service.facade.admin.QuestionAdminService ;
import ma.sir.alc.service.facade.admin.QuizEtudiantAdminService ;
import ma.sir.alc.service.facade.admin.SectionAdminService ;


import java.util.List;
@Service
public class QuizAdminServiceImpl extends AbstractServiceImpl<Quiz,QuizHistory, QuizCriteria, QuizHistoryCriteria, QuizDao,
QuizHistoryDao> implements QuizAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Quiz create(Quiz t) {
        super.create(t);
        if (t.getQuestions() != null) {
                t.getQuestions().forEach(element-> {
                    element.setQuiz(t);
                    questionService.create(element);
            });
        }
        if (t.getQuizEtudiants() != null) {
                t.getQuizEtudiants().forEach(element-> {
                    element.setQuiz(t);
                    quizEtudiantService.create(element);
            });
        }
        return t;
    }

    public Quiz findWithAssociatedLists(Long id){
        Quiz result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setQuestions(questionService.findByQuizId(id));
            result.setQuizEtudiants(quizEtudiantService.findByQuizId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        questionService.deleteByQuizId(id);
        quizEtudiantService.deleteByQuizId(id);
    }


    public void updateWithAssociatedLists(Quiz quiz){
    if(quiz !=null && quiz.getId() != null){
            List<List<Question>> resultQuestions= questionService.getToBeSavedAndToBeDeleted(questionService.findByQuizId(quiz.getId()),quiz.getQuestions());
            questionService.delete(resultQuestions.get(1));
            ListUtil.emptyIfNull(resultQuestions.get(0)).forEach(e -> e.setQuiz(quiz));
            questionService.update(resultQuestions.get(0),true);
            List<List<QuizEtudiant>> resultQuizEtudiants= quizEtudiantService.getToBeSavedAndToBeDeleted(quizEtudiantService.findByQuizId(quiz.getId()),quiz.getQuizEtudiants());
            quizEtudiantService.delete(resultQuizEtudiants.get(1));
            ListUtil.emptyIfNull(resultQuizEtudiants.get(0)).forEach(e -> e.setQuiz(quiz));
            quizEtudiantService.update(resultQuizEtudiants.get(0),true);
    }
    }

    public Quiz findByReferenceEntity(Quiz t){
        return  dao.findByRef(t.getRef());
    }

    public List<Quiz> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }

    public void configure() {
        super.configure(Quiz.class,QuizHistory.class, QuizHistoryCriteria.class, QuizSpecification.class);
    }

    @Autowired
    private QuestionAdminService questionService ;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService ;
    @Autowired
    private SectionAdminService sectionService ;
    public QuizAdminServiceImpl(QuizDao dao, QuizHistoryDao historyDao) {
        super(dao, historyDao);
    }

}