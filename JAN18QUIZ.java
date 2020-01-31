//sheena samuel
import java.util.Arrays;

public class JAN18QUIZ {
    public static void main (String args [])
    {
        int divisor = 57;
        int lowerbound = 800;
        int upperbound = 1250;
        int count = 0;
        int firstary [] = new int [upperbound-lowerbound+1];
        int count2 = 0;

        
        while (count < firstary.length)
        {
            firstary[count] = lowerbound + count;
            count = count +1;
        }
        
        count = 0;
        
        
        while (count < firstary.length)
        {
            if (firstary[count] % divisor == 0)
            {
            count2 = count2+1;
            }//end fo if
            count = count +1;
        }//end of while
        
        count = 0;
        
        int newary [] = new int [count2]; 
        
        count2 = 0;
        
        while (count < firstary.length)
        {
            if (firstary[count] % divisor == 0)
            {
            newary[count2] = firstary[count];
            count2 = count2+1;
            }//end of if
            count = count +1;
        }
        
        count = 0;
        
        while (count < newary.length)
        {
            newary[count] = newary[count]*(-1);
            count = count +1;
        }
        
        count = 0;
        
        int newfirstary [] = new int [firstary.length];
        
        while (count < firstary.length)
        {
            if (firstary[count] % divisor == 0)
            {
                newfirstary[count] = 0;
                count = count+1;
            }
            else
            {
                newfirstary[count] = firstary[count];
                count = count +1;
            }
        }
        
        int sumfirst = 0;
        int sumsecond = 0;
        
        count = 0;
        
        while (count < newfirstary.length)
        {
            sumfirst = sumfirst + newfirstary[count];
            count = count +1;
        }
        
        count = 0;
        
        while (count < newary.length)
        {
            sumsecond = sumsecond + newary[count];
            count = count +1;
        }
        
        System.out.println("Lower bound = " +lowerbound);
        System.out.println("Upper bound = " +upperbound);
        System.out.println("Divisor filter = " +divisor);
System.out.println("");
        System.out.println("Original First array = " +Arrays.toString(firstary));
        System.out.println("Filtered first arry = " +Arrays.toString(newfirstary));
        System.out.println("Second array = " +Arrays.toString(newary));
System.out.println("Sum of first array = " +sumfirst);
System.out.println("Sum of second array = " +sumsecond);


    }
}
