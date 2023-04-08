package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "etat_etudiant_schedule")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_etudiant_schedule_seq",sequenceName="etat_etudiant_schedule_seq",allocationSize=1, initialValue = 1)
public class EtatEtudiantSchedule    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String couleur;



    public EtatEtudiantSchedule(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_etudiant_schedule_seq")
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getCouleur(){
        return this.couleur;
    }
    public void setCouleur(String couleur){
        this.couleur = couleur;
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
        EtatEtudiantSchedule etatEtudiantSchedule = (EtatEtudiantSchedule) o;
        return id != null && id.equals(etatEtudiantSchedule.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

