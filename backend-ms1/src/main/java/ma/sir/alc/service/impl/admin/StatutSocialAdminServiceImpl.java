package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.StatutSocial;
import ma.sir.alc.bean.history.StatutSocialHistory;
import ma.sir.alc.dao.criteria.core.StatutSocialCriteria;
import ma.sir.alc.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.sir.alc.dao.facade.core.StatutSocialDao;
import ma.sir.alc.dao.facade.history.StatutSocialHistoryDao;
import ma.sir.alc.dao.specification.core.StatutSocialSpecification;
import ma.sir.alc.service.facade.admin.StatutSocialAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class StatutSocialAdminServiceImpl extends AbstractServiceImpl<StatutSocial,StatutSocialHistory, StatutSocialCriteria, StatutSocialHistoryCriteria, StatutSocialDao,
StatutSocialHistoryDao> implements StatutSocialAdminService {


    public StatutSocial findByReferenceEntity(StatutSocial t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(StatutSocial.class,StatutSocialHistory.class, StatutSocialHistoryCriteria.class, StatutSocialSpecification.class);
    }

    public StatutSocialAdminServiceImpl(StatutSocialDao dao, StatutSocialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}