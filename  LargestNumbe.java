package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
 
public class LargestNumber {
    public static void main(String[] args){
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(101);
        aList.add(872);
        aList.add(777);
        aList.add(102);
        aList.add(23);
         
        Iterator<Integer> it = aList.iterator();
        int max = 0;
        while(it.hasNext()){
            int temp = it.next();
            if(temp > max)
                max = temp;
        }   
        System.out.println("Max value:"+max);
    }
 
}

