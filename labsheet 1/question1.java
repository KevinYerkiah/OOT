import java.util.Scanner;


public class question1{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double temp_c;
        System.out.println("Enter Temp in Farenheite");
        double temp_f = scn.nextDouble();

        //conversion time 5/9 (f-32)
        temp_c = 0.5555* (temp_f - 32);
        System.out.println("temprature in celsius is= "+temp_c);       


    }
}