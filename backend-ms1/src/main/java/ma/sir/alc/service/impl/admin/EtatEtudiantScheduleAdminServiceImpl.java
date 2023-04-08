package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.EtatEtudiantSchedule;
import ma.sir.alc.bean.history.EtatEtudiantScheduleHistory;
import ma.sir.alc.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.sir.alc.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.sir.alc.dao.facade.core.EtatEtudiantScheduleDao;
import ma.sir.alc.dao.facade.history.EtatEtudiantScheduleHistoryDao;
import ma.sir.alc.dao.specification.core.EtatEtudiantScheduleSpecification;
import ma.sir.alc.service.facade.admin.EtatEtudiantScheduleAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatEtudiantScheduleAdminServiceImpl extends AbstractServiceImpl<EtatEtudiantSchedule,EtatEtudiantScheduleHistory, EtatEtudiantScheduleCriteria, EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleDao,
EtatEtudiantScheduleHistoryDao> implements EtatEtudiantScheduleAdminService {


    public EtatEtudiantSchedule findByReferenceEntity(EtatEtudiantSchedule t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(EtatEtudiantSchedule.class,EtatEtudiantScheduleHistory.class, EtatEtudiantScheduleHistoryCriteria.class, EtatEtudiantScheduleSpecification.class);
    }

    public EtatEtudiantScheduleAdminServiceImpl(EtatEtudiantScheduleDao dao, EtatEtudiantScheduleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}