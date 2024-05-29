import java.util.Scanner;

public class array {

    public static void main (String args[]){

        int [] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();
        numbers[3] = input.nextInt();
        numbers[4] = input.nextInt();


        System.out.println(numbers[0]+ numbers[1]+ numbers[2]+ numbers[3]+ numbers[4]);


        
    }
    
}
