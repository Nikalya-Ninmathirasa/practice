public class method {


    static void greeting(){
        System.out.println("Hello first");
        method obj2 = new method();
        obj2.sample();
    }

     void sample(){
        System.out.println("Hello second");
    }


    public static void main(String[] args) {

        method obj1 = new method();
        obj1.greeting();

        obj1.sample();
        
    }

    
}
