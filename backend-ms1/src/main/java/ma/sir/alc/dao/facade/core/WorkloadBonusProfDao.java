package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.WorkloadBonusProf;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.WorkloadBonusProf;
import java.util.List;


@Repository
public interface WorkloadBonusProfDao extends AbstractRepository<WorkloadBonusProf,Long>  {
    WorkloadBonusProf findByCode(String code);
    int deleteByCode(String code);


}
