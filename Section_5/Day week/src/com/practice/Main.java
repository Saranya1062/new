package com.practice;

public class Main {

    public static void main(String[] args) {
       printDayWeek(-1);
        printDayWeek(5);
        printDayWeek(0);
        printDayWeek(2);
        printDayWeek(4);
    }
    public static void printDayWeek(int day)
    {
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
