import java.util.Scanner;

public class arrayquestion {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        
        int [] num = new int [size];

        for(int i=0; i<size; i++){
             
             num[i] = input.nextInt();

        }

        System.out.println(num[((size+1)/2)-1]);
    }
}
