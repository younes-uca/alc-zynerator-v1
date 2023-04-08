package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "quiz_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quiz_etudiant_seq",sequenceName="quiz_etudiant_seq",allocationSize=1, initialValue = 1)
public class QuizEtudiant    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    private BigDecimal note = BigDecimal.ZERO;
    @Column(length = 500)
    private String resultat;
    private Long questionCurrent ;

    private Etudiant etudiant ;
    
    private Quiz quiz ;
    

    private List<ReponseEtudiant> reponseEtudiants ;

    public QuizEtudiant(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="quiz_etudiant_seq")
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Quiz getQuiz(){
        return this.quiz;
    }
    public void setQuiz(Quiz quiz){
        this.quiz = quiz;
    }
    @OneToMany(mappedBy = "quizEtudiant")
    public List<ReponseEtudiant> getReponseEtudiants(){
        return this.reponseEtudiants;
    }
    public void setReponseEtudiants(List<ReponseEtudiant> reponseEtudiants){
        this.reponseEtudiants = reponseEtudiants;
    }
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }
    public String getResultat(){
        return this.resultat;
    }
    public void setResultat(String resultat){
        this.resultat = resultat;
    }
    public Long getQuestionCurrent(){
        return this.questionCurrent;
    }
    public void setQuestionCurrent(Long questionCurrent){
        this.questionCurrent = questionCurrent;
    }

    @Transient
    public String getLabel() {
        label = ref;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuizEtudiant quizEtudiant = (QuizEtudiant) o;
        return id != null && id.equals(quizEtudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

