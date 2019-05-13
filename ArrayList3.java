package ArrayList;

 

/**
 * Write a description of class ArrayList3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class ArrayList3
{
   public static void main()
   {
      ArrayList al = new ArrayList();

      for (int i=0; i<=1000; i=i+2)
      {
         Integer x = new Integer(i);
         al.add(x);
      }

      System.out.println("The list members are:\n " + al);
   }
}