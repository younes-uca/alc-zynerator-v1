package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Question;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ReponseHistory;
import ma.sir.alc.bean.core.Reponse;
import ma.sir.alc.ws.dto.ReponseDto;

@Component
public class ReponseConverter extends AbstractConverter<Reponse, ReponseDto, ReponseHistory> {

    @Autowired
    private QuestionConverter questionConverter ;
    @Autowired
    private EtatReponseConverter etatReponseConverter ;
    private boolean etatReponse;
    private boolean question;

    public  ReponseConverter(){
        super(Reponse.class, ReponseDto.class, ReponseHistory.class);
    }

    @Override
    public Reponse toItem(ReponseDto dto) {
        if (dto == null) {
            return null;
        } else {
        Reponse item = new Reponse();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLib()))
                item.setLib(dto.getLib());
            if(StringUtil.isNotEmpty(dto.getNumero()))
                item.setNumero(dto.getNumero());
            if(this.etatReponse && dto.getEtatReponse()!=null)
                item.setEtatReponse(etatReponseConverter.toItem(dto.getEtatReponse())) ;

            if(dto.getQuestion() != null && dto.getQuestion().getId() != null){
                item.setQuestion(new Question());
                item.getQuestion().setId(dto.getQuestion().getId());
            }



        return item;
        }
    }

    @Override
    public ReponseDto toDto(Reponse item) {
        if (item == null) {
            return null;
        } else {
            ReponseDto dto = new ReponseDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLib()))
                dto.setLib(item.getLib());
            if(StringUtil.isNotEmpty(item.getNumero()))
                dto.setNumero(item.getNumero());
        if(this.etatReponse && item.getEtatReponse()!=null) {
            dto.setEtatReponse(etatReponseConverter.toDto(item.getEtatReponse())) ;
        }
        if(this.question && item.getQuestion()!=null) {
            dto.setQuestion(questionConverter.toDto(item.getQuestion())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.etatReponse = value;
        this.question = value;
    }


    public QuestionConverter getQuestionConverter(){
        return this.questionConverter;
    }
    public void setQuestionConverter(QuestionConverter questionConverter ){
        this.questionConverter = questionConverter;
    }
    public EtatReponseConverter getEtatReponseConverter(){
        return this.etatReponseConverter;
    }
    public void setEtatReponseConverter(EtatReponseConverter etatReponseConverter ){
        this.etatReponseConverter = etatReponseConverter;
    }
    public boolean  isEtatReponse(){
        return this.etatReponse;
    }
    public void  setEtatReponse(boolean etatReponse){
        this.etatReponse = etatReponse;
    }
    public boolean  isQuestion(){
        return this.question;
    }
    public void  setQuestion(boolean question){
        this.question = question;
    }
}
