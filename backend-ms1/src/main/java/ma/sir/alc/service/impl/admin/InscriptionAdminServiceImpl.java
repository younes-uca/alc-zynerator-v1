package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Inscription;
import ma.sir.alc.bean.history.InscriptionHistory;
import ma.sir.alc.dao.criteria.core.InscriptionCriteria;
import ma.sir.alc.dao.criteria.history.InscriptionHistoryCriteria;
import ma.sir.alc.dao.facade.core.InscriptionDao;
import ma.sir.alc.dao.facade.history.InscriptionHistoryDao;
import ma.sir.alc.dao.specification.core.InscriptionSpecification;
import ma.sir.alc.service.facade.admin.InscriptionAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;
import ma.sir.alc.service.facade.admin.QuizAdminService ;
import ma.sir.alc.service.facade.admin.StatutSocialAdminService ;
import ma.sir.alc.service.facade.admin.EtatInscriptionAdminService ;
import ma.sir.alc.service.facade.admin.NiveauEtudeAdminService ;
import ma.sir.alc.service.facade.admin.ParcoursAdminService ;
import ma.sir.alc.service.facade.admin.FonctionAdminService ;
import ma.sir.alc.service.facade.admin.SkillAdminService ;
import ma.sir.alc.service.facade.admin.GroupeEtudeAdminService ;
import ma.sir.alc.service.facade.admin.InteretEtudiantAdminService ;
import ma.sir.alc.service.facade.admin.PackStudentAdminService ;


import java.util.List;
@Service
public class InscriptionAdminServiceImpl extends AbstractServiceImpl<Inscription,InscriptionHistory, InscriptionCriteria, InscriptionHistoryCriteria, InscriptionDao,
InscriptionHistoryDao> implements InscriptionAdminService {



    public List<Inscription> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<Inscription> findByEtatInscriptionId(Long id){
        return dao.findByEtatInscriptionId(id);
    }
    public int deleteByEtatInscriptionId(Long id){
        return dao.deleteByEtatInscriptionId(id);
    }
    public List<Inscription> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<Inscription> findByGroupeEtudeId(Long id){
        return dao.findByGroupeEtudeId(id);
    }
    public int deleteByGroupeEtudeId(Long id){
        return dao.deleteByGroupeEtudeId(id);
    }
    public List<Inscription> findByStatutSocialId(Long id){
        return dao.findByStatutSocialId(id);
    }
    public int deleteByStatutSocialId(Long id){
        return dao.deleteByStatutSocialId(id);
    }
    public List<Inscription> findByInteretEtudiantId(Long id){
        return dao.findByInteretEtudiantId(id);
    }
    public int deleteByInteretEtudiantId(Long id){
        return dao.deleteByInteretEtudiantId(id);
    }
    public List<Inscription> findByNiveauEtudeId(Long id){
        return dao.findByNiveauEtudeId(id);
    }
    public int deleteByNiveauEtudeId(Long id){
        return dao.deleteByNiveauEtudeId(id);
    }
    public List<Inscription> findByFonctionId(Long id){
        return dao.findByFonctionId(id);
    }
    public int deleteByFonctionId(Long id){
        return dao.deleteByFonctionId(id);
    }
    public List<Inscription> findByQuizNiveauId(Long id){
        return dao.findByQuizNiveauId(id);
    }
    public int deleteByQuizNiveauId(Long id){
        return dao.deleteByQuizNiveauId(id);
    }
    public List<Inscription> findByPackStudentId(Long id){
        return dao.findByPackStudentId(id);
    }
    public int deleteByPackStudentId(Long id){
        return dao.deleteByPackStudentId(id);
    }
    public List<Inscription> findBySkillId(Long id){
        return dao.findBySkillId(id);
    }
    public int deleteBySkillId(Long id){
        return dao.deleteBySkillId(id);
    }

    public void configure() {
        super.configure(Inscription.class,InscriptionHistory.class, InscriptionHistoryCriteria.class, InscriptionSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private QuizAdminService quizService ;
    @Autowired
    private StatutSocialAdminService statutSocialService ;
    @Autowired
    private EtatInscriptionAdminService etatInscriptionService ;
    @Autowired
    private NiveauEtudeAdminService niveauEtudeService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private FonctionAdminService fonctionService ;
    @Autowired
    private SkillAdminService skillService ;
    @Autowired
    private GroupeEtudeAdminService groupeEtudeService ;
    @Autowired
    private InteretEtudiantAdminService interetEtudiantService ;
    @Autowired
    private PackStudentAdminService packStudentService ;
    public InscriptionAdminServiceImpl(InscriptionDao dao, InscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}