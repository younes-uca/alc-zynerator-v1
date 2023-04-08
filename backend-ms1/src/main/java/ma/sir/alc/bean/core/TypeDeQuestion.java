package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "type_de_question")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_de_question_seq",sequenceName="type_de_question_seq",allocationSize=1, initialValue = 1)
public class TypeDeQuestion    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String lib;



    public TypeDeQuestion(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_de_question_seq")
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

    @Transient
    public String getLabel() {
        label = lib;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeDeQuestion typeDeQuestion = (TypeDeQuestion) o;
        return id != null && id.equals(typeDeQuestion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

