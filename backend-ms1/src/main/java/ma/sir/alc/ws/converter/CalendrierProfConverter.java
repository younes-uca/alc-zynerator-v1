package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Prof;
import ma.sir.alc.bean.core.Etudiant;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.CalendrierProfHistory;
import ma.sir.alc.bean.core.CalendrierProf;
import ma.sir.alc.ws.dto.CalendrierProfDto;

@Component
public class CalendrierProfConverter extends AbstractConverter<CalendrierProf, CalendrierProfDto, CalendrierProfHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private ProfConverter profConverter ;
    private boolean prof;
    private boolean etudiant;

    public  CalendrierProfConverter(){
        super(CalendrierProf.class, CalendrierProfDto.class, CalendrierProfHistory.class);
    }

    @Override
    public CalendrierProf toItem(CalendrierProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        CalendrierProf item = new CalendrierProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getStartTime()))
                item.setStartTime(dto.getStartTime());
            if(StringUtil.isNotEmpty(dto.getEndTime()))
                item.setEndTime(dto.getEndTime());
            if(StringUtil.isNotEmpty(dto.getStartRecur()))
                item.setStartRecur(DateUtil.stringEnToDate(dto.getStartRecur()));
            if(StringUtil.isNotEmpty(dto.getEndRecur()))
                item.setEndRecur(DateUtil.stringEnToDate(dto.getEndRecur()));
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public CalendrierProfDto toDto(CalendrierProf item) {
        if (item == null) {
            return null;
        } else {
            CalendrierProfDto dto = new CalendrierProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getStartTime()))
                dto.setStartTime(item.getStartTime());
            if(StringUtil.isNotEmpty(item.getEndTime()))
                dto.setEndTime(item.getEndTime());
            if(item.getStartRecur()!=null)
                dto.setStartRecur(DateUtil.dateTimeToString(item.getStartRecur()));
            if(item.getEndRecur()!=null)
                dto.setEndRecur(DateUtil.dateTimeToString(item.getEndRecur()));
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.prof = value;
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
