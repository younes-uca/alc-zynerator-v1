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
@Table(name = "parcours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="parcours_seq",sequenceName="parcours_seq",allocationSize=1, initialValue = 1)
public class Parcours    extends AuditBusinessObject   {

    private Long id;

    private LocalDateTime datePublication ;
    private LocalDateTime dateCreation ;
    @Column(length = 500)
    private String description;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private Integer numeroOrder = 0;
    private Integer nombreCours = 0;

    private Centre centre ;
    

    private List<Cours> courss ;
    private List<Etudiant> etudiants ;

    public Parcours(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="parcours_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDatePublication(){
        return this.datePublication;
    }
    public void setDatePublication(LocalDateTime datePublication){
        this.datePublication = datePublication;
    }
    public LocalDateTime getDateCreation(){
        return this.dateCreation;
    }
    public void setDateCreation(LocalDateTime dateCreation){
        this.dateCreation = dateCreation;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
    public Integer getNombreCours(){
        return this.nombreCours;
    }
    public void setNombreCours(Integer nombreCours){
        this.nombreCours = nombreCours;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Centre getCentre(){
        return this.centre;
    }
    public void setCentre(Centre centre){
        this.centre = centre;
    }
    @OneToMany(mappedBy = "parcours")
    public List<Cours> getCourss(){
        return this.courss;
    }
    public void setCourss(List<Cours> courss){
        this.courss = courss;
    }
    @OneToMany(mappedBy = "parcours")
    public List<Etudiant> getEtudiants(){
        return this.etudiants;
    }
    public void setEtudiants(List<Etudiant> etudiants){
        this.etudiants = etudiants;
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
        Parcours parcours = (Parcours) o;
        return id != null && id.equals(parcours.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

