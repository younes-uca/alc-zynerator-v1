package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.sir.alc.bean.core.FreeTrialStudentEmailTemplate;
import ma.sir.alc.ws.dto.FreeTrialStudentEmailTemplateDto;

@Component
public class FreeTrialStudentEmailTemplateConverter extends AbstractConverter<FreeTrialStudentEmailTemplate, FreeTrialStudentEmailTemplateDto, FreeTrialStudentEmailTemplateHistory> {


    public  FreeTrialStudentEmailTemplateConverter(){
        super(FreeTrialStudentEmailTemplate.class, FreeTrialStudentEmailTemplateDto.class, FreeTrialStudentEmailTemplateHistory.class);
    }

    @Override
    public FreeTrialStudentEmailTemplate toItem(FreeTrialStudentEmailTemplateDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialStudentEmailTemplate item = new FreeTrialStudentEmailTemplate();
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
    public FreeTrialStudentEmailTemplateDto toDto(FreeTrialStudentEmailTemplate item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialStudentEmailTemplateDto dto = new FreeTrialStudentEmailTemplateDto();
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
