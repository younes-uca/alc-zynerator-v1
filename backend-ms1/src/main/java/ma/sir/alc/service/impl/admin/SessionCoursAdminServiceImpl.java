package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.SessionCours;
import ma.sir.alc.bean.history.SessionCoursHistory;
import ma.sir.alc.dao.criteria.core.SessionCoursCriteria;
import ma.sir.alc.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.sir.alc.dao.facade.core.SessionCoursDao;
import ma.sir.alc.dao.facade.history.SessionCoursHistoryDao;
import ma.sir.alc.dao.specification.core.SessionCoursSpecification;
import ma.sir.alc.service.facade.admin.SessionCoursAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.Section;

import ma.sir.alc.service.facade.admin.GroupeEtudiantAdminService ;
import ma.sir.alc.service.facade.admin.ProfAdminService ;
import ma.sir.alc.service.facade.admin.CoursAdminService ;
import ma.sir.alc.service.facade.admin.SectionAdminService ;
import ma.sir.alc.service.facade.admin.SalaryAdminService ;


import java.util.List;
@Service
public class SessionCoursAdminServiceImpl extends AbstractServiceImpl<SessionCours,SessionCoursHistory, SessionCoursCriteria, SessionCoursHistoryCriteria, SessionCoursDao,
SessionCoursHistoryDao> implements SessionCoursAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public SessionCours create(SessionCours t) {
        super.create(t);
        if (t.getSections() != null) {
                t.getSections().forEach(element-> {
                    element.setSessionCours(t);
                    sectionService.create(element);
            });
        }
        return t;
    }

    public SessionCours findWithAssociatedLists(Long id){
        SessionCours result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSections(sectionService.findBySessionCoursId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sectionService.deleteBySessionCoursId(id);
    }


    public void updateWithAssociatedLists(SessionCours sessionCours){
    if(sessionCours !=null && sessionCours.getId() != null){
            List<List<Section>> resultSections= sectionService.getToBeSavedAndToBeDeleted(sectionService.findBySessionCoursId(sessionCours.getId()),sessionCours.getSections());
            sectionService.delete(resultSections.get(1));
            ListUtil.emptyIfNull(resultSections.get(0)).forEach(e -> e.setSessionCours(sessionCours));
            sectionService.update(resultSections.get(0),true);
    }
    }

    public SessionCours findByReferenceEntity(SessionCours t){
        return  dao.findByReference(t.getReference());
    }

    public List<SessionCours> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<SessionCours> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }
    public List<SessionCours> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }
    public List<SessionCours> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }

    public void configure() {
        super.configure(SessionCours.class,SessionCoursHistory.class, SessionCoursHistoryCriteria.class, SessionCoursSpecification.class);
    }

    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private SectionAdminService sectionService ;
    @Autowired
    private SalaryAdminService salaryService ;
    public SessionCoursAdminServiceImpl(SessionCoursDao dao, SessionCoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}