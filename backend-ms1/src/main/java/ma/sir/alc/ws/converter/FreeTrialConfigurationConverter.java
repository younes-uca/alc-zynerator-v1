package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.FreeTrialConfigurationHistory;
import ma.sir.alc.bean.core.FreeTrialConfiguration;
import ma.sir.alc.ws.dto.FreeTrialConfigurationDto;

@Component
public class FreeTrialConfigurationConverter extends AbstractConverter<FreeTrialConfiguration, FreeTrialConfigurationDto, FreeTrialConfigurationHistory> {


    public  FreeTrialConfigurationConverter(){
        super(FreeTrialConfiguration.class, FreeTrialConfigurationDto.class, FreeTrialConfigurationHistory.class);
    }

    @Override
    public FreeTrialConfiguration toItem(FreeTrialConfigurationDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialConfiguration item = new FreeTrialConfiguration();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateApplicationDebut()))
                item.setDateApplicationDebut(DateUtil.stringEnToDate(dto.getDateApplicationDebut()));
            if(StringUtil.isNotEmpty(dto.getDateApplicationFin()))
                item.setDateApplicationFin(DateUtil.stringEnToDate(dto.getDateApplicationFin()));
            if(StringUtil.isNotEmpty(dto.getNombreStudentMax()))
                item.setNombreStudentMax(dto.getNombreStudentMax());
            if(StringUtil.isNotEmpty(dto.getNombreStudentMin()))
                item.setNombreStudentMin(dto.getNombreStudentMin());


        return item;
        }
    }

    @Override
    public FreeTrialConfigurationDto toDto(FreeTrialConfiguration item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialConfigurationDto dto = new FreeTrialConfigurationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateApplicationDebut()!=null)
                dto.setDateApplicationDebut(DateUtil.dateTimeToString(item.getDateApplicationDebut()));
            if(item.getDateApplicationFin()!=null)
                dto.setDateApplicationFin(DateUtil.dateTimeToString(item.getDateApplicationFin()));
            if(StringUtil.isNotEmpty(item.getNombreStudentMax()))
                dto.setNombreStudentMax(item.getNombreStudentMax());
            if(StringUtil.isNotEmpty(item.getNombreStudentMin()))
                dto.setNombreStudentMin(item.getNombreStudentMin());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
