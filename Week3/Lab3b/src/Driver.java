import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ClassExamples ce = new ClassExamples();
        double c = 20.5;
        double d = 3.5;
        ce.addNum(c, d);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int int1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int int2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int int3 = sc.nextInt();
        int answer=ce.addNum(int1, int2, int3);
        System.out.println(int1+"+"+int2+"+"+int3+"="+answer);

        System.out.println("factorial(5) using recursion " + ce.factorialRecursion(5));
        System.out.println("factortial(5) using loop "+ ce.factorialloop(5));
    }
}
