/*sheena samuel*/
public class GeoSolids {
 public static void main(String args[])
 {
 //legs of triangle
double lega = 3;
double legb = 4;
double hyp = 0;
double tmp = lega * lega + legb * legb;

hyp = Math.sqrt(tmp);
     System.out.println("The hypoteneuse is " +hyp);
     
hyp = 25;
legb = 8;
lega = 0;

tmp = Math.pow(hyp,2) - Math.pow(legb,2);

lega = Math.sqrt(tmp);

System.out.println("Given the hypotenues = " +hyp+ " and leg b = " +legb+","
        + " the third side (leg) equals " +lega);
     

 }//end main
    
}//end class GeoSoids
