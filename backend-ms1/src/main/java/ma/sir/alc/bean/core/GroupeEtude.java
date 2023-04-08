package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "groupe_etude")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="groupe_etude_seq",sequenceName="groupe_etude_seq",allocationSize=1, initialValue = 1)
public class GroupeEtude    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String description;
    private Long nombreEtudiant ;



    public GroupeEtude(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="groupe_etude_seq")
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public Long getNombreEtudiant(){
        return this.nombreEtudiant;
    }
    public void setNombreEtudiant(Long nombreEtudiant){
        this.nombreEtudiant = nombreEtudiant;
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
        GroupeEtude groupeEtude = (GroupeEtude) o;
        return id != null && id.equals(groupeEtude.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

