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
@Table(name = "calendrier_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="calendrier_prof_seq",sequenceName="calendrier_prof_seq",allocationSize=1, initialValue = 1)
public class CalendrierProf    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String startTime;
    @Column(length = 500)
    private String endTime;
    private LocalDateTime startRecur ;
    private LocalDateTime endRecur ;

    private Prof prof ;
    
    private Etudiant etudiant ;
    


    public CalendrierProf(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="calendrier_prof_seq")
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
    public String getStartTime(){
        return this.startTime;
    }
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    public String getEndTime(){
        return this.endTime;
    }
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }
    public LocalDateTime getStartRecur(){
        return this.startRecur;
    }
    public void setStartRecur(LocalDateTime startRecur){
        this.startRecur = startRecur;
    }
    public LocalDateTime getEndRecur(){
        return this.endRecur;
    }
    public void setEndRecur(LocalDateTime endRecur){
        this.endRecur = endRecur;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }

    @Transient
    public String getLabel() {
        label = ref;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendrierProf calendrierProf = (CalendrierProf) o;
        return id != null && id.equals(calendrierProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

