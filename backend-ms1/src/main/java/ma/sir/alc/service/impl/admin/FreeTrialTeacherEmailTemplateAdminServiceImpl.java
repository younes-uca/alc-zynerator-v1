package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialTeacherEmailTemplate;
import ma.sir.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialTeacherEmailTemplateDao;
import ma.sir.alc.dao.facade.history.FreeTrialTeacherEmailTemplateHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialTeacherEmailTemplateSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialTeacherEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherEmailTemplate,FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateDao,
FreeTrialTeacherEmailTemplateHistoryDao> implements FreeTrialTeacherEmailTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialTeacherEmailTemplate.class,FreeTrialTeacherEmailTemplateHistory.class, FreeTrialTeacherEmailTemplateHistoryCriteria.class, FreeTrialTeacherEmailTemplateSpecification.class);
    }

    public FreeTrialTeacherEmailTemplateAdminServiceImpl(FreeTrialTeacherEmailTemplateDao dao, FreeTrialTeacherEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}