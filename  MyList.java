package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//create generic MyList class with type parameter T
final class MyList<T extends Number>{

    //create ArrayList of type T
    ArrayList<T> list = new ArrayList<T>();

    //create an add method that adds argument of type T to ArrayList
    public void add( T new_element ){
	list.add( new_element );
    }

    //create method 'largest' that returns largest value of 'list'
    public T largest(){
	Collections.sort( list );
        //must return largest value after sorting
    }

    //create method 'smallest' that returns smallest value of 'list'
    public T smallest(){
	Collections.sort( list );
	//must return smallest value after sorting
    }
}

public final class GenericsHW{

    public static void main(final String[] args) {
	MyList<Number> list = new MyList<Number>();

	list.add( new Integer( 10  ) );
	list.add( new Double( 1.2 ) );
    }

}
