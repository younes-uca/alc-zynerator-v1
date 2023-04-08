package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.TeacherLocality;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.TeacherLocality;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface TeacherLocalityDao extends AbstractRepository<TeacherLocality,Long>  {
    TeacherLocality findByCode(String code);
    int deleteByCode(String code);


    @Query(value = "SELECT MAX(item.ordre) FROM TeacherLocality item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
