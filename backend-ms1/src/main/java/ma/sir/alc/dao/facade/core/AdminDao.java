package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Admin;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AdminDao extends AbstractRepository<Admin,Long>  {

    Admin findByUsername(String username);

}
