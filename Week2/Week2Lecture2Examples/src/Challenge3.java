import java.util.Scanner;
public class Challenge3 {
    public static void main(String[] args) {
        System.out.println("How many students in the class:");
        Scanner sc = new Scanner(System.in);
        int total =0;
        int num = sc.nextInt();
        int aver=num;
        int pass=0;
        while (num > 0) {
            System.out.println("Please enter student's score:");
            int score = sc.nextInt();
            if (score >= 50 && score <= 100) {
                System.out.println("PASS");
                pass++;
            total += score;}
            else if (score > 0 && score < 50) {
                    System.out.println("FAIL");
                    total += score;
                }
            else  if (score > 100 || score < 0) {
                    System.out.println("ENTER CORRECT SCORE");num++;
            } num--;
        }
        System.out.println("Average score: " + (double) total/aver);
        System.out.println("Passed students: " + pass);
    }
}
