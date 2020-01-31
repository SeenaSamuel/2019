
import java.util.Arrays;

//sheena samuel

public class JAN22Practice {
public static void main (String args[])
{
    int upper = 8;
    int lower = 0;
    int divisor = 2;
    int k = 0;
    int c = 0;
    int first [] = new int [upper-lower+1];
        int first50 [] = new int [50];
    int second [] = new int [upper-lower+1];
        int second50 [] = new int [50];
    int length = 50;
        
    while (k<first.length)
    {
        first[k] = lower + k;
        k=k+1;
    }//end of while
    
    k=0;
    
    while (k<second.length)
    {
       second[k] = lower + k;
       if(second[k]%divisor == 0)
       {
        second[k] = 0;
       }
       k=k+1; 
    }
    
    k=0;
    
    while (k<second.length)
    {
        if (first[k] != second[k])
        {
            c=c+1;
        }
        k=k+1;
    }
    
    double third [] = new double [c];
        double third50 [] = new double [50];
    k=0;
    c=0;
    
    while (k<first.length)
    {
        if (first[k] != second[k] && k>1 && k<(first.length-1))
        {
        third[c] =(Math.pow(first[k-1],2) + Math.pow(first[k+1],2))/(first[k-1] + first[k+1]);
        c=c+1;
        }
        if (first[k] != second[k] && k==0)
        {
        third[c] =(Math.pow(first[k+1],2) + Math.pow(first[k+2],2))/(first[k+1] + first[k+2]);
        c=c+1;
        }
        if (first[k] != second[k] && k==first.length-1)
        {
        third[c] =(Math.pow(first[k-1],2) + Math.pow(first[k-2],2))/(first[k-1] + first[k-2]);
        c=c+1;
        }
        k=k+1;
    }

    k=0;
    c=0;
    
    String print1 = "";
    String print2 = "";
    String print3 = "";

    while (k<50)
    {
        if(first.length<50)
        {
        print1 = print1 + first[k]+ ",";
        print2 = print2 + second[k]+ ",";
        print3 = print3 + third[k]+ ",";
        }
        if(first.length>50)
        {
        print1 = print1 + first[k]+ ",";
        print2 = print2 + second[k]+ ",";
        print3 = print3 + third[k]+ ",";    
        }
        k=k+1;
    }
    

    
    System.out.println(print1);
    System.out.println(print2);
    System.out.println(print3);

    
}//end main
}//end class
