import java.util.Scanner;

public class loop {
    
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        boolean rain = input.nextBoolean();

        if(rain){
            System.out.println("need umbrella");
        }
        else{
            System.out.println("sunlight");
        }

       
        

    }
}
