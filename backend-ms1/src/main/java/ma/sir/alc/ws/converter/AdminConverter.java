package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.AdminHistory;
import ma.sir.alc.bean.core.Admin;
import ma.sir.alc.ws.dto.AdminDto;

@Component
public class AdminConverter extends AbstractConverter<Admin, AdminDto, AdminHistory> {


    public  AdminConverter(){
        super(Admin.class, AdminDto.class, AdminHistory.class);
    }

    @Override
    public Admin toItem(AdminDto dto) {
        if (dto == null) {
            return null;
        } else {
        Admin item = new Admin();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            item.setCredentialsNonExpired(dto.getCredentialsNonExpired());
            item.setEnabled(dto.getEnabled());
            item.setAccountNonExpired(dto.getAccountNonExpired());
            item.setAccountNonLocked(dto.getAccountNonLocked());
            item.setPasswordChanged(dto.getPasswordChanged());
          /*  if(StringUtil.isNotEmpty(dto.getCreatedAt()))
                item.setCreatedAt(DateUtil.stringEnToDate(dto.getCreatedAt()));
            if(StringUtil.isNotEmpty(dto.getUpdatedAt()))
                item.setUpdatedAt(dto.getUpdatedAt());*/
            if(StringUtil.isNotEmpty(dto.getUsername()))
                item.setUsername(dto.getUsername());
            if(StringUtil.isNotEmpty(dto.getPassword()))
                item.setPassword(dto.getPassword());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());


        return item;
        }
    }

    @Override
    public AdminDto toDto(Admin item) {
        if (item == null) {
            return null;
        } else {
            AdminDto dto = new AdminDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getCredentialsNonExpired()))
                dto.setCredentialsNonExpired(item.getCredentialsNonExpired());
            if(StringUtil.isNotEmpty(item.getEnabled()))
                dto.setEnabled(item.getEnabled());
            if(StringUtil.isNotEmpty(item.getAccountNonExpired()))
                dto.setAccountNonExpired(item.getAccountNonExpired());
            if(StringUtil.isNotEmpty(item.getAccountNonLocked()))
                dto.setAccountNonLocked(item.getAccountNonLocked());
            if(StringUtil.isNotEmpty(item.getPasswordChanged()))
                dto.setPasswordChanged(item.getPasswordChanged());
            /*if(StringUtil.isNotEmpty(item.getCreatedAt()))
                dto.setCreatedAt(item.getCreatedAt());
            if(StringUtil.isNotEmpty(item.getUpdatedAt()))
                dto.setUpdatedAt(item.getUpdatedAt());*/
            if(StringUtil.isNotEmpty(item.getUsername()))
                dto.setUsername(item.getUsername());
            if(StringUtil.isNotEmpty(item.getPassword()))
                dto.setPassword(item.getPassword());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
