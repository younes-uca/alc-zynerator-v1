package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.EtatEtudiantHistory;
import ma.sir.alc.bean.core.EtatEtudiant;
import ma.sir.alc.ws.dto.EtatEtudiantDto;

@Component
public class EtatEtudiantConverter extends AbstractConverter<EtatEtudiant, EtatEtudiantDto, EtatEtudiantHistory> {


    public  EtatEtudiantConverter(){
        super(EtatEtudiant.class, EtatEtudiantDto.class, EtatEtudiantHistory.class);
    }

    @Override
    public EtatEtudiant toItem(EtatEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtatEtudiant item = new EtatEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getUsername()))
                item.setUsername(dto.getUsername());
            if(StringUtil.isNotEmpty(dto.getFirstName()))
                item.setFirstName(dto.getFirstName());
            if(StringUtil.isNotEmpty(dto.getLastName()))
                item.setLastName(dto.getLastName());
            if(StringUtil.isNotEmpty(dto.getNationnalite()))
                item.setNationnalite(dto.getNationnalite());
            if(StringUtil.isNotEmpty(dto.getSchedule1()))
                item.setSchedule1(dto.getSchedule1());
            if(StringUtil.isNotEmpty(dto.getSchedule2()))
                item.setSchedule2(dto.getSchedule2());
            if(StringUtil.isNotEmpty(dto.getLastClass()))
                item.setLastClass(dto.getLastClass());
            if(StringUtil.isNotEmpty(dto.getNbrClass()))
                item.setNbrClass(dto.getNbrClass());
            if(StringUtil.isNotEmpty(dto.getEtat()))
                item.setEtat(dto.getEtat());
            if(StringUtil.isNotEmpty(dto.getEtatNumber()))
                item.setEtatNumber(dto.getEtatNumber());


        return item;
        }
    }

    @Override
    public EtatEtudiantDto toDto(EtatEtudiant item) {
        if (item == null) {
            return null;
        } else {
            EtatEtudiantDto dto = new EtatEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(StringUtil.isNotEmpty(item.getUsername()))
                dto.setUsername(item.getUsername());
            if(StringUtil.isNotEmpty(item.getFirstName()))
                dto.setFirstName(item.getFirstName());
            if(StringUtil.isNotEmpty(item.getLastName()))
                dto.setLastName(item.getLastName());
            if(StringUtil.isNotEmpty(item.getNationnalite()))
                dto.setNationnalite(item.getNationnalite());
            if(StringUtil.isNotEmpty(item.getSchedule1()))
                dto.setSchedule1(item.getSchedule1());
            if(StringUtil.isNotEmpty(item.getSchedule2()))
                dto.setSchedule2(item.getSchedule2());
            if(StringUtil.isNotEmpty(item.getLastClass()))
                dto.setLastClass(item.getLastClass());
            if(StringUtil.isNotEmpty(item.getNbrClass()))
                dto.setNbrClass(item.getNbrClass());
            if(StringUtil.isNotEmpty(item.getEtat()))
                dto.setEtat(item.getEtat());
            if(StringUtil.isNotEmpty(item.getEtatNumber()))
                dto.setEtatNumber(item.getEtatNumber());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
