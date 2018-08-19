package com.pluralsight.pluralsightdemo;

public class Arrays {

    public void array()
    {
        int i=0;
        int [] a1= new int[10];
        for(i=0; i<10;i++) {
            a1[i] = i;
        }
        for (i=0; i<a1.length;i++)
        System.out.print ("   a["+i+"]= "+a1[i]);
    }
}
