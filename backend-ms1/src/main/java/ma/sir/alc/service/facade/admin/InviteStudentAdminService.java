package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.InviteStudent;
import ma.sir.alc.dao.criteria.core.InviteStudentCriteria;
import ma.sir.alc.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface InviteStudentAdminService extends  IService<InviteStudent,InviteStudentCriteria, InviteStudentHistoryCriteria>  {

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
