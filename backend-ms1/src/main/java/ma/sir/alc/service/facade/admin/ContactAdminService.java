package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Contact;
import ma.sir.alc.dao.criteria.core.ContactCriteria;
import ma.sir.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ContactAdminService extends  IService<Contact,ContactCriteria, ContactHistoryCriteria>  {




}
