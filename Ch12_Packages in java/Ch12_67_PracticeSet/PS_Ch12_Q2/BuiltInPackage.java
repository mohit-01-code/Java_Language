//import java.util.Scanner; //importing built in package
class BuiltInPackage{
    int num;

    public void setNum(){
        System.out.println("Enter any value:");
        java.util.Scanner sc = new java.util.Scanner(System.in); // Using built in package
        num = sc.nextInt();
    }

    public int getNum(){
        return num;
    }

    public static void main(String args[]){
        BuiltInPackage obj = new BuiltInPackage();
        obj.setNum();
        System.out.println("The value is : "+obj.getNum());
    }
}