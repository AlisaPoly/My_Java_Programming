public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("Elon Musk", "123456789", 1500.0);
    // deposit
    bankAccount1.deposit(900.00);

    //Withdraw
    String withdrawMessage = bankAccount1.withdraw(100.0);
    System.out.println(withdrawMessage + "\n");  // the "/n" is the newline character - prints a blank line on console
    // Try this without the use of the String withdrawMessage

    // Use the getters to print specific fields of the object
    System.out.println("The owner of the bank account is : " + bankAccount1.getName());
    //
    //Now change the owner's name using the setter
    bankAccount1.setName("Alisa Poly");
    //print new value
    System.out.println("The updated owner of the bank account is : " + bankAccount1.getName() + " (This is just Java, this is not me!)");
    System.out.println();

    // TODO make your own changes here

    // this  prints out the details to the console
    System.out.println(bankAccount1.display());
}
