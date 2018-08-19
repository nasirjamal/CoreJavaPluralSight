package com.pluralsight.pluralsightdemo;

public class Condition {
    int rooms=10, students=50, avg=0;

    public void conditionalLogic()
    {

          String a=rooms>students?"Rooms are more than Students...":"Students are more than rooms...";
          System.out.println(a);
          if (students>0)
          {
              avg=students/rooms;
              System.out.println("Average of "+avg+" Students per room...");
          }
          else
          {
               System.out.println("No Students...");
          }
    }

    public void condtionalOperators()
    {
        if (rooms>0&&students/rooms>4)
        {
            System.out.println("Crowded!!");
        }
        else
        {
            System.out.println("Not Crowded!!");
        }
    }
}
