package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.PriceHistory;
import ma.sir.alc.bean.core.Price;
import ma.sir.alc.ws.dto.PriceDto;

@Component
public class PriceConverter extends AbstractConverter<Price, PriceDto, PriceHistory> {


    public  PriceConverter(){
        super(Price.class, PriceDto.class, PriceHistory.class);
    }

    @Override
    public Price toItem(PriceDto dto) {
        if (dto == null) {
            return null;
        } else {
        Price item = new Price();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getPrice()))
                item.setPrice(dto.getPrice());
            if(StringUtil.isNotEmpty(dto.getOldPrice()))
                item.setOldPrice(dto.getOldPrice());
            if(StringUtil.isNotEmpty(dto.getLib()))
                item.setLib(dto.getLib());
            if(StringUtil.isNotEmpty(dto.getNreCourse()))
                item.setNreCourse(dto.getNreCourse());
            if(StringUtil.isNotEmpty(dto.getNreHours()))
                item.setNreHours(dto.getNreHours());
            if(StringUtil.isNotEmpty(dto.getNreMonth()))
                item.setNreMonth(dto.getNreMonth());
            if(dto.getForGroup() != null)
                item.setForGroup(dto.getForGroup());


        return item;
        }
    }

    @Override
    public PriceDto toDto(Price item) {
        if (item == null) {
            return null;
        } else {
            PriceDto dto = new PriceDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getPrice()))
                dto.setPrice(item.getPrice());
            if(StringUtil.isNotEmpty(item.getOldPrice()))
                dto.setOldPrice(item.getOldPrice());
            if(StringUtil.isNotEmpty(item.getLib()))
                dto.setLib(item.getLib());
            if(StringUtil.isNotEmpty(item.getNreCourse()))
                dto.setNreCourse(item.getNreCourse());
            if(StringUtil.isNotEmpty(item.getNreHours()))
                dto.setNreHours(item.getNreHours());
            if(StringUtil.isNotEmpty(item.getNreMonth()))
                dto.setNreMonth(item.getNreMonth());
                dto.setForGroup(item.getForGroup());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
