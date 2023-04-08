package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.ReclamationProf;
import ma.sir.alc.bean.history.ReclamationProfHistory;
import ma.sir.alc.dao.criteria.core.ReclamationProfCriteria;
import ma.sir.alc.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.sir.alc.dao.facade.core.ReclamationProfDao;
import ma.sir.alc.dao.facade.history.ReclamationProfHistoryDao;
import ma.sir.alc.dao.specification.core.ReclamationProfSpecification;
import ma.sir.alc.service.facade.admin.ReclamationProfAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.AdminAdminService ;
import ma.sir.alc.service.facade.admin.ProfAdminService ;
import ma.sir.alc.service.facade.admin.TypeReclamationProfAdminService ;


import java.util.List;
@Service
public class ReclamationProfAdminServiceImpl extends AbstractServiceImpl<ReclamationProf,ReclamationProfHistory, ReclamationProfCriteria, ReclamationProfHistoryCriteria, ReclamationProfDao,
ReclamationProfHistoryDao> implements ReclamationProfAdminService {


    public ReclamationProf findByReferenceEntity(ReclamationProf t){
        return  dao.findByReference(t.getReference());
    }

    public List<ReclamationProf> findByAdminId(Long id){
        return dao.findByAdminId(id);
    }
    public int deleteByAdminId(Long id){
        return dao.deleteByAdminId(id);
    }
    public List<ReclamationProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ReclamationProf> findByTypeReclamationProfId(Long id){
        return dao.findByTypeReclamationProfId(id);
    }
    public int deleteByTypeReclamationProfId(Long id){
        return dao.deleteByTypeReclamationProfId(id);
    }

    public void configure() {
        super.configure(ReclamationProf.class,ReclamationProfHistory.class, ReclamationProfHistoryCriteria.class, ReclamationProfSpecification.class);
    }

    @Autowired
    private AdminAdminService adminService ;
    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private TypeReclamationProfAdminService typeReclamationProfService ;
    public ReclamationProfAdminServiceImpl(ReclamationProfDao dao, ReclamationProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}