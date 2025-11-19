public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Elon Musk", "123456789", 1500.0);

        // deposit
        bankAccount1.deposit(300.00);

        //Withdraw
        String withdrawMessage = bankAccount1.withdraw(200.0);
        System.out.println(withdrawMessage);
        // Try this without the use of the String withdrawMessage

        System.out.println(bankAccount1.display());   // this  prints out the details to the console
    }
}