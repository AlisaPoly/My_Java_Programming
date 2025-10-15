public class SimpleCalculator {
    public static void main(String[] args) {
        int mynum1 = 13;
        int mynum2 = 15;

        int sub = mynum1 - mynum2;
        System.out.println("Substruction result of 13 and 15 is equal to " + sub);
        double div = (double)mynum1 / mynum2;
        System.out.println("Division result of 13 and 15 is equal to " + div);
        int add = mynum1 + mynum2;
        System.out.println("Addition result of 13 and 15 is equal to " + add);
        int multiply = mynum1 * mynum2;
        System.out.println("Multiply result of 13 and 15 is equal to " + multiply);
    }
}
