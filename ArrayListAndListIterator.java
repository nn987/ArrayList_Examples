 

//Java enter list element through keyboard and remove element

import java.util.*;

class ArrayListAndListIterator{
   public static void main(String[]args){
	List l = new ArrayList();
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 5 elements: ");
		for(int i=0;i<5;i++){
			String st=input.next();
			l.add(st);
		}
		System.out.println("Enter element to remove: ");
		String st=input.next();
		l.remove(st);

	ListIterator listIterator = l.listIterator();
	System.out.println("Elements are: ");
	while (listIterator.hasNext()) {
	System.out.println(listIterator.next());
       }
    }
}
