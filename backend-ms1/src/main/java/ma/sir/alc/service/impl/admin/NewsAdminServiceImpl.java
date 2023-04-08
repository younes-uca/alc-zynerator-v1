package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.News;
import ma.sir.alc.bean.history.NewsHistory;
import ma.sir.alc.dao.criteria.core.NewsCriteria;
import ma.sir.alc.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.alc.dao.facade.core.NewsDao;
import ma.sir.alc.dao.facade.history.NewsHistoryDao;
import ma.sir.alc.dao.specification.core.NewsSpecification;
import ma.sir.alc.service.facade.admin.NewsAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NewsAdminServiceImpl extends AbstractServiceImpl<News,NewsHistory, NewsCriteria, NewsHistoryCriteria, NewsDao,
NewsHistoryDao> implements NewsAdminService {


    public News findByReferenceEntity(News t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(News.class,NewsHistory.class, NewsHistoryCriteria.class, NewsSpecification.class);
    }

    public NewsAdminServiceImpl(NewsDao dao, NewsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}