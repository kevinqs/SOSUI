package rest;

import javax.ws.rs.*;

/**
 * Created with IntelliJ IDEA.
 * User: tlatif
 * Date: 5/10/13
 * Time: 2:37 PM
 */
@Path("/vehicle")
public class Vehicle {


        @GET
        @Path("/getVehicles")
        @Produces("application/json")
        public String getVehicles() {
            String json = "{" +
                    "vehicles: [" +
                    "{\"make\": 'make1', \"color\": 'red',\"year\": 2001, \"id\": '8', \"customer\": {\"id\": '1', \"name\": 'Customer1', \"phone\": '650-546-3452', \"address\": 'address1'} }," +
                    "{\"make\": 'make2', \"color\": 'red',\"year\": 2001, \"id\": '2', \"customer\": {\"id\": '1', \"name\": 'Customer1', \"phone\": '650-546-3452', \"address\": 'address1'} }" +
                    "]" +
                    "}";
            return json;
        }

    @POST
    @Path("/update")
    @Produces("application/json")
    public String updateVehicle(@FormParam(value = "vehicleId") String vehicleId, @FormParam(value = "currentMileage") String newMileage) {
        System.out.print("Updating vehicle with vehicleId  = " + vehicleId + "and it has the new mileage = " + newMileage);
        return "{success:true}";
    }
}
