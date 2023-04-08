package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.HomeWorkEtudiant;
import ma.sir.alc.bean.history.HomeWorkEtudiantHistory;
import ma.sir.alc.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.HomeWorkEtudiantDao;
import ma.sir.alc.dao.facade.history.HomeWorkEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.HomeWorkEtudiantSpecification;
import ma.sir.alc.service.facade.admin.HomeWorkEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.ReponseEtudiantHomeWork;

import ma.sir.alc.service.facade.admin.EtudiantAdminService ;
import ma.sir.alc.service.facade.admin.ResultatHomeWorkAdminService ;
import ma.sir.alc.service.facade.admin.HomeWorkAdminService ;
import ma.sir.alc.service.facade.admin.ReponseEtudiantHomeWorkAdminService ;


import java.util.List;
@Service
public class HomeWorkEtudiantAdminServiceImpl extends AbstractServiceImpl<HomeWorkEtudiant,HomeWorkEtudiantHistory, HomeWorkEtudiantCriteria, HomeWorkEtudiantHistoryCriteria, HomeWorkEtudiantDao,
HomeWorkEtudiantHistoryDao> implements HomeWorkEtudiantAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public HomeWorkEtudiant create(HomeWorkEtudiant t) {
        super.create(t);
        if (t.getReponseEtudiantHomeWorks() != null) {
                t.getReponseEtudiantHomeWorks().forEach(element-> {
                    element.setHomeWorkEtudiant(t);
                    reponseEtudiantHomeWorkService.create(element);
            });
        }
        return t;
    }

    public HomeWorkEtudiant findWithAssociatedLists(Long id){
        HomeWorkEtudiant result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setReponseEtudiantHomeWorks(reponseEtudiantHomeWorkService.findByHomeWorkEtudiantId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        reponseEtudiantHomeWorkService.deleteByHomeWorkEtudiantId(id);
    }


    public void updateWithAssociatedLists(HomeWorkEtudiant homeWorkEtudiant){
    if(homeWorkEtudiant !=null && homeWorkEtudiant.getId() != null){
            List<List<ReponseEtudiantHomeWork>> resultReponseEtudiantHomeWorks= reponseEtudiantHomeWorkService.getToBeSavedAndToBeDeleted(reponseEtudiantHomeWorkService.findByHomeWorkEtudiantId(homeWorkEtudiant.getId()),homeWorkEtudiant.getReponseEtudiantHomeWorks());
            reponseEtudiantHomeWorkService.delete(resultReponseEtudiantHomeWorks.get(1));
            ListUtil.emptyIfNull(resultReponseEtudiantHomeWorks.get(0)).forEach(e -> e.setHomeWorkEtudiant(homeWorkEtudiant));
            reponseEtudiantHomeWorkService.update(resultReponseEtudiantHomeWorks.get(0),true);
    }
    }


    public List<HomeWorkEtudiant> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<HomeWorkEtudiant> findByHomeWorkId(Long id){
        return dao.findByHomeWorkId(id);
    }
    public int deleteByHomeWorkId(Long id){
        return dao.deleteByHomeWorkId(id);
    }
    public List<HomeWorkEtudiant> findByResultatHomeWorkId(Long id){
        return dao.findByResultatHomeWorkId(id);
    }
    public int deleteByResultatHomeWorkId(Long id){
        return dao.deleteByResultatHomeWorkId(id);
    }

    public void configure() {
        super.configure(HomeWorkEtudiant.class,HomeWorkEtudiantHistory.class, HomeWorkEtudiantHistoryCriteria.class, HomeWorkEtudiantSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ResultatHomeWorkAdminService resultatHomeWorkService ;
    @Autowired
    private HomeWorkAdminService homeWorkService ;
    @Autowired
    private ReponseEtudiantHomeWorkAdminService reponseEtudiantHomeWorkService ;
    public HomeWorkEtudiantAdminServiceImpl(HomeWorkEtudiantDao dao, HomeWorkEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}