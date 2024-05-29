import java.util.Scanner;

public class question1 {
    
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
         int mark = input.nextInt();

        if(mark>35){
            System.out.println("pass");

        }
        else{
            System.out.println("fail");
        }

        
    }
}
