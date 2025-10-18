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
    public void futurePrediction(String starSign) {
        if (starSign.equalsIgnoreCase("aquarius")) {
            System.out.println("Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("taurus")) {
            System.out.println(starSign.toUpperCase() + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("leo")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("capricorn")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("aries")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("gemini")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("cancer")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("virgo")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("libra")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("sagittarius")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("scorpio")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else if (starSign.equalsIgnoreCase("piscies")) {
            System.out.println(starSign + " is ok, but Aquarius is the best!");
        } else System.out.println("This" + starSign + " doesn't exist! Please try again!");
    }
}


