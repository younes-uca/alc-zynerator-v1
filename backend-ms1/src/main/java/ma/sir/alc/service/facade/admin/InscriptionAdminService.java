package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Inscription;
import ma.sir.alc.dao.criteria.core.InscriptionCriteria;
import ma.sir.alc.dao.criteria.history.InscriptionHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface InscriptionAdminService extends  IService<Inscription,InscriptionCriteria, InscriptionHistoryCriteria>  {

    List<Inscription> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<Inscription> findByEtatInscriptionId(Long id);
    int deleteByEtatInscriptionId(Long id);
    List<Inscription> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Inscription> findByGroupeEtudeId(Long id);
    int deleteByGroupeEtudeId(Long id);
    List<Inscription> findByStatutSocialId(Long id);
    int deleteByStatutSocialId(Long id);
    List<Inscription> findByInteretEtudiantId(Long id);
    int deleteByInteretEtudiantId(Long id);
    List<Inscription> findByNiveauEtudeId(Long id);
    int deleteByNiveauEtudeId(Long id);
    List<Inscription> findByFonctionId(Long id);
    int deleteByFonctionId(Long id);
    List<Inscription> findByQuizNiveauId(Long id);
    int deleteByQuizNiveauId(Long id);
    List<Inscription> findByPackStudentId(Long id);
    int deleteByPackStudentId(Long id);
    List<Inscription> findBySkillId(Long id);
    int deleteBySkillId(Long id);



}
