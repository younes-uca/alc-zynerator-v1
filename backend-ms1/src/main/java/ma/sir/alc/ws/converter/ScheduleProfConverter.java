package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.GroupeEtudiant;
import ma.sir.alc.bean.core.Prof;
import ma.sir.alc.bean.core.Cours;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ScheduleProfHistory;
import ma.sir.alc.bean.core.ScheduleProf;
import ma.sir.alc.ws.dto.ScheduleProfDto;

@Component
public class ScheduleProfConverter extends AbstractConverter<ScheduleProf, ScheduleProfDto, ScheduleProfHistory> {

    @Autowired
    private GroupeEtudiantConverter groupeEtudiantConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private CoursConverter coursConverter ;
    private boolean groupeEtudiant;
    private boolean prof;
    private boolean cours;

    public  ScheduleProfConverter(){
        super(ScheduleProf.class, ScheduleProfDto.class, ScheduleProfHistory.class);
    }

    @Override
    public ScheduleProf toItem(ScheduleProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        ScheduleProf item = new ScheduleProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getSubject()))
                item.setSubject(dto.getSubject());
            if(StringUtil.isNotEmpty(dto.getStartTime()))
                item.setStartTime(DateUtil.stringEnToDate(dto.getStartTime()));
            if(StringUtil.isNotEmpty(dto.getEndTime()))
                item.setEndTime(DateUtil.stringEnToDate(dto.getEndTime()));
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getGrpName()))
                item.setGrpName(dto.getGrpName());
            if(StringUtil.isNotEmpty(dto.getProfName()))
                item.setProfName(dto.getProfName());
            if(StringUtil.isNotEmpty(dto.getProfsId()))
                item.setProfsId(dto.getProfsId());
            if(dto.getGroupeEtudiant() != null && dto.getGroupeEtudiant().getId() != null){
                item.setGroupeEtudiant(new GroupeEtudiant());
                item.getGroupeEtudiant().setId(dto.getGroupeEtudiant().getId());
            }

            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(dto.getCours() != null && dto.getCours().getId() != null){
                item.setCours(new Cours());
                item.getCours().setId(dto.getCours().getId());
            }



        return item;
        }
    }

    @Override
    public ScheduleProfDto toDto(ScheduleProf item) {
        if (item == null) {
            return null;
        } else {
            ScheduleProfDto dto = new ScheduleProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getSubject()))
                dto.setSubject(item.getSubject());
            if(item.getStartTime()!=null)
                dto.setStartTime(DateUtil.dateTimeToString(item.getStartTime()));
            if(item.getEndTime()!=null)
                dto.setEndTime(DateUtil.dateTimeToString(item.getEndTime()));
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getGrpName()))
                dto.setGrpName(item.getGrpName());
            if(StringUtil.isNotEmpty(item.getProfName()))
                dto.setProfName(item.getProfName());
            if(StringUtil.isNotEmpty(item.getProfsId()))
                dto.setProfsId(item.getProfsId());
        if(this.groupeEtudiant && item.getGroupeEtudiant()!=null) {
            dto.setGroupeEtudiant(groupeEtudiantConverter.toDto(item.getGroupeEtudiant())) ;
        }
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.cours && item.getCours()!=null) {
            dto.setCours(coursConverter.toDto(item.getCours())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.groupeEtudiant = value;
        this.prof = value;
        this.cours = value;
    }


    public GroupeEtudiantConverter getGroupeEtudiantConverter(){
        return this.groupeEtudiantConverter;
    }
    public void setGroupeEtudiantConverter(GroupeEtudiantConverter groupeEtudiantConverter ){
        this.groupeEtudiantConverter = groupeEtudiantConverter;
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
    public boolean  isGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void  setGroupeEtudiant(boolean groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
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
}
