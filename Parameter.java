public class Parameter {

    void sum(int a, int b){
        System.out.println(a+b);

    }

    void sub(int a, int b){
        System.out.println(a-b);
    }

    void mul(int a, int b){
        System.out.println(a*b);
        
    }

    void div(int a, int b){
        System.err.println(a/b);
        
    }

    public static void main(String[] args) {


      Parameter obj = new Parameter();
      
      obj.sum(10,5);
      obj.sub(10,5);
      obj.mul(10,5);
      obj.div(10,5);


    //   System.err.println("hello");
    //   System.out.println("hello");
        
    }
    
}
