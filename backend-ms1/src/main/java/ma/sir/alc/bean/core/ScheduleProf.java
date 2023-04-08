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
@Table(name = "schedule_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="schedule_prof_seq",sequenceName="schedule_prof_seq",allocationSize=1, initialValue = 1)
public class ScheduleProf    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String subject;
    private LocalDateTime startTime ;
    private LocalDateTime endTime ;
    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String grpName;
    @Column(length = 500)
    private String profName;
    private Long profsId ;

    private GroupeEtudiant groupeEtudiant ;
    
    private Prof prof ;
    
    private Cours cours ;
    


    public ScheduleProf(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="schedule_prof_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public LocalDateTime getStartTime(){
        return this.startTime;
    }
    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime(){
        return this.endTime;
    }
    public void setEndTime(LocalDateTime endTime){
        this.endTime = endTime;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GroupeEtudiant getGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void setGroupeEtudiant(GroupeEtudiant groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
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
    public String getGrpName(){
        return this.grpName;
    }
    public void setGrpName(String grpName){
        this.grpName = grpName;
    }
    public String getProfName(){
        return this.profName;
    }
    public void setProfName(String profName){
        this.profName = profName;
    }
    public Long getProfsId(){
        return this.profsId;
    }
    public void setProfsId(Long profsId){
        this.profsId = profsId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleProf scheduleProf = (ScheduleProf) o;
        return id != null && id.equals(scheduleProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

