package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.WorkloadBonusProfHistory;
import ma.sir.alc.bean.core.WorkloadBonusProf;
import ma.sir.alc.ws.dto.WorkloadBonusProfDto;

@Component
public class WorkloadBonusProfConverter extends AbstractConverter<WorkloadBonusProf, WorkloadBonusProfDto, WorkloadBonusProfHistory> {


    public  WorkloadBonusProfConverter(){
        super(WorkloadBonusProf.class, WorkloadBonusProfDto.class, WorkloadBonusProfHistory.class);
    }

    @Override
    public WorkloadBonusProf toItem(WorkloadBonusProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        WorkloadBonusProf item = new WorkloadBonusProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNombreSession()))
                item.setNombreSession(dto.getNombreSession());
            if(StringUtil.isNotEmpty(dto.getPrix()))
                item.setPrix(dto.getPrix());


        return item;
        }
    }

    @Override
    public WorkloadBonusProfDto toDto(WorkloadBonusProf item) {
        if (item == null) {
            return null;
        } else {
            WorkloadBonusProfDto dto = new WorkloadBonusProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNombreSession()))
                dto.setNombreSession(item.getNombreSession());
            if(StringUtil.isNotEmpty(item.getPrix()))
                dto.setPrix(item.getPrix());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
