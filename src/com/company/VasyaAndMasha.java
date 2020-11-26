package com.company;

import java.util.ArrayList;

class VasyaAndMasha{
    private int vasya_salary;
    private int masha_salary;
    private int total_salary;
    VasyaAndMasha(String text){
        text = text.trim();
        ArrayList<Integer> spacePlaces = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                spacePlaces.add(i);
            }
        }
        vasya_salary = Integer.parseInt(text.substring(spacePlaces.get(1)+1, spacePlaces.get(2)));
        masha_salary = Integer.parseInt(text.substring(spacePlaces.get(10)+1, spacePlaces.get(11)));
        total_salary = masha_salary + vasya_salary;
    }

    public int getTotal_salary() {
        return total_salary;
    }

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        VasyaAndMasha vasyaAndMasha = new VasyaAndMasha(text);
        System.out.println(vasyaAndMasha.getTotal_salary());
    }
}