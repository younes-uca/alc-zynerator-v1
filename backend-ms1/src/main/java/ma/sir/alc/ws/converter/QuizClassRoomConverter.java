package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.ClassRoom;
import ma.sir.alc.bean.core.Quiz;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.QuizClassRoomHistory;
import ma.sir.alc.bean.core.QuizClassRoom;
import ma.sir.alc.ws.dto.QuizClassRoomDto;

@Component
public class QuizClassRoomConverter extends AbstractConverter<QuizClassRoom, QuizClassRoomDto, QuizClassRoomHistory> {

    @Autowired
    private ClassRoomConverter classRoomConverter ;
    @Autowired
    private QuizConverter quizConverter ;
    private boolean classRoom;
    private boolean quiz;

    public  QuizClassRoomConverter(){
        super(QuizClassRoom.class, QuizClassRoomDto.class, QuizClassRoomHistory.class);
    }

    @Override
    public QuizClassRoom toItem(QuizClassRoomDto dto) {
        if (dto == null) {
            return null;
        } else {
        QuizClassRoom item = new QuizClassRoom();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getClassRoom() != null && dto.getClassRoom().getId() != null){
                item.setClassRoom(new ClassRoom());
                item.getClassRoom().setId(dto.getClassRoom().getId());
            }

            if(dto.getQuiz() != null && dto.getQuiz().getId() != null){
                item.setQuiz(new Quiz());
                item.getQuiz().setId(dto.getQuiz().getId());
            }



        return item;
        }
    }

    @Override
    public QuizClassRoomDto toDto(QuizClassRoom item) {
        if (item == null) {
            return null;
        } else {
            QuizClassRoomDto dto = new QuizClassRoomDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.classRoom && item.getClassRoom()!=null) {
            dto.setClassRoom(classRoomConverter.toDto(item.getClassRoom())) ;
        }
        if(this.quiz && item.getQuiz()!=null) {
            dto.setQuiz(quizConverter.toDto(item.getQuiz())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.classRoom = value;
        this.quiz = value;
    }


    public ClassRoomConverter getClassRoomConverter(){
        return this.classRoomConverter;
    }
    public void setClassRoomConverter(ClassRoomConverter classRoomConverter ){
        this.classRoomConverter = classRoomConverter;
    }
    public QuizConverter getQuizConverter(){
        return this.quizConverter;
    }
    public void setQuizConverter(QuizConverter quizConverter ){
        this.quizConverter = quizConverter;
    }
    public boolean  isClassRoom(){
        return this.classRoom;
    }
    public void  setClassRoom(boolean classRoom){
        this.classRoom = classRoom;
    }
    public boolean  isQuiz(){
        return this.quiz;
    }
    public void  setQuiz(boolean quiz){
        this.quiz = quiz;
    }
}
