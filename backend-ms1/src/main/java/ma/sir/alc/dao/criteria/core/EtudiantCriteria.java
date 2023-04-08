package  ma.sir.alc.dao.criteria.core;


import ma.sir.alc.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EtudiantCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String groupOption;
    private String groupOptionLike;
    private String email;
    private String emailLike;

    private TeacherLocalityCriteria teacherLocality ;
    private List<TeacherLocalityCriteria> teacherLocalitys ;
    private EtatEtudiantScheduleCriteria etatEtudiantSchedule ;
    private List<EtatEtudiantScheduleCriteria> etatEtudiantSchedules ;
    private ParcoursCriteria parcours ;
    private List<ParcoursCriteria> parcourss ;
    private GroupeEtudeCriteria groupeEtude ;
    private List<GroupeEtudeCriteria> groupeEtudes ;
    private PackStudentCriteria packStudent ;
    private List<PackStudentCriteria> packStudents ;
    private StatutSocialCriteria statutSocial ;
    private List<StatutSocialCriteria> statutSocials ;
    private InteretEtudiantCriteria interetEtudiant ;
    private List<InteretEtudiantCriteria> interetEtudiants ;
    private NiveauEtudeCriteria niveauEtude ;
    private List<NiveauEtudeCriteria> niveauEtudes ;
    private SkillCriteria skill ;
    private List<SkillCriteria> skills ;
    private FonctionCriteria fonction ;
    private List<FonctionCriteria> fonctions ;
    private LangueCriteria langue ;
    private List<LangueCriteria> langues ;


    public EtudiantCriteria(){}

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

    public String getGroupOption(){
        return this.groupOption;
    }
    public void setGroupOption(String groupOption){
        this.groupOption = groupOption;
    }
    public String getGroupOptionLike(){
        return this.groupOptionLike;
    }
    public void setGroupOptionLike(String groupOptionLike){
        this.groupOptionLike = groupOptionLike;
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


    public TeacherLocalityCriteria getTeacherLocality(){
        return this.teacherLocality;
    }

    public void setTeacherLocality(TeacherLocalityCriteria teacherLocality){
        this.teacherLocality = teacherLocality;
    }
    public List<TeacherLocalityCriteria> getTeacherLocalitys(){
        return this.teacherLocalitys;
    }

    public void setTeacherLocalitys(List<TeacherLocalityCriteria> teacherLocalitys){
        this.teacherLocalitys = teacherLocalitys;
    }
    public EtatEtudiantScheduleCriteria getEtatEtudiantSchedule(){
        return this.etatEtudiantSchedule;
    }

    public void setEtatEtudiantSchedule(EtatEtudiantScheduleCriteria etatEtudiantSchedule){
        this.etatEtudiantSchedule = etatEtudiantSchedule;
    }
    public List<EtatEtudiantScheduleCriteria> getEtatEtudiantSchedules(){
        return this.etatEtudiantSchedules;
    }

    public void setEtatEtudiantSchedules(List<EtatEtudiantScheduleCriteria> etatEtudiantSchedules){
        this.etatEtudiantSchedules = etatEtudiantSchedules;
    }
    public ParcoursCriteria getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursCriteria parcours){
        this.parcours = parcours;
    }
    public List<ParcoursCriteria> getParcourss(){
        return this.parcourss;
    }

    public void setParcourss(List<ParcoursCriteria> parcourss){
        this.parcourss = parcourss;
    }
    public GroupeEtudeCriteria getGroupeEtude(){
        return this.groupeEtude;
    }

    public void setGroupeEtude(GroupeEtudeCriteria groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    public List<GroupeEtudeCriteria> getGroupeEtudes(){
        return this.groupeEtudes;
    }

    public void setGroupeEtudes(List<GroupeEtudeCriteria> groupeEtudes){
        this.groupeEtudes = groupeEtudes;
    }
    public PackStudentCriteria getPackStudent(){
        return this.packStudent;
    }

    public void setPackStudent(PackStudentCriteria packStudent){
        this.packStudent = packStudent;
    }
    public List<PackStudentCriteria> getPackStudents(){
        return this.packStudents;
    }

    public void setPackStudents(List<PackStudentCriteria> packStudents){
        this.packStudents = packStudents;
    }
    public StatutSocialCriteria getStatutSocial(){
        return this.statutSocial;
    }

    public void setStatutSocial(StatutSocialCriteria statutSocial){
        this.statutSocial = statutSocial;
    }
    public List<StatutSocialCriteria> getStatutSocials(){
        return this.statutSocials;
    }

    public void setStatutSocials(List<StatutSocialCriteria> statutSocials){
        this.statutSocials = statutSocials;
    }
    public InteretEtudiantCriteria getInteretEtudiant(){
        return this.interetEtudiant;
    }

    public void setInteretEtudiant(InteretEtudiantCriteria interetEtudiant){
        this.interetEtudiant = interetEtudiant;
    }
    public List<InteretEtudiantCriteria> getInteretEtudiants(){
        return this.interetEtudiants;
    }

    public void setInteretEtudiants(List<InteretEtudiantCriteria> interetEtudiants){
        this.interetEtudiants = interetEtudiants;
    }
    public NiveauEtudeCriteria getNiveauEtude(){
        return this.niveauEtude;
    }

    public void setNiveauEtude(NiveauEtudeCriteria niveauEtude){
        this.niveauEtude = niveauEtude;
    }
    public List<NiveauEtudeCriteria> getNiveauEtudes(){
        return this.niveauEtudes;
    }

    public void setNiveauEtudes(List<NiveauEtudeCriteria> niveauEtudes){
        this.niveauEtudes = niveauEtudes;
    }
    public SkillCriteria getSkill(){
        return this.skill;
    }

    public void setSkill(SkillCriteria skill){
        this.skill = skill;
    }
    public List<SkillCriteria> getSkills(){
        return this.skills;
    }

    public void setSkills(List<SkillCriteria> skills){
        this.skills = skills;
    }
    public FonctionCriteria getFonction(){
        return this.fonction;
    }

    public void setFonction(FonctionCriteria fonction){
        this.fonction = fonction;
    }
    public List<FonctionCriteria> getFonctions(){
        return this.fonctions;
    }

    public void setFonctions(List<FonctionCriteria> fonctions){
        this.fonctions = fonctions;
    }
    public LangueCriteria getLangue(){
        return this.langue;
    }

    public void setLangue(LangueCriteria langue){
        this.langue = langue;
    }
    public List<LangueCriteria> getLangues(){
        return this.langues;
    }

    public void setLangues(List<LangueCriteria> langues){
        this.langues = langues;
    }
}
