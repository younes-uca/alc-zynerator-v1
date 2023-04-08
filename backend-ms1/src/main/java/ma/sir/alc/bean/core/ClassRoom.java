package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "class_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="class_room_seq",sequenceName="class_room_seq",allocationSize=1, initialValue = 1)
public class ClassRoom    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String description;

    private Prof prof ;
    

    private List<EtudiantClassRoom> etudiantClassRooms ;
    private List<QuizClassRoom> quizClassRooms ;

    public ClassRoom(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="class_room_seq")
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    @OneToMany(mappedBy = "classRoom")
    public List<EtudiantClassRoom> getEtudiantClassRooms(){
        return this.etudiantClassRooms;
    }
    public void setEtudiantClassRooms(List<EtudiantClassRoom> etudiantClassRooms){
        this.etudiantClassRooms = etudiantClassRooms;
    }
    @OneToMany(mappedBy = "classRoom")
    public List<QuizClassRoom> getQuizClassRooms(){
        return this.quizClassRooms;
    }
    public void setQuizClassRooms(List<QuizClassRoom> quizClassRooms){
        this.quizClassRooms = quizClassRooms;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return id != null && id.equals(classRoom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

