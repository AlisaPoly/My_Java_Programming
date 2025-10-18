import java.util.Scanner;

public class Driver {
    public static void main(String[] args) { //starting the programme
        FortuneTeller ft = new FortuneTeller(); //make a new FortuneTeller object = call it ft
        Scanner input = new Scanner(System.in); //to ask for name
        ft.FortuneTeller(); //call method

        System.out.println("Please enter your name");
        String name = input.nextLine();
        ft.personalFortune(name);

        System.out.println("Please enter your age");
        int age = input.nextInt();
        String resp = ft.futurePrediction(age);
        System.out.println(resp);
        input.skip("\n");
        System.out.println("Please enter your Star sign");
        String starSign = input.nextLine();
        ft.futurePrediction(starSign);
    }
}
