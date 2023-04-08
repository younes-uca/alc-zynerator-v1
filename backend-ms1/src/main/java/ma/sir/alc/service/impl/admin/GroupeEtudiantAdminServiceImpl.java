package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.GroupeEtudiant;
import ma.sir.alc.bean.history.GroupeEtudiantHistory;
import ma.sir.alc.dao.criteria.core.GroupeEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.GroupeEtudiantDao;
import ma.sir.alc.dao.facade.history.GroupeEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.GroupeEtudiantSpecification;
import ma.sir.alc.service.facade.admin.GroupeEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.GroupeEtudiantDetail;

import ma.sir.alc.service.facade.admin.ProfAdminService ;
import ma.sir.alc.service.facade.admin.ParcoursAdminService ;
import ma.sir.alc.service.facade.admin.GroupeEtudeAdminService ;
import ma.sir.alc.service.facade.admin.GroupeEtudiantDetailAdminService ;


import java.util.List;
@Service
public class GroupeEtudiantAdminServiceImpl extends AbstractServiceImpl<GroupeEtudiant,GroupeEtudiantHistory, GroupeEtudiantCriteria, GroupeEtudiantHistoryCriteria, GroupeEtudiantDao,
GroupeEtudiantHistoryDao> implements GroupeEtudiantAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public GroupeEtudiant create(GroupeEtudiant t) {
        super.create(t);
        if (t.getGroupeEtudiantDetails() != null) {
                t.getGroupeEtudiantDetails().forEach(element-> {
                    element.setGroupeEtudiant(t);
                    groupeEtudiantDetailService.create(element);
            });
        }
        return t;
    }

    public GroupeEtudiant findWithAssociatedLists(Long id){
        GroupeEtudiant result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setGroupeEtudiantDetails(groupeEtudiantDetailService.findByGroupeEtudiantId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        groupeEtudiantDetailService.deleteByGroupeEtudiantId(id);
    }


    public void updateWithAssociatedLists(GroupeEtudiant groupeEtudiant){
    if(groupeEtudiant !=null && groupeEtudiant.getId() != null){
            List<List<GroupeEtudiantDetail>> resultGroupeEtudiantDetails= groupeEtudiantDetailService.getToBeSavedAndToBeDeleted(groupeEtudiantDetailService.findByGroupeEtudiantId(groupeEtudiant.getId()),groupeEtudiant.getGroupeEtudiantDetails());
            groupeEtudiantDetailService.delete(resultGroupeEtudiantDetails.get(1));
            ListUtil.emptyIfNull(resultGroupeEtudiantDetails.get(0)).forEach(e -> e.setGroupeEtudiant(groupeEtudiant));
            groupeEtudiantDetailService.update(resultGroupeEtudiantDetails.get(0),true);
    }
    }


    public List<GroupeEtudiant> findByGroupeEtudeId(Long id){
        return dao.findByGroupeEtudeId(id);
    }
    public int deleteByGroupeEtudeId(Long id){
        return dao.deleteByGroupeEtudeId(id);
    }
    public List<GroupeEtudiant> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<GroupeEtudiant> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(GroupeEtudiant.class,GroupeEtudiantHistory.class, GroupeEtudiantHistoryCriteria.class, GroupeEtudiantSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private GroupeEtudeAdminService groupeEtudeService ;
    @Autowired
    private GroupeEtudiantDetailAdminService groupeEtudiantDetailService ;
    public GroupeEtudiantAdminServiceImpl(GroupeEtudiantDao dao, GroupeEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}