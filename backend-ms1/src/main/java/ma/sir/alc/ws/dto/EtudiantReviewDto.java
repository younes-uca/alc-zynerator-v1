package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtudiantReviewDto  extends AuditBaseDto {

    private Integer review  = 0 ;
    private String comment  ;
    private String dateReview ;

    private EtudiantDto etudiant ;
    private ProfDto prof ;
    private CoursDto cours ;



    public EtudiantReviewDto(){
        super();
    }



    @Log
    public Integer getReview(){
        return this.review;
    }
    public void setReview(Integer review){
        this.review = review;
    }

    @Log
    public String getComment(){
        return this.comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateReview(){
        return this.dateReview;
    }
    public void setDateReview(String dateReview){
        this.dateReview = dateReview;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }
    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }
    public CoursDto getCours(){
        return this.cours;
    }

    public void setCours(CoursDto cours){
        this.cours = cours;
    }




}
