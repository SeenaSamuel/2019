//sheena samuel
public class BooleanStmts{
    public static void main(String args[]){
       
       boolean ans = true;
       boolean val01 = true;
       boolean val02 = false;
       boolean a = true;
       boolean b = false;
       boolean y = false;
       boolean z = false;
       
       ans = a || b && z;
       System.out.println("a || b && z is "+ans);
       
       ans = !a && y || b && !z;
       System.out.println("!a && y || b && !z is "+ans);
       
       ans = !a && !b;
       System.out.println("!a && !b is "+ans);
       
       ans = !(!a && y || b || z);
       System.out.println("!(!a && y || b || z) is "+ans);
       
       /*String msg = "";
       
       ans = val01 && !val02;
       msg = msg + "val01 && !val02 is a " +ans+ "boolean expression";
       msg = msg + " when val01 = " +val01;
       msg = msg + " and when val02 = " +val02;
       
       System.out.println(msg);
      
       ans = val01 && val02;
       msg = msg + "val01 && val02 is a " +ans+ "boolean expression";
       msg = msg + " when val01 = " +val01;
       msg = msg + " and when val02 = " +val02;
       
       System.out.println(msg);
       
       
       System.out.println(ans);
       
       //boolean expression that compares 2 numbers
       
       ans = 2 <= 5;
       System.out.println("2 <= 5 is a " +ans+ "boolean expression");
       
       ans = 2 == 5;
       System.out.println("2 == 5 is a " +ans+ "boolean expression");
       
       ans = 2. == 2;
       System.out.println("2. == 2 is a " +ans+ "boolean expression");*/
        
    }//end man    
}//end BooleanStmts
