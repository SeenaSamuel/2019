//sheena samuel
public class CorrespondingArrays {
   public static void main (String args[])
   {
       
       int nbrOfCylinders = 5;
       double radius[] = new double[nbrOfCylinders];
       double height[] = new double[nbrOfCylinders];
       double volume[] = new double[nbrOfCylinders];
       double totalbase[] = new double[nbrOfCylinders];
       double latarea [] = new double[nbrOfCylinders];
       int lwrrad = 3;
       int uprrad = 10;
       int lwrheight = 5;
       int uprheight = 20;
       int k = 0;
       
       while (k < radius.length)
       {
        radius [k] = Math.random() * (uprrad- lwrrad + 1) + lwrrad;
        height [k] = Math.random() * (uprheight - lwrheight + 1) + lwrheight;
        k=k+1;
       }
       
       k=0;
       
       while(k < radius.length)
       {
        totalbase[k] = 2*radius[k]*radius[k]*Math.PI;
        volume[k] = (totalbase[k] * height[k])/2;
        latarea[k] = (2 * Math.PI * radius[k]) * height[k];
        k=k+1;
       }
       
       k=0;
       
       while (k < radius.length)
       {
        String print = "";
        
        print = print + "Cylinder " + (k+1) + ":";
        print = print + "Radius: " + radius[k] + " ";
        print = print + "Height: "+ height[k] + " ";
        print = print + "Volume: " + volume[k] + " ";
        print = print + "Totalbase: " + totalbase[k] + " ";
        print = print + "Lateral Area: " + latarea[k] + " ";
        k=k+1;
        System.out.println(print);
       }
       
       
   }//end of main
}//end of class
