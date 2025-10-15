public class Even {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // it means if i divide the result by 2 without remainder
                System.out.println(i);
            }
        } //same with WHILE
        System.out.println("Same with WHILE Loop");
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }i++;

        }
    }
}
