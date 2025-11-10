import java.util.Scanner;

public class ArrayClass {
    public void exercise1() {
        System.out.println("Exercise 1: reads in 6 ints into an int array and prints the values to the screen");

        int[] numbers = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value : ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("value " + (i + 1) + " is: " + numbers[i]);
        }
    }

    public void exercise2() {
        System.out.println("Exercise 2: reads in 6 ints into an int array and prints the values to the screen backwards");

        int[] numbers = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value : ");
            numbers[i] = input.nextInt();
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("value " + (i) + " is: " + numbers[i]);
        }
    }

    public void exercise3() {
        System.out.println("Exercise 3: reads in 6 ints into an int array, adds 1 and prints out the sum");

        int[] numbers = new int[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value : ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("value " + (i) + " is: " + (numbers[i] + 1));
        }
    }

    public void exercise4() {
        System.out.println("Exercise 4: 10 ‘wages’ into a ‘double’ array");

        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        input.skip("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter wage : ");
            numbers[i] = input.nextDouble();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Wage at index " + (i) + " is: " + numbers[i]);
        }
    }

    public void exercise5() {
        System.out.println("Exercise 5: read in 10 wage into a double array - print out any wages over 100");

        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter wage : ");
            numbers[i] = input.nextDouble();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                System.out.println("Wage at index " + (i) + " is: " + numbers[i]);
            }
        }
    }

    public void exercise6() {
        System.out.println("Exercise 6: read in 10 wage into a double array - Anyone who earns over 1000 will have a wage reduction of 10%. Make this reduction. Finally print out all the values.");

        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter wage : ");
            numbers[i] = input.nextDouble();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 1000) {
                numbers[i] = numbers[i] * 0.9;

            }
            System.out.println("Wage at index " + (i) + " is: " + numbers[i]);
        }
    }

    public void exercise7() {
        System.out.println("Exercise 7: read in 10 wage into a double array - Calculate and print the average of the inputted wages.");

        double[] numbers = new double[10];
        double sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter wage : ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];

        }
        System.out.println("Average Wage =" + (sum / 10));
    }

    public void exercise8() {
        System.out.println("Exercise 8: read in 6 wages into a double array - Print out the largest wage in the array.");

        double[] numbers = new double[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter wage : ");
            numbers[i] = input.nextDouble();
        }
        double big = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > big) {
                big = numbers[i];

            }

        }
        System.out.println("Largest wage is: " + big);
    }

    public void exercise9() {
        System.out.println("Exercise 9: read in 6 wages into a double array - Print out the largest wage in the array and its index.");

        double[] numbers = new double[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter wage : ");
            numbers[i] = input.nextDouble();
        }
        double big = 0; // declared variable for largest wage
        int locIndex = 0; // declared variable for index location
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > big) {
                big = numbers[i];
                locIndex = i;
            }
        }
        System.out.println("Largest wage is: " + big + " is stored at index " + (locIndex));
    }

    public void exercise10() {
        System.out.println("Exercise 10: read in 5 names into a String array.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + (i) + " is: " + names[i]);
        }
    }

    public void exercise11() {
        System.out.println("Exercise 11: read in 5 names into a String array and CAPATALISE them.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + (i) + " is: " + names[i].toUpperCase());
        }
    }

    public void exercise12() {
        System.out.println("Exercise 12: read in 5 names into a String array and write them lowercase.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + (i) + " is: " + names[i].toLowerCase());
        }
    }

    public void exercise13() {
        System.out.println("Exercise 13: read in 5 names into a String array - only print out the names that have at least 7 characters.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() >= 7) {
                System.out.println("Name at index " + (i) + " is: " + names[i]);

            }
        }
    }

    public void exercise14() {
        System.out.println("Exercise 14: read in 5 names into a String array - only print out the first 3 characters of each name  in UPPERCASE to the console.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + (i) + " is: " + names[i].substring(0, 3));

        }
    }

    public void exercise15() {
        System.out.println("Exercise 15: read in 5 names into a String array - only print out the first 3 characters of each name to the console.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + (i) + " is: " + names[i].substring(0, 3).toUpperCase());

        }
    }

    public void exercise16() {
        System.out.println("Exercise 16: read in 5 names into a String array - only print out the names that contain 'ann'.");

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name : ");
            names[i] = input.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            String name = names[i].toLowerCase();

            if(name.contains("ann")) {
                System.out.println("Name at index " + (i) + " is: " + names[i]);
            }
        }
    }
}





