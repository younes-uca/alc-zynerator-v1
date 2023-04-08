package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Price;
import ma.sir.alc.dao.criteria.core.PriceCriteria;
import ma.sir.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface PriceAdminService extends  IService<Price,PriceCriteria, PriceHistoryCriteria>  {




}
