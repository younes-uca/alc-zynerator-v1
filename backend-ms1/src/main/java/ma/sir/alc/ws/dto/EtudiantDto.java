package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtudiantDto  extends AuditBaseDto {

    private String ref  ;
    private String groupOption  ;
    private String email  ;

    private TeacherLocalityDto teacherLocality ;
    private EtatEtudiantScheduleDto etatEtudiantSchedule ;
    private ParcoursDto parcours ;
    private GroupeEtudeDto groupeEtude ;
    private PackStudentDto packStudent ;
    private StatutSocialDto statutSocial ;
    private InteretEtudiantDto interetEtudiant ;
    private NiveauEtudeDto niveauEtude ;
    private SkillDto skill ;
    private FonctionDto fonction ;
    private LangueDto langue ;

    private List<QuizEtudiantDto> quizEtudiants ;
    private List<GroupeEtudiantDetailDto> groupeEtudiantDetails ;


    public EtudiantDto(){
        super();
    }



    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }

    @Log
    public String getGroupOption(){
        return this.groupOption;
    }
    public void setGroupOption(String groupOption){
        this.groupOption = groupOption;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }


    public TeacherLocalityDto getTeacherLocality(){
        return this.teacherLocality;
    }

    public void setTeacherLocality(TeacherLocalityDto teacherLocality){
        this.teacherLocality = teacherLocality;
    }
    public EtatEtudiantScheduleDto getEtatEtudiantSchedule(){
        return this.etatEtudiantSchedule;
    }

    public void setEtatEtudiantSchedule(EtatEtudiantScheduleDto etatEtudiantSchedule){
        this.etatEtudiantSchedule = etatEtudiantSchedule;
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
    public PackStudentDto getPackStudent(){
        return this.packStudent;
    }

    public void setPackStudent(PackStudentDto packStudent){
        this.packStudent = packStudent;
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
    public SkillDto getSkill(){
        return this.skill;
    }

    public void setSkill(SkillDto skill){
        this.skill = skill;
    }
    public FonctionDto getFonction(){
        return this.fonction;
    }

    public void setFonction(FonctionDto fonction){
        this.fonction = fonction;
    }
    public LangueDto getLangue(){
        return this.langue;
    }

    public void setLangue(LangueDto langue){
        this.langue = langue;
    }



    public List<QuizEtudiantDto> getQuizEtudiants(){
        return this.quizEtudiants;
    }

    public void setQuizEtudiants(List<QuizEtudiantDto> quizEtudiants){
        this.quizEtudiants = quizEtudiants;
    }
    public List<GroupeEtudiantDetailDto> getGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails;
    }

    public void setGroupeEtudiantDetails(List<GroupeEtudiantDetailDto> groupeEtudiantDetails){
        this.groupeEtudiantDetails = groupeEtudiantDetails;
    }

}
