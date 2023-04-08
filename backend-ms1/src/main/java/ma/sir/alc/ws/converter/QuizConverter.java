package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Section;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.QuizHistory;
import ma.sir.alc.bean.core.Quiz;
import ma.sir.alc.ws.dto.QuizDto;

@Component
public class QuizConverter extends AbstractConverter<Quiz, QuizDto, QuizHistory> {

    @Autowired
    private TypeDeQuestionConverter typeDeQuestionConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private ReponseConverter reponseConverter ;
    @Autowired
    private QuestionConverter questionConverter ;
    @Autowired
    private ReponseEtudiantConverter reponseEtudiantConverter ;
    @Autowired
    private HomeWorkConverter homeWorkConverter ;
    @Autowired
    private QuizEtudiantConverter quizEtudiantConverter ;
    @Autowired
    private SectionConverter sectionConverter ;
    private boolean section;
    private boolean questions;
    private boolean quizEtudiants;

    public  QuizConverter(){
        super(Quiz.class, QuizDto.class, QuizHistory.class);
        init(true);
    }

    @Override
    public Quiz toItem(QuizDto dto) {
        if (dto == null) {
            return null;
        } else {
        Quiz item = new Quiz();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLib()))
                item.setLib(dto.getLib());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(StringUtil.isNotEmpty(dto.getNumero()))
                item.setNumero(dto.getNumero());
            if(StringUtil.isNotEmpty(dto.getSeuilReussite()))
                item.setSeuilReussite(dto.getSeuilReussite());
            if(dto.getSection() != null && dto.getSection().getId() != null){
                item.setSection(new Section());
                item.getSection().setId(dto.getSection().getId());
            }


            if(this.questions && ListUtil.isNotEmpty(dto.getQuestions()))
                item.setQuestions(questionConverter.toItem(dto.getQuestions()));
            if(this.quizEtudiants && ListUtil.isNotEmpty(dto.getQuizEtudiants()))
                item.setQuizEtudiants(quizEtudiantConverter.toItem(dto.getQuizEtudiants()));

        return item;
        }
    }

    @Override
    public QuizDto toDto(Quiz item) {
        if (item == null) {
            return null;
        } else {
            QuizDto dto = new QuizDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLib()))
                dto.setLib(item.getLib());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
            if(StringUtil.isNotEmpty(item.getNumero()))
                dto.setNumero(item.getNumero());
            if(StringUtil.isNotEmpty(item.getSeuilReussite()))
                dto.setSeuilReussite(item.getSeuilReussite());
        if(this.section && item.getSection()!=null) {
            dto.setSection(sectionConverter.toDto(item.getSection())) ;
        }
        if(this.questions && ListUtil.isNotEmpty(item.getQuestions())){
            questionConverter.init(true);
            questionConverter.setQuiz(false);
            dto.setQuestions(questionConverter.toDto(item.getQuestions()));
            questionConverter.setQuiz(true);

        }
        if(this.quizEtudiants && ListUtil.isNotEmpty(item.getQuizEtudiants())){
            quizEtudiantConverter.init(true);
            quizEtudiantConverter.setQuiz(false);
            dto.setQuizEtudiants(quizEtudiantConverter.toDto(item.getQuizEtudiants()));
            quizEtudiantConverter.setQuiz(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.questions = value;
        this.quizEtudiants = value;
    }

    public void initObject(boolean value) {
        this.section = value;
    }


    public TypeDeQuestionConverter getTypeDeQuestionConverter(){
        return this.typeDeQuestionConverter;
    }
    public void setTypeDeQuestionConverter(TypeDeQuestionConverter typeDeQuestionConverter ){
        this.typeDeQuestionConverter = typeDeQuestionConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public ReponseConverter getReponseConverter(){
        return this.reponseConverter;
    }
    public void setReponseConverter(ReponseConverter reponseConverter ){
        this.reponseConverter = reponseConverter;
    }
    public QuestionConverter getQuestionConverter(){
        return this.questionConverter;
    }
    public void setQuestionConverter(QuestionConverter questionConverter ){
        this.questionConverter = questionConverter;
    }
    public ReponseEtudiantConverter getReponseEtudiantConverter(){
        return this.reponseEtudiantConverter;
    }
    public void setReponseEtudiantConverter(ReponseEtudiantConverter reponseEtudiantConverter ){
        this.reponseEtudiantConverter = reponseEtudiantConverter;
    }
    public HomeWorkConverter getHomeWorkConverter(){
        return this.homeWorkConverter;
    }
    public void setHomeWorkConverter(HomeWorkConverter homeWorkConverter ){
        this.homeWorkConverter = homeWorkConverter;
    }
    public QuizEtudiantConverter getQuizEtudiantConverter(){
        return this.quizEtudiantConverter;
    }
    public void setQuizEtudiantConverter(QuizEtudiantConverter quizEtudiantConverter ){
        this.quizEtudiantConverter = quizEtudiantConverter;
    }
    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public boolean  isSection(){
        return this.section;
    }
    public void  setSection(boolean section){
        this.section = section;
    }
    public boolean  isQuestions(){
        return this.questions ;
    }
    public void  setQuestions(boolean questions ){
        this.questions  = questions ;
    }
    public boolean  isQuizEtudiants(){
        return this.quizEtudiants ;
    }
    public void  setQuizEtudiants(boolean quizEtudiants ){
        this.quizEtudiants  = quizEtudiants ;
    }
}
