package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ReclamationEtudiantHistory;
import ma.sir.alc.bean.core.ReclamationEtudiant;
import ma.sir.alc.ws.dto.ReclamationEtudiantDto;

@Component
public class ReclamationEtudiantConverter extends AbstractConverter<ReclamationEtudiant, ReclamationEtudiantDto, ReclamationEtudiantHistory> {

    @Autowired
    private TypeReclamationEtudiantConverter typeReclamationEtudiantConverter ;
    private boolean typeReclamationEtudiant;

    public  ReclamationEtudiantConverter(){
        super(ReclamationEtudiant.class, ReclamationEtudiantDto.class, ReclamationEtudiantHistory.class);
    }

    @Override
    public ReclamationEtudiant toItem(ReclamationEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        ReclamationEtudiant item = new ReclamationEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReference()))
                item.setReference(dto.getReference());
            if(StringUtil.isNotEmpty(dto.getDateReclamation()))
                item.setDateReclamation(DateUtil.stringEnToDate(dto.getDateReclamation()));
            if(StringUtil.isNotEmpty(dto.getMessage()))
                item.setMessage(dto.getMessage());
            if(StringUtil.isNotEmpty(dto.getSetFrom()))
                item.setSetFrom(dto.getSetFrom());
            if(StringUtil.isNotEmpty(dto.getImg()))
                item.setImg(dto.getImg());
            if(dto.getTraite() != null)
                item.setTraite(dto.getTraite());
            if(StringUtil.isNotEmpty(dto.getDateTraitement()))
                item.setDateTraitement(DateUtil.stringEnToDate(dto.getDateTraitement()));
            if(StringUtil.isNotEmpty(dto.getDateReponse()))
                item.setDateReponse(DateUtil.stringEnToDate(dto.getDateReponse()));
            if(dto.getPostView() != null)
                item.setPostView(dto.getPostView());
            if(StringUtil.isNotEmpty(dto.getObjetReclamationEtudiant()))
                item.setObjetReclamationEtudiant(dto.getObjetReclamationEtudiant());
            if(StringUtil.isNotEmpty(dto.getCommentaireTraiteur()))
                item.setCommentaireTraiteur(dto.getCommentaireTraiteur());
            if(StringUtil.isNotEmpty(dto.getUsername()))
                item.setUsername(dto.getUsername());
            if(this.typeReclamationEtudiant && dto.getTypeReclamationEtudiant()!=null)
                item.setTypeReclamationEtudiant(typeReclamationEtudiantConverter.toItem(dto.getTypeReclamationEtudiant())) ;



        return item;
        }
    }

    @Override
    public ReclamationEtudiantDto toDto(ReclamationEtudiant item) {
        if (item == null) {
            return null;
        } else {
            ReclamationEtudiantDto dto = new ReclamationEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReference()))
                dto.setReference(item.getReference());
            if(item.getDateReclamation()!=null)
                dto.setDateReclamation(DateUtil.dateTimeToString(item.getDateReclamation()));
            if(StringUtil.isNotEmpty(item.getMessage()))
                dto.setMessage(item.getMessage());
            if(StringUtil.isNotEmpty(item.getSetFrom()))
                dto.setSetFrom(item.getSetFrom());
            if(StringUtil.isNotEmpty(item.getImg()))
                dto.setImg(item.getImg());
                dto.setTraite(item.getTraite());
            if(item.getDateTraitement()!=null)
                dto.setDateTraitement(DateUtil.dateTimeToString(item.getDateTraitement()));
            if(item.getDateReponse()!=null)
                dto.setDateReponse(DateUtil.dateTimeToString(item.getDateReponse()));
                dto.setPostView(item.getPostView());
            if(StringUtil.isNotEmpty(item.getObjetReclamationEtudiant()))
                dto.setObjetReclamationEtudiant(item.getObjetReclamationEtudiant());
            if(StringUtil.isNotEmpty(item.getCommentaireTraiteur()))
                dto.setCommentaireTraiteur(item.getCommentaireTraiteur());
            if(StringUtil.isNotEmpty(item.getUsername()))
                dto.setUsername(item.getUsername());
        if(this.typeReclamationEtudiant && item.getTypeReclamationEtudiant()!=null) {
            dto.setTypeReclamationEtudiant(typeReclamationEtudiantConverter.toDto(item.getTypeReclamationEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeReclamationEtudiant = value;
    }


    public TypeReclamationEtudiantConverter getTypeReclamationEtudiantConverter(){
        return this.typeReclamationEtudiantConverter;
    }
    public void setTypeReclamationEtudiantConverter(TypeReclamationEtudiantConverter typeReclamationEtudiantConverter ){
        this.typeReclamationEtudiantConverter = typeReclamationEtudiantConverter;
    }
    public boolean  isTypeReclamationEtudiant(){
        return this.typeReclamationEtudiant;
    }
    public void  setTypeReclamationEtudiant(boolean typeReclamationEtudiant){
        this.typeReclamationEtudiant = typeReclamationEtudiant;
    }
}
