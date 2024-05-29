public class Addition {

    int a = 10;
    int b = 20;

    int sum(){
        int total = a+b;
       return total;
       // System.out.println(total);
    }

    public static void main(String[] args) {
         
        Addition obj = new Addition();

        int result = obj.sum();

        System.out.println(result);
    }
    
}
