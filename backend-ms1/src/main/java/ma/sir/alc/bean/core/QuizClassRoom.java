package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "quiz_class_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quiz_class_room_seq",sequenceName="quiz_class_room_seq",allocationSize=1, initialValue = 1)
public class QuizClassRoom    extends AuditBusinessObject   {

    private Long id;


    private ClassRoom classRoom ;
    
    private Quiz quiz ;
    


    public QuizClassRoom(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="quiz_class_room_seq")
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
    public Quiz getQuiz(){
        return this.quiz;
    }
    public void setQuiz(Quiz quiz){
        this.quiz = quiz;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuizClassRoom quizClassRoom = (QuizClassRoom) o;
        return id != null && id.equals(quizClassRoom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

