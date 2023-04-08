package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassRoomDto  extends AuditBaseDto {

    private String libelle  ;
    private String description  ;

    private ProfDto prof ;

    private List<EtudiantClassRoomDto> etudiantClassRooms ;
    private List<QuizClassRoomDto> quizClassRooms ;


    public ClassRoomDto(){
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


    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }



    public List<EtudiantClassRoomDto> getEtudiantClassRooms(){
        return this.etudiantClassRooms;
    }

    public void setEtudiantClassRooms(List<EtudiantClassRoomDto> etudiantClassRooms){
        this.etudiantClassRooms = etudiantClassRooms;
    }
    public List<QuizClassRoomDto> getQuizClassRooms(){
        return this.quizClassRooms;
    }

    public void setQuizClassRooms(List<QuizClassRoomDto> quizClassRooms){
        this.quizClassRooms = quizClassRooms;
    }

}
