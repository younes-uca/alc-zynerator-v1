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
@Table(name = "prof_review")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prof_review_seq",sequenceName="prof_review_seq",allocationSize=1, initialValue = 1)
public class ProfReview    extends AuditBusinessObject   {

    private Long id;

    private Integer review = 0;
    @Column(length = 500)
    private String comment;
    private LocalDateTime dateReview ;

    private Etudiant etudiant ;
    
    private Prof prof ;
    
    private Cours cours ;
    


    public ProfReview(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prof_review_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Cours getCours(){
        return this.cours;
    }
    public void setCours(Cours cours){
        this.cours = cours;
    }
    public Integer getReview(){
        return this.review;
    }
    public void setReview(Integer review){
        this.review = review;
    }
    public String getComment(){
        return this.comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    public LocalDateTime getDateReview(){
        return this.dateReview;
    }
    public void setDateReview(LocalDateTime dateReview){
        this.dateReview = dateReview;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfReview profReview = (ProfReview) o;
        return id != null && id.equals(profReview.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

