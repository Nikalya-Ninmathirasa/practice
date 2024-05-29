import java.util.Scanner;

public class question2 {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
         int number = input.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("divisible");

        }
        else{
            System.out.println("not divisible");
        }

        
    }
    
}
