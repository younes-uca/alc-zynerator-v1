package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.CategorieSection;
import ma.sir.alc.dao.criteria.core.CategorieSectionCriteria;
import ma.sir.alc.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface CategorieSectionAdminService extends  IService<CategorieSection,CategorieSectionCriteria, CategorieSectionHistoryCriteria>  {

    List<CategorieSection> findBySuperCategorieSectionId(Long id);
    int deleteBySuperCategorieSectionId(Long id);



}
