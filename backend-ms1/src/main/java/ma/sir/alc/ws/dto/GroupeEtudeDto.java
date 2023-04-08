package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupeEtudeDto  extends AuditBaseDto {

    private String libelle  ;
    private String description  ;
    private Long nombreEtudiant  ;




    public GroupeEtudeDto(){
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Log
    public Long getNombreEtudiant(){
        return this.nombreEtudiant;
    }
    public void setNombreEtudiant(Long nombreEtudiant){
        this.nombreEtudiant = nombreEtudiant;
    }






}
