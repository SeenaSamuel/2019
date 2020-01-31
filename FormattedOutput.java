public class FormattedOutput {
public static void main (String args[])
{
    String name[] = new String[3];
    double weight[] = new double[3];
    name[0] = "Spot";
    name [1] = "Popper";
    weight [0] = (Math.random()*50+10);
    //simple formated output
    System.out.printf("My cat |%25s| weighs %.2f pounds.\n", name[0] , weight[0]);
    System.out.printf("My cat |%25s| weighs %.2f pounds.\n", name[1] , weight[0]);
    
}//end main
}//end class
