import java.util.Scanner;

public class notLoop10numbersW4L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10; //remembering the numbers
        int sum=0;
        System.out.print("Enter enter a number: ");
        n1 = input.nextInt();
        sum+=n1;
        System.out.print("Enter enter a number: ");
        n2 = input.nextInt();
        sum+=n2;
        System.out.print("Enter enter a number: ");
        n3 = input.nextInt();
        sum+=n3;
        System.out.print("Enter enter a number: ");
        n4 = input.nextInt();
        sum+=n4;
        System.out.print("Enter enter a number: ");
        n5 = input.nextInt();
        sum+=n5;
        System.out.print("Enter enter a number: ");
        n6 = input.nextInt();
        sum+=n6;
        System.out.print("Enter enter a number: ");
        n7 = input.nextInt();
        sum+=n7;
        System.out.print("Enter enter a number: ");
        n8 = input.nextInt();
        sum+=n8;
        System.out.print("Enter enter a number: ");
        n9 = input.nextInt();
        sum+=n9;
        System.out.print("Enter enter a number: ");
        n10 = input.nextInt();
        sum+=n10;
        System.out.println("The sum of the values you typed is: "+sum);
    }
}
