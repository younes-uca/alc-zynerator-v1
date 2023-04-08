package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;



import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;



import ma.sir.alc.security.bean.User;

@Entity
@Table(name = "prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prof_seq",sequenceName="prof_seq",allocationSize=1, initialValue = 1)
public class Prof    extends AuditBusinessObject   {


    public Prof(String username) {
        super(username);
    }
    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String about;
    @Column(length = 500)
    private String email;
    @Column(columnDefinition = "boolean default false")
    private boolean credentialsNonExpired = false;
    @Column(columnDefinition = "boolean default false")
    private boolean enabled = false;
    @Column(columnDefinition = "boolean default false")
    private boolean accountNonExpired = false;
    @Column(columnDefinition = "boolean default false")
    private boolean accountNonLocked = false;
    @Column(columnDefinition = "boolean default false")
    private boolean passwordChanged = false;
    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date createdAt ;
    @JsonFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date updatedAt ;
    @Column(length = 500)
    private String username;
    @Column(length = 500)
    private String password;
    @Column(length = 500)
    private String prenom;
    @Column(length = 500)
    private String nom;

    private Parcours levelMin ;
    
    private Parcours levelMax ;
    
    private CategorieProf categorieProf ;
    
    private TypeTeacher typeTeacher ;
    

    private List<TrancheHoraireProf> trancheHoraireProfList ;
    private List<ClassRoom> classRooms ;
    private List<RecommendTeacher> recommendTeachers ;

    public Prof(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prof_seq")
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
    public String getAbout(){
        return this.about;
    }
    public void setAbout(String about){
        this.about = about;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getLevelMin(){
        return this.levelMin;
    }
    public void setLevelMin(Parcours levelMin){
        this.levelMin = levelMin;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getLevelMax(){
        return this.levelMax;
    }
    public void setLevelMax(Parcours levelMax){
        this.levelMax = levelMax;
    }
    @OneToMany(mappedBy = "prof")
    public List<TrancheHoraireProf> getTrancheHoraireProfList(){
        return this.trancheHoraireProfList;
    }
    public void setTrancheHoraireProfList(List<TrancheHoraireProf> trancheHoraireProfList){
        this.trancheHoraireProfList = trancheHoraireProfList;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategorieProf getCategorieProf(){
        return this.categorieProf;
    }
    public void setCategorieProf(CategorieProf categorieProf){
        this.categorieProf = categorieProf;
    }
    @OneToMany(mappedBy = "prof")
    public List<ClassRoom> getClassRooms(){
        return this.classRooms;
    }
    public void setClassRooms(List<ClassRoom> classRooms){
        this.classRooms = classRooms;
    }
    @OneToMany(mappedBy = "prof")
    public List<RecommendTeacher> getRecommendTeachers(){
        return this.recommendTeachers;
    }
    public void setRecommendTeachers(List<RecommendTeacher> recommendTeachers){
        this.recommendTeachers = recommendTeachers;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeTeacher getTypeTeacher(){
        return this.typeTeacher;
    }
    public void setTypeTeacher(TypeTeacher typeTeacher){
        this.typeTeacher = typeTeacher;
    }
    public boolean  getCredentialsNonExpired(){
        return this.credentialsNonExpired;
    }
    public void setCredentialsNonExpired(boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
    }
    public boolean  getEnabled(){
        return this.enabled;
    }
    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }
    public boolean  getAccountNonExpired(){
        return this.accountNonExpired;
    }
    public void setAccountNonExpired(boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
    }
    public boolean  getAccountNonLocked(){
        return this.accountNonLocked;
    }
    public void setAccountNonLocked(boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
    }
    public boolean  getPasswordChanged(){
        return this.passwordChanged;
    }
    public void setPasswordChanged(boolean passwordChanged){
        this.passwordChanged = passwordChanged;
    }
    public Date getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
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
        Prof prof = (Prof) o;
        return id != null && id.equals(prof.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

