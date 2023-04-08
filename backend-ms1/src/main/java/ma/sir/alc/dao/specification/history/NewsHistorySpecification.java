package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.alc.bean.history.NewsHistory;


public class NewsHistorySpecification extends AbstractHistorySpecification<NewsHistoryCriteria, NewsHistory> {

    public NewsHistorySpecification(NewsHistoryCriteria criteria) {
        super(criteria);
    }

    public NewsHistorySpecification(NewsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
