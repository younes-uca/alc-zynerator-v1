package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.sir.alc.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialTeacherWhatsTemplateDao;
import ma.sir.alc.dao.facade.history.FreeTrialTeacherWhatsTemplateHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialTeacherWhatsTemplateSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialTeacherWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherWhatsTemplate,FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateDao,
FreeTrialTeacherWhatsTemplateHistoryDao> implements FreeTrialTeacherWhatsTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialTeacherWhatsTemplate.class,FreeTrialTeacherWhatsTemplateHistory.class, FreeTrialTeacherWhatsTemplateHistoryCriteria.class, FreeTrialTeacherWhatsTemplateSpecification.class);
    }

    public FreeTrialTeacherWhatsTemplateAdminServiceImpl(FreeTrialTeacherWhatsTemplateDao dao, FreeTrialTeacherWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}