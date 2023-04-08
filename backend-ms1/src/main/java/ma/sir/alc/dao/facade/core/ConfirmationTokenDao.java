package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ConfirmationToken;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ConfirmationTokenDao extends AbstractRepository<ConfirmationToken,Long>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
