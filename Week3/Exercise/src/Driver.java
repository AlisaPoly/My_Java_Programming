public class Driver {
    public static void main(String[] args) {
        Methods me = new Methods();
        me.printWelcome();
        double area =  me.printArea();
        System.out.println("\nRectangle Area is "+area);
        double perim = me.printPerimeter();
        System.out.println("Rectangle Perimeter is "+perim);
        me.printGoodbye();
    }
}
