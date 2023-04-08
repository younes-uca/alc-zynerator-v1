package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "cours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="cours_seq",sequenceName="cours_seq",allocationSize=1, initialValue = 1)
public class Cours    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String description;
    @Column(length = 500)
    private String image;
    private Integer nombreSectionFinalise = 0;
    private Integer nombreSectionEnCours = 0;
    private Integer nombreLinkEnCours = 0;
    private Integer nombreLinkFinalise = 0;
    private Integer numeroOrder = 0;

    private EtatCours etatCours ;
    
    private Parcours parcours ;
    

    private List<Section> sections ;
    private List<HomeWork> homeWorks ;

    public Cours(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cours_seq")
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatCours getEtatCours(){
        return this.etatCours;
    }
    public void setEtatCours(EtatCours etatCours){
        this.etatCours = etatCours;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }
    public Integer getNombreSectionFinalise(){
        return this.nombreSectionFinalise;
    }
    public void setNombreSectionFinalise(Integer nombreSectionFinalise){
        this.nombreSectionFinalise = nombreSectionFinalise;
    }
    public Integer getNombreSectionEnCours(){
        return this.nombreSectionEnCours;
    }
    public void setNombreSectionEnCours(Integer nombreSectionEnCours){
        this.nombreSectionEnCours = nombreSectionEnCours;
    }
    public Integer getNombreLinkEnCours(){
        return this.nombreLinkEnCours;
    }
    public void setNombreLinkEnCours(Integer nombreLinkEnCours){
        this.nombreLinkEnCours = nombreLinkEnCours;
    }
    public Integer getNombreLinkFinalise(){
        return this.nombreLinkFinalise;
    }
    public void setNombreLinkFinalise(Integer nombreLinkFinalise){
        this.nombreLinkFinalise = nombreLinkFinalise;
    }
    public Integer getNumeroOrder(){
        return this.numeroOrder;
    }
    public void setNumeroOrder(Integer numeroOrder){
        this.numeroOrder = numeroOrder;
    }
    @OneToMany(mappedBy = "cours")
    public List<Section> getSections(){
        return this.sections;
    }
    public void setSections(List<Section> sections){
        this.sections = sections;
    }
    @OneToMany(mappedBy = "cours")
    public List<HomeWork> getHomeWorks(){
        return this.homeWorks;
    }
    public void setHomeWorks(List<HomeWork> homeWorks){
        this.homeWorks = homeWorks;
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
        Cours cours = (Cours) o;
        return id != null && id.equals(cours.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

