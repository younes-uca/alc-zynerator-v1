package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.HomeWorkEtudiant;
import ma.sir.alc.bean.core.HomeWorkQuestion;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.sir.alc.bean.core.ReponseEtudiantHomeWork;
import ma.sir.alc.ws.dto.ReponseEtudiantHomeWorkDto;

@Component
public class ReponseEtudiantHomeWorkConverter extends AbstractConverter<ReponseEtudiantHomeWork, ReponseEtudiantHomeWorkDto, ReponseEtudiantHomeWorkHistory> {

    @Autowired
    private HoweWorkQSTReponseConverter howeWorkQSTReponseConverter ;
    @Autowired
    private HomeWorkQuestionConverter homeWorkQuestionConverter ;
    @Autowired
    private HomeWorkEtudiantConverter homeWorkEtudiantConverter ;
    private boolean howeWorkQSTReponse;
    private boolean homeWorkEtudiant;
    private boolean homeWorkQuestion;

    public  ReponseEtudiantHomeWorkConverter(){
        super(ReponseEtudiantHomeWork.class, ReponseEtudiantHomeWorkDto.class, ReponseEtudiantHomeWorkHistory.class);
    }

    @Override
    public ReponseEtudiantHomeWork toItem(ReponseEtudiantHomeWorkDto dto) {
        if (dto == null) {
            return null;
        } else {
        ReponseEtudiantHomeWork item = new ReponseEtudiantHomeWork();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getAnswer()))
                item.setAnswer(dto.getAnswer());
            if(StringUtil.isNotEmpty(dto.getProfNote()))
                item.setProfNote(dto.getProfNote());
            if(StringUtil.isNotEmpty(dto.getNote()))
                item.setNote(dto.getNote());
            if(this.howeWorkQSTReponse && dto.getHoweWorkQSTReponse()!=null)
                item.setHoweWorkQSTReponse(howeWorkQSTReponseConverter.toItem(dto.getHoweWorkQSTReponse())) ;

            if(dto.getHomeWorkEtudiant() != null && dto.getHomeWorkEtudiant().getId() != null){
                item.setHomeWorkEtudiant(new HomeWorkEtudiant());
                item.getHomeWorkEtudiant().setId(dto.getHomeWorkEtudiant().getId());
            }

            if(dto.getHomeWorkQuestion() != null && dto.getHomeWorkQuestion().getId() != null){
                item.setHomeWorkQuestion(new HomeWorkQuestion());
                item.getHomeWorkQuestion().setId(dto.getHomeWorkQuestion().getId());
            }



        return item;
        }
    }

    @Override
    public ReponseEtudiantHomeWorkDto toDto(ReponseEtudiantHomeWork item) {
        if (item == null) {
            return null;
        } else {
            ReponseEtudiantHomeWorkDto dto = new ReponseEtudiantHomeWorkDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getAnswer()))
                dto.setAnswer(item.getAnswer());
            if(StringUtil.isNotEmpty(item.getProfNote()))
                dto.setProfNote(item.getProfNote());
            if(StringUtil.isNotEmpty(item.getNote()))
                dto.setNote(item.getNote());
        if(this.howeWorkQSTReponse && item.getHoweWorkQSTReponse()!=null) {
            dto.setHoweWorkQSTReponse(howeWorkQSTReponseConverter.toDto(item.getHoweWorkQSTReponse())) ;
        }
        if(this.homeWorkEtudiant && item.getHomeWorkEtudiant()!=null) {
            dto.setHomeWorkEtudiant(homeWorkEtudiantConverter.toDto(item.getHomeWorkEtudiant())) ;
        }
        if(this.homeWorkQuestion && item.getHomeWorkQuestion()!=null) {
            dto.setHomeWorkQuestion(homeWorkQuestionConverter.toDto(item.getHomeWorkQuestion())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.howeWorkQSTReponse = value;
        this.homeWorkEtudiant = value;
        this.homeWorkQuestion = value;
    }


    public HoweWorkQSTReponseConverter getHoweWorkQSTReponseConverter(){
        return this.howeWorkQSTReponseConverter;
    }
    public void setHoweWorkQSTReponseConverter(HoweWorkQSTReponseConverter howeWorkQSTReponseConverter ){
        this.howeWorkQSTReponseConverter = howeWorkQSTReponseConverter;
    }
    public HomeWorkQuestionConverter getHomeWorkQuestionConverter(){
        return this.homeWorkQuestionConverter;
    }
    public void setHomeWorkQuestionConverter(HomeWorkQuestionConverter homeWorkQuestionConverter ){
        this.homeWorkQuestionConverter = homeWorkQuestionConverter;
    }
    public HomeWorkEtudiantConverter getHomeWorkEtudiantConverter(){
        return this.homeWorkEtudiantConverter;
    }
    public void setHomeWorkEtudiantConverter(HomeWorkEtudiantConverter homeWorkEtudiantConverter ){
        this.homeWorkEtudiantConverter = homeWorkEtudiantConverter;
    }
    public boolean  isHoweWorkQSTReponse(){
        return this.howeWorkQSTReponse;
    }
    public void  setHoweWorkQSTReponse(boolean howeWorkQSTReponse){
        this.howeWorkQSTReponse = howeWorkQSTReponse;
    }
    public boolean  isHomeWorkEtudiant(){
        return this.homeWorkEtudiant;
    }
    public void  setHomeWorkEtudiant(boolean homeWorkEtudiant){
        this.homeWorkEtudiant = homeWorkEtudiant;
    }
    public boolean  isHomeWorkQuestion(){
        return this.homeWorkQuestion;
    }
    public void  setHomeWorkQuestion(boolean homeWorkQuestion){
        this.homeWorkQuestion = homeWorkQuestion;
    }
}
