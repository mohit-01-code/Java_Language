package calC;

class HybridCalculator extends ScCalculator{
    int principalAmount;
    float interestRate;
    int time;

    HybridCalculator(int p, float i, int t){
        super(60);
        principalAmount = p;
        interestRate = i;
        time = t;
    }

    float simpleInterest(){
        return principalAmount * (1 + (interestRate / 100) * time);
    }

    void displaySimpleInterst(){
        System.out.println("The final amount of rupee "+principalAmount+" at "+interestRate+" interest rate in "+time+" years is : "+simpleInterest());
    }

    public static void main(String[] args){
        HybridCalculator cal1 = new HybridCalculator(20000, 1.59f, 2);
        cal1.displaySimpleInterst();

        cal1.displayCalculator();

        cal1.displayScCalculator();
    }
}