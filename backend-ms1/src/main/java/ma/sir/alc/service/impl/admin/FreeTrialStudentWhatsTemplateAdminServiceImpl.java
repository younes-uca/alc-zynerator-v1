package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialStudentWhatsTemplate;
import ma.sir.alc.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialStudentWhatsTemplateDao;
import ma.sir.alc.dao.facade.history.FreeTrialStudentWhatsTemplateHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialStudentWhatsTemplateSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentWhatsTemplate,FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateDao,
FreeTrialStudentWhatsTemplateHistoryDao> implements FreeTrialStudentWhatsTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialStudentWhatsTemplate.class,FreeTrialStudentWhatsTemplateHistory.class, FreeTrialStudentWhatsTemplateHistoryCriteria.class, FreeTrialStudentWhatsTemplateSpecification.class);
    }

    public FreeTrialStudentWhatsTemplateAdminServiceImpl(FreeTrialStudentWhatsTemplateDao dao, FreeTrialStudentWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}