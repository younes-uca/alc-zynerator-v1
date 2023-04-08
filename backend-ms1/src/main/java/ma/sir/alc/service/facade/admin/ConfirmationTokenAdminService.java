package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ConfirmationToken;
import ma.sir.alc.dao.criteria.core.ConfirmationTokenCriteria;
import ma.sir.alc.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ConfirmationTokenAdminService extends  IService<ConfirmationToken,ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
