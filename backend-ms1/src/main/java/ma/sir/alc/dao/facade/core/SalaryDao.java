package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Salary;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Salary;
import java.util.List;


@Repository
public interface SalaryDao extends AbstractRepository<Salary,Long>  {
    Salary findByCode(String code);
    int deleteByCode(String code);

    List<Salary> findByProfId(Long id);
    int deleteByProfId(Long id);

}
