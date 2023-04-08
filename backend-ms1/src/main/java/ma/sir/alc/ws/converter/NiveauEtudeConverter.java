package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.NiveauEtudeHistory;
import ma.sir.alc.bean.core.NiveauEtude;
import ma.sir.alc.ws.dto.NiveauEtudeDto;

@Component
public class NiveauEtudeConverter extends AbstractConverter<NiveauEtude, NiveauEtudeDto, NiveauEtudeHistory> {


    public  NiveauEtudeConverter(){
        super(NiveauEtude.class, NiveauEtudeDto.class, NiveauEtudeHistory.class);
    }

    @Override
    public NiveauEtude toItem(NiveauEtudeDto dto) {
        if (dto == null) {
            return null;
        } else {
        NiveauEtude item = new NiveauEtude();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());


        return item;
        }
    }

    @Override
    public NiveauEtudeDto toDto(NiveauEtude item) {
        if (item == null) {
            return null;
        } else {
            NiveauEtudeDto dto = new NiveauEtudeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
