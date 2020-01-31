/*Sheena Samuel*/
public class CharString{
    public static void main(String args[]){
        
       //generate a passowrd with the following chars
       //1 uppercase, 3 lowercase, 3 numbers, 1 special character
       
       char ltr02;
       String pswd = "";
       
       //generate a passowrd with the following chars
       //1 uppercase, 3 lowercase, 3 numbers, 1 special character
       
       pswd = pswd + (char)(Math.random() * ('Z'-'A'+1)+'A');
       
       ltr02 = (char)(Math.random() * ('z'-'a'+1)+'a');
       pswd = pswd + ltr02;
       ltr02 = (char)(Math.random() * ('z'-'a'+1)+'a');
       pswd = pswd + ltr02;
       ltr02 = (char)(Math.random() * ('z'-'a'+1)+'a');
       pswd = pswd + ltr02;
       
       ltr02 = (char)(Math.random() * ('9'-'1'+1)+'1');
       pswd = pswd + ltr02;
       ltr02 = (char)(Math.random() * ('9'-'1'+1)+'1');
       pswd = pswd + ltr02;
       ltr02 = (char)(Math.random() * ('9'-'1'+1)+'1');
       pswd = pswd + ltr02;
       
       ltr02 = (char)(Math.random() * ('&'-'!'+1)+'!');
       pswd = pswd + ltr02;
       
       System.out.println(pswd);
       
       //System.out.println(ltr02);
       
       //generate a passowrd with the following chars
       //1 uppercase, 3 lowercase, 3 numbers, 1 special character

       /*char upper;
       upper = (char)(Math.random() * ('Z'-'A' + 1) + 'A');
       char low1;
       low1 = (char)(Math.random() * ('z'-'a' + 1) + 'a');
       char low2;
       low2 = (char)(Math.random() * ('z'-'a' + 1) + 'a');
       char low3;
       low3 = (char)(Math.random() * ('z'-'a' + 1) + 'a');
       char num1;
       num1 = (char)(Math.random() * ('9'-'0' + 1) + '0');
       char num2;
       num2 = (char)(Math.random() * ('9'-'0' + 1) + '0');
       char num3;
       num3 = (char)(Math.random() * ('9'-'0' + 1) + '0');
       char spcl;
       spcl = (char)(Math.random() * ('!'-'/' + 1) + '/');
       
       System.out.println(""+ upper + low1 + low2 + low3 + num1 + num2 + num3 + spcl);*/
       
       //System.out.println("My character is " +ltr01);
       //System.out.println(ltr02+ltr01);
       //System.out.println((char)9984);
       //System.out.println("Lower case J is " +lwrltr);
      
       
    }//end main
}//end CharString
