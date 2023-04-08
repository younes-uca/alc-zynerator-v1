package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Contact;
import ma.sir.alc.bean.history.ContactHistory;
import ma.sir.alc.dao.criteria.core.ContactCriteria;
import ma.sir.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.alc.dao.facade.core.ContactDao;
import ma.sir.alc.dao.facade.history.ContactHistoryDao;
import ma.sir.alc.dao.specification.core.ContactSpecification;
import ma.sir.alc.service.facade.admin.ContactAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ContactAdminServiceImpl extends AbstractServiceImpl<Contact,ContactHistory, ContactCriteria, ContactHistoryCriteria, ContactDao,
ContactHistoryDao> implements ContactAdminService {




    public void configure() {
        super.configure(Contact.class,ContactHistory.class, ContactHistoryCriteria.class, ContactSpecification.class);
    }

    public ContactAdminServiceImpl(ContactDao dao, ContactHistoryDao historyDao) {
        super(dao, historyDao);
    }

}