package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Parcours;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.EtudiantHistory;
import ma.sir.alc.bean.core.Etudiant;
import ma.sir.alc.ws.dto.EtudiantDto;

@Component
public class EtudiantConverter extends AbstractConverter<Etudiant, EtudiantDto, EtudiantHistory> {

    @Autowired
    private GroupeEtudiantConverter groupeEtudiantConverter ;
    @Autowired
    private StatutSocialConverter statutSocialConverter ;
    @Autowired
    private EtatEtudiantScheduleConverter etatEtudiantScheduleConverter ;
    @Autowired
    private ParcoursConverter parcoursConverter ;
    @Autowired
    private GroupeEtudeConverter groupeEtudeConverter ;
    @Autowired
    private GroupeEtudiantDetailConverter groupeEtudiantDetailConverter ;
    @Autowired
    private LangueConverter langueConverter ;
    @Autowired
    private QuizConverter quizConverter ;
    @Autowired
    private ReponseEtudiantConverter reponseEtudiantConverter ;
    @Autowired
    private NiveauEtudeConverter niveauEtudeConverter ;
    @Autowired
    private FonctionConverter fonctionConverter ;
    @Autowired
    private QuizEtudiantConverter quizEtudiantConverter ;
    @Autowired
    private SkillConverter skillConverter ;
    @Autowired
    private TeacherLocalityConverter teacherLocalityConverter ;
    @Autowired
    private InteretEtudiantConverter interetEtudiantConverter ;
    @Autowired
    private PackStudentConverter packStudentConverter ;
    private boolean teacherLocality;
    private boolean etatEtudiantSchedule;
    private boolean parcours;
    private boolean groupeEtude;
    private boolean packStudent;
    private boolean statutSocial;
    private boolean interetEtudiant;
    private boolean niveauEtude;
    private boolean skill;
    private boolean fonction;
    private boolean langue;
    private boolean quizEtudiants;
    private boolean groupeEtudiantDetails;

    public  EtudiantConverter(){
        super(Etudiant.class, EtudiantDto.class, EtudiantHistory.class);
        init(true);
    }

