package pack2;
import pack1.sample;

class accessClass extends sample{
    accessClass(int a1, int b1){
        super(a1, b1);
        // System.out.println(a); //cannot access the default property from sample class
        System.out.println(b); // Can access protected property from sample class
    }
}
class sample2{
    public static void main(String args[]){
        accessClass obj = new accessClass(4, 10);
       
    }
}