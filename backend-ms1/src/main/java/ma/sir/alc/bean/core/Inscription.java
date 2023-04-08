package ma.sir.alc.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "inscription")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="inscription_seq",sequenceName="inscription_seq",allocationSize=1, initialValue = 1)
public class Inscription    extends AuditBusinessObject   {

    private Long id;

    private Integer numeroInscription = 0;
    private BigDecimal noteQuizNiveau = BigDecimal.ZERO;
    @Column(columnDefinition = "boolean default false")
    private Boolean quizFinished = false;
    @Column(length = 500)
    private String dateRegistration;
    private LocalDateTime datedebutinscription ;
    private LocalDateTime datefininscription ;
    @Column(length = 500)
    private String skype;

    private Etudiant etudiant ;
    
    private EtatInscription etatInscription ;
    
    private Parcours parcours ;
    
    private GroupeEtude groupeEtude ;
    
    private StatutSocial statutSocial ;
    
    private InteretEtudiant interetEtudiant ;
    
    private NiveauEtude niveauEtude ;
    
    private Fonction fonction ;
    
    private Quiz quizNiveau ;
    
    private PackStudent packStudent ;
    
    private Skill skill ;
    


    public Inscription(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="inscription_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getNumeroInscription(){
        return this.numeroInscription;
    }
    public void setNumeroInscription(Integer numeroInscription){
        this.numeroInscription = numeroInscription;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatInscription getEtatInscription(){
        return this.etatInscription;
    }
    public void setEtatInscription(EtatInscription etatInscription){
        this.etatInscription = etatInscription;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GroupeEtude getGroupeEtude(){
        return this.groupeEtude;
    }
    public void setGroupeEtude(GroupeEtude groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public StatutSocial getStatutSocial(){
        return this.statutSocial;
    }
    public void setStatutSocial(StatutSocial statutSocial){
        this.statutSocial = statutSocial;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public InteretEtudiant getInteretEtudiant(){
        return this.interetEtudiant;
    }
    public void setInteretEtudiant(InteretEtudiant interetEtudiant){
        this.interetEtudiant = interetEtudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public NiveauEtude getNiveauEtude(){
        return this.niveauEtude;
    }
    public void setNiveauEtude(NiveauEtude niveauEtude){
        this.niveauEtude = niveauEtude;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Fonction getFonction(){
        return this.fonction;
    }
    public void setFonction(Fonction fonction){
        this.fonction = fonction;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Quiz getQuizNiveau(){
        return this.quizNiveau;
    }
    public void setQuizNiveau(Quiz quizNiveau){
        this.quizNiveau = quizNiveau;
    }
    public BigDecimal getNoteQuizNiveau(){
        return this.noteQuizNiveau;
    }
    public void setNoteQuizNiveau(BigDecimal noteQuizNiveau){
        this.noteQuizNiveau = noteQuizNiveau;
    }
    public Boolean  getQuizFinished(){
        return this.quizFinished;
    }
    public void setQuizFinished(Boolean quizFinished){
        this.quizFinished = quizFinished;
    }
    public String getDateRegistration(){
        return this.dateRegistration;
    }
    public void setDateRegistration(String dateRegistration){
        this.dateRegistration = dateRegistration;
    }
    public LocalDateTime getDatedebutinscription(){
        return this.datedebutinscription;
    }
    public void setDatedebutinscription(LocalDateTime datedebutinscription){
        this.datedebutinscription = datedebutinscription;
    }
    public LocalDateTime getDatefininscription(){
        return this.datefininscription;
    }
    public void setDatefininscription(LocalDateTime datefininscription){
        this.datefininscription = datefininscription;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PackStudent getPackStudent(){
        return this.packStudent;
    }
    public void setPackStudent(PackStudent packStudent){
        this.packStudent = packStudent;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Skill getSkill(){
        return this.skill;
    }
    public void setSkill(Skill skill){
        this.skill = skill;
    }
    public String getSkype(){
        return this.skype;
    }
    public void setSkype(String skype){
        this.skype = skype;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inscription inscription = (Inscription) o;
        return id != null && id.equals(inscription.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

