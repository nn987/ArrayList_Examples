package ArrayList;

import java.util.*;

public class maxValue2 {

 public static void main(String[] args) { 
  int max = 0, min=100;
  double average = 0;     
  ArrayList<Integer> grades = new ArrayList<Integer>();
       
  grades.add(75);
  grades.add(80);
  grades.add(95);
  grades.add(100);
  grades.add(85);


    for(int i = 0; i < grades.size(); i++) {
        int score = grades.get(i);
            max = Math.max(max, score);
            min = Math.min(min, score);
            average += score;
    }
System.out.println
("max = " + max + " min = " + min + " average = " + average/grades.size());
}
}
