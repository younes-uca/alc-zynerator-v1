package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Services;
import ma.sir.alc.dao.criteria.core.ServicesCriteria;
import ma.sir.alc.dao.criteria.history.ServicesHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ServicesAdminService extends  IService<Services,ServicesCriteria, ServicesHistoryCriteria>  {

    Long getNextOrdre();



}
