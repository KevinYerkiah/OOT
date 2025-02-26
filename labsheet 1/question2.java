import java.util.Scanner;

public class question2{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        double rupee;

        System.out.println("Input the amount of currency");
        double Currency = scn.nextDouble();
        System.out.println("input the exchange rate");
        double exchange_rate = scn.nextDouble();

        rupee = Currency * exchange_rate;

        System.out.println("The New some of rupees is: "+rupee);


        
    }
}