package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.GroupeEtude;
import ma.sir.alc.bean.history.GroupeEtudeHistory;
import ma.sir.alc.dao.criteria.core.GroupeEtudeCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.sir.alc.dao.facade.core.GroupeEtudeDao;
import ma.sir.alc.dao.facade.history.GroupeEtudeHistoryDao;
import ma.sir.alc.dao.specification.core.GroupeEtudeSpecification;
import ma.sir.alc.service.facade.admin.GroupeEtudeAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class GroupeEtudeAdminServiceImpl extends AbstractServiceImpl<GroupeEtude,GroupeEtudeHistory, GroupeEtudeCriteria, GroupeEtudeHistoryCriteria, GroupeEtudeDao,
GroupeEtudeHistoryDao> implements GroupeEtudeAdminService {




    public void configure() {
        super.configure(GroupeEtude.class,GroupeEtudeHistory.class, GroupeEtudeHistoryCriteria.class, GroupeEtudeSpecification.class);
    }

    public GroupeEtudeAdminServiceImpl(GroupeEtudeDao dao, GroupeEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}