package com.practice;

public class Main {

    public static void main(String[] args) {
        int cnt = 0;
        int sum = 0;

        for(int i=1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                cnt++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if(cnt == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
