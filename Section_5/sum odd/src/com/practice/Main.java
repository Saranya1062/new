package com.practice;

         public class SumOddRange {
            public static boolean isOdd(int number){
                if(number<=0){
                    return false;
                }
                else{
                    if(number%2!=0)
                    {
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
            public static int sumOdd(int start,int end){
                int sum=0;
                if(start<=0 || end<=0){
                    return -1;
                }
                else{
                    if(end>=start){
                        for(int i=start;i<=end;i++){
                            boolean k=isOdd(i);
                            if(k)
                            {
                                sum+=i;
                            }
                        }
                    }
                    else{
                        return -1;
                    }
                }
                return sum;
            }

        }
