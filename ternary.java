import java.util.Scanner;

public class ternary {

    public static void main (String args[]){

       Scanner input = new Scanner(System.in);

       int a = input.nextInt();
       int b = input.nextInt();

       String result = a>b? "maximum is a" : "maximum is b";
       System.out.println(result);

    }
    
}
