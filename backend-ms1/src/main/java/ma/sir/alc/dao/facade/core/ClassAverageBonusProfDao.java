package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ClassAverageBonusProf;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClassAverageBonusProfDao extends AbstractRepository<ClassAverageBonusProf,Long>  {

    List<ClassAverageBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ClassAverageBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);

}
