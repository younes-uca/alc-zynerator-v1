package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.InviteStudent;
import ma.sir.alc.bean.history.InviteStudentHistory;
import ma.sir.alc.dao.criteria.core.InviteStudentCriteria;
import ma.sir.alc.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.sir.alc.dao.facade.core.InviteStudentDao;
import ma.sir.alc.dao.facade.history.InviteStudentHistoryDao;
import ma.sir.alc.dao.specification.core.InviteStudentSpecification;
import ma.sir.alc.service.facade.admin.InviteStudentAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class InviteStudentAdminServiceImpl extends AbstractServiceImpl<InviteStudent,InviteStudentHistory, InviteStudentCriteria, InviteStudentHistoryCriteria, InviteStudentDao,
InviteStudentHistoryDao> implements InviteStudentAdminService {


    public InviteStudent findByReferenceEntity(InviteStudent t){
        return  dao.findByCode(t.getCode());
    }

    public List<InviteStudent> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(InviteStudent.class,InviteStudentHistory.class, InviteStudentHistoryCriteria.class, InviteStudentSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    public InviteStudentAdminServiceImpl(InviteStudentDao dao, InviteStudentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}