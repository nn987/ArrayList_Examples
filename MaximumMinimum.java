//using System.Collections;

//1)Method to find the minimum value from an ArrayList

 public static object GetMinValue(ArrayList arrList) {

      ArrayList sortArrayList = arrList;

      sortArrayList.Sort();

      return sortArrayList[0];

 }



//2Method to find Maximum value from an ArrayList

 public static object GetMaxValue(ArrayList arrList) {

     ArrayList sortArrayList = arrList;

     sortArrayList.Sort();

     sortArrayList.Reverse();

     return sortArrayList[0];

 }
