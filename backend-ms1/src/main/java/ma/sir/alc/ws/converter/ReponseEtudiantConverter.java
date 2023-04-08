package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.QuizEtudiant;
import ma.sir.alc.bean.core.Question;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.ReponseEtudiantHistory;
import ma.sir.alc.bean.core.ReponseEtudiant;
import ma.sir.alc.ws.dto.ReponseEtudiantDto;

@Component
public class ReponseEtudiantConverter extends AbstractConverter<ReponseEtudiant, ReponseEtudiantDto, ReponseEtudiantHistory> {

    @Autowired
    private QuestionConverter questionConverter ;
    @Autowired
    private ReponseConverter reponseConverter ;
    @Autowired
    private QuizEtudiantConverter quizEtudiantConverter ;
    private boolean reponse;
    private boolean quizEtudiant;
    private boolean question;

    public  ReponseEtudiantConverter(){
        super(ReponseEtudiant.class, ReponseEtudiantDto.class, ReponseEtudiantHistory.class);
    }

    @Override
    public ReponseEtudiant toItem(ReponseEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        ReponseEtudiant item = new ReponseEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getAnswer()))
                item.setAnswer(dto.getAnswer());
            if(StringUtil.isNotEmpty(dto.getNote()))
                item.setNote(dto.getNote());
            if(this.reponse && dto.getReponse()!=null)
                item.setReponse(reponseConverter.toItem(dto.getReponse())) ;

            if(dto.getQuizEtudiant() != null && dto.getQuizEtudiant().getId() != null){
                item.setQuizEtudiant(new QuizEtudiant());
                item.getQuizEtudiant().setId(dto.getQuizEtudiant().getId());
            }

            if(dto.getQuestion() != null && dto.getQuestion().getId() != null){
                item.setQuestion(new Question());
                item.getQuestion().setId(dto.getQuestion().getId());
            }



        return item;
        }
    }

    @Override
    public ReponseEtudiantDto toDto(ReponseEtudiant item) {
        if (item == null) {
            return null;
        } else {
            ReponseEtudiantDto dto = new ReponseEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getAnswer()))
                dto.setAnswer(item.getAnswer());
            if(StringUtil.isNotEmpty(item.getNote()))
                dto.setNote(item.getNote());
        if(this.reponse && item.getReponse()!=null) {
            dto.setReponse(reponseConverter.toDto(item.getReponse())) ;
        }
        if(this.quizEtudiant && item.getQuizEtudiant()!=null) {
            dto.setQuizEtudiant(quizEtudiantConverter.toDto(item.getQuizEtudiant())) ;
        }
        if(this.question && item.getQuestion()!=null) {
            dto.setQuestion(questionConverter.toDto(item.getQuestion())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.reponse = value;
        this.quizEtudiant = value;
        this.question = value;
    }


    public QuestionConverter getQuestionConverter(){
        return this.questionConverter;
    }
    public void setQuestionConverter(QuestionConverter questionConverter ){
        this.questionConverter = questionConverter;
    }
    public ReponseConverter getReponseConverter(){
        return this.reponseConverter;
    }
    public void setReponseConverter(ReponseConverter reponseConverter ){
        this.reponseConverter = reponseConverter;
    }
    public QuizEtudiantConverter getQuizEtudiantConverter(){
        return this.quizEtudiantConverter;
    }
    public void setQuizEtudiantConverter(QuizEtudiantConverter quizEtudiantConverter ){
        this.quizEtudiantConverter = quizEtudiantConverter;
    }
    public boolean  isReponse(){
        return this.reponse;
    }
    public void  setReponse(boolean reponse){
        this.reponse = reponse;
    }
    public boolean  isQuizEtudiant(){
        return this.quizEtudiant;
    }
    public void  setQuizEtudiant(boolean quizEtudiant){
        this.quizEtudiant = quizEtudiant;
    }
    public boolean  isQuestion(){
        return this.question;
    }
    public void  setQuestion(boolean question){
        this.question = question;
    }
}
