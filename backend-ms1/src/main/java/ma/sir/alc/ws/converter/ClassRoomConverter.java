package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ClassRoomHistory;
import ma.sir.alc.bean.core.ClassRoom;
import ma.sir.alc.ws.dto.ClassRoomDto;

@Component
public class ClassRoomConverter extends AbstractConverter<ClassRoom, ClassRoomDto, ClassRoomHistory> {

    @Autowired
    private EtudiantClassRoomConverter etudiantClassRoomConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private QuizConverter quizConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private QuizClassRoomConverter quizClassRoomConverter ;
    private boolean prof;
    private boolean etudiantClassRooms;
    private boolean quizClassRooms;

    public  ClassRoomConverter(){
        super(ClassRoom.class, ClassRoomDto.class, ClassRoomHistory.class);
        init(true);
    }

    @Override
    public ClassRoom toItem(ClassRoomDto dto) {
        if (dto == null) {
            return null;
        } else {
        ClassRoom item = new ClassRoom();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }


            if(this.etudiantClassRooms && ListUtil.isNotEmpty(dto.getEtudiantClassRooms()))
                item.setEtudiantClassRooms(etudiantClassRoomConverter.toItem(dto.getEtudiantClassRooms()));
            if(this.quizClassRooms && ListUtil.isNotEmpty(dto.getQuizClassRooms()))
                item.setQuizClassRooms(quizClassRoomConverter.toItem(dto.getQuizClassRooms()));

        return item;
        }
    }

    @Override
    public ClassRoomDto toDto(ClassRoom item) {
        if (item == null) {
            return null;
        } else {
            ClassRoomDto dto = new ClassRoomDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.etudiantClassRooms && ListUtil.isNotEmpty(item.getEtudiantClassRooms())){
            etudiantClassRoomConverter.init(true);
            etudiantClassRoomConverter.setClassRoom(false);
            dto.setEtudiantClassRooms(etudiantClassRoomConverter.toDto(item.getEtudiantClassRooms()));
            etudiantClassRoomConverter.setClassRoom(true);

        }
        if(this.quizClassRooms && ListUtil.isNotEmpty(item.getQuizClassRooms())){
            quizClassRoomConverter.init(true);
            quizClassRoomConverter.setClassRoom(false);
            dto.setQuizClassRooms(quizClassRoomConverter.toDto(item.getQuizClassRooms()));
            quizClassRoomConverter.setClassRoom(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.etudiantClassRooms = value;
        this.quizClassRooms = value;
    }

    public void initObject(boolean value) {
        this.prof = value;
    }


    public EtudiantClassRoomConverter getEtudiantClassRoomConverter(){
        return this.etudiantClassRoomConverter;
    }
    public void setEtudiantClassRoomConverter(EtudiantClassRoomConverter etudiantClassRoomConverter ){
        this.etudiantClassRoomConverter = etudiantClassRoomConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public QuizConverter getQuizConverter(){
        return this.quizConverter;
    }
    public void setQuizConverter(QuizConverter quizConverter ){
        this.quizConverter = quizConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public QuizClassRoomConverter getQuizClassRoomConverter(){
        return this.quizClassRoomConverter;
    }
    public void setQuizClassRoomConverter(QuizClassRoomConverter quizClassRoomConverter ){
        this.quizClassRoomConverter = quizClassRoomConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isEtudiantClassRooms(){
        return this.etudiantClassRooms ;
    }
    public void  setEtudiantClassRooms(boolean etudiantClassRooms ){
        this.etudiantClassRooms  = etudiantClassRooms ;
    }
    public boolean  isQuizClassRooms(){
        return this.quizClassRooms ;
    }
    public void  setQuizClassRooms(boolean quizClassRooms ){
        this.quizClassRooms  = quizClassRooms ;
    }
}
