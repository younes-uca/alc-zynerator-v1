package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfirmationTokenDto  extends AuditBaseDto {

    private String token  ;
    private String expiresAt ;
    private String createdAt ;
    private String confirmedAt ;

    private EtudiantDto etudiant ;



    public ConfirmationTokenDto(){
        super();
    }



    @Log
    public String getToken(){
        return this.token;
    }
    public void setToken(String token){
        this.token = token;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getExpiresAt(){
        return this.expiresAt;
    }
    public void setExpiresAt(String expiresAt){
        this.expiresAt = expiresAt;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getConfirmedAt(){
        return this.confirmedAt;
    }
    public void setConfirmedAt(String confirmedAt){
        this.confirmedAt = confirmedAt;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }




}
