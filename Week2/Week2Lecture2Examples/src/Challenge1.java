import java.util.Scanner;
public class Challenge1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       for (int i = 1; i <= 5; i++) {
           System.out.println("Please enter a number:");
           int Num1 = input.nextInt();
           if (Num1 % 2 == 0) {
               System.out.println(Num1 + " is even");
           } else  {
               System.out.println(Num1 + " is odd");
           }
       }
    }
}
