package rest;

/**
 * Created with IntelliJ IDEA.
 * User: gquispe
 * Date: 5/21/13
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
import javax.ws.rs.*;
import java.util.HashMap;
import java.util.Map;

@Path("/services")
public class Services {

    @GET
    @Path("/dealer/{webKey}/make/{make}/model/{model}/year/{year}/recommended")
    @Produces("application/json")
    public String getRecommended(@QueryParam(value = "mileage") int mileage) {
        //Declaración del mapa
        Map<Integer,String> map=this.getMap();

        int[] recommended=this.getRecommendedGroup(mileage);
        int nextMileage = 0;
        int prevMileage = 0;

        if (recommended[0] == recommended[3]) {
            prevMileage = recommended[0];
            nextMileage = recommended[2];
        }

        return "{\n" +
                "   \"key\" : \"XMM_GET_MENU_BY_MILEAGE2\",\n" +
                "   \"mileage\" : "+recommended[3]+",\n" +
                "   \"nextMileage\" : "+nextMileage+",\n" +
                "   \"previousMileage\" : "+prevMileage+",\n" +
                "   \"recommendedMileage\" : "+recommended[3]+",\n" +
                "   \"servicePoints\" : ["+map.get(recommended[0])+","+map.get(recommended[1])+","+map.get(recommended[2])+"],\n" +
                "   \"statusCode\" : 0,\n" +
                "   \"success\" : true\n" +
                "}";
    }
    public int[] getRecommendedGroup(int mileage){
        int[] mileages = { 21000, 22500, 24000, 28000, 30000, 33000};
        int abs=0;
        int recommended=0;
        int recommendedIndex=-1;
        int minDiff=Integer.MAX_VALUE;
        int[] result={0,0,0,0};

        for (int i = 0; i < mileages.length; i++){
            abs=Math.abs(mileage - mileages[i]);
            if(abs < minDiff){
                minDiff=abs;
                recommended=mileages[i];
                recommendedIndex=i;
            }
        }
        result[3]=recommended;
        if(recommendedIndex == 0){
           result[0]=mileages[0];
           result[1]=mileages[1];
           result[2]=mileages[2];

        }else if(recommendedIndex == mileages.length -1){
            result[0]=mileages[3];
            result[1]=mileages[4];
            result[2]=mileages[5];
        }else{
            result[0]=mileages[recommendedIndex-1];
            result[1]=mileages[recommendedIndex];
            result[2]=mileages[recommendedIndex+1];
        }
        return result;

    }
    public Map<Integer,String> getMap(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(21000,"{\n" +
                "   \"menuTypes\" : [\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended 0\",\n" +
                "         \"dmsOpcode\" : \"01HY7K\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai 0\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : true,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZBS\",\n" +
                "               \"id\" : 176754,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Battery Service\",\n" +
                "               \"order\" : 2,\n" +
                "               \"price\" : 30,\n" +
                "               \"selectable\" : true,\n" +
                "               \"serviceCategory\" : \"Battery & Electrical\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430646,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Brake Inspection\",\n" +
                "               \"order\" : 3,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZBSFR\",\n" +
                "               \"id\" : 176751,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Brake System Fluid Replacement\",\n" +
                "               \"order\" : 4,\n" +
                "               \"price\" : 10,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"shopDuration\" : 30,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430648,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Adjust Drive Belts as Needed\",\n" +
                "               \"order\" : 5,\n" +
                "               \"price\" : 25.350,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Transmission & Axle\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430650,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect All Exterior Light Operations\",\n" +
                "               \"order\" : 9,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Lighting\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIPB\",\n" +
                "               \"id\" : 176769,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Parking Brake\",\n" +
                "               \"order\" : 11,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"shopDuration\" : 10,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430651,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Throttle Chamber\",\n" +
                "               \"order\" : 13,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430649,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Install Valvoline Fuel and Oil Treatments\",\n" +
                "               \"order\" : 15,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430652,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Power Steering Fluid Flush\",\n" +
                "               \"order\" : 17,\n" +
                "               \"price\" : 15,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Alignment & Steering\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430647,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Rear Brake Service When Applicable\",\n" +
                "               \"order\" : 18,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 23.50,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZROT\",\n" +
                "               \"id\" : 176823,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Tire Rotation\",\n" +
                "               \"order\" : 22,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"shopDuration\" : 18,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 61,\n" +
                "         \"totalPrice\" : 143.850\n" +
                "      },\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Factory Severe Conditions\",\n" +
                "         \"dmsOpcode\" : \"10HYZ075K4S\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Severe\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYAFA\",\n" +
                "               \"id\" : 435499,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Add Fuel Additive\",\n" +
                "               \"order\" : 1,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 5,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIACF\",\n" +
                "               \"id\" : 176749,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Air Cleaner Filter\",\n" +
                "               \"order\" : 8,\n" +
                "               \"price\" : 30,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"shopDuration\" : 10,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIBC\",\n" +
                "               \"id\" : 176705,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Battery Condition\",\n" +
                "               \"order\" : 10,\n" +
                "               \"price\" : 40.350,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Battery & Electrical\",\n" +
                "               \"shopDuration\" : 5,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZISB\",\n" +
                "               \"id\" : 176819,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Steering Gear Box, Linkage & Boots/Lower Arm Ball Joint\",\n" +
                "               \"order\" : 12,\n" +
                "               \"price\" : 15.150,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Alignment & Steering\",\n" +
                "               \"shopDuration\" : 6,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIVH\",\n" +
                "               \"id\" : 176853,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Vacuum Hose\",\n" +
                "               \"order\" : 14,\n" +
                "               \"price\" : 13.20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Air conditioning and Heating\",\n" +
                "               \"shopDuration\" : 7,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZLOF1.6\",\n" +
                "               \"id\" : 176736,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 19,\n" +
                "               \"price\" : 10.10,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"shopDuration\" : 9,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZROT\",\n" +
                "               \"id\" : 176823,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Tire Rotation\",\n" +
                "               \"order\" : 22,\n" +
                "               \"price\" : 18.0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"shopDuration\" : 6,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 48,\n" +
                "         \"totalPrice\" : 147\n" +
                "      },\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended 1\",\n" +
                "         \"dmsOpcode\" : \"01HY7K\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai 1\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZBS\",\n" +
                "               \"id\" : 176754,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Battery Service\",\n" +
                "               \"order\" : 2,\n" +
                "               \"price\" : 30,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Battery & Electrical\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430646,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Brake Inspection\",\n" +
                "               \"order\" : 3,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZBSFR\",\n" +
                "               \"id\" : 176751,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Brake System Fluid Replacement\",\n" +
                "               \"order\" : 4,\n" +
                "               \"price\" : 10,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"shopDuration\" : 30,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430648,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Adjust Drive Belts as Needed\",\n" +
                "               \"order\" : 5,\n" +
                "               \"price\" : 25.350,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Transmission & Axle\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430650,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect All Exterior Light Operations\",\n" +
                "               \"order\" : 9,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Lighting\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIPB\",\n" +
                "               \"id\" : 176769,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Parking Brake\",\n" +
                "               \"order\" : 11,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"shopDuration\" : 10,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430651,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Throttle Chamber\",\n" +
                "               \"order\" : 13,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430649,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Install Valvoline Fuel and Oil Treatments\",\n" +
                "               \"order\" : 15,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430652,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Power Steering Fluid Flush\",\n" +
                "               \"order\" : 17,\n" +
                "               \"price\" : 15,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Alignment & Steering\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430647,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Rear Brake Service When Applicable\",\n" +
                "               \"order\" : 18,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 23.50,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZROT\",\n" +
                "               \"id\" : 176823,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Tire Rotation\",\n" +
                "               \"order\" : 22,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"shopDuration\" : 18,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 61,\n" +
                "         \"totalPrice\" : 200.0\n" +
                "      },\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Factory Severe Conditions\",\n" +
                "         \"dmsOpcode\" : \"10HYZ075K4S\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Severe\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYAFA\",\n" +
                "               \"id\" : 435499,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Add Fuel Additive\",\n" +
                "               \"order\" : 1,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 5,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIACF\",\n" +
                "               \"id\" : 176749,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Air Cleaner Filter\",\n" +
                "               \"order\" : 8,\n" +
                "               \"price\" : 30,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"shopDuration\" : 10,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIBC\",\n" +
                "               \"id\" : 176705,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Battery Condition\",\n" +
                "               \"order\" : 10,\n" +
                "               \"price\" : 40.350,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Battery & Electrical\",\n" +
                "               \"shopDuration\" : 5,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZISB\",\n" +
                "               \"id\" : 176819,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Steering Gear Box, Linkage & Boots/Lower Arm Ball Joint\",\n" +
                "               \"order\" : 12,\n" +
                "               \"price\" : 15.150,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Alignment & Steering\",\n" +
                "               \"shopDuration\" : 6,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIVH\",\n" +
                "               \"id\" : 176853,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Vacuum Hose\",\n" +
                "               \"order\" : 14,\n" +
                "               \"price\" : 13.20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Air conditioning and Heating\",\n" +
                "               \"shopDuration\" : 7,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZLOF1.6\",\n" +
                "               \"id\" : 176736,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 19,\n" +
                "               \"price\" : 10.10,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"shopDuration\" : 9,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZROT\",\n" +
                "               \"id\" : 176823,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Tire Rotation\",\n" +
                "               \"order\" : 22,\n" +
                "               \"price\" : 18.0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"shopDuration\" : 6,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 48,\n" +
                "         \"totalPrice\" : 177.50\n" +
                "      },\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended 2\",\n" +
                "         \"dmsOpcode\" : \"01HY7K\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai 2\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZBS\",\n" +
                "               \"id\" : 176754,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Battery Service\",\n" +
                "               \"order\" : 2,\n" +
                "               \"price\" : 30,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Battery & Electrical\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430646,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Brake Inspection\",\n" +
                "               \"order\" : 3,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZBSFR\",\n" +
                "               \"id\" : 176751,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Brake System Fluid Replacement\",\n" +
                "               \"order\" : 4,\n" +
                "               \"price\" : 10,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"shopDuration\" : 30,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430648,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Adjust Drive Belts as Needed\",\n" +
                "               \"order\" : 5,\n" +
                "               \"price\" : 25.350,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Transmission & Axle\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430650,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect All Exterior Light Operations\",\n" +
                "               \"order\" : 9,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Lighting\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZIPB\",\n" +
                "               \"id\" : 176769,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Parking Brake\",\n" +
                "               \"order\" : 11,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"shopDuration\" : 10,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430651,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Inspect Throttle Chamber\",\n" +
                "               \"order\" : 13,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430649,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Install Valvoline Fuel and Oil Treatments\",\n" +
                "               \"order\" : 15,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430652,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Power Steering Fluid Flush\",\n" +
                "               \"order\" : 17,\n" +
                "               \"price\" : 15,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Alignment & Steering\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430647,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Rear Brake Service When Applicable\",\n" +
                "               \"order\" : 18,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Brakes\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 23.50,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"01HYZROT\",\n" +
                "               \"id\" : 176823,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Tire Rotation\",\n" +
                "               \"order\" : 22,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"shopDuration\" : 18,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 61,\n" +
                "         \"totalPrice\" : 260.240\n" +
                "      }\n" +
                "   ],\n" +
                "   \"mileage\" : 21000,\n" +
                "   \"position\" : 1,\n" +
                "   \"units\" : \"miles\"\n" +
                "}\n");
        map.put(22500,"{\n" +
                "   \"menuTypes\" : [\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : true,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20.40,\n" +
                "               \"selectable\" : true,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430644,\n" +
                "               \"loanerAllowed\" : true,\n" +
                "               \"name\" : \"Complimentary Car Wash\",\n" +
                "               \"order\" : 7,\n" +
                "               \"price\" : 14.550,\n" +
                "               \"selectable\" : true,\n" +
                "               \"serviceCategory\" : \"Paint, Body & Glass\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"47HYZWCI\",\n" +
                "               \"id\" : 526755,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Multi-Point Inspection OEM recommended\",\n" +
                "               \"order\" : 16,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 17,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430645,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Set Tire PSI\",\n" +
                "               \"order\" : 21,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 20,\n" +
                "         \"totalPrice\" : 34.950\n" +
                "      }\n" +
                "   ],\n" +
                "   \"mileage\" : 22500,\n" +
                "   \"position\" : 1,\n" +
                "   \"units\" : \"miles\"\n" +
                "}\n");
        map.put(24000,"{\n" +
                "   \"menuTypes\" : [\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20.40,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430644,\n" +
                "               \"loanerAllowed\" : true,\n" +
                "               \"name\" : \"Complimentary Car Wash\",\n" +
                "               \"order\" : 7,\n" +
                "               \"price\" : 14.550,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Paint, Body & Glass\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"47HYZWCI\",\n" +
                "               \"id\" : 526755,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Multi-Point Inspection OEM recommended\",\n" +
                "               \"order\" : 16,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 17,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430645,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Set Tire PSI\",\n" +
                "               \"order\" : 21,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 20,\n" +
                "         \"totalPrice\" : 34.950\n" +
                "      }\n" +
                "   ],\n" +
                "   \"mileage\" : 24000,\n" +
                "   \"position\" : 2,\n" +
                "   \"units\" : \"miles\"\n" +
                "}\n");
        map.put(28000,"{\n" +
                "   \"menuTypes\" : [\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20.40,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430644,\n" +
                "               \"loanerAllowed\" : true,\n" +
                "               \"name\" : \"Complimentary Car Wash\",\n" +
                "               \"order\" : 7,\n" +
                "               \"price\" : 14.550,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Paint, Body & Glass\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"47HYZWCI\",\n" +
                "               \"id\" : 526755,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Multi-Point Inspection OEM recommended\",\n" +
                "               \"order\" : 16,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 17,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430645,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Set Tire PSI\",\n" +
                "               \"order\" : 21,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 20,\n" +
                "         \"totalPrice\" : 34.950\n" +
                "      }\n" +
                "   ],\n" +
                "   \"mileage\" : 28000,\n" +
                "   \"position\" : 3,\n" +
                "   \"units\" : \"miles\"\n" +
                "}\n");
        map.put(30000,"{\n" +
                "   \"menuTypes\" : [\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20.40,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430644,\n" +
                "               \"loanerAllowed\" : true,\n" +
                "               \"name\" : \"Complimentary Car Wash\",\n" +
                "               \"order\" : 7,\n" +
                "               \"price\" : 14.550,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Paint, Body & Glass\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"47HYZWCI\",\n" +
                "               \"id\" : 526755,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Multi-Point Inspection OEM recommended\",\n" +
                "               \"order\" : 16,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 17,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430645,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Set Tire PSI\",\n" +
                "               \"order\" : 21,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 20,\n" +
                "         \"totalPrice\" : 34.950\n" +
                "      }\n" +
                "   ],\n" +
                "   \"mileage\" : 30000,\n" +
                "   \"position\" : 4,\n" +
                "   \"units\" : \"miles\"\n" +
                "}\n");
        map.put(33000,"{\n" +
                "   \"menuTypes\" : [\n" +
                "      {\n" +
                "         \"alacarte\" : false,\n" +
                "         \"description\" : \"Advantage Hyundai Recommended\",\n" +
                "         \"duration\" : 0,\n" +
                "         \"name\" : \"Advantage Hyundai\",\n" +
                "         \"price\" : 0,\n" +
                "         \"selectable\" : false,\n" +
                "         \"services\" : [\n" +
                "            {\n" +
                "               \"id\" : 1430643,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Check and Top Necessary Fluids\",\n" +
                "               \"order\" : 6,\n" +
                "               \"price\" : 20.40,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430644,\n" +
                "               \"loanerAllowed\" : true,\n" +
                "               \"name\" : \"Complimentary Car Wash\",\n" +
                "               \"order\" : 7,\n" +
                "               \"price\" : 14.550,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Paint, Body & Glass\",\n" +
                "               \"shopDuration\" : 3,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"dmsOpcode\" : \"47HYZWCI\",\n" +
                "               \"id\" : 526755,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Multi-Point Inspection OEM recommended\",\n" +
                "               \"order\" : 16,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Diagnostics & Inspection\",\n" +
                "               \"shopDuration\" : 17,\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430642,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Replace Engine Oil and Filter\",\n" +
                "               \"order\" : 20,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Oil & Consumables\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            },\n" +
                "            {\n" +
                "               \"id\" : 1430645,\n" +
                "               \"loanerAllowed\" : false,\n" +
                "               \"name\" : \"Set Tire PSI\",\n" +
                "               \"order\" : 21,\n" +
                "               \"price\" : 0,\n" +
                "               \"selectable\" : false,\n" +
                "               \"serviceCategory\" : \"Wheels & Tires\",\n" +
                "               \"showPrice\" : false,\n" +
                "               \"waiterAllowed\" : true\n" +
                "            }\n" +
                "         ],\n" +
                "         \"shopDuration\" : 20,\n" +
                "         \"totalPrice\" : 34.950\n" +
                "      }\n" +
                "   ],\n" +
                "   \"mileage\" : 33000,\n" +
                "   \"position\" : 5,\n" +
                "   \"units\" : \"miles\"\n" +
                "}\n");
        return map;
    }

    @GET
    @Path("/dealer/{webKey}/maintenanceRepair")
    @Produces("application/json")
    public String getMaintenance(@QueryParam(value = "searchText") String searchText) {
        String json;
		json = "{"+
                    "\"success\": true,\n" +
                    "\"services\": [ \n" +
						"{\n" +
						    "\"type\" : \"Maintenance\",\n" +
						    "\"problem\" : '',\n" +
						    "\"name\" : \"Check brakes\",\n" +
						    "\"duration\" : \"100 hours\",\n" +
						    "\"price\" : 1000,\n" +
						    "\"description\" : \"Break mandatory check \",\n" +
						    "\"opcode\" : \"123-ABC\",\n" +
						    "\"flag\" : true,\n" +
						    "\"priceCaption\" : \"500 $\"\n" +
						"},\n" +
						"{\n" +
							"\"type\" : \"Maintenance\",\n" +
						    "\"problem\" : '',\n" +
						    "\"name\" : \"Check lights\",\n" +
						    "\"duration\" : \"1 hours\",\n" +
						    "\"price\" : 5000,\n" +
						    "\"description\" : \"Lights mandatory check \",\n" +
						    "\"opcode\" : \"321-CBA\",\n" +
						    "\"flag\" : false,\n" +
						    "\"priceCaption\" : \"1000 $\"\n" +
						"},\n" +
						"{\n" +
							"\"type\" : \"Maintenance\",\n" +
						    "\"problem\" : '',\n" +
						    "\"name\" : \"Check doors\",\n" +
						    "\"duration\" : \"50 hours\",\n" +
						    "\"price\" : 666,\n" +
						    "\"description\" : \"Doors mandatory check \",\n" +
						    "\"opcode\" : \"456-ZXW\",\n" +
						    "\"flag\" : true,\n" +
						    "\"priceCaption\" : \"10500 $\"\n" +
						"},\n" +
						"{\n" +
							"\"type\" : \"Repair\",\n" +
						    "\"problem\" : \"Breaks not function properly\",\n" +
						    "\"name\" : \"Broken brakes\",\n" +
						    "\"duration\" : \"100 hours\",\n" +
						    "\"price\" : 100000,\n" +
						    "\"description\" : \"Ex-wife attacks again \",\n" +
						    "\"opcode\" : \"666-XXX\",\n" +
						    "\"flag\" : true,\n" +
						    "\"priceCaption\" : \"200 $\"\n" +
						"},\n" +
						"{\n" +
							"\"type\" : \"Repair\",\n" +
						    "\"problem\" : \"Light dont work\",\n" +
						    "\"name\" : \"Lights burn-out\",\n" +
						    "\"duration\" : \"45 hours\",\n" +
						    "\"price\" : 800,\n" +
						    "\"description\" : \"Lights over-use \",\n" +
						    "\"opcode\" : \"855-CSQ\",\n" +
						    "\"flag\" : false,\n" +
						    "\"priceCaption\" : \"4543 $\"\n" +
						"},\n" +
						"{\n" +
							"\"type\" : \"Repair\",\n" +
						    "\"problem\" : \"Smash with a tree\",\n" +
						    "\"name\" : \"Shatter  door windows\",\n" +
						    "\"duration\" : \"50 hours\",\n" +
						    "\"price\" : 666,\n" +
						    "\"description\" : \"Door slam\",\n" +
						    "\"opcode\" : \"451-ZXW\",\n" +
						    "\"flag\" : true,\n" +
						    "\"priceCaption\" : \"185 $\"\n" +
						"}\n" +
					"]\n" +
				"}";
					
        return json;
    } 
	
	@POST
    @Path("/dealer/{webKey}/make/{make}/model/{model}/year/{year}/unscheduledservices/kind/all")
    @Produces("application/json")
    public String getMaintenanceRepair(@QueryParam(value = "searchText") String searchText) {
        String json;
		json = "{"+
				"   \"key\": \"XMM_FIND_UNSCHEDULED_SERVICES\","+
				"   \"services\":	["+
				"        	{"+
				"     	\"name\": \"Campaign (if applicable)\","+
				"     	\"id\": 176822,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"Please enter the recall number and/or description.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\",\n" +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRECALL\","+
				"     	\"shopDuration\": 0.6,"+
				"     	\"shopDurationMins\": 36,"+
				"     	\"parentId\": 132781,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"RECALL\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"rank\": 1,"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Diagnostics & Inspection\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"2 Wheel Alignment\","+
				"     	\"id\": 176710,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\",\n" +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZ2WA\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 130201,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"2WD\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Alignment & Steering\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"4 Wheel Alignment\","+
				"     	\"id\": 176821,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"Hyundai Express\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\",\n" +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZ4WA\","+
				"     	\"shopDuration\": 0.8,"+
				"     	\"shopDurationMins\": 48,"+
				"     	\"parentId\": 130202,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"4WD\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Alignment & Steering\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"4 Wheel Brake Service\","+
				"     	\"id\": 176768,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"DEALER RECOMMENDED\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\",\n" +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZ4WBS\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 130203,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"4WBS\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Wheels & Tires\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"ABS Light Diagnosis\","+
				"     	\"id\": 176815,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price: Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\",\n" +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"36HYZABS\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128421,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"ABS\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Brakes\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Air Conditioning Service\","+
				"     	\"id\": 176744,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"DEALER RECOMMENDED\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZACS\","+
				"     	\"shopDuration\": 0.8,"+
				"     	\"shopDurationMins\": 48,"+
				"     	\"parentId\": 130204,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"A/CSERV\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Battery Service\","+
				"     	\"id\": 176754,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZBS\","+
				"     	\"shopDuration\": 0.3,"+
				"     	\"shopDurationMins\": 18,"+
				"     	\"parentId\": 130205,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"BATT\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Battery & Electrical\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Body Appearance and/or Paint Concern\","+
				"     	\"id\": 176747,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"10HYZPAINT\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 130121,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"PAINT\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Brake System Diagnosis\","+
				"     	\"id\": 176849,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"06HYZBRAKES\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128423,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"BRKDIAG\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Brakes\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Brake System Fluid Replacement\","+
				"     	\"id\": 176751,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZBSFR\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 130206,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"BRKFLR\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Brakes\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Check Engine Light  - Diagnosis\","+
				"     	\"id\": 176781,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"36HYZCEL\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128424,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"CEL\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Engine\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Complete Power Steering Service\","+
				"     	\"id\": 176787,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZCPSS\","+
				"     	\"shopDuration\": 0.8,"+
				"     	\"shopDurationMins\": 48,"+
				"     	\"parentId\": 130207,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"CPSS\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Alignment & Steering\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Detailing Service\","+
				"     	\"id\": 176715,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"DEALER RECOMMENDED\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZDS\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 130208,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"DS\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Paint, Body & Glass\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Electrical Systems Diagnosis\","+
				"     	\"id\": 176801,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"19HYZELECT\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128426,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"ELECT\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Battery & Electrical\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Engine Diagnosis (Noises,Leaks, Other)\","+
				"     	\"id\": 176796,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"20HYZENGINE\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128427,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"ENGINE\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Engine\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Engine Flush\","+
				"     	\"id\": 176844,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"DEALER RECOMMENDED\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZEF\","+
				"     	\"shopDuration\": 0.8,"+
				"     	\"shopDurationMins\": 48,"+
				"     	\"parentId\": 130209,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"EF\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Engine\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Engine Performance Diagnosis (Running Rough, Other)\","+
				"     	\"id\": 176713,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"20HYZDRV\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128428,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"DRV\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Engine\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Fuel/Air Induction System Service\","+
				"     	\"id\": 176739,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"DEALER RECOMMENDED\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZFISS\","+
				"     	\"shopDuration\": 0.8,"+
				"     	\"shopDurationMins\": 48,"+
				"     	\"parentId\": 130210,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"FISS\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Heating or Air Conditioning Diagnosis\","+
				"     	\"id\": 176810,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"14HYZHVAC\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128429,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"HVAC\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Hyundai World Class Inspection\","+
				"     	\"id\": 467281,"+
				"     	\"description\": \"Hyundai World Class Inspection\","+
				"     	\"tags\": [],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"47HYZWCI\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"HWCI\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": true,"+
				"     	\"serviceCategory\": \"Diagnostics & Inspection\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Other Diagnosis\","+
				"     	\"id\": 176702,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"10HYZOTHER\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128495,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"OTHER\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Air Cleaner Filter\","+
				"     	\"id\": 176800,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"Hyundai Express\","+
				"        	\"Opcode Required\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRACF\","+
				"     	\"shopDuration\": 0.3,"+
				"     	\"shopDurationMins\": 18,"+
				"     	\"parentId\": 128496,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RACF\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Oil & Consumables\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Automatic Transaxle Fluid\","+
				"     	\"id\": 176850,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRATF\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 128498,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RATF\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Transmission & Axle\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Climate Control Air Filter (for evaporator and blower unit)\","+
				"     	\"id\": 176817,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"Hyundai Express\","+
				"        	\"Opcode Required\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRCCAF\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 128500,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RCCAF\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Oil & Consumables\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Coolant\","+
				"     	\"id\": 176784,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRC\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 128501,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RC\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Engine Oil and Filter\","+
				"     	\"id\": 176786,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"Hyundai Express\","+
				"        	\"Opcode Required\","+
				"        	\"ServiceTab\","+
				"        	\"Severe\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZLOF2.0\","+
				"     	\"shopDuration\": 0.3,"+
				"     	\"shopDurationMins\": 18,"+
				"     	\"parentId\": 128511,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"LOF2.0\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Oil & Consumables\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Fuel Filter\","+
				"     	\"id\": 176730,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"Opcode Required\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRFF\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 128521,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RFF\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Oil & Consumables\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Spark Plugs (Platinum)\","+
				"     	\"id\": 176816,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"Opcode Required\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRSP4P\","+
				"     	\"shopDuration\": 0.5,"+
				"     	\"shopDurationMins\": 30,"+
				"     	\"parentId\": 128530,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RSP4P\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Engine\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Timing Belt\","+
				"     	\"id\": 176818,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\": [\"Opcode Required\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRTB2.0\","+
				"     	\"shopDuration\": 2,"+
				"     	\"shopDurationMins\": 120,"+
				"     	\"parentId\": 128534,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RTB2.0\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Engine\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Replace Wiper Blades\","+
				"     	\"id\": 176726,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZRWB\","+
				"     	\"shopDuration\": 0.2,"+
				"     	\"shopDurationMins\": 12,"+
				"     	\"parentId\": 130221,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"RWB\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Squeaks & Rattles Diagnosis\","+
				"     	\"id\": 176854,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"04HYZSQK-RTL\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128540,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"SQK-RTL\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Steering Diagnosis\","+
				"     	\"id\": 176756,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"04HYZSTEER\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128541,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"STEER\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Alignment & Steering\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Suspension Diagnosis\","+
				"     	\"id\": 176720,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"04HYZSUSP\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128542,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"SUSP\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Suspension and Shocks\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Synthetic Motor Oil Upgrade\","+
				"     	\"id\": 176806,"+
				"     	\"variant\": \"HMA\","+
				"     	\"duration\": 0,"+
				"     	\"tags\": [\"DEALER RECOMMENDED\"],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZSMU\","+
				"     	\"shopDuration\": 0,"+
				"     	\"shopDurationMins\": 0,"+
				"     	\"parentId\": 130222,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"SMU\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"durationMins\": 0,"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Oil & Consumables\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Tire Rotation\","+
				"     	\"id\": 176823,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"Hyundai Express\","+
				"        	\"Opcode Required\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZROT\","+
				"     	\"shopDuration\": 0.3,"+
				"     	\"shopDurationMins\": 18,"+
				"     	\"parentId\": 128543,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"ROT\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Wheels & Tires\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Transmission Diagnosis (Not Shifting Properly,Leaks,Other)\","+
				"     	\"id\": 176848,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"12HYZTRANS\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128544,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"TRANS\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Transmission & Axle\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Transmission Flush\","+
				"     	\"id\": 176782,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZTF\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 130223,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"TF\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Transmission & Axle\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Trim or Moulding Diagnosis\","+
				"     	\"id\": 176762,"+
				"     	\"variant\": \"HMA\","+
				"     	\"description\": \"A trained technician will analyze (diagnose) your concern. As a result of diagnosis, an estimate for repairs or additional diagnosis as required will be provided to you. Diagnosis fee does not include cost of parts and/or labor to complete repair. Please address any concerns direclty with your service advisor upon arrival. Disclaimer regarding price:Waived if covered under factory or extended warranty. Dealership will determine eligibility.\","+
				"     	\"tags\":      	["+
				"        	\"Opcode Required\","+
				"        	\"Repair\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"10HYZTRIM\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 128545,"+
				"     	\"serviceKind\": \"repair\","+
				"     	\"abbreviation\": \"TRIM\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Air conditioning and Heating\""+
				"  	},"+
				"        	{"+
				"     	\"name\": \"Wheel Balance (4 Wheel)\","+
				"     	\"id\": 176777,"+
				"     	\"variant\": \"HMA\","+
				"     	\"tags\":      	["+
				"        	\"DEALER RECOMMENDED\","+
				"        	\"Hyundai Express\","+
				"        	\"ServiceTab\""+
				"     	],"+
				"     	\"dealerCode\": \"HMANY110\","+
				"     	\"price\": 0,"+
				"       \"priceCaption\" : \"Dollar\"," +
				"     	\"reservableByCustomers\": 1,"+
				"     	\"dmsOpcode\": \"01HYZWB\","+
				"     	\"shopDuration\": 1,"+
				"     	\"shopDurationMins\": 60,"+
				"     	\"parentId\": 130224,"+
				"     	\"serviceKind\": \"maintenance\","+
				"     	\"abbreviation\": \"WB\","+
				"     	\"nameDealerUpdateable\": 1,"+
				"     	\"mandatoryInApptUpdateable\": 1,"+
				"     	\"enabled\": 1,"+
				"     	\"serviceHours\": [],"+
				"     	\"serviceSkills\": [],"+
				"     	\"waiterAllowed\": true,"+
				"     	\"loanerAllowed\": false,"+
				"     	\"serviceCategory\": \"Wheels & Tires\""+
				"  	}"+
				"   ],"+
				"   \"statusCode\": 0,"+
				"   \"success\": true"+
				"}";
		return json;
	}
}
