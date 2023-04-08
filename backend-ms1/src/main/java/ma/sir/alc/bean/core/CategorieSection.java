package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "categorie_section")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_section_seq",sequenceName="categorie_section_seq",allocationSize=1, initialValue = 1)
public class CategorieSection    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private Integer numeroOrder = 0;

    private SuperCategorieSection superCategorieSection ;
    

    private List<Section> sections ;

    public CategorieSection(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_section_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public Integer getNumeroOrder(){
        return this.numeroOrder;
    }
    public void setNumeroOrder(Integer numeroOrder){
        this.numeroOrder = numeroOrder;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public SuperCategorieSection getSuperCategorieSection(){
        return this.superCategorieSection;
    }
    public void setSuperCategorieSection(SuperCategorieSection superCategorieSection){
        this.superCategorieSection = superCategorieSection;
    }
    @OneToMany(mappedBy = "categorieSection")
    public List<Section> getSections(){
        return this.sections;
    }
    public void setSections(List<Section> sections){
        this.sections = sections;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieSection categorieSection = (CategorieSection) o;
        return id != null && id.equals(categorieSection.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

