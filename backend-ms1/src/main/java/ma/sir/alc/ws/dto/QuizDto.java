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
public class QuizDto  extends AuditBaseDto {

    private String ref  ;
    private String lib  ;
    private String dateDebut ;
    private String dateFin ;
    private Long numero  ;
    private Long seuilReussite  ;

    private SectionDto section ;

    private List<QuestionDto> questions ;
    private List<QuizEtudiantDto> quizEtudiants ;


    public QuizDto(){
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
    public Long getNumero(){
        return this.numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
    }

    @Log
    public Long getSeuilReussite(){
        return this.seuilReussite;
    }
    public void setSeuilReussite(Long seuilReussite){
        this.seuilReussite = seuilReussite;
    }


    public SectionDto getSection(){
        return this.section;
    }

    public void setSection(SectionDto section){
        this.section = section;
    }



    public List<QuestionDto> getQuestions(){
        return this.questions;
    }

    public void setQuestions(List<QuestionDto> questions){
        this.questions = questions;
    }
    public List<QuizEtudiantDto> getQuizEtudiants(){
        return this.quizEtudiants;
    }

    public void setQuizEtudiants(List<QuizEtudiantDto> quizEtudiants){
        this.quizEtudiants = quizEtudiants;
    }

}
