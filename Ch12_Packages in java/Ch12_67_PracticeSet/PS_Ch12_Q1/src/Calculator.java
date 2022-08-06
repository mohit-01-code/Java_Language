package calC;

public class Calculator{
    public int a;
    public int b;

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return this.a + this.b;
    }

    public int subtract(){
        return this.a - this.b;
    }

    public int multiply(){
        return this.a * this.b;
    }

    public int divsion(){
        return this.a / this.b;
    }

    public void displayCalculator(){
        System.out.println(this.a+" + "+b+" = "+this.add());
        System.out.println(this.a+" - "+b+" = "+this.subtract());
        System.out.println(this.a+" * "+b+" = "+this.multiply());
        System.out.println(this.a+" / "+b+" = "+this.divsion());
    }

    // public static void main(String[] args){
    //     Calculator cal2 = new Calculator(16, 4);
    //     cal2.displayCalculator();
    // }

    
}