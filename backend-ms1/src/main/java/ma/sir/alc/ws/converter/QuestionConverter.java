package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Quiz;
import ma.sir.alc.bean.core.HomeWork;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.QuestionHistory;
import ma.sir.alc.bean.core.Question;
import ma.sir.alc.ws.dto.QuestionDto;

@Component
public class QuestionConverter extends AbstractConverter<Question, QuestionDto, QuestionHistory> {

    @Autowired
    private TypeDeQuestionConverter typeDeQuestionConverter ;
    @Autowired
    private QuizConverter quizConverter ;
    @Autowired
    private ReponseConverter reponseConverter ;
    @Autowired
    private HomeWorkConverter homeWorkConverter ;
    @Autowired
    private EtatReponseConverter etatReponseConverter ;
    private boolean typeDeQuestion;
    private boolean quiz;
    private boolean homeWork;
    private boolean reponses;

    public  QuestionConverter(){
        super(Question.class, QuestionDto.class, QuestionHistory.class);
        init(true);
    }

    @Override
    public Question toItem(QuestionDto dto) {
        if (dto == null) {
            return null;
        } else {
        Question item = new Question();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getUrlImg()))
                item.setUrlImg(dto.getUrlImg());
            if(StringUtil.isNotEmpty(dto.getUrlVideo()))
                item.setUrlVideo(dto.getUrlVideo());
            if(StringUtil.isNotEmpty(dto.getNumero()))
                item.setNumero(dto.getNumero());
            if(StringUtil.isNotEmpty(dto.getPointReponseJuste()))
                item.setPointReponseJuste(dto.getPointReponseJuste());
            if(StringUtil.isNotEmpty(dto.getPointReponsefausse()))
                item.setPointReponsefausse(dto.getPointReponsefausse());
            if(this.typeDeQuestion && dto.getTypeDeQuestion()!=null)
                item.setTypeDeQuestion(typeDeQuestionConverter.toItem(dto.getTypeDeQuestion())) ;

            if(dto.getQuiz() != null && dto.getQuiz().getId() != null){
                item.setQuiz(new Quiz());
                item.getQuiz().setId(dto.getQuiz().getId());
            }

            if(dto.getHomeWork() != null && dto.getHomeWork().getId() != null){
                item.setHomeWork(new HomeWork());
                item.getHomeWork().setId(dto.getHomeWork().getId());
            }


            if(this.reponses && ListUtil.isNotEmpty(dto.getReponses()))
                item.setReponses(reponseConverter.toItem(dto.getReponses()));

        return item;
        }
    }

    @Override
    public QuestionDto toDto(Question item) {
        if (item == null) {
            return null;
        } else {
            QuestionDto dto = new QuestionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getUrlImg()))
                dto.setUrlImg(item.getUrlImg());
            if(StringUtil.isNotEmpty(item.getUrlVideo()))
                dto.setUrlVideo(item.getUrlVideo());
            if(StringUtil.isNotEmpty(item.getNumero()))
                dto.setNumero(item.getNumero());
            if(StringUtil.isNotEmpty(item.getPointReponseJuste()))
                dto.setPointReponseJuste(item.getPointReponseJuste());
            if(StringUtil.isNotEmpty(item.getPointReponsefausse()))
                dto.setPointReponsefausse(item.getPointReponsefausse());
        if(this.typeDeQuestion && item.getTypeDeQuestion()!=null) {
            dto.setTypeDeQuestion(typeDeQuestionConverter.toDto(item.getTypeDeQuestion())) ;
        }
        if(this.quiz && item.getQuiz()!=null) {
            dto.setQuiz(quizConverter.toDto(item.getQuiz())) ;
        }
        if(this.homeWork && item.getHomeWork()!=null) {
            dto.setHomeWork(homeWorkConverter.toDto(item.getHomeWork())) ;
        }
        if(this.reponses && ListUtil.isNotEmpty(item.getReponses())){
            reponseConverter.init(true);
            reponseConverter.setQuestion(false);
            dto.setReponses(reponseConverter.toDto(item.getReponses()));
            reponseConverter.setQuestion(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.reponses = value;
    }

    public void initObject(boolean value) {
        this.typeDeQuestion = value;
        this.quiz = value;
        this.homeWork = value;
    }


    public TypeDeQuestionConverter getTypeDeQuestionConverter(){
        return this.typeDeQuestionConverter;
    }
    public void setTypeDeQuestionConverter(TypeDeQuestionConverter typeDeQuestionConverter ){
        this.typeDeQuestionConverter = typeDeQuestionConverter;
    }
    public QuizConverter getQuizConverter(){
        return this.quizConverter;
    }
    public void setQuizConverter(QuizConverter quizConverter ){
        this.quizConverter = quizConverter;
    }
    public ReponseConverter getReponseConverter(){
        return this.reponseConverter;
    }
    public void setReponseConverter(ReponseConverter reponseConverter ){
        this.reponseConverter = reponseConverter;
    }
    public HomeWorkConverter getHomeWorkConverter(){
        return this.homeWorkConverter;
    }
    public void setHomeWorkConverter(HomeWorkConverter homeWorkConverter ){
        this.homeWorkConverter = homeWorkConverter;
    }
    public EtatReponseConverter getEtatReponseConverter(){
        return this.etatReponseConverter;
    }
    public void setEtatReponseConverter(EtatReponseConverter etatReponseConverter ){
        this.etatReponseConverter = etatReponseConverter;
    }
    public boolean  isTypeDeQuestion(){
        return this.typeDeQuestion;
    }
    public void  setTypeDeQuestion(boolean typeDeQuestion){
        this.typeDeQuestion = typeDeQuestion;
    }
    public boolean  isQuiz(){
        return this.quiz;
    }
    public void  setQuiz(boolean quiz){
        this.quiz = quiz;
    }
    public boolean  isHomeWork(){
        return this.homeWork;
    }
    public void  setHomeWork(boolean homeWork){
        this.homeWork = homeWork;
    }
    public boolean  isReponses(){
        return this.reponses ;
    }
    public void  setReponses(boolean reponses ){
        this.reponses  = reponses ;
    }
}
