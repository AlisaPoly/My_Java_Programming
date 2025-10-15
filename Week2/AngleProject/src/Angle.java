import java.util.Scanner;
public class Angle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Create a Scanner object
        System.out.print("Enter the size of the angle: "); // Output user input
        double angle = input.nextDouble();
        if (angle >= 0 && angle < 90) {
            System.out.println("The angle " + angle + ", is acute.");
        }
        if (angle == 90) {
            System.out.println("The angle " + angle + ", is a right angle.");
        }
        if (angle >90 && angle <180) {
            System.out.println("The angle " + angle + ", is an obtuse angle.");
        }
        if (angle == 180) {
            System.out.println("The angle " + angle + ", is a straight angle.");
        }
        if (angle >180 && angle <=360) {
            System.out.println("The angle " + angle + ", is a reflex angle.");
        }
        if (angle >360) {
            System.out.println("The angle " + angle + ", is a faulty figure.");
        }

    }
}
