package com.practice;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));

    }

    public static int sumDigits(int num) {

        if(num < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (num >0) {
            int digit = num % 10;
            sum += digit;


            num /= 10;
        }

        return sum;
    }
}
