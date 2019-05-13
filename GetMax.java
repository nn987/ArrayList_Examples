 


import java.util.*;
public class GetMax {
  
  public int getMax(int array[]) {    
    int k = 0;
    int max = array[0];
    
        for(int j=0; j<array.length; j++) {
           if(array[j]<max)
              max = array[j];
           }
        return max; 
        }
    
    public static void main(String[] args){ 
        int[] max={2,3,4,5,6,7,8,9};
        int[] i;
        
        Arrays.sort(max); 
        System.out.println("max:"+ getMax(max[0]));
    }
  }

