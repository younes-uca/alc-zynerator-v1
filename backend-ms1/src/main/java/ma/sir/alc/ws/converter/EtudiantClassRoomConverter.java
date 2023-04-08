package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.ClassRoom;
import ma.sir.alc.bean.core.Etudiant;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.EtudiantClassRoomHistory;
import ma.sir.alc.bean.core.EtudiantClassRoom;
import ma.sir.alc.ws.dto.EtudiantClassRoomDto;

@Component
public class EtudiantClassRoomConverter extends AbstractConverter<EtudiantClassRoom, EtudiantClassRoomDto, EtudiantClassRoomHistory> {

    @Autowired
    private ClassRoomConverter classRoomConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    private boolean classRoom;
    private boolean etudiant;

    public  EtudiantClassRoomConverter(){
        super(EtudiantClassRoom.class, EtudiantClassRoomDto.class, EtudiantClassRoomHistory.class);
    }

    @Override
    public EtudiantClassRoom toItem(EtudiantClassRoomDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtudiantClassRoom item = new EtudiantClassRoom();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getClassRoom() != null && dto.getClassRoom().getId() != null){
                item.setClassRoom(new ClassRoom());
                item.getClassRoom().setId(dto.getClassRoom().getId());
            }

            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }



        return item;
        }
    }

    @Override
    public EtudiantClassRoomDto toDto(EtudiantClassRoom item) {
        if (item == null) {
            return null;
        } else {
            EtudiantClassRoomDto dto = new EtudiantClassRoomDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.classRoom && item.getClassRoom()!=null) {
            dto.setClassRoom(classRoomConverter.toDto(item.getClassRoom())) ;
        }
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.classRoom = value;
        this.etudiant = value;
    }


    public ClassRoomConverter getClassRoomConverter(){
        return this.classRoomConverter;
    }
    public void setClassRoomConverter(ClassRoomConverter classRoomConverter ){
        this.classRoomConverter = classRoomConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public boolean  isClassRoom(){
        return this.classRoom;
    }
    public void  setClassRoom(boolean classRoom){
        this.classRoom = classRoom;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
}
