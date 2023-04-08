package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.EtatCours;
import ma.sir.alc.bean.history.EtatCoursHistory;
import ma.sir.alc.dao.criteria.core.EtatCoursCriteria;
import ma.sir.alc.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.sir.alc.dao.facade.core.EtatCoursDao;
import ma.sir.alc.dao.facade.history.EtatCoursHistoryDao;
import ma.sir.alc.dao.specification.core.EtatCoursSpecification;
import ma.sir.alc.service.facade.admin.EtatCoursAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatCoursAdminServiceImpl extends AbstractServiceImpl<EtatCours,EtatCoursHistory, EtatCoursCriteria, EtatCoursHistoryCriteria, EtatCoursDao,
EtatCoursHistoryDao> implements EtatCoursAdminService {


    public EtatCours findByReferenceEntity(EtatCours t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatCours.class,EtatCoursHistory.class, EtatCoursHistoryCriteria.class, EtatCoursSpecification.class);
    }

    public EtatCoursAdminServiceImpl(EtatCoursDao dao, EtatCoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}