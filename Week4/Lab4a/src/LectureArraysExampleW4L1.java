import java.util.Scanner;

public class LectureArraysExampleW4L1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum=0; // added line for 2nd shorter option
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            numbers[i] = input.nextInt();
            sum+=numbers[i]; // added line for 2nd shorter option
        }
      //  System.out.println("Just read in data");
      //  int sum = 0;
      //  for (int i = 0; i < 5; i++) {
      //      sum += numbers[i];
      //  }
        System.out.println("The sum is " + sum);
    }
}
