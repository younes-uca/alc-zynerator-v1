package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.SectionItem;
import ma.sir.alc.dao.criteria.core.SectionItemCriteria;
import ma.sir.alc.dao.criteria.history.SectionItemHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface SectionItemAdminService extends  IService<SectionItem,SectionItemCriteria, SectionItemHistoryCriteria>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
