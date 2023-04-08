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
@Table(name = "invite_student")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="invite_student_seq",sequenceName="invite_student_seq",allocationSize=1, initialValue = 1)
public class InviteStudent    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(columnDefinition = "boolean default false")
    private Boolean isAccepted = false;
    @Column(columnDefinition = "boolean default false")
    private Boolean isPaidPack = false;
    @Column(length = 500)
    private String emailInvited;
    private LocalDateTime dateSentInvitation ;
    private LocalDateTime dateAcceptInvitation ;
    private LocalDateTime datePayPack ;

    private Etudiant etudiant ;
    


    public InviteStudent(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="invite_student_seq")
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }
    public Boolean  getIsAccepted(){
        return this.isAccepted;
    }
    public void setIsAccepted(Boolean isAccepted){
        this.isAccepted = isAccepted;
    }
    public Boolean  getIsPaidPack(){
        return this.isPaidPack;
    }
    public void setIsPaidPack(Boolean isPaidPack){
        this.isPaidPack = isPaidPack;
    }
    public String getEmailInvited(){
        return this.emailInvited;
    }
    public void setEmailInvited(String emailInvited){
        this.emailInvited = emailInvited;
    }
    public LocalDateTime getDateSentInvitation(){
        return this.dateSentInvitation;
    }
    public void setDateSentInvitation(LocalDateTime dateSentInvitation){
        this.dateSentInvitation = dateSentInvitation;
    }
    public LocalDateTime getDateAcceptInvitation(){
        return this.dateAcceptInvitation;
    }
    public void setDateAcceptInvitation(LocalDateTime dateAcceptInvitation){
        this.dateAcceptInvitation = dateAcceptInvitation;
    }
    public LocalDateTime getDatePayPack(){
        return this.datePayPack;
    }
    public void setDatePayPack(LocalDateTime datePayPack){
        this.datePayPack = datePayPack;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InviteStudent inviteStudent = (InviteStudent) o;
        return id != null && id.equals(inviteStudent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

