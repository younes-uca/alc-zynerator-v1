package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtatEtudiantDto  extends AuditBaseDto {

    private String reference  ;
    private String username  ;
    private String firstName  ;
    private String lastName  ;
    private String nationnalite  ;
    private String schedule1  ;
    private String schedule2  ;
    private String lastClass  ;
    private String nbrClass  ;
    private String etat  ;
    private Long etatNumber  ;




    public EtatEtudiantDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    @Log
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    @Log
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Log
    public String getNationnalite(){
        return this.nationnalite;
    }
    public void setNationnalite(String nationnalite){
        this.nationnalite = nationnalite;
    }

    @Log
    public String getSchedule1(){
        return this.schedule1;
    }
    public void setSchedule1(String schedule1){
        this.schedule1 = schedule1;
    }

    @Log
    public String getSchedule2(){
        return this.schedule2;
    }
    public void setSchedule2(String schedule2){
        this.schedule2 = schedule2;
    }

    @Log
    public String getLastClass(){
        return this.lastClass;
    }
    public void setLastClass(String lastClass){
        this.lastClass = lastClass;
    }

    @Log
    public String getNbrClass(){
        return this.nbrClass;
    }
    public void setNbrClass(String nbrClass){
        this.nbrClass = nbrClass;
    }

    @Log
    public String getEtat(){
        return this.etat;
    }
    public void setEtat(String etat){
        this.etat = etat;
    }

    @Log
    public Long getEtatNumber(){
        return this.etatNumber;
    }
    public void setEtatNumber(Long etatNumber){
        this.etatNumber = etatNumber;
    }






}
