public class JokeGenerator {
    // Method 1: No parametr, no return
    public void tellJoke(){
        System.out.println("Why don't programmers like nature? It has too many bugs");
    }
    // Method 2: Parametrs, no return
    public void tellSTory(String name) {
        System.out.println("Once upon time, " + name + " tried to debug code at 3 am ...");
        System.out.println("The bug fixed itself. Legends still talk about it.");
    }
    // Method 3: Parametr and return value
    public String ageInTenYears(int age) {
        int futureAge = age + 10;
        if (age <= 10) {
            String s = "You are not old enough";
            return s;
        } else return "In 10 years, you'll be " + futureAge + " years old - still debugging";
    }
}
