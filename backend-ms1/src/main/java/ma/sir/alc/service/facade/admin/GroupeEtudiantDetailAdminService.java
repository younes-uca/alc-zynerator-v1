package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.GroupeEtudiantDetail;
import ma.sir.alc.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface GroupeEtudiantDetailAdminService extends  IService<GroupeEtudiantDetail,GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria>  {

    List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<GroupeEtudiantDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
