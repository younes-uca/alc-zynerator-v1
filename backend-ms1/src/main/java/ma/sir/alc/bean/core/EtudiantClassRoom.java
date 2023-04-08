package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "etudiant_class_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_class_room_seq",sequenceName="etudiant_class_room_seq",allocationSize=1, initialValue = 1)
public class EtudiantClassRoom    extends AuditBusinessObject   {

    private Long id;


    private ClassRoom classRoom ;
    
    private Etudiant etudiant ;
    


    public EtudiantClassRoom(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_class_room_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ClassRoom getClassRoom(){
        return this.classRoom;
    }
    public void setClassRoom(ClassRoom classRoom){
        this.classRoom = classRoom;
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
        EtudiantClassRoom etudiantClassRoom = (EtudiantClassRoom) o;
        return id != null && id.equals(etudiantClassRoom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

