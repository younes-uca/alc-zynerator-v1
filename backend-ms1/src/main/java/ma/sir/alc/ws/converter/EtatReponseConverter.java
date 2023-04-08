package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.EtatReponseHistory;
import ma.sir.alc.bean.core.EtatReponse;
import ma.sir.alc.ws.dto.EtatReponseDto;

@Component
public class EtatReponseConverter extends AbstractConverter<EtatReponse, EtatReponseDto, EtatReponseHistory> {


    public  EtatReponseConverter(){
        super(EtatReponse.class, EtatReponseDto.class, EtatReponseHistory.class);
    }

    @Override
    public EtatReponse toItem(EtatReponseDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatReponse item = new EtatReponse();
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
    public EtatReponseDto toDto(EtatReponse item) {
        if (item == null) {
            return null;
        } else {
            EtatReponseDto dto = new EtatReponseDto();
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
