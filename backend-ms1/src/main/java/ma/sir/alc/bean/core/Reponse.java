package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "reponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reponse_seq",sequenceName="reponse_seq",allocationSize=1, initialValue = 1)
public class Reponse    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String lib;
    private Long numero ;

    private EtatReponse etatReponse ;
    
    private Question question ;
    


    public Reponse(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reponse_seq")
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
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatReponse getEtatReponse(){
        return this.etatReponse;
    }
    public void setEtatReponse(EtatReponse etatReponse){
        this.etatReponse = etatReponse;
    }
    public Long getNumero(){
        return this.numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
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
        label = lib;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reponse reponse = (Reponse) o;
        return id != null && id.equals(reponse.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

