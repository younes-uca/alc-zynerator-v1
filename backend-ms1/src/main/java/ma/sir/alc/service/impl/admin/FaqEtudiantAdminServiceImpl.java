package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FaqEtudiant;
import ma.sir.alc.bean.history.FaqEtudiantHistory;
import ma.sir.alc.dao.criteria.core.FaqEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.FaqEtudiantDao;
import ma.sir.alc.dao.facade.history.FaqEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.FaqEtudiantSpecification;
import ma.sir.alc.service.facade.admin.FaqEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;
import ma.sir.alc.service.facade.admin.AdminAdminService ;
import ma.sir.alc.service.facade.admin.FaqTypeAdminService ;


import java.util.List;
@Service
public class FaqEtudiantAdminServiceImpl extends AbstractServiceImpl<FaqEtudiant,FaqEtudiantHistory, FaqEtudiantCriteria, FaqEtudiantHistoryCriteria, FaqEtudiantDao,
FaqEtudiantHistoryDao> implements FaqEtudiantAdminService {



    public List<FaqEtudiant> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<FaqEtudiant> findByAdminId(Long id){
        return dao.findByAdminId(id);
    }
    public int deleteByAdminId(Long id){
        return dao.deleteByAdminId(id);
    }
    public List<FaqEtudiant> findByFaqTypeId(Long id){
        return dao.findByFaqTypeId(id);
    }
    public int deleteByFaqTypeId(Long id){
        return dao.deleteByFaqTypeId(id);
    }

    public void configure() {
        super.configure(FaqEtudiant.class,FaqEtudiantHistory.class, FaqEtudiantHistoryCriteria.class, FaqEtudiantSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private AdminAdminService adminService ;
    @Autowired
    private FaqTypeAdminService faqTypeService ;
    public FaqEtudiantAdminServiceImpl(FaqEtudiantDao dao, FaqEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}