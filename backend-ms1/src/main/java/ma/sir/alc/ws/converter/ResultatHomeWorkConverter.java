package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ResultatHomeWorkHistory;
import ma.sir.alc.bean.core.ResultatHomeWork;
import ma.sir.alc.ws.dto.ResultatHomeWorkDto;

@Component
public class ResultatHomeWorkConverter extends AbstractConverter<ResultatHomeWork, ResultatHomeWorkDto, ResultatHomeWorkHistory> {


    public  ResultatHomeWorkConverter(){
        super(ResultatHomeWork.class, ResultatHomeWorkDto.class, ResultatHomeWorkHistory.class);
    }

    @Override
    public ResultatHomeWork toItem(ResultatHomeWorkDto dto) {
        if (dto == null) {
            return null;
        } else {
        ResultatHomeWork item = new ResultatHomeWork();
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
    public ResultatHomeWorkDto toDto(ResultatHomeWork item) {
        if (item == null) {
            return null;
        } else {
            ResultatHomeWorkDto dto = new ResultatHomeWorkDto();
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
