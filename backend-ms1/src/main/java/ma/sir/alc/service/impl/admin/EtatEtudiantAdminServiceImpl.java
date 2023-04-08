package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.EtatEtudiant;
import ma.sir.alc.bean.history.EtatEtudiantHistory;
import ma.sir.alc.dao.criteria.core.EtatEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.EtatEtudiantDao;
import ma.sir.alc.dao.facade.history.EtatEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.EtatEtudiantSpecification;
import ma.sir.alc.service.facade.admin.EtatEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatEtudiantAdminServiceImpl extends AbstractServiceImpl<EtatEtudiant,EtatEtudiantHistory, EtatEtudiantCriteria, EtatEtudiantHistoryCriteria, EtatEtudiantDao,
EtatEtudiantHistoryDao> implements EtatEtudiantAdminService {


    public EtatEtudiant findByReferenceEntity(EtatEtudiant t){
        return  dao.findByReference(t.getReference());
    }


    public void configure() {
        super.configure(EtatEtudiant.class,EtatEtudiantHistory.class, EtatEtudiantHistoryCriteria.class, EtatEtudiantSpecification.class);
    }

    public EtatEtudiantAdminServiceImpl(EtatEtudiantDao dao, EtatEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}