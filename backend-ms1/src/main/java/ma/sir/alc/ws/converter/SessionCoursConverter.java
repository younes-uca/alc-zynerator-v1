package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Prof;
import ma.sir.alc.bean.core.Cours;
import ma.sir.alc.bean.core.GroupeEtudiant;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.SessionCoursHistory;
import ma.sir.alc.bean.core.SessionCours;
import ma.sir.alc.ws.dto.SessionCoursDto;

@Component
public class SessionCoursConverter extends AbstractConverter<SessionCours, SessionCoursDto, SessionCoursHistory> {

    @Autowired
    private GroupeEtudiantConverter groupeEtudiantConverter ;
    @Autowired
    private CategorieSectionConverter categorieSectionConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private CoursConverter coursConverter ;
    @Autowired
    private SectionItemConverter sectionItemConverter ;
    @Autowired
    private SectionConverter sectionConverter ;
    @Autowired
    private SalaryConverter salaryConverter ;
    private boolean prof;
    private boolean cours;
    private boolean groupeEtudiant;
    private boolean salary;
    private boolean sections;

    public  SessionCoursConverter(){
        super(SessionCours.class, SessionCoursDto.class, SessionCoursHistory.class);
        init(true);
    }

    @Override
    public SessionCours toItem(SessionCoursDto dto) {
        if (dto == null) {
            return null;
        } else {
        SessionCours item = new SessionCours();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getDuree()))
                item.setDuree(dto.getDuree());
            if(StringUtil.isNotEmpty(dto.getTotalheure()))
                item.setTotalheure(dto.getTotalheure());
            if(StringUtil.isNotEmpty(dto.getMois()))
                item.setMois(dto.getMois());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(dto.getPayer() != null)
                item.setPayer(dto.getPayer());
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(dto.getCours() != null && dto.getCours().getId() != null){
                item.setCours(new Cours());
                item.getCours().setId(dto.getCours().getId());
            }

            if(dto.getGroupeEtudiant() != null && dto.getGroupeEtudiant().getId() != null){
                item.setGroupeEtudiant(new GroupeEtudiant());
                item.getGroupeEtudiant().setId(dto.getGroupeEtudiant().getId());
            }

            if(this.salary && dto.getSalary()!=null)
                item.setSalary(salaryConverter.toItem(dto.getSalary())) ;


            if(this.sections && ListUtil.isNotEmpty(dto.getSections()))
                item.setSections(sectionConverter.toItem(dto.getSections()));

        return item;
        }
    }

    @Override
    public SessionCoursDto toDto(SessionCours item) {
        if (item == null) {
            return null;
        } else {
            SessionCoursDto dto = new SessionCoursDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(StringUtil.isNotEmpty(item.getDuree()))
                dto.setDuree(item.getDuree());
            if(StringUtil.isNotEmpty(item.getTotalheure()))
                dto.setTotalheure(item.getTotalheure());
            if(StringUtil.isNotEmpty(item.getMois()))
                dto.setMois(item.getMois());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
                dto.setPayer(item.getPayer());
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.cours && item.getCours()!=null) {
            dto.setCours(coursConverter.toDto(item.getCours())) ;
        }
        if(this.groupeEtudiant && item.getGroupeEtudiant()!=null) {
            dto.setGroupeEtudiant(groupeEtudiantConverter.toDto(item.getGroupeEtudiant())) ;
        }
        if(this.salary && item.getSalary()!=null) {
            dto.setSalary(salaryConverter.toDto(item.getSalary())) ;
        }
        if(this.sections && ListUtil.isNotEmpty(item.getSections())){
            sectionConverter.init(true);
            sectionConverter.setSessionCours(false);
            dto.setSections(sectionConverter.toDto(item.getSections()));
            sectionConverter.setSessionCours(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.sections = value;
    }

    public void initObject(boolean value) {
        this.prof = value;
        this.cours = value;
        this.groupeEtudiant = value;
        this.salary = value;
    }


    public GroupeEtudiantConverter getGroupeEtudiantConverter(){
        return this.groupeEtudiantConverter;
    }
    public void setGroupeEtudiantConverter(GroupeEtudiantConverter groupeEtudiantConverter ){
        this.groupeEtudiantConverter = groupeEtudiantConverter;
    }
    public CategorieSectionConverter getCategorieSectionConverter(){
        return this.categorieSectionConverter;
    }
    public void setCategorieSectionConverter(CategorieSectionConverter categorieSectionConverter ){
        this.categorieSectionConverter = categorieSectionConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public CoursConverter getCoursConverter(){
        return this.coursConverter;
    }
    public void setCoursConverter(CoursConverter coursConverter ){
        this.coursConverter = coursConverter;
    }
    public SectionItemConverter getSectionItemConverter(){
        return this.sectionItemConverter;
    }
    public void setSectionItemConverter(SectionItemConverter sectionItemConverter ){
        this.sectionItemConverter = sectionItemConverter;
    }
    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public SalaryConverter getSalaryConverter(){
        return this.salaryConverter;
    }
    public void setSalaryConverter(SalaryConverter salaryConverter ){
        this.salaryConverter = salaryConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isCours(){
        return this.cours;
    }
    public void  setCours(boolean cours){
        this.cours = cours;
    }
    public boolean  isGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void  setGroupeEtudiant(boolean groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }
    public boolean  isSalary(){
        return this.salary;
    }
    public void  setSalary(boolean salary){
        this.salary = salary;
    }
    public boolean  isSections(){
        return this.sections ;
    }
    public void  setSections(boolean sections ){
        this.sections  = sections ;
    }
}
