package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Admin;
import ma.sir.alc.bean.history.AdminHistory;
import ma.sir.alc.dao.criteria.core.AdminCriteria;
import ma.sir.alc.dao.criteria.history.AdminHistoryCriteria;
import ma.sir.alc.dao.facade.core.AdminDao;
import ma.sir.alc.dao.facade.history.AdminHistoryDao;
import ma.sir.alc.dao.specification.core.AdminSpecification;
import ma.sir.alc.service.facade.admin.AdminAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AdminAdminServiceImpl extends AbstractServiceImpl<Admin,AdminHistory, AdminCriteria, AdminHistoryCriteria, AdminDao,
AdminHistoryDao> implements AdminAdminService {




    public void configure() {
        super.configure(Admin.class,AdminHistory.class, AdminHistoryCriteria.class, AdminSpecification.class);
    }

    public AdminAdminServiceImpl(AdminDao dao, AdminHistoryDao historyDao) {
        super(dao, historyDao);
    }

    @Override
    public Admin findByUsername(String username) {
        return dao.findByUsername(username);
    }
}