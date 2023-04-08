package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ContactHistory;
import ma.sir.alc.bean.core.Contact;
import ma.sir.alc.ws.dto.ContactDto;

@Component
public class ContactConverter extends AbstractConverter<Contact, ContactDto, ContactHistory> {


    public  ContactConverter(){
        super(Contact.class, ContactDto.class, ContactHistory.class);
    }

    @Override
    public Contact toItem(ContactDto dto) {
        if (dto == null) {
            return null;
        } else {
        Contact item = new Contact();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getPhone()))
                item.setPhone(dto.getPhone());
            if(StringUtil.isNotEmpty(dto.getSetFrom()))
                item.setSetFrom(dto.getSetFrom());
            if(StringUtil.isNotEmpty(dto.getDateContact()))
                item.setDateContact(DateUtil.stringEnToDate(dto.getDateContact()));
            if(dto.getReplied() != null)
                item.setReplied(dto.getReplied());
            if(StringUtil.isNotEmpty(dto.getMessage()))
                item.setMessage(dto.getMessage());


        return item;
        }
    }

    @Override
    public ContactDto toDto(Contact item) {
        if (item == null) {
            return null;
        } else {
            ContactDto dto = new ContactDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getPhone()))
                dto.setPhone(item.getPhone());
            if(StringUtil.isNotEmpty(item.getSetFrom()))
                dto.setSetFrom(item.getSetFrom());
            if(item.getDateContact()!=null)
                dto.setDateContact(DateUtil.dateTimeToString(item.getDateContact()));
                dto.setReplied(item.getReplied());
            if(StringUtil.isNotEmpty(item.getMessage()))
                dto.setMessage(item.getMessage());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
