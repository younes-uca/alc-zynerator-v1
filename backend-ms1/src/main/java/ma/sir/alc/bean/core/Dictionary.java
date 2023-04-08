package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "dictionary")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="dictionary_seq",sequenceName="dictionary_seq",allocationSize=1, initialValue = 1)
public class Dictionary    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String word;
    @Column(length = 500)
    private String definition;

    private Etudiant etudiant ;
    


    public Dictionary(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="dictionary_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getWord(){
        return this.word;
    }
    public void setWord(String word){
        this.word = word;
    }
    public String getDefinition(){
        return this.definition;
    }
    public void setDefinition(String definition){
        this.definition = definition;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }

    @Transient
    public String getLabel() {
        label = word;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictionary dictionary = (Dictionary) o;
        return id != null && id.equals(dictionary.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

