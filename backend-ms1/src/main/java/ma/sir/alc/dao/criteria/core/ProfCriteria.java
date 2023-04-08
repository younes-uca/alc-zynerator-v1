package  ma.sir.alc.dao.criteria.core;


import ma.sir.alc.zynerator.criteria.BaseCriteria;
import java.util.List;

public class ProfCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String about;
    private String aboutLike;
    private String email;
    private String emailLike;
    private Boolean credentialsNonExpired;
    private Boolean enabled;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private Boolean passwordChanged;
    private String createdAt;
    private String createdAtLike;
    private String updatedAt;
    private String updatedAtLike;
    private String username;
    private String usernameLike;
    private String password;
    private String passwordLike;
    private String prenom;
    private String prenomLike;
    private String nom;
    private String nomLike;

    private ParcoursCriteria levelMin ;
    private List<ParcoursCriteria> levelMins ;
    private ParcoursCriteria levelMax ;
    private List<ParcoursCriteria> levelMaxs ;
    private CategorieProfCriteria categorieProf ;
    private List<CategorieProfCriteria> categorieProfs ;
    private TypeTeacherCriteria typeTeacher ;
    private List<TypeTeacherCriteria> typeTeachers ;


    public ProfCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

    public String getAbout(){
        return this.about;
    }
    public void setAbout(String about){
        this.about = about;
    }
    public String getAboutLike(){
        return this.aboutLike;
    }
    public void setAboutLike(String aboutLike){
        this.aboutLike = aboutLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }

    public Boolean getCredentialsNonExpired(){
        return this.credentialsNonExpired;
    }
    public void setCredentialsNonExpired(Boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
    }
    public Boolean getEnabled(){
        return this.enabled;
    }
    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }
    public Boolean getAccountNonExpired(){
        return this.accountNonExpired;
    }
    public void setAccountNonExpired(Boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
    }
    public Boolean getAccountNonLocked(){
        return this.accountNonLocked;
    }
    public void setAccountNonLocked(Boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
    }
    public Boolean getPasswordChanged(){
        return this.passwordChanged;
    }
    public void setPasswordChanged(Boolean passwordChanged){
        this.passwordChanged = passwordChanged;
    }
    public String getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }
    public String getCreatedAtLike(){
        return this.createdAtLike;
    }
    public void setCreatedAtLike(String createdAtLike){
        this.createdAtLike = createdAtLike;
    }

    public String getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }
    public String getUpdatedAtLike(){
        return this.updatedAtLike;
    }
    public void setUpdatedAtLike(String updatedAtLike){
        this.updatedAtLike = updatedAtLike;
    }

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsernameLike(){
        return this.usernameLike;
    }
    public void setUsernameLike(String usernameLike){
        this.usernameLike = usernameLike;
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPasswordLike(){
        return this.passwordLike;
    }
    public void setPasswordLike(String passwordLike){
        this.passwordLike = passwordLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }


    public ParcoursCriteria getLevelMin(){
        return this.levelMin;
    }

    public void setLevelMin(ParcoursCriteria levelMin){
        this.levelMin = levelMin;
    }
    public List<ParcoursCriteria> getLevelMins(){
        return this.levelMins;
    }

    public void setLevelMins(List<ParcoursCriteria> levelMins){
        this.levelMins = levelMins;
    }
    public ParcoursCriteria getLevelMax(){
        return this.levelMax;
    }

    public void setLevelMax(ParcoursCriteria levelMax){
        this.levelMax = levelMax;
    }
    public List<ParcoursCriteria> getLevelMaxs(){
        return this.levelMaxs;
    }

    public void setLevelMaxs(List<ParcoursCriteria> levelMaxs){
        this.levelMaxs = levelMaxs;
    }
    public CategorieProfCriteria getCategorieProf(){
        return this.categorieProf;
    }

    public void setCategorieProf(CategorieProfCriteria categorieProf){
        this.categorieProf = categorieProf;
    }
    public List<CategorieProfCriteria> getCategorieProfs(){
        return this.categorieProfs;
    }

    public void setCategorieProfs(List<CategorieProfCriteria> categorieProfs){
        this.categorieProfs = categorieProfs;
    }
    public TypeTeacherCriteria getTypeTeacher(){
        return this.typeTeacher;
    }

    public void setTypeTeacher(TypeTeacherCriteria typeTeacher){
        this.typeTeacher = typeTeacher;
    }
    public List<TypeTeacherCriteria> getTypeTeachers(){
        return this.typeTeachers;
    }

    public void setTypeTeachers(List<TypeTeacherCriteria> typeTeachers){
        this.typeTeachers = typeTeachers;
    }
}