    @Override
    public Etudiant toItem(EtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        Etudiant item = new Etudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getGroupOption()))
                item.setGroupOption(dto.getGroupOption());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(this.teacherLocality && dto.getTeacherLocality()!=null)
                item.setTeacherLocality(teacherLocalityConverter.toItem(dto.getTeacherLocality())) ;

            if(this.etatEtudiantSchedule && dto.getEtatEtudiantSchedule()!=null)
                item.setEtatEtudiantSchedule(etatEtudiantScheduleConverter.toItem(dto.getEtatEtudiantSchedule())) ;

            if(dto.getParcours() != null && dto.getParcours().getId() != null){
                item.setParcours(new Parcours());
                item.getParcours().setId(dto.getParcours().getId());
            }

            if(this.groupeEtude && dto.getGroupeEtude()!=null)
                item.setGroupeEtude(groupeEtudeConverter.toItem(dto.getGroupeEtude())) ;

            if(this.packStudent && dto.getPackStudent()!=null)
                item.setPackStudent(packStudentConverter.toItem(dto.getPackStudent())) ;

            if(this.statutSocial && dto.getStatutSocial()!=null)
                item.setStatutSocial(statutSocialConverter.toItem(dto.getStatutSocial())) ;

            if(this.interetEtudiant && dto.getInteretEtudiant()!=null)
                item.setInteretEtudiant(interetEtudiantConverter.toItem(dto.getInteretEtudiant())) ;

            if(this.niveauEtude && dto.getNiveauEtude()!=null)
                item.setNiveauEtude(niveauEtudeConverter.toItem(dto.getNiveauEtude())) ;

            if(this.skill && dto.getSkill()!=null)
                item.setSkill(skillConverter.toItem(dto.getSkill())) ;

            if(this.fonction && dto.getFonction()!=null)
                item.setFonction(fonctionConverter.toItem(dto.getFonction())) ;

            if(this.langue && dto.getLangue()!=null)
                item.setLangue(langueConverter.toItem(dto.getLangue())) ;


            if(this.quizEtudiants && ListUtil.isNotEmpty(dto.getQuizEtudiants()))
                item.setQuizEtudiants(quizEtudiantConverter.toItem(dto.getQuizEtudiants()));
            if(this.groupeEtudiantDetails && ListUtil.isNotEmpty(dto.getGroupeEtudiantDetails()))
                item.setGroupeEtudiantDetails(groupeEtudiantDetailConverter.toItem(dto.getGroupeEtudiantDetails()));

        return item;
        }
    }

    @Override
    public EtudiantDto toDto(Etudiant item) {
        if (item == null) {
            return null;
        } else {
            EtudiantDto dto = new EtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getGroupOption()))
                dto.setGroupOption(item.getGroupOption());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
        if(this.teacherLocality && item.getTeacherLocality()!=null) {
            dto.setTeacherLocality(teacherLocalityConverter.toDto(item.getTeacherLocality())) ;
        }
        if(this.etatEtudiantSchedule && item.getEtatEtudiantSchedule()!=null) {
            dto.setEtatEtudiantSchedule(etatEtudiantScheduleConverter.toDto(item.getEtatEtudiantSchedule())) ;
        }
        if(this.parcours && item.getParcours()!=null) {
            dto.setParcours(parcoursConverter.toDto(item.getParcours())) ;
        }
        if(this.groupeEtude && item.getGroupeEtude()!=null) {
            dto.setGroupeEtude(groupeEtudeConverter.toDto(item.getGroupeEtude())) ;
        }
        if(this.packStudent && item.getPackStudent()!=null) {
            dto.setPackStudent(packStudentConverter.toDto(item.getPackStudent())) ;
        }
        if(this.statutSocial && item.getStatutSocial()!=null) {
            dto.setStatutSocial(statutSocialConverter.toDto(item.getStatutSocial())) ;
        }
        if(this.interetEtudiant && item.getInteretEtudiant()!=null) {
            dto.setInteretEtudiant(interetEtudiantConverter.toDto(item.getInteretEtudiant())) ;
        }
        if(this.niveauEtude && item.getNiveauEtude()!=null) {
            dto.setNiveauEtude(niveauEtudeConverter.toDto(item.getNiveauEtude())) ;
        }
        if(this.skill && item.getSkill()!=null) {
            dto.setSkill(skillConverter.toDto(item.getSkill())) ;
        }
        if(this.fonction && item.getFonction()!=null) {
            dto.setFonction(fonctionConverter.toDto(item.getFonction())) ;
        }
        if(this.langue && item.getLangue()!=null) {
            dto.setLangue(langueConverter.toDto(item.getLangue())) ;
        }
        if(this.quizEtudiants && ListUtil.isNotEmpty(item.getQuizEtudiants())){
            quizEtudiantConverter.init(true);
            quizEtudiantConverter.setEtudiant(false);
            dto.setQuizEtudiants(quizEtudiantConverter.toDto(item.getQuizEtudiants()));
            quizEtudiantConverter.setEtudiant(true);

        }
        if(this.groupeEtudiantDetails && ListUtil.isNotEmpty(item.getGroupeEtudiantDetails())){
            groupeEtudiantDetailConverter.init(true);
            groupeEtudiantDetailConverter.setEtudiant(false);
            dto.setGroupeEtudiantDetails(groupeEtudiantDetailConverter.toDto(item.getGroupeEtudiantDetails()));
            groupeEtudiantDetailConverter.setEtudiant(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.quizEtudiants = value;
        this.groupeEtudiantDetails = value;
    }

    public void initObject(boolean value) {
        this.teacherLocality = value;
        this.etatEtudiantSchedule = value;
        this.parcours = value;
        this.groupeEtude = value;
        this.packStudent = value;
        this.statutSocial = value;
        this.interetEtudiant = value;
        this.niveauEtude = value;
        this.skill = value;
        this.fonction = value;
        this.langue = value;
    }


    public GroupeEtudiantConverter getGroupeEtudiantConverter(){
        return this.groupeEtudiantConverter;
    }
    public void setGroupeEtudiantConverter(GroupeEtudiantConverter groupeEtudiantConverter ){
        this.groupeEtudiantConverter = groupeEtudiantConverter;
    }
    public StatutSocialConverter getStatutSocialConverter(){
        return this.statutSocialConverter;
    }
    public void setStatutSocialConverter(StatutSocialConverter statutSocialConverter ){
        this.statutSocialConverter = statutSocialConverter;
    }
    public EtatEtudiantScheduleConverter getEtatEtudiantScheduleConverter(){
        return this.etatEtudiantScheduleConverter;
    }
    public void setEtatEtudiantScheduleConverter(EtatEtudiantScheduleConverter etatEtudiantScheduleConverter ){
        this.etatEtudiantScheduleConverter = etatEtudiantScheduleConverter;
    }
    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public GroupeEtudeConverter getGroupeEtudeConverter(){
        return this.groupeEtudeConverter;
    }
    public void setGroupeEtudeConverter(GroupeEtudeConverter groupeEtudeConverter ){
        this.groupeEtudeConverter = groupeEtudeConverter;
    }
    public GroupeEtudiantDetailConverter getGroupeEtudiantDetailConverter(){
        return this.groupeEtudiantDetailConverter;
    }
    public void setGroupeEtudiantDetailConverter(GroupeEtudiantDetailConverter groupeEtudiantDetailConverter ){
        this.groupeEtudiantDetailConverter = groupeEtudiantDetailConverter;
    }
    public LangueConverter getLangueConverter(){
        return this.langueConverter;
    }
    public void setLangueConverter(LangueConverter langueConverter ){
        this.langueConverter = langueConverter;
    }
    public QuizConverter getQuizConverter(){
        return this.quizConverter;
    }
    public void setQuizConverter(QuizConverter quizConverter ){
        this.quizConverter = quizConverter;
    }
    public ReponseEtudiantConverter getReponseEtudiantConverter(){
        return this.reponseEtudiantConverter;
    }
    public void setReponseEtudiantConverter(ReponseEtudiantConverter reponseEtudiantConverter ){
        this.reponseEtudiantConverter = reponseEtudiantConverter;
    }
    public NiveauEtudeConverter getNiveauEtudeConverter(){
        return this.niveauEtudeConverter;
    }
    public void setNiveauEtudeConverter(NiveauEtudeConverter niveauEtudeConverter ){
        this.niveauEtudeConverter = niveauEtudeConverter;
    }
    public FonctionConverter getFonctionConverter(){
        return this.fonctionConverter;
    }
    public void setFonctionConverter(FonctionConverter fonctionConverter ){
        this.fonctionConverter = fonctionConverter;
    }
    public QuizEtudiantConverter getQuizEtudiantConverter(){
        return this.quizEtudiantConverter;
    }
    public void setQuizEtudiantConverter(QuizEtudiantConverter quizEtudiantConverter ){
        this.quizEtudiantConverter = quizEtudiantConverter;
    }
    public SkillConverter getSkillConverter(){
        return this.skillConverter;
    }
    public void setSkillConverter(SkillConverter skillConverter ){
        this.skillConverter = skillConverter;
    }
    public TeacherLocalityConverter getTeacherLocalityConverter(){
        return this.teacherLocalityConverter;
    }
    public void setTeacherLocalityConverter(TeacherLocalityConverter teacherLocalityConverter ){
        this.teacherLocalityConverter = teacherLocalityConverter;
    }
    public InteretEtudiantConverter getInteretEtudiantConverter(){
        return this.interetEtudiantConverter;
    }
    public void setInteretEtudiantConverter(InteretEtudiantConverter interetEtudiantConverter ){
        this.interetEtudiantConverter = interetEtudiantConverter;
    }
    public PackStudentConverter getPackStudentConverter(){
        return this.packStudentConverter;
    }
    public void setPackStudentConverter(PackStudentConverter packStudentConverter ){
        this.packStudentConverter = packStudentConverter;
    }
    public boolean  isTeacherLocality(){
        return this.teacherLocality;
    }
    public void  setTeacherLocality(boolean teacherLocality){
        this.teacherLocality = teacherLocality;
    }
    public boolean  isEtatEtudiantSchedule(){
        return this.etatEtudiantSchedule;
    }
    public void  setEtatEtudiantSchedule(boolean etatEtudiantSchedule){
        this.etatEtudiantSchedule = etatEtudiantSchedule;
    }
    public boolean  isParcours(){
        return this.parcours;
    }
    public void  setParcours(boolean parcours){
        this.parcours = parcours;
    }
    public boolean  isGroupeEtude(){
        return this.groupeEtude;
    }
    public void  setGroupeEtude(boolean groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    public boolean  isPackStudent(){
        return this.packStudent;
    }
    public void  setPackStudent(boolean packStudent){
        this.packStudent = packStudent;
    }
    public boolean  isStatutSocial(){
        return this.statutSocial;
    }
    public void  setStatutSocial(boolean statutSocial){
        this.statutSocial = statutSocial;
    }
    public boolean  isInteretEtudiant(){
        return this.interetEtudiant;
    }
    public void  setInteretEtudiant(boolean interetEtudiant){
        this.interetEtudiant = interetEtudiant;
    }
    public boolean  isNiveauEtude(){
        return this.niveauEtude;
    }
    public void  setNiveauEtude(boolean niveauEtude){
        this.niveauEtude = niveauEtude;
    }
    public boolean  isSkill(){
        return this.skill;
    }
    public void  setSkill(boolean skill){
        this.skill = skill;
    }
    public boolean  isFonction(){
        return this.fonction;
    }
    public void  setFonction(boolean fonction){
        this.fonction = fonction;
    }
    public boolean  isLangue(){
        return this.langue;
    }
    public void  setLangue(boolean langue){
        this.langue = langue;
    }
    public boolean  isQuizEtudiants(){
        return this.quizEtudiants ;
    }
    public void  setQuizEtudiants(boolean quizEtudiants ){
        this.quizEtudiants  = quizEtudiants ;
    }
    public boolean  isGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails ;
    }
    public void  setGroupeEtudiantDetails(boolean groupeEtudiantDetails ){
        this.groupeEtudiantDetails  = groupeEtudiantDetails ;
    }
}
