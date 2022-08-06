package calC;
import java.lang.Math;

public class ScCalculator extends Calculator{
    int angle;
    float sinX, cosX, secX, cosecX, tanX, cotX, rootX;

    public ScCalculator(int angleX){
        super(16, 4);
        this.angle = angleX;
    }

    public double getSinX(){
        return Math.sin(angle * (3.14f / 180));
    }

    public double getCosX(){
        return Math.cos(angle * (3.14f / 180));
    }

    public double getSecX(){
        return 1 / (cosX);
    }

    public double getCosecX(){
        return 1 / (sinX);
    }

    public double getTanX(){
        return Math.tan(angle * (3.14f / 180));
    }

    public double getCotX(){
        return (cosX) / (sinX);
    }

    public double getRootX(){
        return Math.sqrt(angle);
    }

    void displayScCalculator(){
        System.out.printf("sin(%d) = %.2f\n", angle, this.getSinX());
        System.out.printf("Cos(%d) = %.2f\n", angle, this.getCosX());
        System.out.printf("Sec(%d) = %.2f\n", angle, this.getSecX());
        System.out.printf("Cosec(%d) = %.2f\n", angle, this.getCosecX());
        System.out.printf("Sec(%d) = %.2f\n", angle, this.getSecX());
        System.out.printf("Tan(%d) = %.2f\n", angle, this.getTanX());
        System.out.printf("Cot(%d) = %.2f\n", angle, this.getCotX());
        System.out.printf("Square root of angle %d = %.2f", angle, this.getRootX());
    }

    // public static void main(String[] args){
    //     ScCalculator scCal1 = new ScCalculator(60);
    //     scCal1.displayScCalculator();
    // }
}