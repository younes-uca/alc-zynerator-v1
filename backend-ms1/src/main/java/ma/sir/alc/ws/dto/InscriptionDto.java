package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class InscriptionDto  extends AuditBaseDto {

    private Integer numeroInscription  = 0 ;
    private BigDecimal noteQuizNiveau  ;
    private Boolean quizFinished  ;
    private String dateRegistration  ;
    private String datedebutinscription ;
    private String datefininscription ;
    private String skype  ;

    private EtudiantDto etudiant ;
    private EtatInscriptionDto etatInscription ;
    private ParcoursDto parcours ;
    private GroupeEtudeDto groupeEtude ;
    private StatutSocialDto statutSocial ;
    private InteretEtudiantDto interetEtudiant ;
    private NiveauEtudeDto niveauEtude ;
    private FonctionDto fonction ;
    private QuizDto quizNiveau ;
    private PackStudentDto packStudent ;
    private SkillDto skill ;



    public InscriptionDto(){
        super();
    }



    @Log
    public Integer getNumeroInscription(){
        return this.numeroInscription;
    }
    public void setNumeroInscription(Integer numeroInscription){
        this.numeroInscription = numeroInscription;
    }

    @Log
    public BigDecimal getNoteQuizNiveau(){
        return this.noteQuizNiveau;
    }
    public void setNoteQuizNiveau(BigDecimal noteQuizNiveau){
        this.noteQuizNiveau = noteQuizNiveau;
    }

    @Log
    public Boolean getQuizFinished(){
        return this.quizFinished;
    }
    public void setQuizFinished(Boolean quizFinished){
        this.quizFinished = quizFinished;
    }

    @Log
    public String getDateRegistration(){
        return this.dateRegistration;
    }
    public void setDateRegistration(String dateRegistration){
        this.dateRegistration = dateRegistration;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatedebutinscription(){
        return this.datedebutinscription;
    }
    public void setDatedebutinscription(String datedebutinscription){
        this.datedebutinscription = datedebutinscription;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatefininscription(){
        return this.datefininscription;
    }
    public void setDatefininscription(String datefininscription){
        this.datefininscription = datefininscription;
    }

    @Log
    public String getSkype(){
        return this.skype;
    }
    public void setSkype(String skype){
        this.skype = skype;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }
    public EtatInscriptionDto getEtatInscription(){
        return this.etatInscription;
    }

    public void setEtatInscription(EtatInscriptionDto etatInscription){
        this.etatInscription = etatInscription;
    }
    public ParcoursDto getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursDto parcours){
        this.parcours = parcours;
    }
    public GroupeEtudeDto getGroupeEtude(){
        return this.groupeEtude;
    }

    public void setGroupeEtude(GroupeEtudeDto groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    public StatutSocialDto getStatutSocial(){
        return this.statutSocial;
    }

    public void setStatutSocial(StatutSocialDto statutSocial){
        this.statutSocial = statutSocial;
    }
    public InteretEtudiantDto getInteretEtudiant(){
        return this.interetEtudiant;
    }

    public void setInteretEtudiant(InteretEtudiantDto interetEtudiant){
        this.interetEtudiant = interetEtudiant;
    }
    public NiveauEtudeDto getNiveauEtude(){
        return this.niveauEtude;
    }

    public void setNiveauEtude(NiveauEtudeDto niveauEtude){
        this.niveauEtude = niveauEtude;
    }
    public FonctionDto getFonction(){
        return this.fonction;
    }

    public void setFonction(FonctionDto fonction){
        this.fonction = fonction;
    }
    public QuizDto getQuizNiveau(){
        return this.quizNiveau;
    }

    public void setQuizNiveau(QuizDto quizNiveau){
        this.quizNiveau = quizNiveau;
    }
    public PackStudentDto getPackStudent(){
        return this.packStudent;
    }

    public void setPackStudent(PackStudentDto packStudent){
        this.packStudent = packStudent;
    }
    public SkillDto getSkill(){
        return this.skill;
    }

    public void setSkill(SkillDto skill){
        this.skill = skill;
    }




}
