package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverterEnhanced;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ServicesHistory;
import ma.sir.alc.bean.core.Services;
import ma.sir.alc.ws.dto.ServicesDto;

@Component
public class ServicesConverter extends AbstractConverterEnhanced<Services, ServicesDto, ServicesHistory> {


    public  ServicesConverter(){
        super(Services.class, ServicesDto.class, ServicesHistory.class);
    }

    @Override
    public Services toItem(ServicesDto dto) {
        if (dto == null) {
            return null;
        } else {
        Services item = new Services();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


        convertRefentielAttribute(dto, item);
        return item;
        }
    }

    @Override
    public ServicesDto toDto(Services item) {
        if (item == null) {
            return null;
        } else {
            ServicesDto dto = new ServicesDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());


        convertRefentielAttribute(item, dto);
        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
