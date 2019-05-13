 

//using System.Collections;

//minimum value from an ArrayList


 import java.util.*;
 
 public class MaxMinValues {
 
 public ArrayList GetMinValue(ArrayList arrList) {
      ArrayList sortArrayList = arrList;

      sortArrayList.Sort();
      return sortArrayList[0];
 }



//find Maximum value from an ArrayList

 public ArrayList GetMaxValue(ArrayList arrList) {
     ArrayList sortArrayList = arrList;

     sortArrayList.Sort();
     sortArrayList.Reverse();
     return sortArrayList[0];

 }
}