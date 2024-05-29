import java.util.Scanner;

public class Find {

   void evenorodd(int num){
          
    if(num%2==0){
        System.out.println("even number");
    }
    else{
        System.out.println("odd number");
    }


    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        Find obj = new Find();
        obj.evenorodd(a);
        

    }



    
    
}
