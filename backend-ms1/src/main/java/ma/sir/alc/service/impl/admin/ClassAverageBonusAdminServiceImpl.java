package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.ClassAverageBonus;
import ma.sir.alc.bean.history.ClassAverageBonusHistory;
import ma.sir.alc.dao.criteria.core.ClassAverageBonusCriteria;
import ma.sir.alc.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.sir.alc.dao.facade.core.ClassAverageBonusDao;
import ma.sir.alc.dao.facade.history.ClassAverageBonusHistoryDao;
import ma.sir.alc.dao.specification.core.ClassAverageBonusSpecification;
import ma.sir.alc.service.facade.admin.ClassAverageBonusAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ClassAverageBonusAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonus,ClassAverageBonusHistory, ClassAverageBonusCriteria, ClassAverageBonusHistoryCriteria, ClassAverageBonusDao,
ClassAverageBonusHistoryDao> implements ClassAverageBonusAdminService {


    public ClassAverageBonus findByReferenceEntity(ClassAverageBonus t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ClassAverageBonus.class,ClassAverageBonusHistory.class, ClassAverageBonusHistoryCriteria.class, ClassAverageBonusSpecification.class);
    }

    public ClassAverageBonusAdminServiceImpl(ClassAverageBonusDao dao, ClassAverageBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}