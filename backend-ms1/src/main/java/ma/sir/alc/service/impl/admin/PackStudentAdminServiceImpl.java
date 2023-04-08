package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.PackStudent;
import ma.sir.alc.bean.history.PackStudentHistory;
import ma.sir.alc.dao.criteria.core.PackStudentCriteria;
import ma.sir.alc.dao.criteria.history.PackStudentHistoryCriteria;
import ma.sir.alc.dao.facade.core.PackStudentDao;
import ma.sir.alc.dao.facade.history.PackStudentHistoryDao;
import ma.sir.alc.dao.specification.core.PackStudentSpecification;
import ma.sir.alc.service.facade.admin.PackStudentAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.PriceAdminService ;
import ma.sir.alc.service.facade.admin.ParcoursAdminService ;


import java.util.List;
@Service
public class PackStudentAdminServiceImpl extends AbstractServiceImpl<PackStudent,PackStudentHistory, PackStudentCriteria, PackStudentHistoryCriteria, PackStudentDao,
PackStudentHistoryDao> implements PackStudentAdminService {


    public PackStudent findByReferenceEntity(PackStudent t){
        return  dao.findByCode(t.getCode());
    }

    public List<PackStudent> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<PackStudent> findByPriceId(Long id){
        return dao.findByPriceId(id);
    }
    public int deleteByPriceId(Long id){
        return dao.deleteByPriceId(id);
    }

    public void configure() {
        super.configure(PackStudent.class,PackStudentHistory.class, PackStudentHistoryCriteria.class, PackStudentSpecification.class);
    }

    @Autowired
    private PriceAdminService priceService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    public PackStudentAdminServiceImpl(PackStudentDao dao, PackStudentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}