package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.ReponseEtudiant;
import ma.sir.alc.bean.history.ReponseEtudiantHistory;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.ReponseEtudiantDao;
import ma.sir.alc.dao.facade.history.ReponseEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.ReponseEtudiantSpecification;
import ma.sir.alc.service.facade.admin.ReponseEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.QuestionAdminService ;
import ma.sir.alc.service.facade.admin.ReponseAdminService ;
import ma.sir.alc.service.facade.admin.QuizEtudiantAdminService ;


import java.util.List;
@Service
public class ReponseEtudiantAdminServiceImpl extends AbstractServiceImpl<ReponseEtudiant,ReponseEtudiantHistory, ReponseEtudiantCriteria, ReponseEtudiantHistoryCriteria, ReponseEtudiantDao,
ReponseEtudiantHistoryDao> implements ReponseEtudiantAdminService {


    public ReponseEtudiant findByReferenceEntity(ReponseEtudiant t){
        return  dao.findByRef(t.getRef());
    }

    public List<ReponseEtudiant> findByReponseId(Long id){
        return dao.findByReponseId(id);
    }
    public int deleteByReponseId(Long id){
        return dao.deleteByReponseId(id);
    }
    public List<ReponseEtudiant> findByQuizEtudiantId(Long id){
        return dao.findByQuizEtudiantId(id);
    }
    public int deleteByQuizEtudiantId(Long id){
        return dao.deleteByQuizEtudiantId(id);
    }
    public List<ReponseEtudiant> findByQuestionId(Long id){
        return dao.findByQuestionId(id);
    }
    public int deleteByQuestionId(Long id){
        return dao.deleteByQuestionId(id);
    }

    public void configure() {
        super.configure(ReponseEtudiant.class,ReponseEtudiantHistory.class, ReponseEtudiantHistoryCriteria.class, ReponseEtudiantSpecification.class);
    }

    @Autowired
    private QuestionAdminService questionService ;
    @Autowired
    private ReponseAdminService reponseService ;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService ;
    public ReponseEtudiantAdminServiceImpl(ReponseEtudiantDao dao, ReponseEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}