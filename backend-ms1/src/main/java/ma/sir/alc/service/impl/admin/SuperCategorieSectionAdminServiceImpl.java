package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.SuperCategorieSection;
import ma.sir.alc.bean.history.SuperCategorieSectionHistory;
import ma.sir.alc.dao.criteria.core.SuperCategorieSectionCriteria;
import ma.sir.alc.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.sir.alc.dao.facade.core.SuperCategorieSectionDao;
import ma.sir.alc.dao.facade.history.SuperCategorieSectionHistoryDao;
import ma.sir.alc.dao.specification.core.SuperCategorieSectionSpecification;
import ma.sir.alc.service.facade.admin.SuperCategorieSectionAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.CategorieSection;

import ma.sir.alc.service.facade.admin.CategorieSectionAdminService ;


import java.util.List;
@Service
public class SuperCategorieSectionAdminServiceImpl extends AbstractServiceImpl<SuperCategorieSection,SuperCategorieSectionHistory, SuperCategorieSectionCriteria, SuperCategorieSectionHistoryCriteria, SuperCategorieSectionDao,
SuperCategorieSectionHistoryDao> implements SuperCategorieSectionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public SuperCategorieSection create(SuperCategorieSection t) {
        super.create(t);
        if (t.getCategorieSections() != null) {
                t.getCategorieSections().forEach(element-> {
                    element.setSuperCategorieSection(t);
                    categorieSectionService.create(element);
            });
        }
        return t;
    }

    public SuperCategorieSection findWithAssociatedLists(Long id){
        SuperCategorieSection result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setCategorieSections(categorieSectionService.findBySuperCategorieSectionId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        categorieSectionService.deleteBySuperCategorieSectionId(id);
    }


    public void updateWithAssociatedLists(SuperCategorieSection superCategorieSection){
    if(superCategorieSection !=null && superCategorieSection.getId() != null){
            List<List<CategorieSection>> resultCategorieSections= categorieSectionService.getToBeSavedAndToBeDeleted(categorieSectionService.findBySuperCategorieSectionId(superCategorieSection.getId()),superCategorieSection.getCategorieSections());
            categorieSectionService.delete(resultCategorieSections.get(1));
            ListUtil.emptyIfNull(resultCategorieSections.get(0)).forEach(e -> e.setSuperCategorieSection(superCategorieSection));
            categorieSectionService.update(resultCategorieSections.get(0),true);
    }
    }

    public SuperCategorieSection findByReferenceEntity(SuperCategorieSection t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(SuperCategorieSection.class,SuperCategorieSectionHistory.class, SuperCategorieSectionHistoryCriteria.class, SuperCategorieSectionSpecification.class);
    }

    @Autowired
    private CategorieSectionAdminService categorieSectionService ;
    public SuperCategorieSectionAdminServiceImpl(SuperCategorieSectionDao dao, SuperCategorieSectionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}