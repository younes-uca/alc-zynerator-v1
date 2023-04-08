package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "faq")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="faq_seq",sequenceName="faq_seq",allocationSize=1, initialValue = 1)
public class Faq    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String description;
    @Column(length = 500)
    private String libelle;

    private FaqType faqType ;
    


    public Faq(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="faq_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public FaqType getFaqType(){
        return this.faqType;
    }
    public void setFaqType(FaqType faqType){
        this.faqType = faqType;
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
        Faq faq = (Faq) o;
        return id != null && id.equals(faq.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

