/*Sheena Samuel*/
public class MakeRndPswd{
    public static void main(String args[]){
      
        char rnd;
        String pswd = "";
        int count = 0;
        int Upper = 3;//how many uppercase letters
        int upcount = 0;
        int Lower = 12;//how many lowercase letters
        int lowcount = 0;
        int Numbers = 7;//how many numbers
        int numbcount = 0;
        int Special = 69;//how many special characters
        int specount = 0;
        int max = Upper + Lower + Numbers + Special;//total length of password
        int lowmax = max - 1;//max without last char special
        
        int newupper = Upper - 1;//Uppercase total without start uppercase letter
        int newspecial = Special - 1;//Special char total with out end special
        
        while (count < max)
        {
        rnd = (char)(Math.random() * ('~' - '!' + 1) + '!');

        if ((count == 0) &&  ('A' <= rnd && rnd <= 'Z'))
        {
            pswd = pswd + rnd;    
            count = count + 1;
        }//end of if
        
        
        
        else if ((0 < count && count < lowmax) && ('A' <= rnd && rnd <= 'Z') && (newupper > upcount)) 
        {
            pswd = pswd + rnd;    
            count = count + 1;
            upcount = upcount + 1;
        }//end of if
            

        
        else if ((0 < count && count < lowmax) && ('a' <= rnd && rnd <= 'z') && (Lower > lowcount))
        {
            count = count + 1;
            pswd = pswd + rnd;
            lowcount = lowcount + 1;
        }//end of if

         
           
        else if ((0 < count && count < lowmax) && ('0' <= rnd && rnd <= '9') && (Numbers > numbcount))
        {
            count = count + 1;
            pswd = pswd + rnd;
            numbcount = numbcount + 1;
        }//end of if
           
          
        
        else if ((0 < count && count < lowmax) && ('#' <= rnd && rnd <= '&' || rnd == '!' || rnd == '*' || rnd == '?' || rnd == '^' || rnd == '@') && (newspecial > specount))
        {
            count = count + 1;
            pswd = pswd + rnd;
            specount = specount + 1;
        }//end of if
            
        
        
        
        else if ((count == lowmax) && ('#' <= rnd && rnd <= '&' || rnd == '!' || rnd == '*' || rnd == '?' || rnd == '^' || rnd == '@'))
        {
            count = count + 1;
            pswd = pswd + rnd;            
        }//end of if
            
        }//end while
                    
        System.out.println("password = " +pswd);

        
    }//end main
}//end class
