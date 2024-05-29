public class methodoverloading {

// same method but can have different parameters


    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        
        methodoverloading obj = new methodoverloading();

        obj.sum(10,5 ,15);
         obj.sum(5,10 );


    }
    
}
