import java.util.Scanner;

public class dfd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();
        if (age < 18) {
            System.out.println("You are a kid ! Under 18");
        } else {
            System.out.println("You are an Adult ! Above 18");
        }
    }
}
