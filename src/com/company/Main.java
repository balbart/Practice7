package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        breakpoint:
        while (true) {
            System.out.println("1. Зарплата Маши и Васи");
            System.out.println("2. ФИО");
            System.out.println("3. Номер телефона");
            System.out.println("0. Выход");
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()){
                case 0:
                    break breakpoint;
                case 1:
                    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
                    VasyaAndMasha vasyaAndMasha = new VasyaAndMasha(text);
                    System.out.println(vasyaAndMasha.getSalary());
                    break;
                case 2:
                    String s = in.nextLine();
                    s = in.nextLine();
                    NameForm nameForm = new NameForm(s);
                    break;
                case 3:
                    String s1 = in.nextLine();
                    s1 = in.nextLine();
                    PhoneNumber phoneNumber = new PhoneNumber(s1);
                    break;
                default:
                    System.out.println("Неправильный ввод");
                    break;
            }
        }
    }
}
