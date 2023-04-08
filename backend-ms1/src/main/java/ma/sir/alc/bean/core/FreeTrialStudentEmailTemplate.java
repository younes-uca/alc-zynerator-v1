package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "free_trial_student_email_template")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="free_trial_student_email_template_seq",sequenceName="free_trial_student_email_template_seq",allocationSize=1, initialValue = 1)
public class FreeTrialStudentEmailTemplate    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String object;
    @Column(length = 500)
    private String corps;
    @Column(length = 500)
    private String source;



    public FreeTrialStudentEmailTemplate(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="free_trial_student_email_template_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getObject(){
        return this.object;
    }
    public void setObject(String object){
        this.object = object;
    }
    public String getCorps(){
        return this.corps;
    }
    public void setCorps(String corps){
        this.corps = corps;
    }
    public String getSource(){
        return this.source;
    }
    public void setSource(String source){
        this.source = source;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeTrialStudentEmailTemplate freeTrialStudentEmailTemplate = (FreeTrialStudentEmailTemplate) o;
        return id != null && id.equals(freeTrialStudentEmailTemplate.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

