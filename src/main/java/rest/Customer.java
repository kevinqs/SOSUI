package rest;

/**
 * Created with IntelliJ IDEA.
 * User: tlatif
 * Date: 5/10/13
 * Time: 10:19 AM
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/customer")
public class Customer {

    @GET
    @Path("/getCustomers")
    @Produces("application/json")
    public String getCustomers() {
        String json = "{"+
                "\"success\": true," +
                "\"customers\": [   {"+

            "\"personId\":56050895941,"+

                    "\"firstName\": \"Aditi\","+

                    "\"lastName\":\"Das\","+

                    "\"otherName\":\"Other\","+

                    "\"contactInfo\":{\"phoneNumbers\":[{\"type\":\"HOME\",\"digits\":\"4354323456\"},"+

                "{\"type\":\"WORK\",\"digits\":null},"+

                "{\"type\":\"MOBILE\",\"digits\":null}],"+

                "\"emailAddress\":{\"email\":\"test@test.com\"},"+

                "\"address\":{\"streetAddress1\":\"A\","+

                        "\"streetAddress2\":\"B\","+

                        "\"city\":\"AAA\","+

                        "\"state\":\"FL\",\"country\":\"US\","+

                        "\"postalCode\":\"96677\"}"+

            "},"+

            "\"vehicles\":[{\"year\":\"2012\",\"mileage\":0,\"make\":\"INFINITI\","+

                    "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                    "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                "\"avgMileage\":0,\"isDefault\":true,"+

                    "\"mileageDt\":\"2013-05-10\",\"color\":\"blue\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+

           "]}," +
                "{"+

                        "\"personId\":56050895941,"+

                                "\"firstName\": \"Aditi\","+

                                "\"lastName\":\"Das\","+

                                "\"otherName\":\"Other\","+

                                "\"contactInfo\":{\"phoneNumbers\":[{\"type\":\"HOME\",\"digits\":\"4354323456\"},"+

                                "{\"type\":\"WORK\",\"digits\":1123223122},"+

                                "{\"type\":\"MOBILE\",\"digits\":1212121212}],"+

                                "\"emailAddress\":{\"email\":\"test2@test2.com\"},"+

                                "\"address\":{\"streetAddress1\":\"B\","+

                                "\"streetAddress2\":\"C\","+

                                "\"city\":\"BBB\","+

                                "\"state\":\"FL\",\"country\":\"US\","+

                                "\"postalCode\":\"96677\"}"+

                                "},"+

                                "\"vehicles\":[{\"year\":\"2012\",\"mileage\":0,\"make\":\"INFINITI\","+

                                "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                                "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                                "\"avgMileage\":0,\"isDefault\":true,"+

                                "\"mileageDt\":\"2013-05-10\",\"color\":\"red\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"},"+
                                "{\"year\":\"2012\",\"mileage\":0,\"make\":\"INFINITI\"," +
                                "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\"," +
                                "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                                "\"avgMileage\":0,\"isDefault\":true,"+
                                "\"\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}" +
                                "]}]}";

        return json;
    }

}
