package  ma.sir.alc.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminDto  extends AuditBaseDto {

    private String description  ;
    private Boolean credentialsNonExpired  ;
    private Boolean enabled  ;
    private Boolean accountNonExpired  ;
    private Boolean accountNonLocked  ;
    private Boolean passwordChanged  ;
    private String createdAt ;
    private String updatedAt ;
    private String username  ;
    private String password  ;
    private String prenom  ;
    private String nom  ;




    public AdminDto(){
        super();
    }



    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Log
    public Boolean getCredentialsNonExpired(){
        return this.credentialsNonExpired;
    }
    public void setCredentialsNonExpired(Boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
    }

    @Log
    public Boolean getEnabled(){
        return this.enabled;
    }
    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }

    @Log
    public Boolean getAccountNonExpired(){
        return this.accountNonExpired;
    }
    public void setAccountNonExpired(Boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
    }

    @Log
    public Boolean getAccountNonLocked(){
        return this.accountNonLocked;
    }
    public void setAccountNonLocked(Boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
    }

    @Log
    public Boolean getPasswordChanged(){
        return this.passwordChanged;
    }
    public void setPasswordChanged(Boolean passwordChanged){
        this.passwordChanged = passwordChanged;
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
    public String getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
    }

    @Log
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    @Log
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }






}
