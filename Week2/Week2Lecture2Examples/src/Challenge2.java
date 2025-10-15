import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) {
int Snumber = 33;
int Attempts = 0;
boolean Guess = false;
        Scanner input = new Scanner(System.in);
        while (Guess == false) {
            Attempts+=1;
            System.out.print("Please enter a number of 1 to 50:");
           int Gnumber = input.nextInt();
           if (Gnumber < 1 || Gnumber > 50) {
               System.out.println("You have entered an invalid number");
           }
           else if (Snumber < Gnumber) {
               System.out.println("Too High!");
           } else if (Snumber > Gnumber) {
               System.out.println("Too Low!");
           } else  if (Snumber == Gnumber) {
               Guess = true; System.out.println("You Got It in " + Attempts + " attempts");
           }
        }

    }
}
