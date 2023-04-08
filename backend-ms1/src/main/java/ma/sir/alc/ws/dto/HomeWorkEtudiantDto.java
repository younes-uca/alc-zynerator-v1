package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class HomeWorkEtudiantDto  extends AuditBaseDto {

    private BigDecimal note  ;
    private String dateHomeWork ;

    private EtudiantDto etudiant ;
    private HomeWorkDto homeWork ;
    private ResultatHomeWorkDto resultatHomeWork ;

    private List<ReponseEtudiantHomeWorkDto> reponseEtudiantHomeWorks ;


    public HomeWorkEtudiantDto(){
        super();
    }



    @Log
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateHomeWork(){
        return this.dateHomeWork;
    }
    public void setDateHomeWork(String dateHomeWork){
        this.dateHomeWork = dateHomeWork;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }
    public HomeWorkDto getHomeWork(){
        return this.homeWork;
    }

    public void setHomeWork(HomeWorkDto homeWork){
        this.homeWork = homeWork;
    }
    public ResultatHomeWorkDto getResultatHomeWork(){
        return this.resultatHomeWork;
    }

    public void setResultatHomeWork(ResultatHomeWorkDto resultatHomeWork){
        this.resultatHomeWork = resultatHomeWork;
    }



    public List<ReponseEtudiantHomeWorkDto> getReponseEtudiantHomeWorks(){
        return this.reponseEtudiantHomeWorks;
    }

    public void setReponseEtudiantHomeWorks(List<ReponseEtudiantHomeWorkDto> reponseEtudiantHomeWorks){
        this.reponseEtudiantHomeWorks = reponseEtudiantHomeWorks;
    }

}
