import java.util.Arrays;

//sheena samuel
public class Array1DNotes
{
public static void main (String args [])
{

//Fill an array or type int with 25 odd numbers
//ranging from a lower to upper bound
    
    int oddnbr[] = new int [25];
    
    int lwr = 21;
    int upr = 100;
    int i = 0;
    int randnbr;
    
    while (i < oddnbr.length)
    {
        randnbr = (int) (Math.random() * (upr-lwr +1) + lwr);

        if(randnbr%2 != 0)
        {       
        oddnbr [i] = randnbr;
        i = i + 1;
        }
        
    }//end of while
    
    System.out.println(Arrays.toString(oddnbr));
    
//int evennbrs[] = {12, 6, 8, 2, 10};
//System.out.println("Element 3 contains " + evennbrs[2]);

//Creating and initializing an array explicitly
//int evennbrs[] = new int[5];    
//evennbrs[0] = 2;
//evennbrs[1] = 12;
//evennbrs[2] = 20;
//evennbrs[3] = 14;
//evennbrs[4] = 32;
//
//System.out.println("Element 3 contains " + evennbrs[2]);

}//end of main    
}//end of clas
