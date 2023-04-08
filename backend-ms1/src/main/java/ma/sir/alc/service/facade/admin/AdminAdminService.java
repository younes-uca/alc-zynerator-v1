package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Admin;
import ma.sir.alc.dao.criteria.core.AdminCriteria;
import ma.sir.alc.dao.criteria.history.AdminHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface AdminAdminService extends  IService<Admin,AdminCriteria, AdminHistoryCriteria>  {
    Admin findByUsername(String username);




}
