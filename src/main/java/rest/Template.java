package rest;

import javax.ws.rs.*;

@Path("/user")
public class Template {

    @POST
    @Path("login")
    @Produces("application/json")
    public String authenticate(@FormParam(value = "userName") String userName,
                               @FormParam(value = "password") String password) {
        String jsonOutput = "";
        if (userName.equals("att1")) {
            jsonOutput = "{\"success\": false, \"errorCode\": 'ERR0002'}";
        } else if (userName.equals("att2") || userName.equals("att3") || userName.equals("att4")){
            jsonOutput = "{\"success\": false, \"errorCode\": 'ERR0001'}";
        } else if (userName.equals("att3qs")){
            jsonOutput = "{\"success\": false, \"errorCode\": 'ERR0003'}";
        }else if (userName.equals("att4qs")){
            jsonOutput = "{\"success\": false, \"errorCode\": 'ERR0003'}";
        }else if (userName.equals("att5qs")){
            jsonOutput = "{\"success\": false, \"errorCode\": 'ERR0004'}";
        }else if (userName.equals("att5")){
            jsonOutput = "{\"success\": false, \"errorCode\": 'ERR0005'}";
        }else if (userName.equals("reset") || userName.equals("expired")){
            jsonOutput = "{\"users\": [{username: 'some user', \"challengeQuestions\": ["+
                    "{\"challengeCode\": 'user.identity.challenge.CHILDHOOD_BEST_FRIEND_NAME', \"challengeId\": '1008', \"answer\": 'longAnswer1'}," +
                    "{\"challengeCode\": 'user.identity.challenge.CHILDHOOD_NICKNAME', \"challengeId\": '1003', \"answer\": 'longAnswer2'}," +
                    "{\"challengeCode\": 'user.identity.challenge.FIRST_BOY_GIRL_FRIEND_NAME', \"challengeId\": '1004', \"answer\": 'longAnswer3'}" +
                    "]}]," +
					"\"userRoles\": [{"+
						"\"name\": \"ADVISOR\","+
						"\"description\": \"Xtime Service Advisor\""+
					"}],"+
                    "\"success\": true, \"errorCode\": 'ERR0008' " +
                    "}";
        }else if (userName.equals("aboutToExpire")) {
            jsonOutput = "{\"users\": [{username: 'some user', \"challengeQuestions\": ["+
                    "{\"challengeCode\": 'user.identity.challenge.CHILDHOOD_BEST_FRIEND_NAME', \"challengeId\": '1008', \"answer\": 'longAnswer1'}," +
                    "{\"challengeCode\": 'user.identity.challenge.CHILDHOOD_NICKNAME', \"challengeId\": '1003', \"answer\": 'longAnswer2'}," +
                    "{\"challengeCode\": 'user.identity.challenge.FIRST_BOY_GIRL_FRIEND_NAME', \"challengeId\": '1004', \"answer\": 'longAnswer3'}" +
                    "]}]," +
                    "\"userRoles\": [{"+
						"\"name\": \"ADVISOR\","+
						"\"description\": \"Xtime Service Advisor\""+
					"}],"+
                    "\"success\": true, \"errorCode\": 'ERR0007' " +
                    "}";
        }else if (userName.equals("God")){
            jsonOutput = 
				"{" +
					"\"success\": true," +
					"\"errorCode\": ''," +
					"\"users\": [" +
						"{" +
						    "\"userId\": 12345," +
						    "\"participantId\": 48014209936," +
							"\"username\": \"God\"," +
							"\"challengeQuestions\":[" +
									"{" +
									   "\"challengeId\": 1000," +
									   "\"challengeCode\": 'user.identity.challenge.CHILDHOOD_BEST_FRIEND_NAME'," +
									   "\"answer\": \"Answer1\"" +
									"}," +
									"{"+
									   "\"challengeId\": 1001," +
									   "\"challengeCode\": 'user.identity.challenge.CHILDHOOD_NICKNAME'," +
									   "\"answer\": \"Answer2\"" +
									"},"+
									"{"+
									   "\"challengeId\": 1002," +
									   "\"challengeCode\": 'user.identity.challenge.FIRST_BOY_GIRL_FRIEND_NAME'," +
									   "\"answer\": \"Answer3\" "+
									"}"+
							"]," +
							"\"personas\": [" +
								"{" +
									"\"name\": \"service_advisor_persona\"," +
									"\"description\": \"Xtime Service Advisor\"" +
								"}," +
								"{" +
									"\"name\": \"service_manager_persona\"," +
									"\"description\": \"Xtime Service Manager\"" +
								"}," +
								"{" +
									"\"name\": \"dealer_principal_persona\"," +
									"\"description\": \"Xtime Dealer Principal\"" +
								"}" +
							"]," +
                            "\"permissions\": [" +
								"{" +
									"\"key\": \"DELETE_RESERVATIONS_FOR_SELF\"," +
									"\"description\": \"DELETE_RESERVATIONS_FOR_SELF\"" +
								"}," +
								"{" +
									"\"name\": \"DELETE_RESERVATION_FOR_OTHER_EMPLOYEES\"," +
									"\"description\": \"DELETE_RESERVATION_FOR_OTHER_EMPLOYEES\"" +
								"}," +
								"{" +
									"\"key\": \"DELETE_RESERVATION_FOR_CONSUMER\"," +
									"\"description\": \"DELETE_RESERVATION_FOR_CONSUMER\"" +
								"}" +
							"]," +
							"\"defaultPersona\": " +
								"{" + 
									"\"name\": \"service_advisor_persona\"," +
									"\"description\": \"Xtime Dealer group Principal\"" +
								"}," +
							"\"scopedDealers\": [" +
								"{" +
									"\"name\": \"South Motors BMW\"," +
									"\"webKey\": \"hmany110\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Hyundai, Kia, Volkswagen\"," +
								"}," +
								"{" +
									"\"name\": \"East Motors BMW\"," +
									"\"webKey\": \"hmany110\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Volkswagen\"," +
								"}," +
								"{" +
									"\"name\": \"West Motors BMW\"," +
									"\"webKey\": \"hmany110\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Ferrari, Porche, Nissan, Hyundai, Kia, Volkswagen\"," +
								"}," +
								"{" +
									"\"name\": \"North Motors BMW\"," +
									"\"webKey\": \"hmany110\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Toyota, Hyundai, Kia, Volkswagen\"," +
								"}," +		
							"]" +
						"}" +
					"]" +
				"}";
        } else if (userName.equals("Devil")){
            jsonOutput = 
				"{" +
					"\"success\": true," +
					"\"errorCode\": ''," +
					"\"users\": [" +
						"{" +
							"\"username\": \"Devil\"," +
							"\"challengeQuestions\":[" +
									"{" +
									   "\"challengeId\": 1000," +
									   "\"challengeCode\": 'user.identity.challenge.CHILDHOOD_BEST_FRIEND_NAME'," +
									   "\"answer\": \"Answer1\"" +
									"}," +
									"{"+
									   "\"challengeId\": 1001," +
									   "\"challengeCode\": 'user.identity.challenge.CHILDHOOD_NICKNAME'," +
									   "\"answer\": \"Answer2\"" +
									"},"+
									"{"+
									   "\"challengeId\": 1002," +
									   "\"challengeCode\": 'user.identity.challenge.FIRST_BOY_GIRL_FRIEND_NAME'," +
									   "\"answer\": \"Answer3\" "+
									"}"+
							"]," +
							"\"personas\": [" +
								"{" +
									"\"name\": \"DEALER PRINCIPAL\"," +
									"\"description\": \"Xtime Service Advisor\"" +
								"}," +
								"{" +
									"\"name\": \"CALL CENTER APPOINTMENT TAKER\"," +
									"\"description\": \"Xtime Dealer Principal\"" +
								"}," +
								"{" +
									"\"name\": \"DEALER GROUP PRINCIPAL\"," +
									"\"description\": \"Xtime Service Manager\"" +
								"}" +
							"]," +		 
							"\"defaultPersona\": [" + 	
								"{" + 
									"\"name\": \"DEALER PRINCIPAL\"," +
									"\"description\": \"Xtime Dealer group Principal\"" +
								"}" +
							"]," +								
							"\"scopedDealers\": [" +
								"{" +
									"\"name\": \"South Motors BMW\"," +
									"\"webkey\": \"Some web key\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Hyundai, Kia, Volkswagen\"," +
								"}," +
								"{" +
									"\"name\": \"East Motors BMW\"," +
									"\"webkey\": \"Some web key\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Volkswagen\"," +
								"}," +
								"{" +
									"\"name\": \"West Motors BMW\"," +
									"\"webkey\": \"Some web key\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Ferrari, Porche, Nissan, Hyundai, Kia, Volkswagen\"," +
								"}," +
								"{" +
									"\"name\": \"North Motors BMW\"," +
									"\"webkey\": \"Some web key\"," +
									"\"location\": \"STATE, City Name\"," +
									"\"dealerCode\": \"HMACA301\"," +
									"\"supportedBrands\": \"Toyota, Hyundai, Kia, Volkswagen\"," +
								"}," +		
							"]" +
						"}" +
					"]" +
				"}";
        } else if (userName.equals("DemiGod")){
                      jsonOutput =
          				"{" +
          					"\"success\": true," +
          					"\"errorCode\": ''," +
          					"\"users\": [" +
          						"{" +
          							"\"username\": \"Devil\"," +
          							"\"challengeQuestions\":[" +
          									"{" +
          									   "\"challengeId\": 1000," +
          									   "\"challengeCode\": 'user.identity.challenge.CHILDHOOD_BEST_FRIEND_NAME'," +
          									   "\"answer\": \"Answer1\"" +
          									"}," +
          									"{"+
          									   "\"challengeId\": 1001," +
          									   "\"challengeCode\": 'user.identity.challenge.CHILDHOOD_NICKNAME'," +
          									   "\"answer\": \"Answer2\"" +
          									"},"+
          									"{"+
          									   "\"challengeId\": 1002," +
          									   "\"challengeCode\": 'user.identity.challenge.FIRST_BOY_GIRL_FRIEND_NAME'," +
          									   "\"answer\": \"Answer3\" "+
          									"}"+
          							"]," +
          							"\"personas\": [" +
          							"]," +
          							"\"scopedDealers\": [" +
          								"{" +
          									"\"name\": \"South Motors BMW\"," +
          									"\"webkey\": \"Some web key\"," +
          									"\"location\": \"STATE, City Name\"," +
          									"\"dealerCode\": \"HMACA301\"," +
          									"\"supportedBrands\": \"Hyundai, Kia, Volkswagen\"," +
          								"}," +
          								"{" +
          									"\"name\": \"East Motors BMW\"," +
          									"\"webkey\": \"Some web key\"," +
          									"\"location\": \"STATE, City Name\"," +
          									"\"dealerCode\": \"HMACA301\"," +
          									"\"supportedBrands\": \"Volkswagen\"," +
          								"}," +
          								"{" +
          									"\"name\": \"West Motors BMW\"," +
          									"\"webkey\": \"Some web key\"," +
          									"\"location\": \"STATE, City Name\"," +
          									"\"dealerCode\": \"HMACA301\"," +
          									"\"supportedBrands\": \"Ferrari, Porche, Nissan, Hyundai, Kia, Volkswagen\"," +
          								"}," +
          								"{" +
          									"\"name\": \"North Motors BMW\"," +
          									"\"webkey\": \"Some web key\"," +
          									"\"location\": \"STATE, City Name\"," +
          									"\"dealerCode\": \"HMACA301\"," +
          									"\"supportedBrands\": \"Toyota, Hyundai, Kia, Volkswagen\"," +
          								"}," +
          							"]" +
          						"}" +
          					"]" +
          				"}";
            } else {
            jsonOutput = "{ " +
                    "\"success\": false,"+
                    "\"errorCode\": 'ERR0002'}";
        }
        return jsonOutput;
    }
    @POST
    @Path("reset")
    @Produces("application/json")
    public String resetUserPassword(@FormParam(value = "userName") String userName,
                                    @FormParam(value = "newPassword") String password,
                                    @FormParam(value = "confPassword") String confPassword,
                                    @FormParam(value = "challengeQuestions") String challengeQuestions) {
        String jsonOutput = "";
        if (password.contains("PASS")) {
            jsonOutput = "{\"success\": false, \"errorCode\": \"ERR0015\" }";
        } else if (password.contains("USER")) {
            jsonOutput = "{\"success\": false, \"errorCode\": \"ERR0016\" }";
         } else {
            jsonOutput = "{\"success\": true}";
        }
        return jsonOutput;
    }
    @POST
    @Path("lostUserName")
    @Produces ("application/json")
    public String recoverUsername(@FormParam(value = "email") String email) {
        String json;
        if (email.equals("valid@email.com")) {
            json = "{\"success\": true}";
        } else {
            json = "{\"success\": false, \"errorCode\": 'ERRFGTU'}";
        }
        return json;
    }
    @GET
    @Path("lostPassword")
    @Produces("application/json")
    public String getSecurityQuestion(@QueryParam("userName") String userName) {
        String json;
        if (userName.equals("invalid")) {
            json = "{\"success\": false, \"errorCode\": 'ERR0009'}";
        } else if (userName.equals("noquestions")) {
            json = "{\"success\": false, \"errorCode\": 'ERR0012'}";
        } else if (userName.equals("lockeduser")) {
            json = "{\"success\": false, \"errorCode\": 'ERR0010'}";
        } else if (userName.equals("allattempts")) {
            json = "{\"success\": false, \"errorCode\": 'ERR0006'}";
        } else if (userName.equals("lockedandallatempts")) {
            json = "{\"success\": false, \"errorCode\": 'ERR0011'}";
        } else if (userName.equals("question2")) {
            json = "{\"challengeQuestion\": {\"challengeCode\": 'security question2', \"challengeId\": '1005'}, " +
                    "\"success\": true}";
        } else if (userName.equals("question3")) {
            json = "{\"challengeQuestion\": {\"challengeCode\": 'security question3', \"challengeId\": '1002'}, " +
                    "\"success\": true}";
        } else {
            json = "{\"challengeQuestion\": {\"challengeCode\": 'security question1', \"challengeId\": '1003'}, " +
                    "\"success\": true}";
        }
        return json;
    }
    @POST
    @Path("lostPassword")
    @Produces("application/json")
    public String evaluateAnswer(@FormParam(value = "userName") String userName,
                                 @FormParam(value = "challengeId") String challengeId,
                                 @FormParam(value = "challengeResponse") String answer) {
        String json = "";
        if (answer.equals("success")) {
            json = "{\"success\": true, \"tempPassword\": 'FD760EKZ'}";
        } else {
            json = "{\"success\": false}";
        }
        return json;
    }

}