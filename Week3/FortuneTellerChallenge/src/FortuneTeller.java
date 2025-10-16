public class FortuneTeller {
    public void FortuneTeller(){
        System.out.println("You'll be successful today!");
    }
    public void personalFortune(String name){
        System.out.println("Let's stay home. not to shine so bright,"+ name+" !");
    }
    public String futurePrediction(int age){
        int futugeAge = age+10;
        String message = "You'll have all the gold in the world at "+futugeAge+" years old!";
        return message;
    }
}

