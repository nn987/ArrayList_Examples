//ArrayList long list of methods

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{

// Storage for an arbitrary number of notes.
private ArrayList<String> notes;

/**
 * Perform any initialization that is required for the
 * notebook.
 */
public Notebook()
{
    notes = new ArrayList<String>();
}

/**
 * Store a new note into the notebook.
 * @param note The note to be stored.
 */
public void storeNote(String note)
{
    notes.add(note);
}

/**
 * @return The number of notes currently in the notebook.
 */
public int numberOfNotes()
{
    return notes.size();
}

/**
 * Show a note.
 * @param noteNumber The number of the note to be shown.
 */
public void showNote(int noteNumber)
{
    if(noteNumber < 0) {
        // This is not a valid note number, so do nothing.
        System.out.println("invalid index given");
    }
    else if(noteNumber < numberOfNotes()) {
        // This is a valid note number, so we can print it.
        System.out.println(notes.get(noteNumber));
    }
    else {
         System.out.println("there are fewer items in the notebook than that");
        // This is not a valid note number, so do nothing.
    }
}

public void removeNote(int noteNumber)
{
    if(noteNumber < 0) {
        // This is not a valid note number, so do nothing.
         System.out.println("invalid index given");
    }
    else if(noteNumber < numberOfNotes()) {
        // This is a valid note number.
        notes.remove(noteNumber);
    }
    else {
        System.out.println("there are fewer items in the notebook than that");
        // This is not a valid note number, so do nothing.
    }
}

public void multiplesOfFive()
{

    int i = 10;
    while(i < 100) 
    {
        System.out.println(i);
        i = i + 5;
    }
}

public int sum(int a, int b)
{

    int index = a;
    int result = 0;
    while(index <= b) 
    {
        result = result + index;
        index = index + 1;
    }
    return result;
}

public int product(int a, int b)
{

    int index = a;
    int result = 1;
    while(index <= b) 
    {
        result = result * index;
        index = index + 1;
    }
    return result;
}

public boolean 
    isPrime (int n)
    {
       if (n<=1)return false;
       if (n==2) return true;
       for (int i = 2;i<=n-1;i++)
       {
         if (n%i==0)return false;
       }
       return true;
     }
}
