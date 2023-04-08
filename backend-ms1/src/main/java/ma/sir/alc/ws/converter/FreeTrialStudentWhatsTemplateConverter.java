package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.sir.alc.bean.core.FreeTrialStudentWhatsTemplate;
import ma.sir.alc.ws.dto.FreeTrialStudentWhatsTemplateDto;

@Component
public class FreeTrialStudentWhatsTemplateConverter extends AbstractConverter<FreeTrialStudentWhatsTemplate, FreeTrialStudentWhatsTemplateDto, FreeTrialStudentWhatsTemplateHistory> {


    public  FreeTrialStudentWhatsTemplateConverter(){
        super(FreeTrialStudentWhatsTemplate.class, FreeTrialStudentWhatsTemplateDto.class, FreeTrialStudentWhatsTemplateHistory.class);
    }

    @Override
    public FreeTrialStudentWhatsTemplate toItem(FreeTrialStudentWhatsTemplateDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialStudentWhatsTemplate item = new FreeTrialStudentWhatsTemplate();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getObject()))
                item.setObject(dto.getObject());
            if(StringUtil.isNotEmpty(dto.getCorps()))
                item.setCorps(dto.getCorps());
            if(StringUtil.isNotEmpty(dto.getSource()))
                item.setSource(dto.getSource());


        return item;
        }
    }

    @Override
    public FreeTrialStudentWhatsTemplateDto toDto(FreeTrialStudentWhatsTemplate item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialStudentWhatsTemplateDto dto = new FreeTrialStudentWhatsTemplateDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getObject()))
                dto.setObject(item.getObject());
            if(StringUtil.isNotEmpty(item.getCorps()))
                dto.setCorps(item.getCorps());
            if(StringUtil.isNotEmpty(item.getSource()))
                dto.setSource(item.getSource());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
