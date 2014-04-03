package rest;

import javax.ws.rs.*;

/**
 * Created with IntelliJ IDEA.
 * User: tlatif
 * Date: 6/22/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/dealers")
public class Dealers {
    @GET
    @Path("/{webKey}/settings")
    @Produces("application/json")
    public String getDealerSettings(@QueryParam(value = "tokenId") String tokenId) {
        String json = "{" +
                "\"success\": true," +
                "\"makes\": [ " +

                "]" +
                "}";
        return json;
    }
	
    @GET
    @Path("/{webKey}/ledger/appointments")
    @Produces("application/json")
    public String getAppointments(@QueryParam(value = "date") String date) {
        String json = "{ "+
						"\"success\": true,"+
						"\"appointments\":    ["+
							"{"+
								"\"reservationId\": 67114245296,"+
								"\"confirmationKey\": \"X02GC4C259\","+
								"\"startTime\": \"2013-07-14 08:15:00\","+
								"\"attendanceStatus\": \"UNKNOWN\","+
								"\"transportationOption\": \"WAITER\","+
								"\"advisorId\": 48077039411,"+
								"\"advisorName\": \"AutoButler\","+
								"\"placedMethod\": \"PHONE\","+
								"\"isCarryover\": false,"+
								"\"isDmsAppt\": false,"+
								"\"isExtendedHourAppt\": false,"+
								"\"countMaintenance\": 2,"+
								"\"countRepair\": 1,"+
								"\"countRecall\": 0,"+
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
								"\"reservationId\": 67114245264,"+
								"\"confirmationKey\": \"X02B2Y5ZM4\","+
								"\"startTime\": \"2013-07-14 13:00:00\","+
								"\"attendanceStatus\": \"UNKNOWN\","+
								"\"transportationOption\": \"WAITER\","+
								"\"advisorId\": 48087395119,"+
								"\"advisorName\": \"1st Available!\","+
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
        return json;
    }
	@GET
    @Path("/{webKey}/makeVariantInfo")
    @Produces("application/json")
    public String getDealerMakeVariantInfo(@QueryParam(value = "tokenId") String tokenId) {
        String json = 
		"{" +
		   "\"dealerMakeVariantInfo\":	[ " +
				"{" +
					"\"variant\": \"HMA\", " +
					"\"make\": \"HYUNDAI\", " +
					"\"menuMileageTolerance\": 0, "+
					"\"defaultDrivingCondition\": \"Severe\", " +
					"\"skipTrim\": false, " +
					"\"showDrivingConditions\": true " +
				"}," +
				"{" +
					"\"variant\": \"HMA\", " +
					"\"make\": \"ANY\", " +
					"\"menuMileageTolerance\": 4000, " +
					"\"skipTrim\": false, " +
					"\"showDrivingConditions\": true" +
				"}"+
		   "]," +
		   "\"key\": \"XMM_GET_DEALER_MAKE_VARIANT_INFO\", " +
		   "\"statusCode\": 0, " + 
		   "\"success\": true " +
		"}";
        return json;
    }
	
	@GET
    @Path("/{webKey}/settingsDP")
    @Produces("application/json")
    public String getDealerMakeVariantInfo(@QueryParam(value = "countryCode") String countryCode,
										   @QueryParam(value = "languageCode") String languageCode,
										   @QueryParam(value = "locale") String locale,
										   @QueryParam(value = "tokenId") String tokenId) {
        String json = 
				"{" +
					"	\"success\":true," +
					"    \"statusCode\":0," +
					"	\"key\":\"settingsDP\"," +
					"	\"name\": \"LOKEY INFINITI\"," +
					"	\"teamState\":\"0\"," +
					"	\"operatingHours\":[" +
					"		{\"dayOfWeek\":\"SUN\",\"isOpen\":false}," +
					"		{\"dayOfWeek\":\"MON\",\"isOpen\":true,\"startTime\":\"07:00:00\",\"closeTime\":\"18:30:00\"}," +
					"		{\"dayOfWeek\":\"TUE\",\"isOpen\":true,\"startTime\":\"07:00:00\",\"closeTime\":\"18:30:00\"}," +
					"		{\"dayOfWeek\":\"WED\",\"isOpen\":true,\"startTime\":\"07:00:00\",\"closeTime\":\"18:30:00\"}," +
					"		{\"dayOfWeek\":\"THU\",\"isOpen\":true,\"startTime\":\"07:00:00\",\"closeTime\":\"18:30:00\"}," +
					"		{\"dayOfWeek\":\"FRI\",\"isOpen\":true,\"startTime\":\"07:00:00\",\"closeTime\":\"18:30:00\"}," +
					"		{\"dayOfWeek\":\"SAT\",\"isOpen\":true,\"startTime\":\"08:00:00\",\"closeTime\":\"16:00:00\"}" +
					"	]," +
					"	\"dealerContact\":{" +
					"		\"streetAddressOne\":\"19740 US HIGHWAY 19 N\"," +
					"        \"city\":\"CLEARWATER\"," +
					"		\"districtId\":\"18000000063\"," +
					"		\"state\":\"FL\"," +
					"		\"country\":\"US\"," +
					"		\"postalCodeString\":\"33764\"," +
					"		\"servicePhone\":\"(727) 531-4774\"," +
					"		\"quickLanePhone\":\"\"," +
					"		\"partsPhone\":\"\"," +
					"		\"fax\":\"\"" +
					"	}," +
					"	\"messageOfTheDay\":\"Get customer mobile phone number and email address!!!\"," +
					"	\"amenities\":[\"Car Wash\",\"Customer WiFi Internet\",\"Dining Nearby\",\"Loaner Car\",\"Rental Car\",\"Shopping Nearby\",\"Shuttle Service\",\"Vehicle Pickup and Delivery\",\"Waiting Area\"" +
					"	]," +
					"	\"locales\":[" +
					"		{\"localeCode\":\"en_US\",\"localeName\":\"American English\"}," +
					"		{\"localeCode\":\"fr_CA\",\"localeName\":\"French Canada\"}" +
					"	]," +
					"	\"supportedCountries\":[" +
					"		{\"name\":\"Canada\",\"code\":\"CA\"}," +
					"		{\"name\":\"United States of America\",\"code\":\"US\"}" +
					"	]," +
					"	\"supportedStates\":[" +
					"		{\"name\":\"[State-1 US]\",\"countryCode\":\"US\",\"code\":\"FL\"}," +
					"		{\"name\":\"[State-2 US]\",\"countryCode\":\"US\",\"code\":\"PA\"}," +
					"		{\"name\":\"[State-3 US]\",\"countryCode\":\"US\",\"code\":\"TX\"}," +
					"		{\"name\":\"[State-1 CA]\",\"countryCode\":\"CA\",\"code\":\"QB\"}," +
					"		{\"name\":\"[State-2 CA]\",\"countryCode\":\"CA\",\"code\":\"MT\"}," +
					"		{\"name\":\"[State-3 CA]\",\"countryCode\":\"CA\",\"code\":\"TR\"}," +
					"	]," +
					"	\"mobileProviders\":[" +
					"		{\"name\":\"[Aliant]\",\"providerId\":9200000102,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Bell Canada]\",\"providerId\":9200000021,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Boost Mobile]\",\"providerId\":9200000108,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Fido]\",\"providerId\":9200000101,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Koodo Mobile]\",\"providerId\":9200000100,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[MTS Mobility]\",\"providerId\":9200000105,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[PC Telecom]\",\"providerId\":9200000103,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Rogers Canada]\",\"providerId\":9200000020,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[SaskTel]\",\"providerId\":9200000104,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[TELUS Canada]\",\"providerId\":9200000040,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Vidotron]\",\"providerId\":9200000180,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Virgin Canada]\",\"providerId\":9200000106,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[Wind Mobile]\",\"providerId\":9200000107,\"selectable\":false,\"countryCode\":\"CA\"}," +
					"		{\"name\":\"[AT&T]\",\"providerId\":9200000000,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Airtel]\",\"providerId\":9200000011,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Alltel]\",\"providerId\":9200000007,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Bluegrass]\",\"providerId\":9200000220,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Boost Mobile]\",\"providerId\":9200000224,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Cellcom]\",\"providerId\":9200000123,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Cellular South]\",\"providerId\":9200000080,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Cincinnati Bell]\",\"providerId\":9200000010,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Cingular]\",\"providerId\":9200000001,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Cricket]\",\"providerId\":9200000222,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Fido]\",\"providerId\":9200000121,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Koodo]\",\"providerId\":9200000122,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Metro PCS]\",\"providerId\":9200000008,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Metrocall]\",\"providerId\":9200000002,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Net10]\",\"providerId\":9200000223,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Nextel]\",\"providerId\":9200000003,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Sprint PCS]\",\"providerId\":9200000004,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[T-Mobile]\",\"providerId\":9200000005,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Tbay Tel]\",\"providerId\":9200000140,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[US Cellular]\",\"providerId\":9200000060,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Verizon]\",\"providerId\":9200000006,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Virgin Mobile]\",\"providerId\":9200000009,\"selectable\":false,\"countryCode\":\"US\"}," +
					"		{\"name\":\"[Wind Mobile]\",\"providerId\":9200000120,\"selectable\":false,\"countryCode\":\"US\"}" +
					"	]," +
					"	\"supportedMakeVariants\":[" +
					"		{\"variant\":\"HMA\"," +
					"		 \"make\":\"HYUNDAI\"," +
					"		 \"menuMileageTolerance\":0.0," +
					"		 \"defaultDrivingCondition\":\"Severe\"," +
					"		 \"skipTrim\":false,\"showDrivingConditions\":true}," +
					"		{\"variant\":\"HMA\"," +
					"		 \"make\":\"ANY\"," +
					"		 \"menuMileageTolerance\":4000.0," +
					"		 \"skipTrim\":false,\"showDrivingConditions\":true}" +
					"	]," +
					"	\"supportedYearMakeModels\": [" +
					"		{make:\"INFINITI\"," +
					"		 model:\"EX35\"," +
					"		 year:\"2012\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"EX35\"," +
					"		 year:\"2011\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"EX35\"," +
					"		 year:\"2010\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"EX37\"," +
					"		 year:\"2013\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"G37\"," +
					"		 year:\"2013\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"G37\"," +
					"		 year:\"2012\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"G37\"," +
					"		 year:\"2011\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2013\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2012\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2011\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2010\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2009\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2008\"}," +
					"		{make:\"INFINITI\"," +
					"		 model:\"QX56\"," +
					"		 year:\"2007\"}," +
					"		{make:\"OTHER\"," +
					"		 model:\"OTHER\"," +
					"		 year:\"2013\"}," +
					"		{make:\"OTHER\"," +
					"		 model:\"OTHER\"," +
					"		 year:\"2012\"}," +
					"		{make:\"OTHER\"," +
					"		 model:\"OTHER\"," +
					"		 year:\"2011\"}," +
					"		{make:\"OTHER\"," +
					"		 model:\"OTHER\"," +
					"		 year:\"2010\"}," +
					"		{make:\"OTHER\"," +
					"		 model:\"OTHER\"," +
					"		 year:\"2009\"}," +
					"		{make:\"OTHER\"," +
					"		 model:\"OTHER\"," +
					"		 year:\"2008\"}" +
					"	]," +
					"	\"transportationOptions\": [" +
					"		{\"id\":0, \"key\":\"APPT_DROP_OFF_TYPE\",\"isOffered\":true}," +
					"		{\"id\":1, \"key\":\"APPT_WAITER_TYPE\",\"isOffered\":true}," +
					"		{\"id\":2, \"key\":\"APPT_LOANER_TYPE\",\"isOffered\":true}," +
					"		{\"id\":3, \"key\":\"APPT_SHUTTLE_TYPE\",\"isOffered\":true}," +
					"		{\"id\":4, \"key\":\"APPT_RENTAL_TYPE\",\"isOffered\":true}," +
					"		{\"id\":5, \"key\":\"APPT_VALET_TYPE\",\"isOffered\":true}" +
					"	]," +
					"	\"teamAdvisorInfoList\":[" +
					"	 	{ \"id\":88000042204," +
					"	 	  \"name\":\"AUTO BUTLER\"," +
					"	 	  \"isPrimal\":false," +
					"	 	  \"advisors\":[" +
					"	 	 	{\"id\":48077039411,\"name\":\"AutoButler\"}," +
					"	 	 	{\"id\":48051166206,\"name\":\"Jim Downs\"}" +
					"	 	  ]" +
					"	 	}," +
					"	 	{ \"id\":88000036484," +
					"	 	  \"name\":\"Hyundai Service\"," +
					"	 	  \"isPrimal\":false," +
					"	 	  \"advisors\":[" +
					"	 	  	{\"id\":48087395119,\"name\":\"1st Available!\"}," +
					"	 	  	{\"id\":48049219395,\"name\":\"Bob Johnston 412.245.3698\"}," +
					"	 	  	{\"id\":48092903209,\"name\":\"Conner Williams 412.245.3708\"}," +
					"	 	  	{\"id\":48049219435,\"name\":\"Rex Sutton 412.245.3699\"}," +
					"	 	  	{\"id\":48109368809,\"name\":\"Wayne Casteel 412.245.3707\"}" +
					"	 	  ]" +
					"	 	}," +
					"	 	{ \"id\":88000027525," +
					"	 	  \"name\":\"Primal Team for 43000012482\"," +
					"	 	  \"isPrimal\":true," +
					"	 	  \"advisors\":[" +
					"	 	  	{\"id\":48096818967,\"name\":\"1st Avaliable!!\"}," +
					"	 	  	{\"id\":48099245011,\"name\":\"James Hogue 412.245.3707\"}" +
					"	 	  ]" +
					"	 	}" +
					" 	]" +
					"}";
        return json;
    }
	
	
}
