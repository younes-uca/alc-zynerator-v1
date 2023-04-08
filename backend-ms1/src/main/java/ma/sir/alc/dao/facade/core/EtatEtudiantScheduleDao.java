package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtatEtudiantSchedule;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.EtatEtudiantSchedule;
import java.util.List;


@Repository
public interface EtatEtudiantScheduleDao extends AbstractRepository<EtatEtudiantSchedule,Long>  {
    EtatEtudiantSchedule findByLibelle(String libelle);
    int deleteByLibelle(String libelle);


}
