package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverterEnhanced;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.TeacherLocalityHistory;
import ma.sir.alc.bean.core.TeacherLocality;
import ma.sir.alc.ws.dto.TeacherLocalityDto;

@Component
public class TeacherLocalityConverter extends AbstractConverterEnhanced<TeacherLocality, TeacherLocalityDto, TeacherLocalityHistory> {


    public  TeacherLocalityConverter(){
        super(TeacherLocality.class, TeacherLocalityDto.class, TeacherLocalityHistory.class);
    }

    @Override
    public TeacherLocality toItem(TeacherLocalityDto dto) {
        if (dto == null) {
            return null;
        } else {
        TeacherLocality item = new TeacherLocality();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        convertRefentielAttribute(dto, item);
        return item;
        }
    }

    @Override
    public TeacherLocalityDto toDto(TeacherLocality item) {
        if (item == null) {
            return null;
        } else {
            TeacherLocalityDto dto = new TeacherLocalityDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        convertRefentielAttribute(item, dto);
        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
