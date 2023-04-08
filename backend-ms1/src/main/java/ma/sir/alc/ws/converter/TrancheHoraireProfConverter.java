package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.TrancheHoraireProfHistory;
import ma.sir.alc.bean.core.TrancheHoraireProf;
import ma.sir.alc.ws.dto.TrancheHoraireProfDto;

@Component
public class TrancheHoraireProfConverter extends AbstractConverter<TrancheHoraireProf, TrancheHoraireProfDto, TrancheHoraireProfHistory> {

    @Autowired
    private ProfConverter profConverter ;
    private boolean prof;

    public  TrancheHoraireProfConverter(){
        super(TrancheHoraireProf.class, TrancheHoraireProfDto.class, TrancheHoraireProfHistory.class);
    }

    @Override
    public TrancheHoraireProf toItem(TrancheHoraireProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        TrancheHoraireProf item = new TrancheHoraireProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getStartHour()))
                item.setStartHour(dto.getStartHour());
            if(StringUtil.isNotEmpty(dto.getEndHour()))
                item.setEndHour(dto.getEndHour());
            if(StringUtil.isNotEmpty(dto.getDay()))
                item.setDay(dto.getDay());
            if(StringUtil.isNotEmpty(dto.getGroupIndex()))
                item.setGroupIndex(dto.getGroupIndex());
            if(StringUtil.isNotEmpty(dto.getProfsId()))
                item.setProfsId(dto.getProfsId());
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }



        return item;
        }
    }

    @Override
    public TrancheHoraireProfDto toDto(TrancheHoraireProf item) {
        if (item == null) {
            return null;
        } else {
            TrancheHoraireProfDto dto = new TrancheHoraireProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getStartHour()))
                dto.setStartHour(item.getStartHour());
            if(StringUtil.isNotEmpty(item.getEndHour()))
                dto.setEndHour(item.getEndHour());
            if(StringUtil.isNotEmpty(item.getDay()))
                dto.setDay(item.getDay());
            if(StringUtil.isNotEmpty(item.getGroupIndex()))
                dto.setGroupIndex(item.getGroupIndex());
            if(StringUtil.isNotEmpty(item.getProfsId()))
                dto.setProfsId(item.getProfsId());
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.prof = value;
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
}
