package com.company;

class VasyaAndMasha{
    private int vasya_salary;
    private int masha_salary;
    public VasyaAndMasha(String text) {
        String[] arr = text.split(" ");
        if (arr.length > 12) {
            this.masha_salary = Integer.parseInt(arr[11]);
            this.vasya_salary = Integer.parseInt(arr[2]);
        }
        else{
            this.masha_salary = 0;
            this.vasya_salary = 0;
        }
    }

    public int getSalary(){
        return this.masha_salary + this.vasya_salary;
    }


    public static void main(String[] args) {

//        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
//        VasyaAndMasha vasyaAndMasha = new VasyaAndMasha(text);
//        System.out.println(vasyaAndMasha.getSalary());


    }
}