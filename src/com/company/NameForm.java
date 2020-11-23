package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameForm {
    String regexFIO = "^\\s*[а-яА-Я-]+\\s+[а-яА-Я-]+\\s+[а-яА-я-]+\\s*$";
    String regexFI =  "^\\s*[а-яА-Я-]+\\s+[а-яА-Я-]+\\s*$";
    public NameForm(String text) {
        text = text.trim();
        if(isOk(text)){
            String[] arr = text.split("\\s+");
//            System.out.println(Arrays.toString(arr));
            printFIO(arr);
        }else{
            System.out.println("Введенная строка не является ФИО");
        }

    }

    private boolean isOk(String text) {
        Pattern p = Pattern.compile(regexFIO);
        Matcher m = p.matcher(text);
        if(m.matches()){
            return true;
        }
        else{
            p = Pattern.compile(regexFI);
            m = p.matcher(text);
            if(m.matches()){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void printFIO(String[] FIO){
        String[] arr = capitalize(FIO);
        if(arr.length == 2){
            System.out.println("Фамилия: " + arr[0]);
            System.out.println("Имя: " + arr[1]);
        }
        else if(arr.length == 3){
            System.out.println("Фамилия: " + arr[0]);
            System.out.println("Имя: " + arr[1]);
            System.out.println("Отчество: " + arr[2]);
        }
        else{
            System.out.println("Нет данных");
        }
    }

    private String[] capitalize(String[] arr){
        String[] buff = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            buff[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        return buff;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NameForm nameForm = new NameForm(in.nextLine());
    }
}
