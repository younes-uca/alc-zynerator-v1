package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Faq;
import ma.sir.alc.dao.criteria.core.FaqCriteria;
import ma.sir.alc.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface FaqAdminService extends  IService<Faq,FaqCriteria, FaqHistoryCriteria>  {

    List<Faq> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
