//sheena samuel

import java.util.Arrays;

public class FinalExam {
    public static void main (String args[])
    {
        
        int upr = 315;
        int low = 225;
        int multiple = 15;
        int k = 0;
        double first [] = new double [upr-low+1];
        
        while (k<first.length)
        {
            first[k] = low + k;
            k=k+1;
        }
        
        k=0;
        int c = 0;
        
        while (k<first.length)
        {
            if(first[k]%multiple==0)
            {
               c=c+1; 
            }
            k=k+1;
        }
        
        double circumference [] = new double [c];
        double radius [] = new double [c];
        double spherevolume [] = new double [c];
        double cylindervolume [] = new double [c];
        double height [] = new double [c];

        
        c=0;
        k=0;
        
        while (c<circumference.length)
        {
            if (first[k]%multiple==0)
            {
                circumference[c] = first[k];
                c=c+1;
            }
            k=k+1;
        }
           
        c=0;
        
        while (c<radius.length)
        {
            radius[c] = circumference[c]/(2*Math.PI);
            c=c+1;
        }
        
        c=0;
        
        while (c<spherevolume.length)
        {
            spherevolume[c] = ((double)4/3)*(Math.PI)*(Math.pow(radius[c],3));
            c=c+1;
        }
        
        c=0;
        
        while (c<height.length)
        {
            height[c]= radius[c]*2;
            c=c+1;
        }
        
        c=0;
        
        while (c<cylindervolume.length)
        {
            cylindervolume[c] = (Math.PI) * Math.pow(radius[c], 2) * height[c];
            c=c+1;
        }
        
        System.out.println("Lower bound = "+low);
        System.out.println("Upper bound = "+upr);
        System.out.println("Multiples of = "+multiple);
       
        System.out.println("");
        System.out.println("");
        
        System.out.printf("%s|%20s|%20s|%20s|%20s|%20s|\n","idx","circum","radius","height","sphere_vol","cyl_vol");
        System.out.printf("---|--------------------|--------------------|--------------------|--------------------|--------------------|\n");
        
        c=0;
        
        while (c<height.length)
        {
            System.out.printf("%3s|%20.3f|%20.3f|%20.3f|%20.3f|%20.3f|\n",c,circumference[c],radius[c],height[c],spherevolume[c],cylindervolume[c]);
                System.out.printf("---|--------------------|--------------------|--------------------|--------------------|--------------------|\n");

            c=c+1;
        }
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Arrays Used");
        System.out.println("Circumference = " +Arrays.toString(circumference));
        System.out.println("Radius = " +Arrays.toString(radius));
        System.out.println("Cylinder Height = " +Arrays.toString(height));        
        System.out.println("Sphere volume = " +Arrays.toString(spherevolume));
        System.out.println("Cylinder Volume = " +Arrays.toString(cylindervolume));

        
        
    }//end of main
}//end of class
