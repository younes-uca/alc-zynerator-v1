package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupeEtudiantDto  extends AuditBaseDto {

    private String libelle  ;
    private String niveau  ;
    private String dateDebut ;
    private String dateFin ;
    private Long nombrePlace  ;
    private Long nombrePlacevide  ;
    private Long nombrePlaceNonVide  ;

    private GroupeEtudeDto groupeEtude ;
    private ParcoursDto parcours ;
    private ProfDto prof ;

    private List<GroupeEtudiantDetailDto> groupeEtudiantDetails ;


    public GroupeEtudiantDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getNiveau(){
        return this.niveau;
    }
    public void setNiveau(String niveau){
        this.niveau = niveau;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }

    @Log
    public Long getNombrePlace(){
        return this.nombrePlace;
    }
    public void setNombrePlace(Long nombrePlace){
        this.nombrePlace = nombrePlace;
    }

    @Log
    public Long getNombrePlacevide(){
        return this.nombrePlacevide;
    }
    public void setNombrePlacevide(Long nombrePlacevide){
        this.nombrePlacevide = nombrePlacevide;
    }

    @Log
    public Long getNombrePlaceNonVide(){
        return this.nombrePlaceNonVide;
    }
    public void setNombrePlaceNonVide(Long nombrePlaceNonVide){
        this.nombrePlaceNonVide = nombrePlaceNonVide;
    }


    public GroupeEtudeDto getGroupeEtude(){
        return this.groupeEtude;
    }

    public void setGroupeEtude(GroupeEtudeDto groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    public ParcoursDto getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursDto parcours){
        this.parcours = parcours;
    }
    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }



    public List<GroupeEtudiantDetailDto> getGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails;
    }

    public void setGroupeEtudiantDetails(List<GroupeEtudiantDetailDto> groupeEtudiantDetails){
        this.groupeEtudiantDetails = groupeEtudiantDetails;
    }

}
