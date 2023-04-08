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
@Table(name = "groupe_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="groupe_etudiant_seq",sequenceName="groupe_etudiant_seq",allocationSize=1, initialValue = 1)
public class GroupeEtudiant    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String niveau;
    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;
    private Long nombrePlace ;
    private Long nombrePlacevide ;
    private Long nombrePlaceNonVide ;

    private GroupeEtude groupeEtude ;
    
    private Parcours parcours ;
    
    private Prof prof ;
    

    private List<GroupeEtudiantDetail> groupeEtudiantDetails ;

    public GroupeEtudiant(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="groupe_etudiant_seq")
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
    public String getNiveau(){
        return this.niveau;
    }
    public void setNiveau(String niveau){
        this.niveau = niveau;
    }
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public Long getNombrePlace(){
        return this.nombrePlace;
    }
    public void setNombrePlace(Long nombrePlace){
        this.nombrePlace = nombrePlace;
    }
    public Long getNombrePlacevide(){
        return this.nombrePlacevide;
    }
    public void setNombrePlacevide(Long nombrePlacevide){
        this.nombrePlacevide = nombrePlacevide;
    }
    public Long getNombrePlaceNonVide(){
        return this.nombrePlaceNonVide;
    }
    public void setNombrePlaceNonVide(Long nombrePlaceNonVide){
        this.nombrePlaceNonVide = nombrePlaceNonVide;
    }
    @OneToMany(mappedBy = "groupeEtudiant")
    public List<GroupeEtudiantDetail> getGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails;
    }
    public void setGroupeEtudiantDetails(List<GroupeEtudiantDetail> groupeEtudiantDetails){
        this.groupeEtudiantDetails = groupeEtudiantDetails;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GroupeEtude getGroupeEtude(){
        return this.groupeEtude;
    }
    public void setGroupeEtude(GroupeEtude groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupeEtudiant groupeEtudiant = (GroupeEtudiant) o;
        return id != null && id.equals(groupeEtudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

