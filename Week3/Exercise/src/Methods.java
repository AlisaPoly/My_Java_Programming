import java.util.Scanner;

public class Methods {
    public void printWelcome() {
        for (int i = 0; i < 22; i++) {
            System.out.print("*");
        }
        System.out.println("\nWelcome to My Program!");
        for (int i = 0; i < 22; i++) {
            System.out.print("*");
        }
    }

    public void printGoodbye() {
        System.out.println("\nGoodbye!");
    }

    public double printArea() {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        System.out.println("\nRECTANGLE AREA\nEnter the width of the Rectangle: "); // Output user input
        double W = input.nextDouble();
        System.out.println("Enter the height of the Rectangle: ");
        double H = input.nextDouble();
        return W * H;
    }
    public double printPerimeter() {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        System.out.println("\nRECTANGLE PERIMETR\nEnter the width of the Rectangle: "); // Output user input
        double W = input.nextDouble();
        System.out.println("Enter the height of the Rectangle: ");
        double H = input.nextDouble();
        return 2 * W + 2 * H;
    }
}


