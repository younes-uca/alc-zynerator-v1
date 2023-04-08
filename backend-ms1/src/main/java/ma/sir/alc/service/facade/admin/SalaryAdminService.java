package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Salary;
import ma.sir.alc.dao.criteria.core.SalaryCriteria;
import ma.sir.alc.dao.criteria.history.SalaryHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface SalaryAdminService extends  IService<Salary,SalaryCriteria, SalaryHistoryCriteria>  {

    List<Salary> findByProfId(Long id);
    int deleteByProfId(Long id);



}
