package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.*;

@Path("/security")
public class Security {

    @GET
    @Path("/challengeQuestions")
    @Produces("application/json")
    public String getChallengeQuestions() {
        String json = "{\"challengeQuestions\":[" +
                "{\"challengeCode\": 'loc_key_question1', \"challengeId\": '1003'}," +
                "{\"challengeCode\": 'loc_key_question2', \"challengeId\": '1002'}," +
                "{\"challengeCode\": 'loc_key_question3', \"challengeId\": '1004'}," +
                "{\"challengeCode\": 'loc_key_question4', \"challengeId\": '1005'}," +
                "{\"challengeCode\": 'loc_key_question5', \"challengeId\": '1006'}," +
                "{\"challengeCode\": 'loc_key_question6', \"challengeId\": '1007'}," +
                "{\"challengeCode\": 'loc_key_question7', \"challengeId\": '1008'}" +
                "]}";
        return json;
    }
	
	@GET
    @Path("/logout")
    @Produces("application/json")
    public String getLogout(@QueryParam(value = "userId") String  userId) {
		String json = 
			"{" +
				" \"success\": false, " +
				" \"statusMessage\": \"this is an error happened\" " +
			"}";	
		if(!userId.isEmpty()) {
			json = 
				"{" +
					" \"success\": true " +
				"}";
		}
        return json;
    }
}
