package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    String regex = "^[+]?[7-8]?\\s?[(-]?[0-9]{3}[)-]?\\s?[0-9]{3}[-]?[0-9]{2}[-]?[0-9]{2}$";

    public PhoneNumber(String text) {
        text = text.trim();
        Pattern pattern = Pattern.compile(regex);
        Matcher mather = pattern.matcher(text);
        if(mather.matches()){
            System.out.println(parseNumber(text));
        }
        else{
            System.out.println("Неверный формат номера");
        }

    }

    private String parseNumber(String text){
        ArrayList<Character> arrayList = new ArrayList<>();
        for(int i = 0; i < text.length(); i++){
            if((int)text.charAt(i) >47 && (int)text.charAt(i)< 58){
                arrayList.add(text.charAt(i));
            }
        }
        String parsedNumber = "+7 (";
        if(arrayList.size() == 10){
            for(int i = 0; i < 3; i++){
                parsedNumber+=arrayList.get(i);
            }
            parsedNumber+=") ";
            for (int i = 3; i < 6; i++) {
                parsedNumber+=arrayList.get(i);
            }
            parsedNumber+="-";
            for(int i = 6; i < 8; i++){
                parsedNumber+=arrayList.get(i);
            }
            parsedNumber+= "-";
            for (int i = 8; i < 10; i++) {
                parsedNumber += arrayList.get(i);
            }
        }
        else if(arrayList.size() == 11){
            arrayList.remove(0);
            for(int i = 0; i < 3; i++){
                parsedNumber+=arrayList.get(i);
            }
            parsedNumber+=") ";
            for (int i = 3; i < 6; i++) {
                parsedNumber+=arrayList.get(i);
            }
            parsedNumber+="-";
            for(int i = 6; i < 8; i++){
                parsedNumber+=arrayList.get(i);
            }
            parsedNumber+= "-";
            for (int i = 8; i < 10; i++) {
                parsedNumber += arrayList.get(i);
            }
        }
        return parsedNumber;
    }

}
