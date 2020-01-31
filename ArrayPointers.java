import java.util.*;

public class ArrayPointers {
    public static void main (String args[])
    {
        int nbrs [] = {10, -12, 16, -28};
        int total = 0;
        int k = 0;
        
        while (k < nbrs.length-1)
        {
            total = total + nbrs[k] + nbrs[k+1];
            k=k+1;
        }//end of while
        
        System.out.println("Totals for " +Arrays.toString(nbrs)+ " is " +total);
        
//        int nbrs[];//declaring a ponter for refference to an array object
//        nbrs = new int [5];//assign an array object to the reference
//        System.out.println("Array nbrs has " + nbrs.length + " elements");
//        nbrs = new int [50];
        
    }//end main
}//end of class
