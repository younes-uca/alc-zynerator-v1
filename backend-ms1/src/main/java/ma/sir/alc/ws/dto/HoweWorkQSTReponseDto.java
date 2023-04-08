package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class HoweWorkQSTReponseDto  extends AuditBaseDto {

    private String ref  ;
    private String lib  ;
    private Integer numero  = 0 ;

    private EtatReponseDto etatReponse ;
    private HomeWorkQuestionDto homeWorkQuestion ;



    public HoweWorkQSTReponseDto(){
        super();
    }



    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }

    @Log
    public String getLib(){
        return this.lib;
    }
    public void setLib(String lib){
        this.lib = lib;
    }

    @Log
    public Integer getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }


    public EtatReponseDto getEtatReponse(){
        return this.etatReponse;
    }

    public void setEtatReponse(EtatReponseDto etatReponse){
        this.etatReponse = etatReponse;
    }
    public HomeWorkQuestionDto getHomeWorkQuestion(){
        return this.homeWorkQuestion;
    }

    public void setHomeWorkQuestion(HomeWorkQuestionDto homeWorkQuestion){
        this.homeWorkQuestion = homeWorkQuestion;
    }




}
