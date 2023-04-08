package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Paiement;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PaiementDao extends AbstractRepository<Paiement,Long>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);

}
