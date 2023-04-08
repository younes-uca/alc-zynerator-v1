package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.sir.alc.bean.history.ResultatHomeWorkHistory;


public class ResultatHomeWorkHistorySpecification extends AbstractHistorySpecification<ResultatHomeWorkHistoryCriteria, ResultatHomeWorkHistory> {

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
