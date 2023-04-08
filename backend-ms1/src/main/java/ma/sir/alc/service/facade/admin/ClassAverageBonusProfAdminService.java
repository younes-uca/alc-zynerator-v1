package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ClassAverageBonusProf;
import ma.sir.alc.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.sir.alc.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ClassAverageBonusProfAdminService extends  IService<ClassAverageBonusProf,ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria>  {

    List<ClassAverageBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ClassAverageBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
