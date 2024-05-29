import java.util.Scanner;

public class question3 {

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter the age: ");
        int age = input.nextInt();

        if(salary >= 20000 || age < 25){
            System.out.println("You are eligible for loan");

            System.out.println("Enter the loan amount: ");
            double loan = input.nextDouble();
            if(loan <= 50000){
                System.out.println("Available loan");
            }
            else{
                System.out.println("Maximum loan amount is 50000");
            }
        }
        else{
            System.out.println("not eligible for loan");
        }

        
    }
    
}
