package com.pluralsight.pluralsightdemo;
import java.io.BufferedReader;
import java.util.*;
public class Main {
//Nasir.........
    //test
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.println("In Main...");
            System.out.println("Plural Sight Package...");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("1. Conversion");
            System.out.println("2. Conditional Logic");
            System.out.println("3. Loops");
            System.out.println("4. Arrays");
            System.out.println("0. Exit");

            System.out.println("Enter your choice..");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();


            switch (ch) {
                case 1:
                    Conversion C = new Conversion();
                    C.conversion();
                    break;
                case 2:
                    Condition CL = new Condition();
                    CL.conditionalLogic();
                    CL.condtionalOperators();
                    break;
                case 3:
                    Loops L = new Loops();
                    L.fact();
                    L.forLoop();
                    break;
                case 4:
                    Arrays A= new Arrays();
                    A.array();
                    break;
                case 0:
                    System.out.println("Terminating Program....");
                    System.exit(0);
                    break;
                 default:
                     System.out.println("Not a valid option.....");
            }

        }
    }
}
