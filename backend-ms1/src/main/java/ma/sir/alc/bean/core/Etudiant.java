package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import ma.sir.alc.zynerator.security.bean.User;

import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_seq",sequenceName="etudiant_seq",allocationSize=1, initialValue = 1)
public class Etudiant    extends User {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String groupOption;
    @Column(length = 500)
    private String email;

    private TeacherLocality teacherLocality ;
    
    private EtatEtudiantSchedule etatEtudiantSchedule ;
    
    private Parcours parcours ;
    
    private GroupeEtude groupeEtude ;
    
    private PackStudent packStudent ;
    
    private StatutSocial statutSocial ;
    
    private InteretEtudiant interetEtudiant ;
    
    private NiveauEtude niveauEtude ;
    
    private Skill skill ;
    
    private Fonction fonction ;
    
    private Langue langue ;
    

    private List<QuizEtudiant> quizEtudiants ;
    private List<GroupeEtudiantDetail> groupeEtudiantDetails ;

    public Etudiant(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TeacherLocality getTeacherLocality(){
        return this.teacherLocality;
    }
    public void setTeacherLocality(TeacherLocality teacherLocality){
        this.teacherLocality = teacherLocality;
    }
    public String getGroupOption(){
        return this.groupOption;
    }
    public void setGroupOption(String groupOption){
        this.groupOption = groupOption;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatEtudiantSchedule getEtatEtudiantSchedule(){
        return this.etatEtudiantSchedule;
    }
    public void setEtatEtudiantSchedule(EtatEtudiantSchedule etatEtudiantSchedule){
        this.etatEtudiantSchedule = etatEtudiantSchedule;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }
    @OneToMany(mappedBy = "etudiant")
    public List<QuizEtudiant> getQuizEtudiants(){
        return this.quizEtudiants;
    }
    public void setQuizEtudiants(List<QuizEtudiant> quizEtudiants){
        this.quizEtudiants = quizEtudiants;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GroupeEtude getGroupeEtude(){
        return this.groupeEtude;
    }
    public void setGroupeEtude(GroupeEtude groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    @OneToMany(mappedBy = "etudiant")
    public List<GroupeEtudiantDetail> getGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails;
    }
    public void setGroupeEtudiantDetails(List<GroupeEtudiantDetail> groupeEtudiantDetails){
        this.groupeEtudiantDetails = groupeEtudiantDetails;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PackStudent getPackStudent(){
        return this.packStudent;
    }
    public void setPackStudent(PackStudent packStudent){
        this.packStudent = packStudent;
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
    public Skill getSkill(){
        return this.skill;
    }
    public void setSkill(Skill skill){
        this.skill = skill;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Fonction getFonction(){
        return this.fonction;
    }
    public void setFonction(Fonction fonction){
        this.fonction = fonction;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Langue getLangue(){
        return this.langue;
    }
    public void setLangue(Langue langue){
        this.langue = langue;
    }

    @Transient
    public String getLabel() {
        label = ref;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id != null && id.equals(etudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

