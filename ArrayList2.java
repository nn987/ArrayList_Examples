 

 


import java.util.ArrayList;

public class AraryListDemo {

  public static void main(String[] args) {

    ArrayList al = new ArrayList();
    System.out.print("Initial size of al :  " + al.size());
    System.out.print("\n");

    //add.elements to the array list
    al.add("C");
    al.add("A");
    al.add("E");
    al.add("B");
    al.add("D");
    al.add("F");
    al.add(1,"A2");//inserts objects "A2" into array at index 1

    System.out.print("size of al after additions " + al.size());
    System.out.print("\n");

    //display the array list
    System.out.print("contents of al: " +  al );
    System.out.print("\n");

    //Remove elements from the array list
    al.remove("F");
    al.remove(2);

    System.out.print("size of after deletions : " + al.size());
    System.out.print("\n");
    System.out.print("contents of al:" + al);

  }

}
