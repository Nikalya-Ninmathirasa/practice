import java.util.Scanner;

class hello{

    public static void main (String args[]){


      Scanner input = new Scanner(System.in);
      
      String name = input.nextLine();
      double score = input.nextDouble();
      input.nextLine();
      String department = input.nextLine();

     
     // double marks = score/ 10.0 ;
        

        System.out.println("name is " + name);
        System.out.println("Score is " + score/10 + "/10");
        System.out.println("department is " + department);
    }
}