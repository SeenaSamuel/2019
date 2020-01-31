/*sheena samuel*/
public class CylinderCalc01{
    public static void main(String args[]){
        
        double hgt = 7;
        double radi = 3;
        double tmp = 0;
        
        tmp = Math.PI * Math.pow(radi,2) * hgt;
        
        System.out.println("The volume of a cylinder with the hight of " +hgt+ 
                " and the radius of " +radi+ " is " +tmp);
                
        tmp = (2 * Math.PI * radi * hgt) + (2 * Math.PI * Math.pow(radi,2));
        
        System.out.println("The surface area of a cylinder with the hight of " +hgt+ 
                " and the radius of " +radi+ " is " +tmp);
        
        tmp = Math.PI * Math.pow(radi,2);
        
        System.out.println("The base area of a cylinder with the hight of " +hgt+ 
                " and the radius of " +radi+ " is " +tmp);
        
        tmp = 2 * Math.PI * radi * hgt;
        
        System.out.println("The lateral area of a cylinder with the hight of " +hgt+ 
                " and the radius of " +radi+ " is " +tmp);
        
    }//end main function
}//end class CylinderCalc01
