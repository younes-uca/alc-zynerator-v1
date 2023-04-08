package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Etudiant;
import ma.sir.alc.dao.criteria.core.EtudiantCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface EtudiantAdminService extends  IService<Etudiant,EtudiantCriteria, EtudiantHistoryCriteria>  {

    List<Etudiant> findByTeacherLocalityId(Long id);
    int deleteByTeacherLocalityId(Long id);
    List<Etudiant> findByEtatEtudiantScheduleId(Long id);
    int deleteByEtatEtudiantScheduleId(Long id);
    List<Etudiant> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Etudiant> findByGroupeEtudeId(Long id);
    int deleteByGroupeEtudeId(Long id);
    List<Etudiant> findByPackStudentId(Long id);
    int deleteByPackStudentId(Long id);
    List<Etudiant> findByStatutSocialId(Long id);
    int deleteByStatutSocialId(Long id);
    List<Etudiant> findByInteretEtudiantId(Long id);
    int deleteByInteretEtudiantId(Long id);
    List<Etudiant> findByNiveauEtudeId(Long id);
    int deleteByNiveauEtudeId(Long id);
    List<Etudiant> findBySkillId(Long id);
    int deleteBySkillId(Long id);
    List<Etudiant> findByFonctionId(Long id);
    int deleteByFonctionId(Long id);
    List<Etudiant> findByLangueId(Long id);
    int deleteByLangueId(Long id);



}
