package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.CalendrierProf;
import ma.sir.alc.bean.history.CalendrierProfHistory;
import ma.sir.alc.dao.criteria.core.CalendrierProfCriteria;
import ma.sir.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.alc.dao.facade.core.CalendrierProfDao;
import ma.sir.alc.dao.facade.history.CalendrierProfHistoryDao;
import ma.sir.alc.dao.specification.core.CalendrierProfSpecification;
import ma.sir.alc.service.facade.admin.CalendrierProfAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;
import ma.sir.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class CalendrierProfAdminServiceImpl extends AbstractServiceImpl<CalendrierProf,CalendrierProfHistory, CalendrierProfCriteria, CalendrierProfHistoryCriteria, CalendrierProfDao,
CalendrierProfHistoryDao> implements CalendrierProfAdminService {


    public CalendrierProf findByReferenceEntity(CalendrierProf t){
        return  dao.findByRef(t.getRef());
    }

    public List<CalendrierProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<CalendrierProf> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(CalendrierProf.class,CalendrierProfHistory.class, CalendrierProfHistoryCriteria.class, CalendrierProfSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ProfAdminService profService ;
    public CalendrierProfAdminServiceImpl(CalendrierProfDao dao, CalendrierProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}