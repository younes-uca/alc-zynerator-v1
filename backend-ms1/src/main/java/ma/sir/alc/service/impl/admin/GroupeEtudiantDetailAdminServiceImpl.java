package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.GroupeEtudiantDetail;
import ma.sir.alc.bean.history.GroupeEtudiantDetailHistory;
import ma.sir.alc.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.sir.alc.dao.facade.core.GroupeEtudiantDetailDao;
import ma.sir.alc.dao.facade.history.GroupeEtudiantDetailHistoryDao;
import ma.sir.alc.dao.specification.core.GroupeEtudiantDetailSpecification;
import ma.sir.alc.service.facade.admin.GroupeEtudiantDetailAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.GroupeEtudiantAdminService ;
import ma.sir.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class GroupeEtudiantDetailAdminServiceImpl extends AbstractServiceImpl<GroupeEtudiantDetail,GroupeEtudiantDetailHistory, GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailDao,
GroupeEtudiantDetailHistoryDao> implements GroupeEtudiantDetailAdminService {



    public List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }
    public List<GroupeEtudiantDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(GroupeEtudiantDetail.class,GroupeEtudiantDetailHistory.class, GroupeEtudiantDetailHistoryCriteria.class, GroupeEtudiantDetailSpecification.class);
    }

    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    public GroupeEtudiantDetailAdminServiceImpl(GroupeEtudiantDetailDao dao, GroupeEtudiantDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}