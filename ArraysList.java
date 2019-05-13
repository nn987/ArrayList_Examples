package ArrayList;


/**
 * ArraysList : tamanho de um array
 * 
 * @author RND 
 * @version 2011
 */

import java.util.*;
public class ArraysList {
    public static void main (String[] args) {
        ArrayList al = new ArrayList(); //criar o arrayList
        // adicionar elementos ao arraylist
    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    al.add(1, "A2");
    // listar o array list
    System.out.println("Size of al after additions: " + al.size());
    
    // Remover elements from the array list
    al.remove("F");
    al.remove(2);
    // listar o array list
    System.out.println("Contents of al: " + al);
   }
}
