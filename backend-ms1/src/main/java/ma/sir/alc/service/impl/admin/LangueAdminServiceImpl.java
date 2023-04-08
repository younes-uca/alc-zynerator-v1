package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Langue;
import ma.sir.alc.bean.history.LangueHistory;
import ma.sir.alc.dao.criteria.core.LangueCriteria;
import ma.sir.alc.dao.criteria.history.LangueHistoryCriteria;
import ma.sir.alc.dao.facade.core.LangueDao;
import ma.sir.alc.dao.facade.history.LangueHistoryDao;
import ma.sir.alc.dao.specification.core.LangueSpecification;
import ma.sir.alc.service.facade.admin.LangueAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LangueAdminServiceImpl extends AbstractServiceImpl<Langue,LangueHistory, LangueCriteria, LangueHistoryCriteria, LangueDao,
LangueHistoryDao> implements LangueAdminService {


    public Langue findByReferenceEntity(Langue t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(Langue.class,LangueHistory.class, LangueHistoryCriteria.class, LangueSpecification.class);
    }

    public LangueAdminServiceImpl(LangueDao dao, LangueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}