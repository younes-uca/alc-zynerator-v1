package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.HomeWork;
import ma.sir.alc.bean.history.HomeWorkHistory;
import ma.sir.alc.dao.criteria.core.HomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.sir.alc.dao.facade.core.HomeWorkDao;
import ma.sir.alc.dao.facade.history.HomeWorkHistoryDao;
import ma.sir.alc.dao.specification.core.HomeWorkSpecification;
import ma.sir.alc.service.facade.admin.HomeWorkAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.HomeWorkQuestion;
import ma.sir.alc.bean.core.HomeWorkEtudiant;

import ma.sir.alc.service.facade.admin.HomeWorkQuestionAdminService ;
import ma.sir.alc.service.facade.admin.HomeWorkEtudiantAdminService ;
import ma.sir.alc.service.facade.admin.TypeHomeWorkAdminService ;
import ma.sir.alc.service.facade.admin.CoursAdminService ;


import java.util.List;
@Service
public class HomeWorkAdminServiceImpl extends AbstractServiceImpl<HomeWork,HomeWorkHistory, HomeWorkCriteria, HomeWorkHistoryCriteria, HomeWorkDao,
HomeWorkHistoryDao> implements HomeWorkAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public HomeWork create(HomeWork t) {
        super.create(t);
        if (t.getHomeWorkQuestions() != null) {
                t.getHomeWorkQuestions().forEach(element-> {
                    element.setHomeWork(t);
                    homeWorkQuestionService.create(element);
            });
        }
        if (t.getHomeWorkEtudiants() != null) {
                t.getHomeWorkEtudiants().forEach(element-> {
                    element.setHomeWork(t);
                    homeWorkEtudiantService.create(element);
            });
        }
        return t;
    }

    public HomeWork findWithAssociatedLists(Long id){
        HomeWork result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setHomeWorkQuestions(homeWorkQuestionService.findByHomeWorkId(id));
            result.setHomeWorkEtudiants(homeWorkEtudiantService.findByHomeWorkId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        homeWorkQuestionService.deleteByHomeWorkId(id);
        homeWorkEtudiantService.deleteByHomeWorkId(id);
    }


    public void updateWithAssociatedLists(HomeWork homeWork){
    if(homeWork !=null && homeWork.getId() != null){
            List<List<HomeWorkQuestion>> resultHomeWorkQuestions= homeWorkQuestionService.getToBeSavedAndToBeDeleted(homeWorkQuestionService.findByHomeWorkId(homeWork.getId()),homeWork.getHomeWorkQuestions());
            homeWorkQuestionService.delete(resultHomeWorkQuestions.get(1));
            ListUtil.emptyIfNull(resultHomeWorkQuestions.get(0)).forEach(e -> e.setHomeWork(homeWork));
            homeWorkQuestionService.update(resultHomeWorkQuestions.get(0),true);
            List<List<HomeWorkEtudiant>> resultHomeWorkEtudiants= homeWorkEtudiantService.getToBeSavedAndToBeDeleted(homeWorkEtudiantService.findByHomeWorkId(homeWork.getId()),homeWork.getHomeWorkEtudiants());
            homeWorkEtudiantService.delete(resultHomeWorkEtudiants.get(1));
            ListUtil.emptyIfNull(resultHomeWorkEtudiants.get(0)).forEach(e -> e.setHomeWork(homeWork));
            homeWorkEtudiantService.update(resultHomeWorkEtudiants.get(0),true);
    }
    }


    public List<HomeWork> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }
    public List<HomeWork> findByTypeHomeWorkId(Long id){
        return dao.findByTypeHomeWorkId(id);
    }
    public int deleteByTypeHomeWorkId(Long id){
        return dao.deleteByTypeHomeWorkId(id);
    }

    public void configure() {
        super.configure(HomeWork.class,HomeWorkHistory.class, HomeWorkHistoryCriteria.class, HomeWorkSpecification.class);
    }

    @Autowired
    private HomeWorkQuestionAdminService homeWorkQuestionService ;
    @Autowired
    private HomeWorkEtudiantAdminService homeWorkEtudiantService ;
    @Autowired
    private TypeHomeWorkAdminService typeHomeWorkService ;
    @Autowired
    private CoursAdminService coursService ;
    public HomeWorkAdminServiceImpl(HomeWorkDao dao, HomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}