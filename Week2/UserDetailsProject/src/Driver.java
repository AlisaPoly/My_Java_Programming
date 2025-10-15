import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("Please enter your address: ");
        String address = input.nextLine();
        System.out.print("Please enter your Date of Birth: ");
        String DOB  = input.nextLine();
        System.out.print("Please enter your height: ");
        double height = input.nextInt();
    }
}
