import java.util.Scanner;

public class Driver {
    private Scanner input = new Scanner(System.in);
    private GymMember gymMember;

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.addGymMember();
        driver.printGymMember();
    }

    public void addGymMember() {
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Enter Your Height in meters: ");
        double height = input.nextDouble();
        System.out.println("Enter Your Weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter Your Membership Number: ");
        int membershipNumber = input.nextInt();
        System.out.println("Is this Current Gym Member (y/n): ");
        char currentGymMember = input.next().charAt(0);
        boolean isCurrentGymMember = false;
        if ((currentGymMember == 'y') || (currentGymMember == 'Y'))
            isCurrentGymMember = true;

        gymMember = new GymMember(name, height, weight, membershipNumber, isCurrentGymMember);

    }

    public void printGymMember() {
        System.out.println(gymMember.toString());
    }
}


