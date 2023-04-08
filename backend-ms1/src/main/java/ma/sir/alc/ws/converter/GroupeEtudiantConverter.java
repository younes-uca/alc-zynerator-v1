package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Parcours;
import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.GroupeEtudiantHistory;
import ma.sir.alc.bean.core.GroupeEtudiant;
import ma.sir.alc.ws.dto.GroupeEtudiantDto;

@Component
public class GroupeEtudiantConverter extends AbstractConverter<GroupeEtudiant, GroupeEtudiantDto, GroupeEtudiantHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private ParcoursConverter parcoursConverter ;
    @Autowired
    private GroupeEtudeConverter groupeEtudeConverter ;
    @Autowired
    private GroupeEtudiantDetailConverter groupeEtudiantDetailConverter ;
    private boolean groupeEtude;
    private boolean parcours;
    private boolean prof;
    private boolean groupeEtudiantDetails;

    public  GroupeEtudiantConverter(){
        super(GroupeEtudiant.class, GroupeEtudiantDto.class, GroupeEtudiantHistory.class);
        init(true);
    }

    @Override
    public GroupeEtudiant toItem(GroupeEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        GroupeEtudiant item = new GroupeEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getNiveau()))
                item.setNiveau(dto.getNiveau());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(StringUtil.isNotEmpty(dto.getNombrePlace()))
                item.setNombrePlace(dto.getNombrePlace());
            if(StringUtil.isNotEmpty(dto.getNombrePlacevide()))
                item.setNombrePlacevide(dto.getNombrePlacevide());
            if(StringUtil.isNotEmpty(dto.getNombrePlaceNonVide()))
                item.setNombrePlaceNonVide(dto.getNombrePlaceNonVide());
            if(this.groupeEtude && dto.getGroupeEtude()!=null)
                item.setGroupeEtude(groupeEtudeConverter.toItem(dto.getGroupeEtude())) ;

            if(dto.getParcours() != null && dto.getParcours().getId() != null){
                item.setParcours(new Parcours());
                item.getParcours().setId(dto.getParcours().getId());
            }

            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }


            if(this.groupeEtudiantDetails && ListUtil.isNotEmpty(dto.getGroupeEtudiantDetails()))
                item.setGroupeEtudiantDetails(groupeEtudiantDetailConverter.toItem(dto.getGroupeEtudiantDetails()));

        return item;
        }
    }

    @Override
    public GroupeEtudiantDto toDto(GroupeEtudiant item) {
        if (item == null) {
            return null;
        } else {
            GroupeEtudiantDto dto = new GroupeEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getNiveau()))
                dto.setNiveau(item.getNiveau());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
            if(StringUtil.isNotEmpty(item.getNombrePlace()))
                dto.setNombrePlace(item.getNombrePlace());
            if(StringUtil.isNotEmpty(item.getNombrePlacevide()))
                dto.setNombrePlacevide(item.getNombrePlacevide());
            if(StringUtil.isNotEmpty(item.getNombrePlaceNonVide()))
                dto.setNombrePlaceNonVide(item.getNombrePlaceNonVide());
        if(this.groupeEtude && item.getGroupeEtude()!=null) {
            dto.setGroupeEtude(groupeEtudeConverter.toDto(item.getGroupeEtude())) ;
        }
        if(this.parcours && item.getParcours()!=null) {
            dto.setParcours(parcoursConverter.toDto(item.getParcours())) ;
        }
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.groupeEtudiantDetails && ListUtil.isNotEmpty(item.getGroupeEtudiantDetails())){
            groupeEtudiantDetailConverter.init(true);
            groupeEtudiantDetailConverter.setGroupeEtudiant(false);
            dto.setGroupeEtudiantDetails(groupeEtudiantDetailConverter.toDto(item.getGroupeEtudiantDetails()));
            groupeEtudiantDetailConverter.setGroupeEtudiant(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.groupeEtudiantDetails = value;
    }

    public void initObject(boolean value) {
        this.groupeEtude = value;
        this.parcours = value;
        this.prof = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public GroupeEtudeConverter getGroupeEtudeConverter(){
        return this.groupeEtudeConverter;
    }
    public void setGroupeEtudeConverter(GroupeEtudeConverter groupeEtudeConverter ){
        this.groupeEtudeConverter = groupeEtudeConverter;
    }
    public GroupeEtudiantDetailConverter getGroupeEtudiantDetailConverter(){
        return this.groupeEtudiantDetailConverter;
    }
    public void setGroupeEtudiantDetailConverter(GroupeEtudiantDetailConverter groupeEtudiantDetailConverter ){
        this.groupeEtudiantDetailConverter = groupeEtudiantDetailConverter;
    }
    public boolean  isGroupeEtude(){
        return this.groupeEtude;
    }
    public void  setGroupeEtude(boolean groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    public boolean  isParcours(){
        return this.parcours;
    }
    public void  setParcours(boolean parcours){
        this.parcours = parcours;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails ;
    }
    public void  setGroupeEtudiantDetails(boolean groupeEtudiantDetails ){
        this.groupeEtudiantDetails  = groupeEtudiantDetails ;
    }
}
