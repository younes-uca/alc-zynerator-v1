package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "reponse_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reponse_etudiant_seq",sequenceName="reponse_etudiant_seq",allocationSize=1, initialValue = 1)
public class ReponseEtudiant    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String answer;
    private BigDecimal note = BigDecimal.ZERO;

    private Reponse reponse ;
    
    private QuizEtudiant quizEtudiant ;
    
    private Question question ;
    


    public ReponseEtudiant(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reponse_etudiant_seq")
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
    public Reponse getReponse(){
        return this.reponse;
    }
    public void setReponse(Reponse reponse){
        this.reponse = reponse;
    }
    public String getAnswer(){
        return this.answer;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public QuizEtudiant getQuizEtudiant(){
        return this.quizEtudiant;
    }
    public void setQuizEtudiant(QuizEtudiant quizEtudiant){
        this.quizEtudiant = quizEtudiant;
    }
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Question getQuestion(){
        return this.question;
    }
    public void setQuestion(Question question){
        this.question = question;
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
        ReponseEtudiant reponseEtudiant = (ReponseEtudiant) o;
        return id != null && id.equals(reponseEtudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

