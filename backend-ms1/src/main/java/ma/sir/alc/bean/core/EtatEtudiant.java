package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "etat_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_etudiant_seq",sequenceName="etat_etudiant_seq",allocationSize=1, initialValue = 1)
public class EtatEtudiant    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String reference;
    @Column(length = 500)
    private String username;
    @Column(length = 500)
    private String firstName;
    @Column(length = 500)
    private String lastName;
    @Column(length = 500)
    private String nationnalite;
    @Column(length = 500)
    private String schedule1;
    @Column(length = 500)
    private String schedule2;
    @Column(length = 500)
    private String lastClass;
    @Column(length = 500)
    private String nbrClass;
    @Column(length = 500)
    private String etat;
    private Long etatNumber ;



    public EtatEtudiant(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_etudiant_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getNationnalite(){
        return this.nationnalite;
    }
    public void setNationnalite(String nationnalite){
        this.nationnalite = nationnalite;
    }
    public String getSchedule1(){
        return this.schedule1;
    }
    public void setSchedule1(String schedule1){
        this.schedule1 = schedule1;
    }
    public String getSchedule2(){
        return this.schedule2;
    }
    public void setSchedule2(String schedule2){
        this.schedule2 = schedule2;
    }
    public String getLastClass(){
        return this.lastClass;
    }
    public void setLastClass(String lastClass){
        this.lastClass = lastClass;
    }
    public String getNbrClass(){
        return this.nbrClass;
    }
    public void setNbrClass(String nbrClass){
        this.nbrClass = nbrClass;
    }
    public String getEtat(){
        return this.etat;
    }
    public void setEtat(String etat){
        this.etat = etat;
    }
    public Long getEtatNumber(){
        return this.etatNumber;
    }
    public void setEtatNumber(Long etatNumber){
        this.etatNumber = etatNumber;
    }

    @Transient
    public String getLabel() {
        label = reference;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtatEtudiant etatEtudiant = (EtatEtudiant) o;
        return id != null && id.equals(etatEtudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

