package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreeTrialTeacherWhatsTemplateDto  extends AuditBaseDto {

    private String object  ;
    private String corps  ;
    private String source  ;




    public FreeTrialTeacherWhatsTemplateDto(){
        super();
    }



    @Log
    public String getObject(){
        return this.object;
    }
    public void setObject(String object){
        this.object = object;
    }

    @Log
    public String getCorps(){
        return this.corps;
    }
    public void setCorps(String corps){
        this.corps = corps;
    }

    @Log
    public String getSource(){
        return this.source;
    }
    public void setSource(String source){
        this.source = source;
    }






}
