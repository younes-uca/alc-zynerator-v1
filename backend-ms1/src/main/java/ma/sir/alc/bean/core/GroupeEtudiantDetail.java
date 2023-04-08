package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "groupe_etudiant_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="groupe_etudiant_detail_seq",sequenceName="groupe_etudiant_detail_seq",allocationSize=1, initialValue = 1)
public class GroupeEtudiantDetail    extends AuditBusinessObject   {

    private Long id;


    private GroupeEtudiant groupeEtudiant ;
    
    private Etudiant etudiant ;
    


    public GroupeEtudiantDetail(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="groupe_etudiant_detail_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GroupeEtudiant getGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void setGroupeEtudiant(GroupeEtudiant groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupeEtudiantDetail groupeEtudiantDetail = (GroupeEtudiantDetail) o;
        return id != null && id.equals(groupeEtudiantDetail.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

