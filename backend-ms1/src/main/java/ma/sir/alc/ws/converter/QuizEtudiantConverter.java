package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Etudiant;
import ma.sir.alc.bean.core.Quiz;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.QuizEtudiantHistory;
import ma.sir.alc.bean.core.QuizEtudiant;
import ma.sir.alc.ws.dto.QuizEtudiantDto;

@Component
public class QuizEtudiantConverter extends AbstractConverter<QuizEtudiant, QuizEtudiantDto, QuizEtudiantHistory> {

    @Autowired
    private QuestionConverter questionConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private QuizConverter quizConverter ;
    @Autowired
    private ReponseEtudiantConverter reponseEtudiantConverter ;
    @Autowired
    private ReponseConverter reponseConverter ;
    private boolean etudiant;
    private boolean quiz;
    private boolean reponseEtudiants;

    public  QuizEtudiantConverter(){
        super(QuizEtudiant.class, QuizEtudiantDto.class, QuizEtudiantHistory.class);
        init(true);
    }

    @Override
    public QuizEtudiant toItem(QuizEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        QuizEtudiant item = new QuizEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getNote()))
                item.setNote(dto.getNote());
            if(StringUtil.isNotEmpty(dto.getResultat()))
                item.setResultat(dto.getResultat());
            if(StringUtil.isNotEmpty(dto.getQuestionCurrent()))
                item.setQuestionCurrent(dto.getQuestionCurrent());
            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }

            if(dto.getQuiz() != null && dto.getQuiz().getId() != null){
                item.setQuiz(new Quiz());
                item.getQuiz().setId(dto.getQuiz().getId());
            }


            if(this.reponseEtudiants && ListUtil.isNotEmpty(dto.getReponseEtudiants()))
                item.setReponseEtudiants(reponseEtudiantConverter.toItem(dto.getReponseEtudiants()));

        return item;
        }
    }

    @Override
    public QuizEtudiantDto toDto(QuizEtudiant item) {
        if (item == null) {
            return null;
        } else {
            QuizEtudiantDto dto = new QuizEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getNote()))
                dto.setNote(item.getNote());
            if(StringUtil.isNotEmpty(item.getResultat()))
                dto.setResultat(item.getResultat());
            if(StringUtil.isNotEmpty(item.getQuestionCurrent()))
                dto.setQuestionCurrent(item.getQuestionCurrent());
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }
        if(this.quiz && item.getQuiz()!=null) {
            dto.setQuiz(quizConverter.toDto(item.getQuiz())) ;
        }
        if(this.reponseEtudiants && ListUtil.isNotEmpty(item.getReponseEtudiants())){
            reponseEtudiantConverter.init(true);
            reponseEtudiantConverter.setQuizEtudiant(false);
            dto.setReponseEtudiants(reponseEtudiantConverter.toDto(item.getReponseEtudiants()));
            reponseEtudiantConverter.setQuizEtudiant(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.reponseEtudiants = value;
    }

    public void initObject(boolean value) {
        this.etudiant = value;
        this.quiz = value;
    }


    public QuestionConverter getQuestionConverter(){
        return this.questionConverter;
    }
    public void setQuestionConverter(QuestionConverter questionConverter ){
        this.questionConverter = questionConverter;
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
    public ReponseEtudiantConverter getReponseEtudiantConverter(){
        return this.reponseEtudiantConverter;
    }
    public void setReponseEtudiantConverter(ReponseEtudiantConverter reponseEtudiantConverter ){
        this.reponseEtudiantConverter = reponseEtudiantConverter;
    }
    public ReponseConverter getReponseConverter(){
        return this.reponseConverter;
    }
    public void setReponseConverter(ReponseConverter reponseConverter ){
        this.reponseConverter = reponseConverter;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
    public boolean  isQuiz(){
        return this.quiz;
    }
    public void  setQuiz(boolean quiz){
        this.quiz = quiz;
    }
    public boolean  isReponseEtudiants(){
        return this.reponseEtudiants ;
    }
    public void  setReponseEtudiants(boolean reponseEtudiants ){
        this.reponseEtudiants  = reponseEtudiants ;
    }
}
