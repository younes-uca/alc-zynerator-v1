package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.StatutSocialHistory;
import ma.sir.alc.bean.core.StatutSocial;
import ma.sir.alc.ws.dto.StatutSocialDto;

@Component
public class StatutSocialConverter extends AbstractConverter<StatutSocial, StatutSocialDto, StatutSocialHistory> {


    public  StatutSocialConverter(){
        super(StatutSocial.class, StatutSocialDto.class, StatutSocialHistory.class);
    }

    @Override
    public StatutSocial toItem(StatutSocialDto dto) {
        if (dto == null) {
            return null;
        } else {
        StatutSocial item = new StatutSocial();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public StatutSocialDto toDto(StatutSocial item) {
        if (item == null) {
            return null;
        } else {
            StatutSocialDto dto = new StatutSocialDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
