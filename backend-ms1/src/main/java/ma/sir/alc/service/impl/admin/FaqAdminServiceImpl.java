package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Faq;
import ma.sir.alc.bean.history.FaqHistory;
import ma.sir.alc.dao.criteria.core.FaqCriteria;
import ma.sir.alc.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.alc.dao.facade.core.FaqDao;
import ma.sir.alc.dao.facade.history.FaqHistoryDao;
import ma.sir.alc.dao.specification.core.FaqSpecification;
import ma.sir.alc.service.facade.admin.FaqAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.FaqTypeAdminService ;


import java.util.List;
@Service
public class FaqAdminServiceImpl extends AbstractServiceImpl<Faq,FaqHistory, FaqCriteria, FaqHistoryCriteria, FaqDao,
FaqHistoryDao> implements FaqAdminService {



    public List<Faq> findByFaqTypeId(Long id){
        return dao.findByFaqTypeId(id);
    }
    public int deleteByFaqTypeId(Long id){
        return dao.deleteByFaqTypeId(id);
    }

    public void configure() {
        super.configure(Faq.class,FaqHistory.class, FaqHistoryCriteria.class, FaqSpecification.class);
    }

    @Autowired
    private FaqTypeAdminService faqTypeService ;
    public FaqAdminServiceImpl(FaqDao dao, FaqHistoryDao historyDao) {
        super(dao, historyDao);
    }

}