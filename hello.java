import java.util.Scanner;

class hello{

    public static void main (String args[]){


      Scanner input = new Scanner(System.in);
      
      String name = input.nextLine();
      int score = input.nextInt();
      input.nextLine();
      String department = input.nextLine();

     
      double marks = score/ 10.0 ;
        

        System.out.println("name is " + name);
        System.out.println("Score is " + marks);
        System.out.println("department is " + department);
    }
}