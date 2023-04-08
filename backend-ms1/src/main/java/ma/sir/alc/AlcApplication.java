package  ma.sir.alc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import ma.sir.alc.bean.core.*;
import ma.sir.alc.service.facade.admin.*;

import ma.sir.alc.zynerator.security.common.AuthoritiesConstants;
import ma.sir.alc.zynerator.security.bean.User;
import ma.sir.alc.zynerator.security.bean.Permission;
import ma.sir.alc.zynerator.security.bean.Role;
import ma.sir.alc.zynerator.security.service.facade.UserService;
import ma.sir.alc.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableFeignClients("ma.sir.alc.required.facade")
public class AlcApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(AlcApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){



    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }




    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("InviteStudent.edit"));
        permissions.add(new Permission("InviteStudent.list"));
        permissions.add(new Permission("InviteStudent.view"));
        permissions.add(new Permission("InviteStudent.add"));
        permissions.add(new Permission("InviteStudent.delete"));
        permissions.add(new Permission("News.edit"));
        permissions.add(new Permission("News.list"));
        permissions.add(new Permission("News.view"));
        permissions.add(new Permission("News.add"));
        permissions.add(new Permission("News.delete"));
        permissions.add(new Permission("WorkloadBonusProf.edit"));
        permissions.add(new Permission("WorkloadBonusProf.list"));
        permissions.add(new Permission("WorkloadBonusProf.view"));
        permissions.add(new Permission("WorkloadBonusProf.add"));
        permissions.add(new Permission("WorkloadBonusProf.delete"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.edit"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.list"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.view"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.add"));
        permissions.add(new Permission("ReponseEtudiantHomeWork.delete"));
        permissions.add(new Permission("HomeWork.edit"));
        permissions.add(new Permission("HomeWork.list"));
        permissions.add(new Permission("HomeWork.view"));
        permissions.add(new Permission("HomeWork.add"));
        permissions.add(new Permission("HomeWork.delete"));
        permissions.add(new Permission("HomeWorkEtudiant.edit"));
        permissions.add(new Permission("HomeWorkEtudiant.list"));
        permissions.add(new Permission("HomeWorkEtudiant.view"));
        permissions.add(new Permission("HomeWorkEtudiant.add"));
        permissions.add(new Permission("HomeWorkEtudiant.delete"));
        permissions.add(new Permission("GroupeEtudiant.edit"));
        permissions.add(new Permission("GroupeEtudiant.list"));
        permissions.add(new Permission("GroupeEtudiant.view"));
        permissions.add(new Permission("GroupeEtudiant.add"));
        permissions.add(new Permission("GroupeEtudiant.delete"));
        permissions.add(new Permission("ClassAverageBonus.edit"));
        permissions.add(new Permission("ClassAverageBonus.list"));
        permissions.add(new Permission("ClassAverageBonus.view"));
        permissions.add(new Permission("ClassAverageBonus.add"));
        permissions.add(new Permission("ClassAverageBonus.delete"));
        permissions.add(new Permission("Services.edit"));
        permissions.add(new Permission("Services.list"));
        permissions.add(new Permission("Services.view"));
        permissions.add(new Permission("Services.add"));
        permissions.add(new Permission("Services.delete"));
        permissions.add(new Permission("CategorieProf.edit"));
        permissions.add(new Permission("CategorieProf.list"));
        permissions.add(new Permission("CategorieProf.view"));
        permissions.add(new Permission("CategorieProf.add"));
        permissions.add(new Permission("CategorieProf.delete"));
        permissions.add(new Permission("ClassRoom.edit"));
        permissions.add(new Permission("ClassRoom.list"));
        permissions.add(new Permission("ClassRoom.view"));
        permissions.add(new Permission("ClassRoom.add"));
        permissions.add(new Permission("ClassRoom.delete"));
        permissions.add(new Permission("Parcours.edit"));
        permissions.add(new Permission("Parcours.list"));
        permissions.add(new Permission("Parcours.view"));
        permissions.add(new Permission("Parcours.add"));
        permissions.add(new Permission("Parcours.delete"));
        permissions.add(new Permission("NiveauEtude.edit"));
        permissions.add(new Permission("NiveauEtude.list"));
        permissions.add(new Permission("NiveauEtude.view"));
        permissions.add(new Permission("NiveauEtude.add"));
        permissions.add(new Permission("NiveauEtude.delete"));
        permissions.add(new Permission("SessionCours.edit"));
        permissions.add(new Permission("SessionCours.list"));
        permissions.add(new Permission("SessionCours.view"));
        permissions.add(new Permission("SessionCours.add"));
        permissions.add(new Permission("SessionCours.delete"));
        permissions.add(new Permission("Inscription.edit"));
        permissions.add(new Permission("Inscription.list"));
        permissions.add(new Permission("Inscription.view"));
        permissions.add(new Permission("Inscription.add"));
        permissions.add(new Permission("Inscription.delete"));
        permissions.add(new Permission("EtatInscription.edit"));
        permissions.add(new Permission("EtatInscription.list"));
        permissions.add(new Permission("EtatInscription.view"));
        permissions.add(new Permission("EtatInscription.add"));
        permissions.add(new Permission("EtatInscription.delete"));
        permissions.add(new Permission("ClassAverageBonusProf.edit"));
        permissions.add(new Permission("ClassAverageBonusProf.list"));
        permissions.add(new Permission("ClassAverageBonusProf.view"));
        permissions.add(new Permission("ClassAverageBonusProf.add"));
        permissions.add(new Permission("ClassAverageBonusProf.delete"));
        permissions.add(new Permission("Etudiant.edit"));
        permissions.add(new Permission("Etudiant.list"));
        permissions.add(new Permission("Etudiant.view"));
        permissions.add(new Permission("Etudiant.add"));
        permissions.add(new Permission("Etudiant.delete"));
        permissions.add(new Permission("FreeTrialConfiguration.edit"));
        permissions.add(new Permission("FreeTrialConfiguration.list"));
        permissions.add(new Permission("FreeTrialConfiguration.view"));
        permissions.add(new Permission("FreeTrialConfiguration.add"));
        permissions.add(new Permission("FreeTrialConfiguration.delete"));
        permissions.add(new Permission("TypeReclamationProf.edit"));
        permissions.add(new Permission("TypeReclamationProf.list"));
        permissions.add(new Permission("TypeReclamationProf.view"));
        permissions.add(new Permission("TypeReclamationProf.add"));
        permissions.add(new Permission("TypeReclamationProf.delete"));
        permissions.add(new Permission("FaqType.edit"));
        permissions.add(new Permission("FaqType.list"));
        permissions.add(new Permission("FaqType.view"));
        permissions.add(new Permission("FaqType.add"));
        permissions.add(new Permission("FaqType.delete"));
        permissions.add(new Permission("CalendrierProf.edit"));
        permissions.add(new Permission("CalendrierProf.list"));
        permissions.add(new Permission("CalendrierProf.view"));
        permissions.add(new Permission("CalendrierProf.add"));
        permissions.add(new Permission("CalendrierProf.delete"));
        permissions.add(new Permission("Admin.edit"));
        permissions.add(new Permission("Admin.list"));
        permissions.add(new Permission("Admin.view"));
        permissions.add(new Permission("Admin.add"));
        permissions.add(new Permission("Admin.delete"));
        permissions.add(new Permission("TypeReclamationEtudiant.edit"));
        permissions.add(new Permission("TypeReclamationEtudiant.list"));
        permissions.add(new Permission("TypeReclamationEtudiant.view"));
        permissions.add(new Permission("TypeReclamationEtudiant.add"));
        permissions.add(new Permission("TypeReclamationEtudiant.delete"));
        permissions.add(new Permission("QuizClassRoom.edit"));
        permissions.add(new Permission("QuizClassRoom.list"));
        permissions.add(new Permission("QuizClassRoom.view"));
        permissions.add(new Permission("QuizClassRoom.add"));
        permissions.add(new Permission("QuizClassRoom.delete"));
        permissions.add(new Permission("NiveauEtude.edit"));
        permissions.add(new Permission("NiveauEtude.list"));
        permissions.add(new Permission("NiveauEtude.view"));
        permissions.add(new Permission("NiveauEtude.add"));
        permissions.add(new Permission("NiveauEtude.delete"));
        permissions.add(new Permission("StatutSocial.edit"));
        permissions.add(new Permission("StatutSocial.list"));
        permissions.add(new Permission("StatutSocial.view"));
        permissions.add(new Permission("StatutSocial.add"));
        permissions.add(new Permission("StatutSocial.delete"));
        permissions.add(new Permission("Quiz.edit"));
        permissions.add(new Permission("Quiz.list"));
        permissions.add(new Permission("Quiz.view"));
        permissions.add(new Permission("Quiz.add"));
        permissions.add(new Permission("Quiz.delete"));
        permissions.add(new Permission("GroupeEtude.edit"));
        permissions.add(new Permission("GroupeEtude.list"));
        permissions.add(new Permission("GroupeEtude.view"));
        permissions.add(new Permission("GroupeEtude.add"));
        permissions.add(new Permission("GroupeEtude.delete"));
        permissions.add(new Permission("TypeHomeWork.edit"));
        permissions.add(new Permission("TypeHomeWork.list"));
        permissions.add(new Permission("TypeHomeWork.view"));
        permissions.add(new Permission("TypeHomeWork.add"));
        permissions.add(new Permission("TypeHomeWork.delete"));
        permissions.add(new Permission("Cours.edit"));
        permissions.add(new Permission("Cours.list"));
        permissions.add(new Permission("Cours.view"));
        permissions.add(new Permission("Cours.add"));
        permissions.add(new Permission("Cours.delete"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.edit"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.list"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.view"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.add"));
        permissions.add(new Permission("FreeTrialTeacherWhatsTemplate.delete"));
        permissions.add(new Permission("SectionItem.edit"));
        permissions.add(new Permission("SectionItem.list"));
        permissions.add(new Permission("SectionItem.view"));
        permissions.add(new Permission("SectionItem.add"));
        permissions.add(new Permission("SectionItem.delete"));
        permissions.add(new Permission("FreeTrial.edit"));
        permissions.add(new Permission("FreeTrial.list"));
        permissions.add(new Permission("FreeTrial.view"));
        permissions.add(new Permission("FreeTrial.add"));
        permissions.add(new Permission("FreeTrial.delete"));
        permissions.add(new Permission("Section.edit"));
        permissions.add(new Permission("Section.list"));
        permissions.add(new Permission("Section.view"));
        permissions.add(new Permission("Section.add"));
        permissions.add(new Permission("Section.delete"));
        permissions.add(new Permission("EtudiantCours.edit"));
        permissions.add(new Permission("EtudiantCours.list"));
        permissions.add(new Permission("EtudiantCours.view"));
        permissions.add(new Permission("EtudiantCours.add"));
        permissions.add(new Permission("EtudiantCours.delete"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.edit"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.list"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.view"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.add"));
        permissions.add(new Permission("FreeTrialStudentWhatsTemplate.delete"));
        permissions.add(new Permission("LevelTestConfiguration.edit"));
        permissions.add(new Permission("LevelTestConfiguration.list"));
        permissions.add(new Permission("LevelTestConfiguration.view"));
        permissions.add(new Permission("LevelTestConfiguration.add"));
        permissions.add(new Permission("LevelTestConfiguration.delete"));
        permissions.add(new Permission("StatutFreeTrial.edit"));
        permissions.add(new Permission("StatutFreeTrial.list"));
        permissions.add(new Permission("StatutFreeTrial.view"));
        permissions.add(new Permission("StatutFreeTrial.add"));
        permissions.add(new Permission("StatutFreeTrial.delete"));
        permissions.add(new Permission("ReponseEtudiant.edit"));
        permissions.add(new Permission("ReponseEtudiant.list"));
        permissions.add(new Permission("ReponseEtudiant.view"));
        permissions.add(new Permission("ReponseEtudiant.add"));
        permissions.add(new Permission("ReponseEtudiant.delete"));
        permissions.add(new Permission("EtatEtudiant.edit"));
        permissions.add(new Permission("EtatEtudiant.list"));
        permissions.add(new Permission("EtatEtudiant.view"));
        permissions.add(new Permission("EtatEtudiant.add"));
        permissions.add(new Permission("EtatEtudiant.delete"));
        permissions.add(new Permission("FreeTrialDetail.edit"));
        permissions.add(new Permission("FreeTrialDetail.list"));
        permissions.add(new Permission("FreeTrialDetail.view"));
        permissions.add(new Permission("FreeTrialDetail.add"));
        permissions.add(new Permission("FreeTrialDetail.delete"));
        permissions.add(new Permission("ScheduleProf.edit"));
        permissions.add(new Permission("ScheduleProf.list"));
        permissions.add(new Permission("ScheduleProf.view"));
        permissions.add(new Permission("ScheduleProf.add"));
        permissions.add(new Permission("ScheduleProf.delete"));
        permissions.add(new Permission("Fonction.edit"));
        permissions.add(new Permission("Fonction.list"));
        permissions.add(new Permission("Fonction.view"));
        permissions.add(new Permission("Fonction.add"));
        permissions.add(new Permission("Fonction.delete"));
        permissions.add(new Permission("HoweWorkQSTReponse.edit"));
        permissions.add(new Permission("HoweWorkQSTReponse.list"));
        permissions.add(new Permission("HoweWorkQSTReponse.view"));
        permissions.add(new Permission("HoweWorkQSTReponse.add"));
        permissions.add(new Permission("HoweWorkQSTReponse.delete"));
        permissions.add(new Permission("Contact.edit"));
        permissions.add(new Permission("Contact.list"));
        permissions.add(new Permission("Contact.view"));
        permissions.add(new Permission("Contact.add"));
        permissions.add(new Permission("Contact.delete"));
        permissions.add(new Permission("TypeTeacher.edit"));
        permissions.add(new Permission("TypeTeacher.list"));
        permissions.add(new Permission("TypeTeacher.view"));
        permissions.add(new Permission("TypeTeacher.add"));
        permissions.add(new Permission("TypeTeacher.delete"));
        permissions.add(new Permission("EtudiantClassRoom.edit"));
        permissions.add(new Permission("EtudiantClassRoom.list"));
        permissions.add(new Permission("EtudiantClassRoom.view"));
        permissions.add(new Permission("EtudiantClassRoom.add"));
        permissions.add(new Permission("EtudiantClassRoom.delete"));
        permissions.add(new Permission("EtatReponse.edit"));
        permissions.add(new Permission("EtatReponse.list"));
        permissions.add(new Permission("EtatReponse.view"));
        permissions.add(new Permission("EtatReponse.add"));
        permissions.add(new Permission("EtatReponse.delete"));
        permissions.add(new Permission("ResultatHomeWork.edit"));
        permissions.add(new Permission("ResultatHomeWork.list"));
        permissions.add(new Permission("ResultatHomeWork.view"));
        permissions.add(new Permission("ResultatHomeWork.add"));
        permissions.add(new Permission("ResultatHomeWork.delete"));
        permissions.add(new Permission("ConfirmationToken.edit"));
        permissions.add(new Permission("ConfirmationToken.list"));
        permissions.add(new Permission("ConfirmationToken.view"));
        permissions.add(new Permission("ConfirmationToken.add"));
        permissions.add(new Permission("ConfirmationToken.delete"));
        permissions.add(new Permission("SuperCategorieSection.edit"));
        permissions.add(new Permission("SuperCategorieSection.list"));
        permissions.add(new Permission("SuperCategorieSection.view"));
        permissions.add(new Permission("SuperCategorieSection.add"));
        permissions.add(new Permission("SuperCategorieSection.delete"));
        permissions.add(new Permission("Faq.edit"));
        permissions.add(new Permission("Faq.list"));
        permissions.add(new Permission("Faq.view"));
        permissions.add(new Permission("Faq.add"));
        permissions.add(new Permission("Faq.delete"));
        permissions.add(new Permission("CategorieSection.edit"));
        permissions.add(new Permission("CategorieSection.list"));
        permissions.add(new Permission("CategorieSection.view"));
        permissions.add(new Permission("CategorieSection.add"));
        permissions.add(new Permission("CategorieSection.delete"));
        permissions.add(new Permission("PackStudent.edit"));
        permissions.add(new Permission("PackStudent.list"));
        permissions.add(new Permission("PackStudent.view"));
        permissions.add(new Permission("PackStudent.add"));
        permissions.add(new Permission("PackStudent.delete"));
        permissions.add(new Permission("GroupeEtudiantDetail.edit"));
        permissions.add(new Permission("GroupeEtudiantDetail.list"));
        permissions.add(new Permission("GroupeEtudiantDetail.view"));
        permissions.add(new Permission("GroupeEtudiantDetail.add"));
        permissions.add(new Permission("GroupeEtudiantDetail.delete"));
        permissions.add(new Permission("TypeDeQuestion.edit"));
        permissions.add(new Permission("TypeDeQuestion.list"));
        permissions.add(new Permission("TypeDeQuestion.view"));
        permissions.add(new Permission("TypeDeQuestion.add"));
        permissions.add(new Permission("TypeDeQuestion.delete"));
        permissions.add(new Permission("TrancheHoraireProf.edit"));
        permissions.add(new Permission("TrancheHoraireProf.list"));
        permissions.add(new Permission("TrancheHoraireProf.view"));
        permissions.add(new Permission("TrancheHoraireProf.add"));
        permissions.add(new Permission("TrancheHoraireProf.delete"));
        permissions.add(new Permission("FreeTrialformule.edit"));
        permissions.add(new Permission("FreeTrialformule.list"));
        permissions.add(new Permission("FreeTrialformule.view"));
        permissions.add(new Permission("FreeTrialformule.add"));
        permissions.add(new Permission("FreeTrialformule.delete"));
        permissions.add(new Permission("EtatEtudiantSchedule.edit"));
        permissions.add(new Permission("EtatEtudiantSchedule.list"));
        permissions.add(new Permission("EtatEtudiantSchedule.view"));
        permissions.add(new Permission("EtatEtudiantSchedule.add"));
        permissions.add(new Permission("EtatEtudiantSchedule.delete"));
        permissions.add(new Permission("HomeWorkQuestion.edit"));
        permissions.add(new Permission("HomeWorkQuestion.list"));
        permissions.add(new Permission("HomeWorkQuestion.view"));
        permissions.add(new Permission("HomeWorkQuestion.add"));
        permissions.add(new Permission("HomeWorkQuestion.delete"));
        permissions.add(new Permission("Question.edit"));
        permissions.add(new Permission("Question.list"));
        permissions.add(new Permission("Question.view"));
        permissions.add(new Permission("Question.add"));
        permissions.add(new Permission("Question.delete"));
        permissions.add(new Permission("RecommendTeacher.edit"));
        permissions.add(new Permission("RecommendTeacher.list"));
        permissions.add(new Permission("RecommendTeacher.view"));
        permissions.add(new Permission("RecommendTeacher.add"));
        permissions.add(new Permission("RecommendTeacher.delete"));
        permissions.add(new Permission("Price.edit"));
        permissions.add(new Permission("Price.list"));
        permissions.add(new Permission("Price.view"));
        permissions.add(new Permission("Price.add"));
        permissions.add(new Permission("Price.delete"));
        permissions.add(new Permission("Centre.edit"));
        permissions.add(new Permission("Centre.list"));
        permissions.add(new Permission("Centre.view"));
        permissions.add(new Permission("Centre.add"));
        permissions.add(new Permission("Centre.delete"));
        permissions.add(new Permission("ReclamationEtudiant.edit"));
        permissions.add(new Permission("ReclamationEtudiant.list"));
        permissions.add(new Permission("ReclamationEtudiant.view"));
        permissions.add(new Permission("ReclamationEtudiant.add"));
        permissions.add(new Permission("ReclamationEtudiant.delete"));
        permissions.add(new Permission("Skill.edit"));
        permissions.add(new Permission("Skill.list"));
        permissions.add(new Permission("Skill.view"));
        permissions.add(new Permission("Skill.add"));
        permissions.add(new Permission("Skill.delete"));
        permissions.add(new Permission("Prof.edit"));
        permissions.add(new Permission("Prof.list"));
        permissions.add(new Permission("Prof.view"));
        permissions.add(new Permission("Prof.add"));
        permissions.add(new Permission("Prof.delete"));
        permissions.add(new Permission("WorkloadBonus.edit"));
        permissions.add(new Permission("WorkloadBonus.list"));
        permissions.add(new Permission("WorkloadBonus.view"));
        permissions.add(new Permission("WorkloadBonus.add"));
        permissions.add(new Permission("WorkloadBonus.delete"));
        permissions.add(new Permission("Langue.edit"));
        permissions.add(new Permission("Langue.list"));
        permissions.add(new Permission("Langue.view"));
        permissions.add(new Permission("Langue.add"));
        permissions.add(new Permission("Langue.delete"));
        permissions.add(new Permission("Paiement.edit"));
        permissions.add(new Permission("Paiement.list"));
        permissions.add(new Permission("Paiement.view"));
        permissions.add(new Permission("Paiement.add"));
        permissions.add(new Permission("Paiement.delete"));
        permissions.add(new Permission("TeacherLocality.edit"));
        permissions.add(new Permission("TeacherLocality.list"));
        permissions.add(new Permission("TeacherLocality.view"));
        permissions.add(new Permission("TeacherLocality.add"));
        permissions.add(new Permission("TeacherLocality.delete"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.edit"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.list"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.view"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.add"));
        permissions.add(new Permission("FreeTrialStudentEmailTemplate.delete"));
        permissions.add(new Permission("Reponse.edit"));
        permissions.add(new Permission("Reponse.list"));
        permissions.add(new Permission("Reponse.view"));
        permissions.add(new Permission("Reponse.add"));
        permissions.add(new Permission("Reponse.delete"));
        permissions.add(new Permission("InteretEtudiant.edit"));
        permissions.add(new Permission("InteretEtudiant.list"));
        permissions.add(new Permission("InteretEtudiant.view"));
        permissions.add(new Permission("InteretEtudiant.add"));
        permissions.add(new Permission("InteretEtudiant.delete"));
        permissions.add(new Permission("QuizEtudiant.edit"));
        permissions.add(new Permission("QuizEtudiant.list"));
        permissions.add(new Permission("QuizEtudiant.view"));
        permissions.add(new Permission("QuizEtudiant.add"));
        permissions.add(new Permission("QuizEtudiant.delete"));
        permissions.add(new Permission("Dictionary.edit"));
        permissions.add(new Permission("Dictionary.list"));
        permissions.add(new Permission("Dictionary.view"));
        permissions.add(new Permission("Dictionary.add"));
        permissions.add(new Permission("Dictionary.delete"));
        permissions.add(new Permission("Salary.edit"));
        permissions.add(new Permission("Salary.list"));
        permissions.add(new Permission("Salary.view"));
        permissions.add(new Permission("Salary.add"));
        permissions.add(new Permission("Salary.delete"));
        permissions.add(new Permission("EtatCours.edit"));
        permissions.add(new Permission("EtatCours.list"));
        permissions.add(new Permission("EtatCours.view"));
        permissions.add(new Permission("EtatCours.add"));
        permissions.add(new Permission("EtatCours.delete"));
        permissions.add(new Permission("ProfReview.edit"));
        permissions.add(new Permission("ProfReview.list"));
        permissions.add(new Permission("ProfReview.view"));
        permissions.add(new Permission("ProfReview.add"));
        permissions.add(new Permission("ProfReview.delete"));
        permissions.add(new Permission("ReclamationProf.edit"));
        permissions.add(new Permission("ReclamationProf.list"));
        permissions.add(new Permission("ReclamationProf.view"));
        permissions.add(new Permission("ReclamationProf.add"));
        permissions.add(new Permission("ReclamationProf.delete"));
        permissions.add(new Permission("VocabularyQuiz.edit"));
        permissions.add(new Permission("VocabularyQuiz.list"));
        permissions.add(new Permission("VocabularyQuiz.view"));
        permissions.add(new Permission("VocabularyQuiz.add"));
        permissions.add(new Permission("VocabularyQuiz.delete"));
        permissions.add(new Permission("FaqEtudiant.edit"));
        permissions.add(new Permission("FaqEtudiant.list"));
        permissions.add(new Permission("FaqEtudiant.view"));
        permissions.add(new Permission("FaqEtudiant.add"));
        permissions.add(new Permission("FaqEtudiant.delete"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.edit"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.list"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.view"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.add"));
        permissions.add(new Permission("FreeTrialTeacherEmailTemplate.delete"));
        permissions.add(new Permission("Vocabulary.edit"));
        permissions.add(new Permission("Vocabulary.list"));
        permissions.add(new Permission("Vocabulary.view"));
        permissions.add(new Permission("Vocabulary.add"));
        permissions.add(new Permission("Vocabulary.delete"));
        permissions.add(new Permission("EtudiantReview.edit"));
        permissions.add(new Permission("EtudiantReview.list"));
        permissions.add(new Permission("EtudiantReview.view"));
        permissions.add(new Permission("EtudiantReview.add"));
        permissions.add(new Permission("EtudiantReview.delete"));
        permissions.add(new Permission("FaqProf.edit"));
        permissions.add(new Permission("FaqProf.list"));
        permissions.add(new Permission("FaqProf.view"));
        permissions.add(new Permission("FaqProf.add"));
        permissions.add(new Permission("FaqProf.delete"));
    }

}

