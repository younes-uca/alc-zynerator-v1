package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.SkillHistory;
import ma.sir.alc.bean.core.Skill;
import ma.sir.alc.ws.dto.SkillDto;

@Component
public class SkillConverter extends AbstractConverter<Skill, SkillDto, SkillHistory> {


    public  SkillConverter(){
        super(Skill.class, SkillDto.class, SkillHistory.class);
    }

    @Override
    public Skill toItem(SkillDto dto) {
        if (dto == null) {
            return null;
        } else {
        Skill item = new Skill();
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
    public SkillDto toDto(Skill item) {
        if (item == null) {
            return null;
        } else {
            SkillDto dto = new SkillDto();
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
