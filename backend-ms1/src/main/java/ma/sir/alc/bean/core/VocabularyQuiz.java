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
@Table(name = "vocabulary_quiz")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="vocabulary_quiz_seq",sequenceName="vocabulary_quiz_seq",allocationSize=1, initialValue = 1)
public class VocabularyQuiz    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String libelle;
    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;

    private Section section ;
    

    private List<Vocabulary> vocabularys ;

    public VocabularyQuiz(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vocabulary_quiz_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
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
    @OneToMany(mappedBy = "vocabularyQuiz")
    public List<Vocabulary> getVocabularys(){
        return this.vocabularys;
    }
    public void setVocabularys(List<Vocabulary> vocabularys){
        this.vocabularys = vocabularys;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Section getSection(){
        return this.section;
    }
    public void setSection(Section section){
        this.section = section;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VocabularyQuiz vocabularyQuiz = (VocabularyQuiz) o;
        return id != null && id.equals(vocabularyQuiz.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

