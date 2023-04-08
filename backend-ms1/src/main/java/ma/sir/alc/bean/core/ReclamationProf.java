package ma.sir.alc.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "reclamation_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reclamation_prof_seq",sequenceName="reclamation_prof_seq",allocationSize=1, initialValue = 1)
public class ReclamationProf    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String reference;
    private LocalDateTime dateReclamation ;
    @Column(length = 500)
    private String message;
    @Column(columnDefinition = "boolean default false")
    private Boolean traite = false;
    private LocalDateTime dateTraitement ;
    private LocalDateTime dateReponse ;
    @Column(columnDefinition = "boolean default false")
    private Boolean postView = false;
    @Column(length = 500)
    private String commentaireTraiteur;
    @Column(length = 500)
    private String objetReclamationProf;

    private Admin admin ;
    
    private Prof prof ;
    
    private TypeReclamationProf typeReclamationProf ;
    


    public ReclamationProf(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reclamation_prof_seq")
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
    public LocalDateTime getDateReclamation(){
        return this.dateReclamation;
    }
    public void setDateReclamation(LocalDateTime dateReclamation){
        this.dateReclamation = dateReclamation;
    }
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public Boolean  getTraite(){
        return this.traite;
    }
    public void setTraite(Boolean traite){
        this.traite = traite;
    }
    public LocalDateTime getDateTraitement(){
        return this.dateTraitement;
    }
    public void setDateTraitement(LocalDateTime dateTraitement){
        this.dateTraitement = dateTraitement;
    }
    public LocalDateTime getDateReponse(){
        return this.dateReponse;
    }
    public void setDateReponse(LocalDateTime dateReponse){
        this.dateReponse = dateReponse;
    }
    public Boolean  getPostView(){
        return this.postView;
    }
    public void setPostView(Boolean postView){
        this.postView = postView;
    }
    public String getCommentaireTraiteur(){
        return this.commentaireTraiteur;
    }
    public void setCommentaireTraiteur(String commentaireTraiteur){
        this.commentaireTraiteur = commentaireTraiteur;
    }
    public String getObjetReclamationProf(){
        return this.objetReclamationProf;
    }
    public void setObjetReclamationProf(String objetReclamationProf){
        this.objetReclamationProf = objetReclamationProf;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Admin getAdmin(){
        return this.admin;
    }
    public void setAdmin(Admin admin){
        this.admin = admin;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeReclamationProf getTypeReclamationProf(){
        return this.typeReclamationProf;
    }
    public void setTypeReclamationProf(TypeReclamationProf typeReclamationProf){
        this.typeReclamationProf = typeReclamationProf;
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
        ReclamationProf reclamationProf = (ReclamationProf) o;
        return id != null && id.equals(reclamationProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

