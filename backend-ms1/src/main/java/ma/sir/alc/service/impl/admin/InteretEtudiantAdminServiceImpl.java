package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.InteretEtudiant;
import ma.sir.alc.bean.history.InteretEtudiantHistory;
import ma.sir.alc.dao.criteria.core.InteretEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.InteretEtudiantDao;
import ma.sir.alc.dao.facade.history.InteretEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.InteretEtudiantSpecification;
import ma.sir.alc.service.facade.admin.InteretEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class InteretEtudiantAdminServiceImpl extends AbstractServiceImpl<InteretEtudiant,InteretEtudiantHistory, InteretEtudiantCriteria, InteretEtudiantHistoryCriteria, InteretEtudiantDao,
InteretEtudiantHistoryDao> implements InteretEtudiantAdminService {


    public InteretEtudiant findByReferenceEntity(InteretEtudiant t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(InteretEtudiant.class,InteretEtudiantHistory.class, InteretEtudiantHistoryCriteria.class, InteretEtudiantSpecification.class);
    }

    public InteretEtudiantAdminServiceImpl(InteretEtudiantDao dao, InteretEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}