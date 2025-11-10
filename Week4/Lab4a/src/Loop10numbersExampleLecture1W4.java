import java.util.Scanner;

public class Loop10numbersExampleLecture1W4 { //adding 10 numbers not saving each input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.print("Enter number: ");
            n = input.nextInt();
            sum+=n; // value stored in sum, but not a separate input
        }
        System.out.println("The sum of the values you typed in is: "+sum);
    }
}
