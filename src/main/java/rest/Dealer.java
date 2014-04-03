package rest;

import javax.ws.rs.*;

/**
 * Created with IntelliJ IDEA.
 * User: tlatif
 * Date: 5/10/13
 * Time: 5:42 PM
 */
@Path("/dealer")
public class Dealer {

    @GET
    @Path("/{webkey}/ledger/carryover/list")
    @Produces("application/json")
    public String getCarryOverList (@QueryParam(value = "current_date") String date) {
        String json = "";
        json += "{\"success\": true," +
                "\"carryOverAppointments\": [" +
                "  {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"lastName\" : \"AND WIND\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-22 11:00:00\",\n" +
                "         \"reservationId\" : 69014794181,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      },\n" +
                "  {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"lastName\" : \"DAA\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-22 00:00:00\",\n" +
                "         \"reservationId\" : 69014794182,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      },\n" +
                "  {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"lastName\" : \"ABB\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-22 00:00:00\",\n" +
                "         \"reservationId\" : 69014794183,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X0567EFGSV\",\n" +
                "         \"countMaintenance\" : 1,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"firstName\" : \"KEVIN\",\n" +
                "            \"lastName\" : \"AUBIN\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"3158317631\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-27 00:00:00\",\n" +
                "         \"reservationId\" : 69014794124,\n" +
                "         \"startTime\" : \"2013-11-20 07:00:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"HYUNDAI\",\n" +
                "            \"mileage\" : 70635,\n" +
                "            \"mileageDt\" : \"2004-09-17 00:00:00\",\n" +
                "            \"model\" : \"ACCENT\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"KMHCF35G82U181133\",\n" +
                "            \"year\" : 2002\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"firstName\" : \"Guido\",\n" +
                "            \"lastName\" : \"Quispe\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-25 00:00:00\",\n" +
                "         \"reservationId\" : 69014794125,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"firstName\" : \"Joel\",\n" +
                "            \"lastName\" : \"Rojas\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-21 08:00:00\",\n" +
                "         \"reservationId\" : 69014794126,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"firstName\" : \"Lucas\",\n" +
                "            \"lastName\" : \"Bandin\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-22 08:00:00\",\n" +
                "         \"reservationId\" : 69014794127,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"advisorId\" : 5.00060e+10,\n" +
                "         \"advisorName\" : \"ANGELO DOLINGER\",\n" +
                "         \"attendanceStatus\" : \"UNKNOWN\",\n" +
                "         \"canChangeStatus\" : true,\n" +
                "         \"canUserCancelAppt\" : false,\n" +
                "         \"confirmationKey\" : \"X059Y0BW9D\",\n" +
                "         \"countMaintenance\" : 2,\n" +
                "         \"countRecall\" : 0,\n" +
                "         \"countRepair\" : 0,\n" +
                "         \"createdById\" : 9.30006e+10,\n" +
                "         \"customer\" : {\n" +
                "            \"email\" : \"--\",\n" +
                "            \"firstName\" : \"Thaer\",\n" +
                "            \"lastName\" : \"Latif\",\n" +
                "            \"lifecycleState\" : false,\n" +
                "            \"personId\" : 5.80028e+10,\n" +
                "            \"phone\" : \"5445249521\"\n" +
                "         },\n" +
                "         \"isCarryover\" : true,\n" +
                "         \"isDmsAppt\" : false,\n" +
                "         \"isExtendedHourAppt\" : false,\n" +
                "         \"lifecycleState\" : \"CONFIRMED\",\n" +
                "         \"placedMethod\" : \"PHONE\",\n" +
                "         \"promisedEndDateTime\" : \"2013-11-21 07:00:00\",\n" +
                "         \"reservationId\" : 69014794128,\n" +
                "         \"startTime\" : \"2013-11-19 07:30:00\",\n" +
                "         \"transportationOption\" : {\n" +
                "            \"id\" : 0,\n" +
                "            \"name\" : \"APPT_DROP_OFF_TYPE\"\n" +
                "         },\n" +
                "         \"vehicle\" : {\n" +
                "            \"isDefault\" : false,\n" +
                "            \"make\" : \"DODGE\",\n" +
                "            \"mileage\" : 18,\n" +
                "            \"mileageDt\" : \"2004-03-15 00:00:00\",\n" +
                "            \"model\" : \"CARAVAN\",\n" +
                "            \"vehicleId\" : 9.90051e+10,\n" +
                "            \"vin\" : \"1D4GP25B54B513662\",\n" +
                "            \"year\" : 2004\n" +
                "         }\n" +
                "      }\n" +
                  "]}";
                  return json;
    }


