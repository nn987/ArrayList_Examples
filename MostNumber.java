package ArrayList;

/**i have an arraylist named proteins.
*i need to find out and display which protein in the arraylist
*is repeated the most number of times.
*/

import java.util.*;

public class MostNumber {

public static void main(String[] args) {
   
  
   ArrayList<String> al = new ArrayList<String>();    //init first,just for test
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("aaa");
        al.add("ccc");

        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<al.size();i++){
            Integer count = map.get(al.get(i));
            map.put(al.get(i), count==null?1:count+1);   //auto boxing and count
        }
        System.out.println(map);
    }
}
