import java.util.Scanner;

public class School {

    String passorfail(int score){

        if(score>35){
            return "pass";

        }
        else{
            return "fail";
        }
            
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int totalmark = input.nextInt();

        School obj = new School();
       String result =  obj.passorfail(totalmark);
       System.out.println(result);

        


    }
    
}
