package com.company;

public class Main {

    public static void main(String[] args) {
	  double firstVal=20.00d;
	  double secVal=80.00d;
	  double totVal=firstVal+secVal*100.00d;
        System.out.println("totVal="+totVal);
	  double rem=totVal%40.00d;
        System.out.println("remainder="+rem);
        boolean isNoRem=(rem==0)?true:false;
          System.out.println("isNoRem="+isNoRem);
          if(!isNoRem)
          {
              System.out.println("Got some remainder");
          }
    }
}
