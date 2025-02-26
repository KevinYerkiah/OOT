import java.util.Scanner;
public class question4{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Input marks");
        int marks =scn.nextInt();
        if (marks >= 70 && marks <=100){
            System.out.println("grade : A");
        }else if (marks>=60 && marks<= 69) {
            System.out.println("grade: B");
        }else if (marks >= 50 && marks <= 59) {
            System.out.println("grade: C");
        }else if (marks >= 40 && marks <= 49) {
            System.out.println("grade: D");
        }else {
            System.out.println("F");
        }

    }
}