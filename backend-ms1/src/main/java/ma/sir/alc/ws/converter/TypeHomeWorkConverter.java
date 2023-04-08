package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.TypeHomeWorkHistory;
import ma.sir.alc.bean.core.TypeHomeWork;
import ma.sir.alc.ws.dto.TypeHomeWorkDto;

@Component
public class TypeHomeWorkConverter extends AbstractConverter<TypeHomeWork, TypeHomeWorkDto, TypeHomeWorkHistory> {


    public  TypeHomeWorkConverter(){
        super(TypeHomeWork.class, TypeHomeWorkDto.class, TypeHomeWorkHistory.class);
    }

    @Override
    public TypeHomeWork toItem(TypeHomeWorkDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeHomeWork item = new TypeHomeWork();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLib()))
                item.setLib(dto.getLib());


        return item;
        }
    }

    @Override
    public TypeHomeWorkDto toDto(TypeHomeWork item) {
        if (item == null) {
            return null;
        } else {
            TypeHomeWorkDto dto = new TypeHomeWorkDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLib()))
                dto.setLib(item.getLib());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
