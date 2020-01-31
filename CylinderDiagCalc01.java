/*Sheena Samuel*/
public class CylinderDiagCalc01{
    public static void main(String args[]){
        
        double h = 6;//height
        double r = 2;//radius
        double D; //diagonal
        double tmp;
        
        tmp = 2 * r; //diameter
        
        D = Math.sqrt(Math.pow(h, 2) + Math.pow(tmp,2));//calculation for diagonal
        
        System.out.println("The length of the diagonal that extends from base to base"
                + " in a cylinder with the height of 6 and a radius of 2 is " +D);
        
    }//end main function
}//end class CylinderDiagCalc
