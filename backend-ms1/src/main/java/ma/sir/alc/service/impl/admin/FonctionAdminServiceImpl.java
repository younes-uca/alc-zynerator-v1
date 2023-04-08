package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Fonction;
import ma.sir.alc.bean.history.FonctionHistory;
import ma.sir.alc.dao.criteria.core.FonctionCriteria;
import ma.sir.alc.dao.criteria.history.FonctionHistoryCriteria;
import ma.sir.alc.dao.facade.core.FonctionDao;
import ma.sir.alc.dao.facade.history.FonctionHistoryDao;
import ma.sir.alc.dao.specification.core.FonctionSpecification;
import ma.sir.alc.service.facade.admin.FonctionAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FonctionAdminServiceImpl extends AbstractServiceImpl<Fonction,FonctionHistory, FonctionCriteria, FonctionHistoryCriteria, FonctionDao,
FonctionHistoryDao> implements FonctionAdminService {


    public Fonction findByReferenceEntity(Fonction t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Fonction.class,FonctionHistory.class, FonctionHistoryCriteria.class, FonctionSpecification.class);
    }

    public FonctionAdminServiceImpl(FonctionDao dao, FonctionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}