    @GET
    @Path("/{webkey}/customer/search")
    @Produces("application/json")
    public String getCustomers(@QueryParam(value = "searchText") String searchText,
                    @QueryParam(value="searchType") String searchType,
                    @QueryParam(value="locale") String locale,
                    @QueryParam(value="userId") String userId) {
        String json;
        if (searchText.equals("error")) {
            json = "{\"success\": false}";
        } else if (searchText.equals("unique")) {
            json = 	"{\"success\": true," +
                    "\"customers\": ["+
                    "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"unique\","+

                    "\"lastName\":\"\","+

                    "\"extId\":66728,"  +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 0," +

                    "\"contactInfo\":{\"phoneNumbers\":[{\"type\":\"HOME\",\"digits\":\"4354323456\"},"+

                    "{\"type\":\"WORK\",\"digits\":1123223122},"+

                    "{\"type\":\"MOBILE\",\"digits\":1212121212}],"+

                    "\"emailAddress\":{\"email\":\"unique@test.com\"},"+

                    "\"address\":{\"streetAddress1\":\"B\","+

                    "\"streetAddress2\":\"C\","+

                    "\"city\":\"BBB\","+

                    "\"state\":\"FL\",\"country\":\"US\","+

                    "\"postalCode\":\"96677\"}"+

                    "},"+

                    "\"vehicles\":[{\"year\":\"2013\",\"mileage\":0,\"make\":\"INFINITI\","+

                    "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V8\", \"engineSize\":\"3.5L\","+
                    "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                    "\"avgMileage\":0,\"isDefault\":true,"+
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"red\",\"licenseNumber\":\"d3333\",\"vin\":\"123456\"}"+
                    "]}]}";
        } else {
//            json = "{"+
//                            "\"success\": true," +
//                            "\"customers\": [   {"+
//
//                            "\"personId\":56050895941,"+
//
//                            "\"extId\":66728," +
//
//                            "\"firstName\": \"" + searchText + "\"," +
//
//                            "\"lastName\":\"Das\","+
//
//                            "\"otherName\":\"Other\","+
//
//                            "\"preferredAdvisorId\": 48028806421," +
//
//                            "\"contactInfo\":{\"phoneNumbers\":[{\"type\":\"HOME\",\"digits\":\"4354323456\"},"+
//
//                            "{\"type\":\"WORK\",\"digits\":null},"+
//
//                            "{\"type\":\"MOBILE\",\"digits\":null}],"+
//
//                            "\"emailAddress\":{\"email\":\"test@test.com\"},"+
//
//                            "\"address\":{\"streetAddress1\":\"A\","+
//
//                            "\"streetAddress2\":\"B\","+
//
//                            "\"city\":\"AAA\","+
//
//                            "\"state\":\"FL\",\"country\":\"US\","+
//
//                            "\"postalCode\":\"96677\"}"+
//
//                            "},"+
//
//                            "\"vehicles\":[{\"year\":\"2012\",\"mileage\":0,\"make\":\"INFINITI\","+
//
//                            "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
//                            "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
//                            "\"avgMileage\":0,\"isDefault\":true,"+
//
//                            "\"mileageDt\":\"2013-05-10\",\"color\":\"blue\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
//
//                            "]}]}";
             json = "{"+
                    "\"success\": true," +
                    "\"customers\": [   {"+

                    "\"personId\":56050895945,"+

                    "\"preferredAdvisorId\": 0," +

                    "\"firstName\": \"Lopez\","+

                    "\"lastName\":\"Smith\","+

                    "\"extId\":66728," +

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

                    "\"personId\":56050895943,"+

                    "\"firstName\": \"Thaer\","+

                    "\"lastName\":\"Latif\","+

                    "\"extId\":66728,"  +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 0," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

					"{"+

                    "\"personId\":56050895949,"+

                    "\"firstName\": \"Lucas\","+

                    "\"lastName\":\"Bandin\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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

                     "\"vehicles\":[{\"year\":\"2010\",\"mileage\":0,\"make\":\"Corolla\","+

                     "\"model\":\"E35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true,"+
                     "\"mileageDt\":\"2013-05-10\",\"color\":\"red\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"},"+

                     "{\"year\":\"2012\",\"mileage\":0,\"make\":\"INFINITI\"," +
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					 
					 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					 
					 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					 
					 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					 
					 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					 
					 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					 
					 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+
					
 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+

 "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728," +

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]},"+					 
					 
                    "{"+

                    "\"personId\":56050895941,"+

                    "\"firstName\": \"" + searchText + "\","+

                    "\"lastName\":\"Das\","+

                    "\"extId\":66728,"+

                    "\"otherName\":\"Other\","+

                    "\"preferredAdvisorId\": 48028806421," +

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
                     "\"model\":\"EX35\", \"metaVehicleId\":77000147706,  \"engineType\":\"V6\", \"engineSize\":\"3.5L\","+
                     "\"driveType\":\"RWD\",\"transmissionType\":\"Automatic\",\"trim\":\"Base\",\"vehicleId\":97072368398," +
                     "\"avgMileage\":0,\"isDefault\":true," +
                    "\"mileageDt\":\"2013-05-10\",\"color\":\"black\",\"licenseNumber\":\"d3333\",\"vin\":\"22222\"}"+
                     "]}]}";
        }
        return json;
    }
    @GET
    @Path("/{webkey}/ledger/dailyTimeslots")
    @Produces("application/json")
    public String getAvailableTimeSlots(@QueryParam(value = "selectedDate")String selectedDate,
                                        @QueryParam(value = "userId")long userId,
                                        @QueryParam(value = "advisorId")long advisorId,
                                        @QueryParam(value = "teamId")long teamId,
                                        @QueryParam(value = "make")String make,
                                        @QueryParam(value = "model")String model,
                                        @QueryParam(value = "transportation")int transportation) {
        String json = "";
        String [] dArray = selectedDate.split("-");
        String stringDate = dArray[0] + dArray[1] + dArray[2];
        int date = Integer.parseInt(stringDate);
        int dateMod = date % 100;
        String timeSlots;
        if (dateMod <= 10) {
            timeSlots = getTimeSlotStructure(7, 19, 6);
        } else if (dateMod <= 20) {
            timeSlots = getTimeSlotStructure(7, 19, 3);
        } else {
            timeSlots = getTimeSlotStructure(7, 19, 2);
        }
        System.out.println(userId + " " + advisorId + " " + teamId + " " + model + " " + make);
        json = "{" +
                    "\"success\": true," +
                    "\"canOverride\": false," +
                    "\"shopUsage\": 354," +
                    "\"shopCapacity\": 7200," +
                    "\"greeterUsage\": 4," +
                    "\"greeterCapacity\": 70," +
                    "\"waiterCapacity\": 43," +
                    "\"waiterUsage\": 2," +
                    "\"loanerUsage\": 0," +
                    "\"loanerCapacity\": 999999," +
                    "\"valetCapacity\": 1," +
                    "\"valetUsage\": 0," +
                    "\"date\": \"" + selectedDate + "\"," +
                    "\"timeslots\": [" +
                        timeSlots +
                        "]" +
                "}";


        return json;
    }
    @POST
    @Path("/{webkey}/appointment/create")
    @Produces("application/json")
    public String confirmAppointment(@FormParam(value = "timeElapsed") String timeElapsed,
                                     @FormParam(value = "successfulAppt") boolean successfulAppt) {
        System.out.println(timeElapsed + " it works");
        successfulAppt = true;
        if (successfulAppt) return "{\"success\": true, \"metrics\": {\"appointmentsMade\": 3, \"averageTime\": \"5:15\"}}";
        else return "{\"success\": false}";
    }
    private String getTimeSlotStructure(int startingHour, int endingHour, int pattern) {
        String json = "";
        int i, j, m;
        String hour;
        String [] minutes = {"00", "15", "30", "45"};
        for (i = startingHour, j = 1; i <= endingHour; i += 1) {

            if (i < 10) {
                hour = "0"+Integer.toString(i);
            } else {
                hour = Integer.toString(i);
            }
            for (m = 0; m < 4; m += 1, j += 1) {
                if (i != startingHour || m != 0) {
                    json += ",";
                }
                boolean available = (j % pattern != 0);
                String unavailableReasons = "";
                if (!available) {
                    unavailableReasons = "\"unavailableReasons\": \"dealer reasons\",";
                }
                json += "{ \"startTime\": \"" + hour + ":" + minutes[m] +"\"," +
                        "\"isExtended\": false," +
                        "\"available\": "+ Boolean.toString(available) + "," +
                        unavailableReasons +
                        "\"greeterUsage\": "+ m + "," +
                        "\"greeterCapacity\": "+ 4 + "," +
                        "\"waiterCapacity\": "+ 1 + "," +
                        "\"waiterUsage\": "+ 0 + "," +
                        "\"valetCapacity\": "+ 999999 + "," +
                        "\"valetUsage\": "+ 0 + "," +
                        "\"loanerUsage\": "+ 0 + "," +
                        "\"loanerCapacity\": "+ 999999 +
                        "}";
            }
        }
        return json;
    }
    @GET
    @Path("/{webkey}/teams/advisors/info")
    @Produces("application/json")
    public String getTeams() {
        String json;
        json = "{" +
                "\"success\": true," +
                "\"teamAdvisorInfoList\": [" +
                    "{" +
                        "\"id\": 88000011522," +
                        "\"name\": \"Blue Team\"," +
                        "\"advisors\": [" +
                            "{" +
                                "\"id\": 48028806421," +
                                "\"name\": \"Doug Hill\"" +
                            "}," +
                            "{" +
                                "\"id\": 48098534004," +
                                "\"name\": \"Neil Kilkenny\"" +
                            "}" +
                        "]" +
                    "}," +
                    "{" +
                        "\"id\": 88000008061," +
                        "\"name\": \"Green Team\"," +
                        "\"advisors\": [" +
                            "{" +
                                "\"id\": 48067298795," +
                                "\"name\": \"Larry Jones\"" +
                            "}" +
                        "]" +
                    "}," +
                    "{" +
                        "\"id\": 88000016441," +
                        "\"name\": \"Orange Team\"," +
                        "\"advisors\": [" +
                        "]" +
                    "}," +
                    "{" +
                        "\"id\": 88000005801," +
                        "\"name\": \"Primal Team for 43000003402\"," +
                        "\"isPrimal\": true," +
                        "\"advisors\": [" +
                            "{" +
                                "\"id\": 48014209936," +
                                "\"name\": \"Kristi Thornton\"" +
                            "}" +
                        "]" +
                    "}" +
                "]" +
                "}";

        return json;
    }
    @GET
    @Path("/{webKey}/customer/getLastAdvisorId")
    @Produces("application/json")
    public String getLastAdvisorId(@QueryParam(value = "userId") String userId,
                                   @QueryParam(value = "vehicleId") String vehicleId,
                                   @QueryParam(value = "customerId") String customerId) {
        String json = "{\"success\": true, \"value\": 48014209936}";
        return json;
    }

    @POST
    @Path("/{webKey}/customer/updateCustomerInfo")
    @Produces("application/json")
    public String updateCustomerInfo(@FormParam(value="webKey") String webKey,
                                     @FormParam(value="userId") String userId,
                                     @FormParam(value="personId") String personId,
                                     @FormParam(value="mobilePhone") String mobilePhone,
                                     @FormParam(value="email") String email){

        System.out.print("Updating Customer INFO:\n");
        System.out.print("webKey= " + webKey + " :: userId= " + userId + " :: personId= " + personId + " :: mobilePhone= " + mobilePhone + " :: email= " + email);
        return "{\n" +
                "   \"success\": true,\n" +
                "}";
    }

    @GET
    @Path("/{webKey}/transportOptions")
    @Produces("application/json")
    public String updateCustomerInfo(@QueryParam(value="vehicleId") String vehicleId,
                                     @QueryParam(value="customerId") String customerId){

        System.out.print("Getting transportation options INFO:\n");
        System.out.print("vehicleId= " + vehicleId + " :: customerId= " + customerId);
        return "{\n" +
                "   \"success\" : true,\n" +
                "   \"transportationTypes\" : [\n" +
                "      {\n" +
                "         \"id\" : 0,\n" +
                "         \"name\" : \"Drop off vehicle\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"attributes\" : {\n" +
                "            \"waiterMaxDurationMins\" : 1440\n" +
                "         },\n" +
                "         \"id\" : 1,\n" +
                "         \"name\" : \"Wait\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"id\" : 2,\n" +
                "         \"name\" : \"Request a loaner\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"id\" : 4,\n" +
                "         \"name\" : \"Request a rental\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"id\" : 3,\n" +
                "         \"name\" : \"Request a Shuttle\"\n" +
                "      },\n" +
                "      {\n" +
                "         \"id\" : 5,\n" +
                "         \"name\" : \"Valet\\r\\n\"\n" +
                "      }\n" +
                "   ]\n" +
                "}\n";
    }
    @GET
    @Path("/{webkey}/customer/getVehicleMileage")
    @Produces("application/json")
    public String getVechileMieage(@QueryParam(value = "customerId") long customerId,
                                   @QueryParam(value = "vehilceId") long vehicleId) {
        String json = "{\"success\": true, \"value\": 20000}";
        return json;
    }
	
	@GET
    @Path("/{webkey}/ledger/appointments")
    @Produces("application/json")
    public String getAppointment(@QueryParam(value = "date") String date) {
        String json = "{ "+
						"\"success\": true,"+
						"\"appointments\":    ["+
							"{"+
								"\"reservationId\": 67114245296,"+
								"\"confirmationKey\": \"X02GC4C259\","+
								"\"startTime\": \"2013-06-27 12:15:00\","+
								"\"attendanceStatus\": \"UNKNOWN\","+
								"\"transportationOption\": \"WAITER\","+
								"\"agentId\": 48077039411,"+
								"\"agentName\": \"AutoButler\","+
								"\"createdPlacedMethod\": \"PHONE\","+
								"\"isCarryover\": false,"+
								"\"isDmsAppt\": false,"+
								"\"isExtendedHourAppt\": false,"+
								"\"countMaintenance\": 2,"+
								"\"countRepair\": 1,"+
								"\"countRecall\": 0,"+
								"\"customer\":       {"+
									"\"customerId\": 56020181027,"+
									"\"firstName\": \"HELENA\","+
									"\"lastName\": \"BAKER\","+
									"\"email\": \"HBAKER29@VERIZON.NET.ss.ss\","+
									"\"phone\": \"4129218632\""+
								"},"+
								"\"vehicle\": {"+
									"\"vehicleId\": 97026157006,"+
									"\"year\": \"2007\","+
									"\"make\": \"BUICK\","+
									"\"model\": \"LUCERNE\","+
									"\"mileage\": 18485,"+
									"\"mileageDate\": \"2013-06-25\","+
									"\"vin\": \"1G4HD57207U114851\""+
								"}"+
							"},"+
							"{"+
								"\"reservationId\": 67114245264,"+
								"\"confirmationKey\": \"X02B2Y5ZM4\","+
								"\"startTime\": \"2013-06-27 12:00:00\","+
								"\"attendanceStatus\": \"UNKNOWN\","+
								"\"transportationOption\": \"WAITER\","+
								"\"agentId\": 48087395119,"+
								"\"agentName\": \"1st Available!\","+
								"\"createdPlacedMethod\": \"PHONE\","+
								"\"isCarryover\": false,"+
								"\"isDmsAppt\": false,"+
								"\"isExtendedHourAppt\": false,"+
								"\"countMaintenance\": 0,"+
								"\"countRepair\": 3,"+
								"\"countRecall\": 0,"+
								"\"customer\": {"+
									"\"customerId\": 56025566899,"+
									"\"firstName\": \"HEATHER\","+
									"\"lastName\": \"BRANNON\","+
									"\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
									"\"phone\": \"9209807767\""+
								"},"+
								"\"vehicle\": {"+
									"\"vehicleId\": 97034042204,"+
									"\"year\": \"2004\","+
									"\"make\": \"HYUNDAI\","+
									"\"model\": \"SONATA\","+
									"\"mileage\": 93022,"+
									"\"mileageDate\": \"2013-06-24\","+
									"\"vin\": \"KMHWF25S24A931805\""+
								"}"+
							"}"+
						"]"+
					"} ";
        json = "";
        System.out.println(date);
        if ((date.charAt(9) - '0') % 2 == 0) {

            json = "{ "+
                    "\"success\": true,"+
                    "\"appointments\":    ["+
                    "{"+
                    "\"reservationId\": 67114245192,"+
                    "\"createdById\": 12345,"+
                    "\"confirmationKey\": \"X02GC4C259\","+
                    "\"startTime\": \"2013-06-27 18:15:00\","+
                    "\"attendanceStatus\": \"UNKNOWN\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_WAITER_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48014209936,"+
                    "\"advisorName\": \"Kristi Thornton\","+
                    "\"placedMethod\": \"SYSTEM\","+
                    "\"isCarryover\": true,"+
                    "\"isDmsAppt\": true,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 2,"+
                    "\"countRepair\": 1,"+
                    "\"countRecall\": 1,"+
                    "\"countCampaing\": 1,"+
                    "\"customer\":       {"+
                    "\"personId\": 56020181027,"+
                    "\"firstName\": \"HELENA\","+
                    "\"lastName\": \"BAKER\","+
                    "\"email\": \"HBAKER29@VERIZON.NET.ss.ss\","+
                    "\"phone\": \"4129218632\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97026157006,"+
                    "\"year\": \"2007\","+
                    "\"make\": \"BUICK\","+
                    "\"model\": \"LUCERNE\","+
                    "\"mileage\": 18485,"+
                    "\"mileageDate\": \"2013-06-25\","+
                    "\"vin\": \"1G4HD57207U114851\""+
                    "}"+
                    "},"+
                    "{"+
                    "\"reservationId\": 67114245261,"+
                    "\"createdById\": 111111111,"+
                    "\"confirmationKey\": \"X02B2Y5ZM4\","+
                    "\"startTime\": \"2013-06-27 17:00:00\","+
                    "\"attendanceStatus\": \"UNKNOWN\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_DROP_OFF_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48087395119,"+
                    "\"advisorName\": \"Neil Kilkenny\","+
                    "\"placedMethod\": \"PHONE\","+
                    "\"isCarryover\": false,"+
                    "\"isDmsAppt\": false,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 0,"+
                    "\"countRepair\": 3,"+
                    "\"countRecall\": 0,"+
                    "\"customer\": {"+
                    "\"personId\": 56025566899,"+
                    "\"firstName\": \"HEATHER\","+
                    "\"lastName\": \"BRANNON\","+
                    "\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
                    "\"phone\": \"9209807767\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97034042204,"+
                    "\"year\": \"2004\","+
                    "\"make\": \"HYUNDAI\","+
                    "\"model\": \"SONATA\","+
                    "\"mileage\": 93022,"+
                    "\"mileageDate\": \"2013-06-24\","+
                    "\"vin\": \"KMHWF25S24A931805\""+
                    "}"+
                    "},"+
                    "{"+
                    "\"reservationId\": 67114245262,"+
                    "\"confirmationKey\": \"X02B2Y5ZM4\","+
                    "\"startTime\": \"2013-06-27 10:00:00\","+
                    "\"attendanceStatus\": \"ARRIVED\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_WAITER_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48087395119,"+
                    "\"advisorName\": \"Neil Kilkenny\","+
                    "\"placedMethod\": \"CALL_CENTER\","+
                    "\"isCarryover\": false,"+
                    "\"isDmsAppt\": false,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 0,"+
                    "\"countRepair\": 3,"+
                    "\"countRecall\": 0,"+
                    "\"customer\": {"+
                    "\"personId\": 56025566899,"+
                    "\"firstName\": \"HEATHER\","+
                    "\"lastName\": \"BRANNON\","+
                    "\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
                    "\"phone\": \"9209807767\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97034042204,"+
                    "\"year\": \"2004\","+
                    "\"make\": \"HYUNDAI\","+
                    "\"model\": \"SONATA\","+
                    "\"mileage\": 93022,"+
                    "\"mileageDate\": \"2013-06-24\","+
                    "\"vin\": \"KMHWF25S24A931805\""+
                    "}"+
                    "},"+
                    "{"+
                    "\"reservationId\": 67114245211,"+
                    "\"confirmationKey\": \"X02B2Y5ZM4\","+
                    "\"startTime\": \"2013-06-27 10:00:00\","+
                    "\"attendanceStatus\": \"ARRIVED\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_SHUTTLE_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48087395119,"+
                    "\"advisorName\": \"Neil Kilkenny\","+
                    "\"placedMethod\": \"IN_PERSON\","+
                    "\"isCarryover\": false,"+
                    "\"isDmsAppt\": false,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 0,"+
                    "\"countRepair\": 3,"+
                    "\"countRecall\": 0,"+
                    "\"customer\": {"+
                    "\"personId\": 56025566899,"+
                    "\"firstName\": \"HEATHER\","+
                    "\"lastName\": \"BRANNON\","+
                    "\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
                    "\"phone\": \"9209807767\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97034042204,"+
                    "\"year\": \"2004\","+
                    "\"make\": \"HYUNDAI\","+
                    "\"model\": \"SONATA\","+
                    "\"mileage\": 93022,"+
                    "\"mileageDate\": \"2013-06-24\","+
                    "\"vin\": \"KMHWF25S24A931805\""+
                    "}"+
                    "}"+

                    "]"+
                    "} ";
        } else {
            json = "{ "+
                    "\"success\": true,"+
                    "\"appointments\":    ["+
                    "{"+
                    "\"reservationId\": 67115245192,"+
                    "\"createdById\": 12345,"+
                    "\"confirmationKey\": \"X02GC4C259\","+
                    "\"startTime\": \"2013-06-27 16:15:00\","+
                    "\"attendanceStatus\": \"UNKNOWN\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_WAITER_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48014209936,"+
                    "\"advisorName\": \"Kristi Thornton\","+
                    "\"placedMethod\": \"PHONE\","+
                    "\"isCarryover\": true,"+
                    "\"isDmsAppt\": true,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 2,"+
                    "\"countRepair\": 1,"+
                    "\"countRecall\": 1,"+
                    "\"countCampaing\": 1,"+
                    "\"customer\":       {"+
                    "\"personId\": 56020181027,"+
                    "\"firstName\": \"HELENA\","+
                    "\"lastName\": \"BAKER\","+
                    "\"email\": \"HBAKER29@VERIZON.NET.ss.ss\","+
                    "\"phone\": \"4129218632\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97026157006,"+
                    "\"year\": \"2007\","+
                    "\"make\": \"BUICK\","+
                    "\"model\": \"LUCERNE\","+
                    "\"mileage\": 18485,"+
                    "\"mileageDate\": \"2013-06-25\","+
                    "\"vin\": \"1G4HD57207U114851\""+
                    "}"+
                    "},"+
                    "{"+
                    "\"reservationId\": 67115245261,"+
                    "\"createdById\": 111111111,"+
                    "\"confirmationKey\": \"X02B2Y5ZM4\","+
                    "\"startTime\": \"2013-06-27 16:00:00\","+
                    "\"attendanceStatus\": \"UNKNOWN\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_SHUTTLE_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48087395119,"+
                    "\"advisorName\": \"Neil Kilkenny\","+
                    "\"placedMethod\": \"PHONE\","+
                    "\"isCarryover\": false,"+
                    "\"isDmsAppt\": false,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 0,"+
                    "\"countRepair\": 3,"+
                    "\"countRecall\": 0,"+
                    "\"customer\": {"+
                    "\"personId\": 56025566899,"+
                    "\"firstName\": \"HEATHER\","+
                    "\"lastName\": \"BRANNON\","+
                    "\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
                    "\"phone\": \"9209807767\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97034042204,"+
                    "\"year\": \"2004\","+
                    "\"make\": \"HYUNDAI\","+
                    "\"model\": \"SONATA\","+
                    "\"mileage\": 93022,"+
                    "\"mileageDate\": \"2013-06-24\","+
                    "\"vin\": \"KMHWF25S24A931805\""+
                    "}"+
                    "},"+
                    "{"+
                    "\"reservationId\": 67115245262,"+
                    "\"confirmationKey\": \"X02B2Y5ZM4\","+
                    "\"startTime\": \"2013-06-27 11:15:00\","+
                    "\"attendanceStatus\": \"ARRIVED\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_LOANER_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48087395119,"+
                    "\"advisorName\": \"Neil Kilkenny\","+
                    "\"placedMethod\": \"IN_PERSON\","+
                    "\"isCarryover\": false,"+
                    "\"isDmsAppt\": false,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 0,"+
                    "\"countRepair\": 3,"+
                    "\"countRecall\": 0,"+
                    "\"customer\": {"+
                    "\"personId\": 56025566899,"+
                    "\"firstName\": \"HEATHER\","+
                    "\"lastName\": \"BRANNON\","+
                    "\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
                    "\"phone\": \"9209807767\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97034042204,"+
                    "\"year\": \"2004\","+
                    "\"make\": \"HYUNDAI\","+
                    "\"model\": \"SONATA\","+
                    "\"mileage\": 93022,"+
                    "\"mileageDate\": \"2013-06-24\","+
                    "\"vin\": \"KMHWF25S24A931805\""+
                    "}"+
                    "},"+
                    "{"+
                    "\"reservationId\": 67115245211,"+
                    "\"confirmationKey\": \"X02B2Y5ZM4\","+
                    "\"startTime\": \"2013-06-27 11:00:00\","+
                    "\"attendanceStatus\": \"ARRIVED\","+
                    //"\"transportationOption\": \"WAITER\","+
                    "\"transportationOption\":         {"+
                    "\"name\": \"APPT_WAITER_TYPE\","+
                    "\"id\": 1"+
                    "},"+
                    "\"advisorId\": 48087395119,"+
                    "\"advisorName\": \"Neil Kilkenny\","+
                    "\"placedMethod\": \"PHONE\","+
                    "\"isCarryover\": false,"+
                    "\"isDmsAppt\": false,"+
                    "\"isExtendedHourAppt\": false,"+
                    "\"countMaintenance\": 0,"+
                    "\"countRepair\": 3,"+
                    "\"countRecall\": 0,"+
                    "\"customer\": {"+
                    "\"personId\": 56025566899,"+
                    "\"firstName\": \"HEATHER\","+
                    "\"lastName\": \"BRANNON\","+
                    "\"email\": \"HEATHER.BRANNON@GMAIL.COM.ss.sp\","+
                    "\"phone\": \"9209807767\""+
                    "},"+
                    "\"vehicle\": {"+
                    "\"vehicleId\": 97034042204,"+
                    "\"year\": \"2004\","+
                    "\"make\": \"HYUNDAI\","+
                    "\"model\": \"SONATA\","+
                    "\"mileage\": 93022,"+
                    "\"mileageDate\": \"2013-06-24\","+
                    "\"vin\": \"KMHWF25S24A931805\""+
                    "}"+
                    "}"+

                    "]"+
                    "} ";
        }
        return json;
    }
	
	@GET
    @Path("/{webkey}/customer/getROHistory")
    @Produces("application/json")
    public String getRO(@QueryParam(value = "vehicleId") String vehicleId,
						@QueryParam(value = "customerId") String customerId,
						@QueryParam(value = "ledgerDate") String ledgerDate,
						@QueryParam(value = "historyPeriodInDays") String historyPeriodInDays) {
        String json = "{" +
						"\"success\": true, " +
						"\"value\": \"2\" " +
					"}";
		return json;
	}
	
	@GET
	@Path("/{webkey}/carryover/{appointmentId}/details")
    @Produces("application/json")
    public String getCompletion(@QueryParam(value = "locale") String locale) {
        String json = "{" +
						   "\"success\": true," +
						   "\"carryOverDetails\":	[" +
								"{" +
									"\"carryOverId\": \"68001272343\"," +
									"\"carryOverDate\": \"2013-11-18\"," +
									"\"valueInMinutes\": 11" +
								"}," +
								"{" +
									"\"carryOverId\": \"68001272344\"," +
									"\"carryOverDate\": \"2013-11-19\"," +
									"\"valueInMinutes\": 22  	}," +
								"{" +
									"\"carryOverDate\": \"2013-11-20\"," +
									"\"valueInMinutes\": 33" +
								"}"+
						   "]"+
						"}";
		return json;
	}
}