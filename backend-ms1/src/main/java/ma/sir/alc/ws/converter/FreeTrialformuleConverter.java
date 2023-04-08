package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.FreeTrialformuleHistory;
import ma.sir.alc.bean.core.FreeTrialformule;
import ma.sir.alc.ws.dto.FreeTrialformuleDto;

@Component
public class FreeTrialformuleConverter extends AbstractConverter<FreeTrialformule, FreeTrialformuleDto, FreeTrialformuleHistory> {

    @Autowired
    private InscriptionConverter inscriptionConverter ;
    private boolean inscription;

    public  FreeTrialformuleConverter(){
        super(FreeTrialformule.class, FreeTrialformuleDto.class, FreeTrialformuleHistory.class);
    }

    @Override
    public FreeTrialformule toItem(FreeTrialformuleDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialformule item = new FreeTrialformule();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDayspeerweek()))
                item.setDayspeerweek(dto.getDayspeerweek());
            if(StringUtil.isNotEmpty(dto.getTimeperday()))
                item.setTimeperday(dto.getTimeperday());
            if(StringUtil.isNotEmpty(dto.getTeacherGenderoption()))
                item.setTeacherGenderoption(dto.getTeacherGenderoption());
            if(StringUtil.isNotEmpty(dto.getTeacherAgeRange()))
                item.setTeacherAgeRange(dto.getTeacherAgeRange());
            if(StringUtil.isNotEmpty(dto.getTeacherPersonnality()))
                item.setTeacherPersonnality(dto.getTeacherPersonnality());
            if(dto.getStatus() != null)
                item.setStatus(dto.getStatus());
            if(StringUtil.isNotEmpty(dto.getDateConfirmation()))
                item.setDateConfirmation(DateUtil.stringEnToDate(dto.getDateConfirmation()));
            if(this.inscription && dto.getInscription()!=null)
                item.setInscription(inscriptionConverter.toItem(dto.getInscription())) ;



        return item;
        }
    }

    @Override
    public FreeTrialformuleDto toDto(FreeTrialformule item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialformuleDto dto = new FreeTrialformuleDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getDayspeerweek()))
                dto.setDayspeerweek(item.getDayspeerweek());
            if(StringUtil.isNotEmpty(item.getTimeperday()))
                dto.setTimeperday(item.getTimeperday());
            if(StringUtil.isNotEmpty(item.getTeacherGenderoption()))
                dto.setTeacherGenderoption(item.getTeacherGenderoption());
            if(StringUtil.isNotEmpty(item.getTeacherAgeRange()))
                dto.setTeacherAgeRange(item.getTeacherAgeRange());
            if(StringUtil.isNotEmpty(item.getTeacherPersonnality()))
                dto.setTeacherPersonnality(item.getTeacherPersonnality());
                dto.setStatus(item.getStatus());
            if(item.getDateConfirmation()!=null)
                dto.setDateConfirmation(DateUtil.dateTimeToString(item.getDateConfirmation()));
        if(this.inscription && item.getInscription()!=null) {
            dto.setInscription(inscriptionConverter.toDto(item.getInscription())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.inscription = value;
    }


    public InscriptionConverter getInscriptionConverter(){
        return this.inscriptionConverter;
    }
    public void setInscriptionConverter(InscriptionConverter inscriptionConverter ){
        this.inscriptionConverter = inscriptionConverter;
    }
    public boolean  isInscription(){
        return this.inscription;
    }
    public void  setInscription(boolean inscription){
        this.inscription = inscription;
    }
}
