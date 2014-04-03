package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/locale")
public class Localization {

    @GET
    @Path("/data")
    @Produces("application/json")
    public String dealerPortalData(@QueryParam(value = "countryCode") String countryCode,
								   @QueryParam(value = "languageCode") String languageCode,
								   @QueryParam(value = "localizationPattern") String localizationPattern,
								   @QueryParam(value = "webKey") String webKey) {
        String result = "{ \"success\": true, \"localizations\":[" +
                    "{\"label\":\"dp.Login.log_in_to_xtime\", \"data\":\"Log in to Xtime\"},"+
                    "{\"label\":\"dp.Login.new_passwordF_must_adhere\", \"data\":\"Your new password must adhere to the following\"},"+
                    "{\"label\":\"dp.Login.password_expired_need_to_change\", \"data\":\"Your password has expired. In order to log-in to Xtime ServiceCRM you will need to change your password.\"},"+
                    "{\"label\":\"dp.Login.login\", \"data\":\"Log in\"},"+
                    "{\"label\":\"dp.Login.Back\", \"data\":\"Back\"},"+
                    "{\"label\":\"dp.Login.lost_username_or_password\", \"data\":\"Lost Username or Password?\"},"+
                    "{\"label\":\"dp.Login.your_email_address\", \"data\":\"Your email address\"},"+
                    "{\"label\":\"dp.Login.enter_username_to_recover_password\", \"data\":\"Please enter your username to recover your password\"},"+
                    "{\"label\":\"dp.Login.what_is_your_username.UPPER\", \"data\":\"WHAT IS YOUR USERNAME?\"},"+
                    "{\"label\":\"dp.Login.Answer_your_security_question\", \"data\":\"Please answer your security question\"},"+
                    "{\"label\":\"dp.Login.great\", \"data\":\"Great!\"},"+
                    "{\"label\":\"dp.Login.Sorry\", \"data\":\"Sorry\"},"+
                    "{\"label\":\"dp.Login.whoops\", \"data\":\"Whoops!\"},"+
                    "{\"label\":\"dp.Login.invalid_username_password_combination\", \"data\":\"Invalid username and password combination. Please try again.\"},"+
                    "{\"label\":\"dp.Login.sent_username_to_email\", \"data\":\"We just sent your username to your email address. Please check your inbox.\"},"+
                    "{\"label\":\"dp3.login.Provided_invalid_username\", \"data\":\"You provided an invalid username\"},"+
                    "{\"label\":\"dp3.login.Inbox_temporary_password\", \"data\":\"We just send a temporary password to your email address. Please check your inbox.\"},"+
                    "{\"label\":\"dp3.login.Wrong_answer\", \"data\":\"Wrong answer\"},"+
                    "{\"label\":\"dp.Login.username\", \"data\":\"Username\"},"+
                    "{\"label\":\"dp.Login.password\", \"data\":\"Password\"},"+
                    "{\"label\":\"dp.Login.temporary_password.UPPER\", \"data\":\"TEMPORARY PASSWORD\"},"+
                    "{\"label\":\"dp3.login.Remember_my_email\", \"data\":\"Remember my email on this computer\"},"+
                    "{\"label\":\"dp3.login.Forgot_username_password\", \"data\":\"Forgot Username or Password?\"},"+
                    "{\"label\":\"dp3.login.Forgot_user\", \"data\":\"Click here</a> if you forgot your user.\"},"+
                    "{\"label\":\"dp3.login.Forgot_password\", \"data\":\"Click here</a> if you forgot your password.\"},"+
                    "{\"label\":\"dp.Login.xtime_copyright\", \"data\":\"\u00A9 2013 Xtime, Inc. All Rights Reserved.\"},"+
                    "{\"label\":\"dp.Login.home\", \"data\":\"Home\"},"+
                    "{\"label\":\"dp.Login.support\", \"data\":\"Support\"},"+
                    "{\"label\":\"dp.Login.contact_us.CAMEL\", \"data\":\"Contact Us\"},"+
                    "{\"label\":\"dp.Login.Click_password_reset\", \"data\":\"Click password reset\"},"+
                    "{\"label\":\"dp.Login.Click_to_password_reset\", \"data\":\"to reset your password\"},"+
                    "{\"label\":\"dp.Login.contact_us\", \"data\":\"Contact us\"},"+
                    "{\"label\":\"dp.Login.contact_us_and\", \"data\":\"and one of our sales associates will contact you for a personal demonstration.\"},"+
                    "{\"label\":\"dp.Login.send_feedback\", \"data\":\"Send Feedback\"},"+
                    "{\"label\":\"dp.Login.American_english\", \"data\":\"American English\"},"+
                    "{\"label\":\"dp.Login.French_canada\", \"data\":\"French Canada\"},"+
                    "{\"label\":\"dp.Login.cancel.UPPER\", \"data\":\"CANCEL\"},"+
                    "{\"label\":\"dp.Login.submit.UPPER\", \"data\":\"SUBMIT\"},"+
                    "{\"label\":\"dp.Login.password_not_meet_requirements\", \"data\":\"The password you entered does not meet the requirements listed above.\"},"+
                    "{\"label\":\"dp.Login.click_here\", \"data\":\"CLICK HERE\"},"+
                    "{\"label\":\"dp3.login.Password_regex_rules\", \"data\":\"Password entered does not match the password rule. Please make sure the password entered is -\"},"+
                    "{\"label\":\"dp3.login.Password_regex_rule_1\", \"data\":\"<br>  Between 8 and 64 characters long\"},"+
                    "{\"label\":\"dp3.login.Password_regex_rule_2\", \"data\":\"<br>  Contains at least 1 upper case letter\"},"+
                    "{\"label\":\"dp3.login.Password_regex_rule_3\", \"data\":\"<br>  Contains at least 1 number (0-9)\"},"+
                    "{\"label\":\"dp3.login.Password_regex_rule_4\", \"data\":\"<br>  Contains at least 1 lower case letter\"},"+
                    "{\"label\":\"dp.Login.new_password.UPPER\", \"data\":\"NEW PASSWORD\"},"+
                    "{\"label\":\"dp.Login.confirm_password.UPPER\", \"data\":\"CONFIRM PASSWORD\"},"+
                    "{\"label\":\"dp.Login.passwords_dont_match\", \"data\":\"The new password and confirm new password do not match. Please re-enter passwords.\"},"+
                    "{\"label\":\"dp3.login.Challenge_question\", \"data\":\"CHALLENGE QUESTION #\"},"+
                    "{\"label\":\"dp3.login.Answer_here\", \"data\":\"Your answer here.\"},"+
                    "{\"label\":\"dp3.login.Support_title\", \"data\":\"SUPPORT\"},"+
                    "{\"label\":\"dp.Login.Customer_service\", \"data\":\"We strive to provide you exceptional costumer service.\"},"+
                    "{\"label\":\"dp.Login.Most_out_xtime\", \"data\":\"Get the most out of Xtime!\"},"+
                    "{\"label\":\"dp.Login.Practice_videos_webinars\", \"data\":\"Our new best practice videos, webinars and online guides are available to you!\"},"+
                    "{\"label\":\"dp.Login.Attend_online_session\", \"data\":\"This free service provides you with the opportunity to attend an on-line session with a live instructor to learn how to maximize both your customer traffic and service revenue. The courses are taught by Xtime expert team of Field Service Consultants, who all come with strong ealership experience. Attend as often as you like! \"},"+
                    "{\"label\":\"dp.Login.Note_login_first\", \"data\":\"Note: you may have to login first. Click on 'Help' after login. It will take you there.\"},"+
                    "{\"label\":\"dp.Login.Submit_support_ticket\", \"data\":\"Submit A Support Ticket\"},"+
                    "{\"label\":\"dp.Login.Support_ticket_info\", \"data\":\"Our online ticketing portal was put in place to provide a higher level of service for our customers.\"},"+
                    "{\"label\":\"dp.Login.US_customer_service\", \"data\":\"U.S. bases customer service\"},"+
                    "{\"label\":\"dp.Login.Hour_response_time\", \"data\":\"1-12 hour response time\"},"+
                    "{\"label\":\"dp.Login.Call_us\", \"data\":\"Call US\"},"+
                    "{\"label\":\"dp.Login.reset\", \"data\":\"Reset\"},"+
                    "{\"label\":\"dp.Login.Your_password_expire_soon\", \"data\":\"Your password will expire soon. Do you want to change it now?\"},"+
                    "{\"label\":\"dp.Login.Email_us\", \"data\":\"Email US\"},"+
                    "{\"label\":\"dp.Login.challenge_question_1.UPPER\", \"data\":\"CHALLENGE QUESTION #1\"},"+
                    "{\"label\":\"dp.Login.challenge_question_2.UPPER\", \"data\":\"CHALLENGE QUESTION #2\"},"+
                    "{\"label\":\"dp.Login.challenge_question_3.UPPER\", \"data\":\"CHALLENGE QUESTION #3\"},"+
                    "{\"label\":\"dp.Login.ready_for_xtime\", \"data\":\"Ready for Xtime?\"},"+
                    "{\"label\":\"dp.Login.Receive_email_notices\", \"data\":\"Receive email notices (i.e. system outages, updates and important information)\"},"+
                    "{\"label\":\"dp3.login.Account_locked_5_attempts\", \"data\":\"Your account is locked because of 5 consecutive unsuccessful attempts to login.\"},"+
                    "{\"label\":\"dp3.login.Contact_xtime_help-desk\", \"data\":\"Please contact Xtime help desk at 1-866-984-6355 to unlock your account.\"},"+
                    "{\"label\":\"dp3.login.Your_account_locked_consecutive_unsuccessful\", \"data\":\"<br> Please note that your account will be locked after 5 consecutive unsuccessful attempts to log in\"},"+
                    "{\"label\":\"dp.Login.failure_capslock_check\", \"data\":\"Password is case sensitive. Is your caps Lock on?\"},"+
                    "{\"label\":\"dp.Login.failure_capslock_check_lock_5_attempts\", \"data\":\"Please ensure that your <b>CAPS LOCK</b> it is not on <br/> <b>Note:</b> Your account will be locked after 5 invalid tries\"},"+
                    "{\"label\":\"dp.Login.account_locked_click_to_reset\", \"data\":\"Your account has been locked\"},"+
                    "{\"label\":\"dp.Login.account_locked_contact_support\", \"data\":\"Your account has been locked. Please contact your dealership Xtime administrator or Xtime support (http://support.xtime.com,support@xtime.com or 1-866-984-6355).\"},"+
                    "{\"label\":\"dp.Login.not_set_up_challenge_questions\", \"data\":\"You have not yet set up challenge questions for password recovery. Please contact your dealer or <br/> Xtime support\"},"+
                    "{\"label\":\"dp.Login.login_with_temporary_password\", \"data\":\"Please login with your temporary password.\"},"+
                    "{\"label\":\"dp.Login.Missing_field\", \"data\":\"Missing or invalid fields\"},"+
                    "{\"label\":\"dp.Login.Missing_field_check_errors\", \"data\":\"Some fields are missing or not properly filled. Please verify you do not have any error alert.\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0013\", \"data\":\"new password doesn\'t match the password format\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0014\", \"data\":\"new password and the confirm password doesn\'t match\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0015\", \"data\":\"new password contains the word 'password'\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0016\", \"data\":\"new password should not contain the username in the password field\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0017\", \"data\":\"new password should not be same as the old password\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0018\", \"data\":\"new password should not match the last four password\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0020\", \"data\":\"Challenge  Question 1 is not answered\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0021\", \"data\":\"Challenge  Question 2 is not answered\"},"+
                    "{\"label\":\"dp.Login.Reset_password_ERR0022\", \"data\":\"Challenge  Question 3 is not answered\"},"+
                    "{\"label\":\"dp.Login.Search_criteria\", \"data\":\"Search criteria\"},"+
                    "{\"label\":\"dp.Login.Customer\", \"data\":\"CUSTOMER\"},"+
                    "{\"label\":\"dp.Login.SEARCH\", \"data\":\"SEARCH\"},"+
                    "{\"label\":\"dp.Login.challenge_response_incorrect_try_again\", \"data\":\"Your response to the challenge phrase was incorrect, Please try again (challenge phrase responses are not case sensitive)\"},"+
                    "{\"label\":\"dp.Login.hello\", \"data\":\"Hello\"},"+
                    "{\"label\":\"dp.Login.if_you_forgot_your\", \"data\":\"if you forgot your\"},"+
                    "{\"label\":\"dp.Login.invalid_email\", \"data\":\"No user exists with the specified email. Either you have entered a wrong email or you have not specified your email at the time of registration. Please try again or contact the dealership to retreive your username.\"},"+
                    "{\"label\":\"dp.Login.partner1_info_url\", \"data\":\"http://www.mcafee.com/\"},"+
                    "{\"label\":\"dp.Login.partner1_logo_url\", \"data\":\"http://media.xtime.com/i/uploads/mcafee_secure_logo.jpg\"},"+
                    "{\"label\":\"dp.Login.partner2_info_url\", \"data\":\"http://www.nada.com\"},"+
                    "{\"label\":\"dp.Login.partner2_logo_url\", \"data\":\"http://media.xtime.com/i/uploads/nada_logo.png\"},"+
                    "{\"label\":\"dp.Login.partner3_info_url\", \"data\":\"http://http://www.truste.com/\"},"+
                    "{\"label\":\"dp.Login.partner3_logo_url\", \"data\":\"http://media.xtime.com/i/uploads/truste_logo.jpg\"},"+
                    "{\"label\":\"dp.Login.password_changed_success\", \"data\":\"Your password has been successfully changed.\"},"+
                    "{\"label\":\"dp.Login.password_rule_complexity\", \"data\":\"Password must contain at least one upper-case letter, one lower-case letter and one number(0-9).\"},"+
                    "{\"label\":\"dp.Login.password_rule_length\", \"data\":\"Password must be between 8 and 64 characters long.\"},"+
                    "{\"label\":\"dp.Login.password_rule_not_contain_string_password\", \"data\":\"Password cannot contain string literal 'password'.\"},"+
                    "{\"label\":\"dp.Login.password_rule_not_repeat_last_four\", \"data\":\"Password cannot be one of the last four passwords used.\"},"+
                    "{\"label\":\"dp.Login.forgot_password_invalid_username\", \"data\":\"Password cannot be reset for the specified user. Please check your input and try again, or contact Dealer or Xtime support for help.\"},"+
                    "{\"label\":\"dp.Login.remember_me\", \"data\":\"Remember me on this computer\"},"+
                    "{\"label\":\"dp.Login.success_username_recovery\", \"data\":\"Your username was retreived successfully and it is sent to your email address.\"}"+
                "]}";
                if ("fr".equals(languageCode)) {
                    result = "{ \"success\": true, \"localizations\":[" +
                                "{\"label\":\"dp.Login.log_in_to_xtime\", \"data\":\"Connectez-vous à Xtime\"},"+
                                "{\"label\":\"dp.Login.new_password_must_adhere\", \"data\":\"Votre nouveau mot de passe doit se conformer à ce qui suit\"},"+
                                "{\"label\":\"dp.Login.password_expired_need_to_change\", \"data\":\"Votre mot de passe a expiré. Afin de vous connecter pour pouvoir Xtime ServiceCRM vous devrez changer votre mot de passe.\"},"+
                                "{\"label\":\"dp.Login.login\", \"data\":\"Connexion\"},"+
                                "{\"label\":\"dp.Login.Back\", \"data\":\"Retour\"},"+
                                "{\"label\":\"dp.Login.NEW PASSWORD_your_username\", \"data\":\"Vous avez perdu votre nom d'utilisateur? Nous vous enverrons par email\"},"+
                                "{\"label\":\"dp.Login.lost_username_or_password\", \"data\":\"Nom d'utilisateur ou mot de passe perdu?\"},"+
                                "{\"label\":\"dp.Login.your_email_address\", \"data\":\"Votre adresse e-mail\"},"+
                                "{\"label\":\"dp.Login.enter_username_to_recover_password\", \"data\":\"S'il vous plaît entrer votre nom d'utilisateur pour récupérer votre mot de passe\"},"+
                                "{\"label\":\"dp.Login.what_is_your_username.UPPER\", \"data\":\"QUEL EST VOTRE NOM D'UTILISATEUR?\"},"+
                                "{\"label\":\"dp.Login.Answer_your_security_question\", \"data\":\"S'il vous plaît répondre à votre question de sécurité\"},"+
                                "{\"label\":\"dp.Login.great\", \"data\":\"Great!\"},"+
                                "{\"label\":\"dp.Login.Sorry\", \"data\":\"Désolé\"},"+
                                "{\"label\":\"dp.Login.whoops\", \"data\":\"Oups!\"},"+
                                "{\"label\":\"dp.Login.invalid_username_password_combination\", \"data\":\"Nom d'utilisateur incorrect et combinaison de mot de passe. S'il vous plaît essayer de nouveau.\"},"+
                                "{\"label\":\"dp.Login.sent_username_to_email\", \"data\":\"Nous venons d'envoyer votre nom d'utilisateur pour votre adresse e-mail. S'il vous plaît vérifier votre boîte de réception.\"},"+
                                "{\"label\":\"dp3.login.Provided_invalid_username\", \"data\":\"Vous avez fourni un nom d'utilisateur incorrect\"},"+
                                "{\"label\":\"dp3.login.Inbox_temporary_password\", \"data\":\"Nous venons d'envoyer un mot de passe temporaire à votre adresse email. S'il vous plaît vérifier votre boîte de réception.\"},"+
                                "{\"label\":\"dp3.login.Wrong_answer\", \"data\":\"Mauvaise réponse\"},"+
                                "{\"label\":\"dp.Login.username\", \"data\":\"Nom d'utilisateur\"},"+
                                "{\"label\":\"dp.Login.password\", \"data\":\"Mot de passe\"},"+
                                "{\"label\":\"dp.Login.temporary_password.UPPER\", \"data\":\"Mot de passe temporaire\"},"+
                                "{\"label\":\"dp3.login.Remember_my_email\", \"data\":\"Rappelez-vous mon email sur cet ordinateur\"},"+
                                "{\"label\":\"dp3.login.Forgot_username_password\", \"data\":\"Oublié nom d'utilisateur ou mot de passe?\"},"+
                                "{\"label\":\"dp3.login.Forgot_user\", \"data\":\"Cliquez ici </ a> si vous avez oublié votre nom d'utilisateur.\"},"+
                                "{\"label\":\"dp3.login.Forgot_password\", \"data\":\"Cliquez ici </ a> si vous avez oublié votre mot de passe.\"},"+
                                "{\"label\":\"dp.Login.xtime_copyright\", \"data\":\"2013 Xtime, Inc. Tous droits réservés.\"},"+
                                "{\"label\":\"dp.Login.home\", \"data\":\"Maison\"},"+
                                "{\"label\":\"dp.Login.support\", \"data\":\"Soutenir\"},"+
                                "{\"label\":\"dp.Login.contact_us.CAMEL\", \"data\":\"Contactez-nous\"},"+
                                "{\"label\":\"dp.Login.contact_us\", \"data\":\"Contactez-nous\"},"+
                                "{\"label\":\"dp.Login.contact_us_and\", \"data\":\"et un de nos associe des ventes prendra contact avec vous pour une démonstration personnelle.\"},"+
                                "{\"label\":\"dp.Login.send_feedback\", \"data\":\"Envoyer un commentaire\"},"+
                                "{\"label\":\"dp3.login.American_english\", \"data\":\"American English\"},"+
                                "{\"label\":\"dp3.login.French_canada\", \"data\":\"Canada franais\"},"+
                                "{\"label\":\"dp.Login.cancel.UPPER\", \"data\":\"ANNULER\"},"+
                                "{\"label\":\"dp.Login.submit.UPPER\", \"data\":\"SOUMETTRE\"},"+
                                "{\"label\":\"dp.Login.save\", \"data\":\"SAUVER\"},"+
                                "{\"label\":\"dp.Login.click_here\", \"data\":\"CLIQUEZ ICI\"},"+
                                "{\"label\":\"dp3.login.Password_regex_rules\", \"data\":\"Mot de passe saisi ne correspond pas à la règle de mot de passe. S'il vous plaît assurez-vous que le mot de passe entré est -\"},"+
                                "{\"label\":\"dp3.login.Password_regex_rule_1\", \"data\":\"<br> Entre 8 et 64 caractères de long\"},"+
                                "{\"label\":\"dp3.login.Password_regex_rule_2\", \"data\":\"<br> contient au moins 1 lettre majuscule\"},"+
                                "{\"label\":\"dp3.login.Password_regex_rule_3\", \"data\":\"<br> contient au moins 1 chiffre (0-9)\"},"+
                                "{\"label\":\"dp3.login.Password_regex_rule_4\", \"data\":\"<br> contient au moins 1 lettre minuscule\"},"+
                                "{\"label\":\"dp.Login.new_password.UPPER\", \"data\":\"NOUVEAU MOT DE PASSE\"},"+
                                "{\"label\":\"dp.Login.confirm_password.UPPER\", \"data\":\"Confirmez mot de passe\"},"+
                                "{\"label\":\"dp3.login.Passwords_dont_match\", \"data\":\"Le nouveau mot de passe et confirmer le nouveau mot de passe ne correspondent pas. S'il vous plaît entrer les mots de passe.\"},"+
                                "{\"label\":\"dp3.login.Challenge_question\", \"data\":\"QUESTION CHALLENGE #\"},"+
                                "{\"label\":\"dp3.login.Answer_here\", \"data\":\"Votre réponse ici.\"},"+
                                "{\"label\":\"dp3.login.Support_title\", \"data\":\"SOUTIEN\"},"+
                                "{\"label\":\"dp3.login.Customer_service\", \"data\":\"Nous nous efforcons de vous fournir un service de costumer exceptionnel.\"},"+
                                "{\"label\":\"dp3.login.Most_out_xtime\", \"data\":\"Tirez le meilleur parti de Xtime!\"},"+
                                "{\"label\":\"dp3.login.Practice_videos_webinars\", \"data\":\"Nos nouvelles vidéos sur les meilleures pratiques, des webinaires et des guides en ligne sont disponibles pour vous!\"},"+
                                "{\"label\":\"dp3.login.Attend_online_session\", \"data\":\"Ce service gratuit vous offre la possibilité d'assister à une session en ligne avec un instructeur pour apprendre à optimiser à la fois le trafic de votre client et les revenus de service. Les cours sont dispensés par l'équipe d'experts Xtime des consultants du Service mobile, qui viennent tous avec une forte expérience de ealership. Assistez aussi souvent que vous le souhaitez!\"},"+
                                "{\"label\":\"dp3.login.Note_login_first\", \"data\":\"Remarque\"},"+
                                "{\"label\":\"dp3.login.Submit_support_ticket\", \"data\":\"Soumettre un ticket de support\"},"+
                                "{\"label\":\"dp3.login.Support_ticket_info\", \"data\":\"Notre portail de billetterie en ligne a été mis en place afin de fournir un niveau de service supérieur à nos clients.\"},"+
                                "{\"label\":\"dp3.login.US_customer_service\", \"data\":\"US fonde service à la clientèle\"},"+
                                "{\"label\":\"dp3.login.Hour_response_time\", \"data\":\"1-12 temps de réponse d'une heure\"},"+
                                "{\"label\":\"dp3.login.Call_us\", \"data\":\"Appelez États-Unis\"},"+
                                "{\"label\":\"dp3.login.Email_us\", \"data\":\"Email américain\"},"+
                                "{\"label\":\"dp.Login.ready_for_xtime\", \"data\":\"Prêt pour Xtime?\"},"+
                                "{\"label\":\"dp3.login.Receive_email_notices\", \"data\":\"Être informé par courriel (c. pannes de système, mises à jour et des informations importantes)\"},"+
                                "{\"label\":\"dp3.login.Account_locked\", \"data\":\"Votre compte est verrouillé\"},"+
                                "{\"label\":\"dp3.login.Account_locked_5_attempts\", \"data\":\"Votre compte est bloqué à cause de 5 tentatives infructueuses consécutives pour vous connecter.\"},"+
                                "{\"label\":\"dp3.login.Contact_xtime_help-desk\", \"data\":\"S'il vous plaît communiquer avec un bureau d'aide Xtime au 1-866-984-6355 pour déverrouiller votre compte.\"},"+
                                "{\"label\":\"dp3.login.Your_account_locked_consecutive_unsuccessful\", \"data\":\"<br> Veuillez noter que votre compte sera bloqué après 5 tentatives infructueuses de se connecter\"},"+
                                "{\"label\":\"dp3.login.Password_changed\", \"data\":\"<b> Great! </ b> votre mot de passe a bien été changé\"},"+
                                "{\"label\":\"dp.Login.failure_capslock_check\", \"data\":\"Mot de passe est sensible à la casse. Est votre verrouillage des majuscules?\"},"+
                                "{\"label\":\"dp3.login.Password_incorrect_caps_lock_on_5_attempts\", \"data\":\"S'il vous plaît vous assurer que votre <b> MAJUSCULE </ b> ce n'est pas sur <br/> <b> Remarque\"},"+
                                "{\"label\":\"dp.Login.account_locked_click_to_reset\", \"data\":\"Votre compte a été bloqué\"},"+
                                "{\"label\":\"dp.Login.account_locked_contact_support\", \"data\":\"Votre compte a été bloqué. S'il vous plaît contactez votre concessionnaire ou soutien Xtime (http://support.xtime.com,support@xtime.com or 1-866-984-6355).\"},"+
                                "{\"label\":\"dp.Login.not_set_up_challenge_questions\", \"data\":\"Vous n'avez pas encore mis en place les questions secrètes pour la récupération de mot de passe. S'il vous plaît contactez votre revendeur ou <br/> soutien Xtime (http\"},"+
                                "{\"label\":\"dp3.login.New_temp_password\", \"data\":\"Votre mot de passe a été changé avec succès. S'il vous plaît vous connecter en utilisant le nouveau mot de passe.\"},"+
                                "{\"label\":\"dp.Login.login_with_temporary_password\", \"data\":\"S'il vous plaît connectez-vous avec votre mot de passe temporaire.\"},"+
                                "{\"label\":\"dp3.login.Missing_field\", \"data\":\"Champs manquants ou non valides\"},"+
                                "{\"label\":\"dp3.login.Missing_field_check_errors\", \"data\":\"Certains champs sont absents ou mal remplis. Veuillez vérifier que vous n'avez pas de message d'alerte.\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0013\", \"data\":\"nouveau mot de passe n \'correspond au format de mot de passe\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0014\", \"data\":\"nouveau mot de passe et le mot de passe de confirmation doesn match \'t\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0015\", \"data\":\"nouveau mot de passe contient 'mot de passe' le mot\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0016\", \"data\":\"nouveau mot de passe ne doit pas contenir le nom d'utilisateur dans le champ Mot de passe\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0017\", \"data\":\"nouveau mot de passe ne doit pas être le même que l'ancien mot de passe\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0018\", \"data\":\"nouveau mot de passe ne doit pas correspondre au dernier carré de passe\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0020\", \"data\":\"Défi Question 1 ne répond pas\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0021\", \"data\":\"Défi Question 2 ne répond pas\"},"+
                                "{\"label\":\"dp3.login.Reset_password_ERR0022\", \"data\":\"Défi Question 3 ne répond pas\"},"+
                                "{\"label\":\"dp3.login.Search_criteria\", \"data\":\"Critères de recherche\"},"+
                                "{\"label\":\"dp3.login.Customer\", \"data\":\"CLIENT\"},"+
                                "{\"label\":\"dp3.login.SEARCH\", \"data\":\"RECHERCHE\"},"+
                                "{\"label\":\"dp.Login.challenge_response_incorrect_try_again\", \"data\":\"Votre réponse à la phrase de défi était incorrect, veuillez réessayer plus (challenge phrase réponses ne sont pas sensibles à la casse)\"},"+
                                "{\"label\":\"dp.Login.hello\", \"data\":\"Bonjour\"},"+
                                "{\"label\":\"dp.Login.if_you_forgot_your\", \"data\":\"si vous avez oublié votre\"},"+
                                "{\"label\":\"dp.Login.invalid_email\", \"data\":\"Aucun utilisateur existe avec l'e-mail indiquée. Soit vous avez entré un mauvais email ou vous n'avez pas indiqué votre email au moment de l'inscription. S'il vous plaît essayer de nouveau ou communiquez avec le concessionnaire pour récupérer votre nom d'utilisateur.\"},"+
                                "{\"label\":\"dp.Login.partner1_info_url\", \"data\":\"http://www.mcafee.com/\"},"+
                                "{\"label\":\"dp.Login.partner1_logo_url\", \"data\":\"http://media.xtime.com/i/uploads/mcafee_secure_logo.jpg\"},"+
                                "{\"label\":\"dp.Login.partner2_info_url\", \"data\":\"http://www.nada.com\"},"+
                                "{\"label\":\"dp.Login.partner2_logo_url\", \"data\":\"http://media.xtime.com/i/uploads/nada_logo.png\"},"+
                                "{\"label\":\"dp.Login.partner3_info_url\", \"data\":\"http://http://www.truste.com/\"},"+
                                "{\"label\":\"dp.Login.partner3_logo_url\", \"data\":\"http://media.xtime.com/i/uploads/truste_logo.jpg\"},"+
                                "{\"label\":\"dp.Login.password_changed_success\", \"data\":\"Votre mot de passe a été changé avec succès.\"},"+
                                "{\"label\":\"dp.Login.password_rule_complexity\", \"data\":\"Mot de passe doit contenir au moins une lettre majuscule, une lettre minuscule et un chiffre (0-9).\"},"+
                                "{\"label\":\"dp.Login.password_rule_length\", \"data\":\"Mot de passe doit être comprise entre 8 et 64 caractères.\"},"+
                                "{\"label\":\"dp.Login.password_rule_not_contain_string_password\", \"data\":\"Mot de passe ne peut pas contenir chaîne littérale 'password'.\"},"+
                                "{\"label\":\"dp.Login.password_rule_not_repeat_last_four\", \"data\":\"Mot de passe ne peut pas être l'un des quatre derniers mots de passe utilisés.\"},"+
                                "{\"label\":\"dp.Login.remember_me\", \"data\":\"Se souvenir de moi sur cet ordinateur\"},"+
                                "{\"label\":\"dp.Login.success_username_recovery\", \"data\":\"Votre nom d'utilisateur a été Extrait le succès et il est envoyé à votre adresse email.\"}"+
                            "]}";
                }
        return result;
    }
}