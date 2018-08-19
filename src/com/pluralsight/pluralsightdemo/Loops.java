package com.pluralsight.pluralsightdemo;

public class Loops
{
    int num1 = 5;

    public void fact()
    {
        System.out.println("While Loop Demo, Factorial of "+num1);
        int fact = 1;
        while (num1 > 1) {
            fact *= num1;
            num1 -= 1;
        }
    System.out.println("Factorial is "+fact);
    }

    public void forLoop()
    {
        for(;num1<=10;num1++)
        {
            System.out.println(num1);
        }
    }
}