package  ma.sir.alc.dao.specification.history;

import ma.sir.alc.zynerator.specification.AbstractHistorySpecification;
import ma.sir.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.alc.bean.history.ContactHistory;


public class ContactHistorySpecification extends AbstractHistorySpecification<ContactHistoryCriteria, ContactHistory> {

    public ContactHistorySpecification(ContactHistoryCriteria criteria) {
        super(criteria);
    }

    public ContactHistorySpecification(ContactHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
