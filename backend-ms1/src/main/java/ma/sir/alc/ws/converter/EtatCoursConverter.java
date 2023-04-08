package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.EtatCoursHistory;
import ma.sir.alc.bean.core.EtatCours;
import ma.sir.alc.ws.dto.EtatCoursDto;

@Component
public class EtatCoursConverter extends AbstractConverter<EtatCours, EtatCoursDto, EtatCoursHistory> {


    public  EtatCoursConverter(){
        super(EtatCours.class, EtatCoursDto.class, EtatCoursHistory.class);
    }

    @Override
    public EtatCours toItem(EtatCoursDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatCours item = new EtatCours();
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
    public EtatCoursDto toDto(EtatCours item) {
        if (item == null) {
            return null;
        } else {
            EtatCoursDto dto = new EtatCoursDto();
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
