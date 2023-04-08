package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.TrancheHoraireProf;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TrancheHoraireProfDao extends AbstractRepository<TrancheHoraireProf,Long>  {

    List<TrancheHoraireProf> findByProfId(Long id);
    int deleteByProfId(Long id);

}
