package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.News;
import ma.sir.alc.dao.criteria.core.NewsCriteria;
import ma.sir.alc.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface NewsAdminService extends  IService<News,NewsCriteria, NewsHistoryCriteria>  {




}
