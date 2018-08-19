package com.pluralsight.pluralsightdemo;

public class Conversion {

    public void conversion()
    {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("In conversion...");
        float floatVal=1.04f;
        double doubleVal=4.0d;
        byte byteVal=7;
        short shortVal=7;
        long longVal=5;

        short result1= (short)longVal;
        long result2= (short) byteVal-longVal;

        System.out.println("Converted---> Result 1: "+result1+" || Result2: "+result2);
        System.out.println("-----------------------------------------------------------------------------");
    }
}
