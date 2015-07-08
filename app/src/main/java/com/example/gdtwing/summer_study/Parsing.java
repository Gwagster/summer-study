package com.example.gdtwing.summer_study;

/**
 * Created by gdtwing on 7/7/15.
 */
public class Parsing {

    public static final Integer ZERO_INTEGER=0;

    public static Integer nullToInteger(Object value){
        if (null==value){
            return ZERO_INTEGER;
        }
        else{
            if (value instanceof Number){
                return ((Number)value).intValue();
            }
            else{
                String stringValue = null;
                if (value instanceof  String){
                    stringValue= (String) value;
                }
                else {
                    stringValue = value.toString();
                }
                try{
                    return Integer.parseInt(stringValue);
                }
                catch (NumberFormatException e){
                    System.out.println("Can't parse provided value"+value+"to integer");
                }
            }

        }
    }
}
