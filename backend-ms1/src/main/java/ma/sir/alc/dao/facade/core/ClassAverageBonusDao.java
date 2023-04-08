package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ClassAverageBonus;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.ClassAverageBonus;
import java.util.List;


@Repository
public interface ClassAverageBonusDao extends AbstractRepository<ClassAverageBonus,Long>  {
    ClassAverageBonus findByCode(String code);
    int deleteByCode(String code);


}
