package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "vocabulary")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="vocabulary_seq",sequenceName="vocabulary_seq",allocationSize=1, initialValue = 1)
public class Vocabulary    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    private Long numero ;
    @Column(length = 500)
    private String word;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String result;
    @Column(length = 500)
    private String explication;
    @Column(length = 500)
    private String exemple;
    @Column(length = 500)
    private String image;

    private Section section ;
    
    private VocabularyQuiz vocabularyQuiz ;
    


    public Vocabulary(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vocabulary_seq")
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
    public Long getNumero(){
        return this.numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
    }
    public String getWord(){
        return this.word;
    }
    public void setWord(String word){
        this.word = word;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getResult(){
        return this.result;
    }
    public void setResult(String result){
        this.result = result;
    }
    public String getExplication(){
        return this.explication;
    }
    public void setExplication(String explication){
        this.explication = explication;
    }
    public String getExemple(){
        return this.exemple;
    }
    public void setExemple(String exemple){
        this.exemple = exemple;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Section getSection(){
        return this.section;
    }
    public void setSection(Section section){
        this.section = section;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public VocabularyQuiz getVocabularyQuiz(){
        return this.vocabularyQuiz;
    }
    public void setVocabularyQuiz(VocabularyQuiz vocabularyQuiz){
        this.vocabularyQuiz = vocabularyQuiz;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vocabulary vocabulary = (Vocabulary) o;
        return id != null && id.equals(vocabulary.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

