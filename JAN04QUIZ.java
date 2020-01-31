//sheena samuel
import java.util.*;

public class JAN04QUIZ {
    public static void main (String args[])
    {
        int upr = 156;
        int low = 78;
        int count0 = 0;
        int numb=0;
        
        while (count0 < 1) 
{
        if(low%2 == 0 && upr%2== 0)
        {
            numb =(int)(upr-low+2)/2-1;
            count0 = count0 +1;
        }
        if (low%2 == 1 || upr%2== 1)
        {
            numb =(int)(upr-low+2)/2;
            count0 = count0 +1;
        }
}
        
        int oddary[] = new int [numb];
        int count = 0;
        int count2 = 0;
        int squareary [] = new int [oddary.length - 1];
        int prodary [] = new int [oddary.length - 1];
        int sum1 = 0;
        int sum2 = 0;
        
        
        
        while (count < oddary.length)
        {
            if ((low+count2)%2 == 1)
            {
            oddary [count] = low + count2;
            count2 = count2 + 1;
            count = count + 1;
            }// end of if
            if ((low+count2)%2 == 0)
            {
            count2 = count2 + 1;
            }
        }//end of while
        
        count = 0;
        
        while (count < prodary.length)
        {
            prodary [count] = oddary[count] * oddary[count+1];
            squareary [count] = (int)(Math.pow(prodary[count],2));
            sum1 = sum1 + prodary[count];
            sum2 = sum2 + squareary [count];
            count = count + 1;
        }
        
        
        
        System.out.println("Lower bound = " +low);
        System.out.println("Upper bound = " +upr);
        System.out.println("Odd array = "+Arrays.toString(oddary));
        System.out.println("First Array = " +Arrays.toString(squareary));
        System.out.println("Second results array = "+Arrays.toString(prodary));
        System.out.println("First results array total = "+sum2);
        System.out.println("Second results array total = "+sum1);
        
    }//end main
}//end class
