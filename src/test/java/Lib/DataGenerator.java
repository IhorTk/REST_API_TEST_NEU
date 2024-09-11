package Lib;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class DataGenerator {
    public static String getRandomEmail(){
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return "John" + timeStamp + "@example.com";

    }
    public static Map<String,String> getRegistrationDate(){
        Map<String,String> data = new HashMap<>();
        data.put("email", getRandomEmail());
        data.put("password", "123");
        data.put("username", "Akurra");
        data.put("firstName", "Akkura");
        data.put("lastName", "HoHo");

        return data;
    }

    public static Map<String,String> getRegistrationDate(Map<String,String> nonDefaultValues){
        Map<String,String> defaultValues = getRegistrationDate();

        Map<String,String> userData = new HashMap<>();
        String[] keys = {"email","password","username","firstName","lastName"};
        for (String key :keys){
            if(nonDefaultValues.containsKey(key)){
                userData.put(key, nonDefaultValues.get(key));
            }else{
                userData.put(key,defaultValues.get(key));
            }
        }
        return userData;
    }
}
