
package ru.geekbrains.homeworks;

public class Main {


    public static void main(String[] args) {
        byte j = 12;
        short k = 20;
        int l = -124;
        long m = 8654;
        float n = 5.5f;
        double g = 10.3;
        char ch = 'c';
        boolean logic = true;
        String phrase = "Java development";

        System.out.println(count(10, 20, 15, 3));
        System.out.println(check(12.5, 5.1));
        System.out.println(chekPositiveNumber(-12));
        System.out.println(checkNumber(-1));
        System.out.println(sayHelloName("Макс"));
        System.out.println(checkYear(2020));

    }
    public static int count (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean check (double a, double b){
        double sum = a+b;
        boolean z = false;
        if (sum > 10 && sum<=20){
            z=true;
        }
        return z;
    }
    public static String chekPositiveNumber (int a){
        String answer = "";
        if (a>=0){
            answer = "positive number";
        } else {
            answer = "negative number";
        }
        return answer;
    }
    public static boolean checkNumber (int a){
        boolean x = false;
        if (a<0){
            x = true;
        }
        return x;
    }
    public static String sayHelloName (String name){
        return "Привет, " + name;
    }
    public static String checkYear (int year){
        String answer = "";
        if (year%4 == 0 && year%100!=0){
            answer = "Этот год високосный";
        }
        else if (year%400 == 0 && year%100==0){
            answer = "Этот год високосный";
        }
        else if (year%400!=0 && year%100 ==0){
            answer = "Этот год не високосный";
        }
        else {
            answer = "Этот год не високосный";
        }
        return answer;
    }
}