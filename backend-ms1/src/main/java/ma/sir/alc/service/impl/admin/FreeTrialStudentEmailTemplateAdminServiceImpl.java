package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialStudentEmailTemplate;
import ma.sir.alc.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialStudentEmailTemplateDao;
import ma.sir.alc.dao.facade.history.FreeTrialStudentEmailTemplateHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialStudentEmailTemplateSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialStudentEmailTemplateAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentEmailTemplate,FreeTrialStudentEmailTemplateHistory, FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateDao,
FreeTrialStudentEmailTemplateHistoryDao> implements FreeTrialStudentEmailTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialStudentEmailTemplate.class,FreeTrialStudentEmailTemplateHistory.class, FreeTrialStudentEmailTemplateHistoryCriteria.class, FreeTrialStudentEmailTemplateSpecification.class);
    }

    public FreeTrialStudentEmailTemplateAdminServiceImpl(FreeTrialStudentEmailTemplateDao dao, FreeTrialStudentEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}