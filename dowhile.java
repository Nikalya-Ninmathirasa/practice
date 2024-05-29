import java.util.Scanner;

public class dowhile {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a =0;

      

        do {
            System.out.println("Enter a number > 10");
            a = input.nextInt();
            
        } 
        while(a<10);
             
        
        
        
    }
}
