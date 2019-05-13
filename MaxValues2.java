 


import java.util.*;

public class MaxValues2 {
 
 public int maxValue (int array[]) {
 mxm = array[0];
  for (i=0; i<array.length; i++) {
     if (array[i]>mxm) {
         mxm = array[i];
     }
   }
   return mxm;
  }

  
//Code for Finding the Minimum Value in an Array:

  public int minValue (int array[]) {
    mn = array[0];
        for (i=0; i<array.length; i++) {
            if (array[i]<mn) {
                mn = array[i];
            }
        }
        return mn;
    }

/**
 * To use either of the above functions, 
 *  simply call minValue or maxValue with an array as an argument. For example:
 */
 
    int k;
    int[] k={12, 5, 63, 7, 1, -1, 352, 36, 754, 75, 56, 74}; 
    maxValue(k[]);
    minValue(k);
    
 /**Since the largest number in our k array is 754, 
  * our maxValue returns a 754 when traced with k as the argument. 
  * Likewise, running the minValue function with k as the argument 
  * returns the smallest value, -1.
  */

