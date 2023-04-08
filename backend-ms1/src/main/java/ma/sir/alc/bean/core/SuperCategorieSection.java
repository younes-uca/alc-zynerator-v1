package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "super_categorie_section")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="super_categorie_section_seq",sequenceName="super_categorie_section_seq",allocationSize=1, initialValue = 1)
public class SuperCategorieSection    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;


    private List<CategorieSection> categorieSections ;

    public SuperCategorieSection(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="super_categorie_section_seq")
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
    @OneToMany(mappedBy = "superCategorieSection")
    public List<CategorieSection> getCategorieSections(){
        return this.categorieSections;
    }
    public void setCategorieSections(List<CategorieSection> categorieSections){
        this.categorieSections = categorieSections;
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
        SuperCategorieSection superCategorieSection = (SuperCategorieSection) o;
        return id != null && id.equals(superCategorieSection.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

