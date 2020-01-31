//sheena samuel
public class IterativeStmts {
public static void main(String args[]) {
    
    int cont1 = 0;
    int cont2 = 0;
    int numb0;
    int numb1 = 0;
    int numb2 = 0;
         
    while (cont1 < 15 && cont2 < 15)
    {
  
        numb0 = (int)(Math.random() * (20 - 0 +1) +0);

        if(numb0%2 == 1)
        { 
            cont1 = cont1+1;
            System.out.println("the number is " +numb0+ " and it is odd. " +cont1+ " odd so far");
          
            numb1 = numb1 + numb0;
            System.out.println("the sum of the odd numbers is " +numb1);
            
        }
        else
        {
            cont2 = cont2+1;
            System.out.println("the number is " +numb1+ " and it is even. " +cont2+ " even so far"); 
           
            numb2 = numb2 + numb0;
            System.out.println("the sum of the even numbers is " +numb2);
          
        }
            
        
    }//end of while
    
    
    
//    //Match logic
//    int k = 0;
//    char ltr = (char)(Math.random() * ('Z'-'A' +1)+ 'A');
//    char nmb = (char)(Math.random() * ('9'-'0' +1)+ '0');
//    
//    while (ltr != 'X' || nmb != '3') 
//    {
//    ltr = (char)(Math.random() * ('Z'-'A' +1)+ 'A');
//    nmb = (char)(Math.random() * ('9'-'0' +1)+ '0');
//    k=k+1;
//    }//while body
//    
//    System.out.println("Found is " +ltr+nmb+ ". Took " +k+ " tries.");
//    
    
//    //sentinel controlled loop
//    while (ltr != 'z')
//    {
//    ltr = (char)(Math.random() * ('z'-'a' +1)+ 'a');
//    k = k + 1;
//    }//while body
    
//    System.out.println("Letter found is " +ltr+ " in " +k+ " tries");
    
    //counter controlled loop
    //while(k<10)
    //{
    //k = k+1;
    //System.out.println("alls good " +k);
    //}//end of while body
    
}//end main
}//end IterativeStmts
