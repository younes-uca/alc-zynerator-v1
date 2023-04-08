package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TeacherLocality;
import ma.sir.alc.bean.history.TeacherLocalityHistory;
import ma.sir.alc.dao.criteria.core.TeacherLocalityCriteria;
import ma.sir.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.alc.dao.facade.core.TeacherLocalityDao;
import ma.sir.alc.dao.facade.history.TeacherLocalityHistoryDao;
import ma.sir.alc.dao.specification.core.TeacherLocalitySpecification;
import ma.sir.alc.service.facade.admin.TeacherLocalityAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TeacherLocalityAdminServiceImpl extends AbstractServiceImpl<TeacherLocality,TeacherLocalityHistory, TeacherLocalityCriteria, TeacherLocalityHistoryCriteria, TeacherLocalityDao,
TeacherLocalityHistoryDao> implements TeacherLocalityAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public TeacherLocality findByReferenceEntity(TeacherLocality t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TeacherLocality.class,TeacherLocalityHistory.class, TeacherLocalityHistoryCriteria.class, TeacherLocalitySpecification.class);
    }

    public TeacherLocalityAdminServiceImpl(TeacherLocalityDao dao, TeacherLocalityHistoryDao historyDao) {
        super(dao, historyDao);
    }

}