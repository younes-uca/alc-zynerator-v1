package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.FreeTrial;
import ma.sir.alc.bean.core.Etudiant;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.FreeTrialDetailHistory;
import ma.sir.alc.bean.core.FreeTrialDetail;
import ma.sir.alc.ws.dto.FreeTrialDetailDto;

@Component
public class FreeTrialDetailConverter extends AbstractConverter<FreeTrialDetail, FreeTrialDetailDto, FreeTrialDetailHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private FreeTrialConverter freeTrialConverter ;
    private boolean freeTrial;
    private boolean etudiant;

    public  FreeTrialDetailConverter(){
        super(FreeTrialDetail.class, FreeTrialDetailDto.class, FreeTrialDetailHistory.class);
    }

    @Override
    public FreeTrialDetail toItem(FreeTrialDetailDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialDetail item = new FreeTrialDetail();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getPresence() != null)
                item.setPresence(dto.getPresence());
            if(dto.getWhatsUpMessageSent() != null)
                item.setWhatsUpMessageSent(dto.getWhatsUpMessageSent());
            if(StringUtil.isNotEmpty(dto.getDateEnvoiwhatsUpMessage()))
                item.setDateEnvoiwhatsUpMessage(DateUtil.stringEnToDate(dto.getDateEnvoiwhatsUpMessage()));
            if(dto.getEmailMessageSent() != null)
                item.setEmailMessageSent(dto.getEmailMessageSent());
            if(StringUtil.isNotEmpty(dto.getDateEnvoiEmailMessage()))
                item.setDateEnvoiEmailMessage(DateUtil.stringEnToDate(dto.getDateEnvoiEmailMessage()));
            if(dto.getAbonne() != null)
                item.setAbonne(dto.getAbonne());
            if(dto.getFreeTrial() != null && dto.getFreeTrial().getId() != null){
                item.setFreeTrial(new FreeTrial());
                item.getFreeTrial().setId(dto.getFreeTrial().getId());
            }

            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public FreeTrialDetailDto toDto(FreeTrialDetail item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialDetailDto dto = new FreeTrialDetailDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
                dto.setPresence(item.getPresence());
                dto.setWhatsUpMessageSent(item.getWhatsUpMessageSent());
            if(item.getDateEnvoiwhatsUpMessage()!=null)
                dto.setDateEnvoiwhatsUpMessage(DateUtil.dateTimeToString(item.getDateEnvoiwhatsUpMessage()));
                dto.setEmailMessageSent(item.getEmailMessageSent());
            if(item.getDateEnvoiEmailMessage()!=null)
                dto.setDateEnvoiEmailMessage(DateUtil.dateTimeToString(item.getDateEnvoiEmailMessage()));
                dto.setAbonne(item.getAbonne());
        if(this.freeTrial && item.getFreeTrial()!=null) {
            dto.setFreeTrial(freeTrialConverter.toDto(item.getFreeTrial())) ;
        }
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.freeTrial = value;
        this.etudiant = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public FreeTrialConverter getFreeTrialConverter(){
        return this.freeTrialConverter;
    }
    public void setFreeTrialConverter(FreeTrialConverter freeTrialConverter ){
        this.freeTrialConverter = freeTrialConverter;
    }
    public boolean  isFreeTrial(){
        return this.freeTrial;
    }
    public void  setFreeTrial(boolean freeTrial){
        this.freeTrial = freeTrial;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
