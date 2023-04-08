package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Cours;
import ma.sir.alc.bean.history.CoursHistory;
import ma.sir.alc.dao.criteria.core.CoursCriteria;
import ma.sir.alc.dao.criteria.history.CoursHistoryCriteria;
import ma.sir.alc.dao.facade.core.CoursDao;
import ma.sir.alc.dao.facade.history.CoursHistoryDao;
import ma.sir.alc.dao.specification.core.CoursSpecification;
import ma.sir.alc.service.facade.admin.CoursAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.Section;
import ma.sir.alc.bean.core.HomeWork;

import ma.sir.alc.service.facade.admin.ParcoursAdminService ;
import ma.sir.alc.service.facade.admin.HomeWorkAdminService ;
import ma.sir.alc.service.facade.admin.EtatCoursAdminService ;
import ma.sir.alc.service.facade.admin.SectionAdminService ;


import java.util.List;
@Service
public class CoursAdminServiceImpl extends AbstractServiceImpl<Cours,CoursHistory, CoursCriteria, CoursHistoryCriteria, CoursDao,
CoursHistoryDao> implements CoursAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Cours create(Cours t) {
        super.create(t);
        if (t.getSections() != null) {
                t.getSections().forEach(element-> {
                    element.setCours(t);
                    sectionService.create(element);
            });
        }
        if (t.getHomeWorks() != null) {
                t.getHomeWorks().forEach(element-> {
                    element.setCours(t);
                    homeWorkService.create(element);
            });
        }
        return t;
    }

    public Cours findWithAssociatedLists(Long id){
        Cours result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSections(sectionService.findByCoursId(id));
            result.setHomeWorks(homeWorkService.findByCoursId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sectionService.deleteByCoursId(id);
        homeWorkService.deleteByCoursId(id);
    }


    public void updateWithAssociatedLists(Cours cours){
    if(cours !=null && cours.getId() != null){
            List<List<Section>> resultSections= sectionService.getToBeSavedAndToBeDeleted(sectionService.findByCoursId(cours.getId()),cours.getSections());
            sectionService.delete(resultSections.get(1));
            ListUtil.emptyIfNull(resultSections.get(0)).forEach(e -> e.setCours(cours));
            sectionService.update(resultSections.get(0),true);
            List<List<HomeWork>> resultHomeWorks= homeWorkService.getToBeSavedAndToBeDeleted(homeWorkService.findByCoursId(cours.getId()),cours.getHomeWorks());
            homeWorkService.delete(resultHomeWorks.get(1));
            ListUtil.emptyIfNull(resultHomeWorks.get(0)).forEach(e -> e.setCours(cours));
            homeWorkService.update(resultHomeWorks.get(0),true);
    }
    }

    public Cours findByReferenceEntity(Cours t){
        return  dao.findByCode(t.getCode());
    }

    public List<Cours> findByEtatCoursId(Long id){
        return dao.findByEtatCoursId(id);
    }
    public int deleteByEtatCoursId(Long id){
        return dao.deleteByEtatCoursId(id);
    }
    public List<Cours> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }

    public void configure() {
        super.configure(Cours.class,CoursHistory.class, CoursHistoryCriteria.class, CoursSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private HomeWorkAdminService homeWorkService ;
    @Autowired
    private EtatCoursAdminService etatCoursService ;
    @Autowired
    private SectionAdminService sectionService ;
    public CoursAdminServiceImpl(CoursDao dao, CoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}