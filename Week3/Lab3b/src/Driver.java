import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ClassExamples ce = new ClassExamples();
        double c = 20.5;
        double d = 3.5;
        ce.addNum(c, d);

        Scanner sc = new Scanner(System.in); // Exercise 1 - addNum()
        System.out.println("Enter 1st number: ");
        int int1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int int2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int int3 = sc.nextInt();
        int answer = ce.addNum(int1, int2, int3);
        System.out.println(int1 + "+" + int2 + "+" + int3 + "=" + answer);

        Scanner sc1 = new Scanner(System.in); // Exercise 2 - overloading
        System.out.println("Enter 1st number: ");
        int int4 = sc1.nextInt();
        System.out.println("Enter 2nd number: ");
        int int5 = sc1.nextInt();
        System.out.println("Enter 3rd number: ");
        int int6 = sc1.nextInt();
        int answer1 = ce.product(int4, int5, int6);
        System.out.println(int4 + "*" + int5 + "*" + int6 + "=" + answer1);

        Scanner sc2 = new Scanner(System.in); // Exercise 3 - max
        System.out.println("Enter 1st number: ");
        int int7 = sc1.nextInt();
        System.out.println("Enter 2nd number: ");
        int int8 = sc1.nextInt();
        System.out.println("Enter 3rd number: ");
        int int9 = sc1.nextInt();
        int answer3 = ce.max(int7, int8, int9);
        System.out.println("The Max of "+int7+"," + int8 +","+ int9+ "=" +"is " + answer3);

        System.out.println("factorial(5) using recursion " + ce.factorialRecursion(5));
        System.out.println("factortial(5) using loop " + ce.factorialloop(5));
    }
}
