package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "quiz")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quiz_seq",sequenceName="quiz_seq",allocationSize=1, initialValue = 1)
public class Quiz    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String lib;
    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;
    private Long numero ;
    private Long seuilReussite ;

    private Section section ;
    

    private List<Question> questions ;
    private List<QuizEtudiant> quizEtudiants ;

    public Quiz(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="quiz_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getLib(){
        return this.lib;
    }
    public void setLib(String lib){
        this.lib = lib;
    }
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    @OneToMany(mappedBy = "quiz")
    public List<Question> getQuestions(){
        return this.questions;
    }
    public void setQuestions(List<Question> questions){
        this.questions = questions;
    }
    @OneToMany(mappedBy = "quiz")
    public List<QuizEtudiant> getQuizEtudiants(){
        return this.quizEtudiants;
    }
    public void setQuizEtudiants(List<QuizEtudiant> quizEtudiants){
        this.quizEtudiants = quizEtudiants;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Section getSection(){
        return this.section;
    }
    public void setSection(Section section){
        this.section = section;
    }
    public Long getNumero(){
        return this.numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
    }
    public Long getSeuilReussite(){
        return this.seuilReussite;
    }
    public void setSeuilReussite(Long seuilReussite){
        this.seuilReussite = seuilReussite;
    }

    @Transient
    public String getLabel() {
        label = lib;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return id != null && id.equals(quiz.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

